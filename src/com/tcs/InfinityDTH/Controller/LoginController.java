package com.tcs.InfinityDTH.Controller;

import java.io.IOException;



import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tcs.InfinityDTH.Dao.PurchaseChannelPackDao;
import com.tcs.InfinityDTH.Model.Bill;
import com.tcs.InfinityDTH.Model.UserDetails;
import com.tcs.InfinityDTH.Service.UserService;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	PrintWriter out = response.getWriter();
		String userName = request.getParameter("username");
		System.out.println("username"+userName);
		String password = request.getParameter("password");
		
		UserDetails user = new UserDetails();
		UserDetails userDetail = new UserDetails();
		userDetail.setUserName(userName);
		userDetail.setPassword(password);
	
//		System.out.println("controller" + userDetail.getUserName());
//		System.out.println("controller" + userDetail.getPassword());
		UserService userService = new UserService();
		user = userService.checkUser(userName, password);
	
			HttpSession session = request.getSession();
		
			//session.setAttribute("username", userDetail.getUserName());
			//session.setAttribute("name", userDetail.getFirst_name()+" "+userDetail.getLast_name());
			//session.setAttribute("usertype", user.get(0).getUserId());
		
			
			session.setAttribute("userid", user.getUserId());
			session.setAttribute("name", user.getFirst_name()+" "+user.getLast_name());
			session.setAttribute("usertype", user.getUser_type());
			session.setAttribute("username", userName);
			System.out.println("user type inside login controller is : " +user.getUser_type());
			System.out.println("hello there");
			System.out.println("user id is : " +user.getUserId());
			
			
			
			session.setMaxInactiveInterval(120);
			
			if(user.getUserId() == 0)
			{
				response.sendRedirect("wrongUser.jsp");
			}
			else
			{
				
			
				if(user.getUser_type().equalsIgnoreCase("admin") || user.getUser_type().equalsIgnoreCase("operator"))
				{
					response.sendRedirect("AdminHome.jsp");
				}
				else if(user.getUser_type().equalsIgnoreCase("user"))
				{
					
					Bill bill=new Bill();
					PurchaseChannelPackDao pcp=new PurchaseChannelPackDao();
					bill = pcp.getlist(user.getUserId());
					session.setAttribute("bill", bill);
					
				//	System.out.println(bill.getList1().get(1));
					RequestDispatcher rd = request.getRequestDispatcher("UserHome.jsp");
					rd.forward(request, response);
				//response.sendRedirect("UserHome.jsp");
				}
			}
		
		
	}

}

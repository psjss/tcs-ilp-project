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
import com.tcs.InfinityDTH.Service.UserService;

/**
 * Servlet implementation class StbSuccessController
 */
@WebServlet("/StbSuccessController")
public class StbSuccessController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StbSuccessController() {
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
		System.out.println("hello prateek");
		int stbId = Integer.parseInt(request.getParameter("stbid"));
		int userID = Integer.parseInt(request.getParameter("userid"));
		double  tax = Double.parseDouble(request.getParameter("tax"));
		String userName = request.getParameter("username");
		System.out.println("tax is :" +tax);
//		UserService user = new UserService();
		System.out.println("user id in stb controller  = " +userID);
		System.out.println("user name in stb controller  = " +userName);
		
		HttpSession session = request.getSession();
		UserService user = new UserService();
		int i = user.addPurchaseStb(tax, stbId,userID,userName);
		if(i == 1)
		{
			Bill bill=new Bill();
			PurchaseChannelPackDao pcp=new PurchaseChannelPackDao();
			bill = pcp.getlist(userID);
			session.setAttribute("bill", bill);
			RequestDispatcher rd = request.getRequestDispatcher("sucessStb.jsp");
			rd.forward(request, response);
		}
		else
		{
			RequestDispatcher rd = request.getRequestDispatcher("failureStb.jsp");
			rd.forward(request, response);
		}
	}

}

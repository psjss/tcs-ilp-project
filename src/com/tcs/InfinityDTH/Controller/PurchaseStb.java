package com.tcs.InfinityDTH.Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.tcs.InfinityDTH.Model.InventoryDetails;
import com.tcs.InfinityDTH.Model.StbDetails;
import com.tcs.InfinityDTH.Model.UserDetails;
import com.tcs.InfinityDTH.Service.UserService;

/**
 * Servlet implementation class PurchaseStb
 */
@WebServlet("/PurchaseStb")
public class PurchaseStb extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PurchaseStb() {
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
		String StbType = request.getParameter("stbtype");
		System.out.println("type of stb is :" +StbType);
		String billType = request.getParameter("billtype");
		System.out.println("bill type is" +billType);
		ArrayList<InventoryDetails> inv = new ArrayList<InventoryDetails>();
		ArrayList<StbDetails> stb = new ArrayList<StbDetails>();
		ArrayList<UserDetails> user = new ArrayList<UserDetails>();
		UserService service = new UserService();
		
		try
		{
		    	  
			inv = service.getStbDetails(StbType);
			stb = service.getStbPriceDetails(StbType,billType);
			
			request.setAttribute("invdet", inv);
			request.setAttribute("stbdet", stb);
			request.setAttribute("userdetails", user);
			RequestDispatcher rd=request.getRequestDispatcher("StbOut.jsp");
			rd.forward(request, response);

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

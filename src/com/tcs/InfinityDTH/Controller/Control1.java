package com.tcs.InfinityDTH.Controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tcs.InfinityDTH.Service.Service;
import com.tcs.InfinityDTH.Model.GenerateBill;

/**
 * Servlet implementation class Control1
 */
@WebServlet("/Control1")
public class Control1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Control1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Service s = new Service();
		 ArrayList<GenerateBill> b;
		try 
		{
			b = s.getDetails1();
			//if(b!=null)
			//{
			request.setAttribute("a", b);
			RequestDispatcher rd = request.getRequestDispatcher("Display.jsp");
			rd.forward(request,response);
			//}
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
		
		
		
		
		
	}


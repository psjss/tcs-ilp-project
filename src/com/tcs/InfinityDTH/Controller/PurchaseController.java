package com.tcs.InfinityDTH.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.tcs.InfinityDTH.Model.Bill;
import com.tcs.InfinityDTH.Model.Pack;
import com.tcs.InfinityDTH.Service.PurchaseChannelPackService;

/**
 * Servlet implementation class PurchaseController
 */
@WebServlet("/PurchaseController")
public class PurchaseController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PurchaseController() {
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
		// TODO Auto-generated method stub
	HttpSession session=request.getSession();
	Bill bill=new Bill();
	bill=(Bill)session.getAttribute("bill");
	ArrayList<String> list1=bill.getList1();
	ArrayList<String> list=bill.getList();
		int i=0;
		int count=0;
		if("add".equalsIgnoreCase(request.getParameter("action")))
		{
		int b=0,x=0;
		int userid=(Integer)session.getAttribute("userid");
		System.out.println(userid);
		int stb_id=Integer.parseInt(request.getParameter("stbid"));
		System.out.println(stb_id);
		for(i=0;i<list.size();i++)
		{
		if(stb_id==Integer.parseInt(list.get(i)))
		{
			count=i;
		}
		}
		String billingtype=list1.get(count);
		System.out.println(billingtype);
		
		String a[]= request.getParameterValues("pack");
		String z[] = request.getParameterValues("tel");
		PrintWriter out=response.getWriter();
		PurchaseChannelPackService s3=new PurchaseChannelPackService();
		try
		{
			i=s3.check(stb_id,userid,billingtype);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		if(i==1)
		{
	try
	{
	PurchaseChannelPackService s=new PurchaseChannelPackService();
	if(a!=null)
	{
	 b = s.addPack(a,stb_id);
	}
	else 
		b=0;
	if(z!=null)
	{
	x = s.channelPrice(z,stb_id);
	}
	else
	x=0;
	
	int total = b+x;
	Pack c = new Pack(total);
	PurchaseChannelPackService s1=new PurchaseChannelPackService();
	int j=s1.update(stb_id,total);
	if(c!=null)
	{
	request.setAttribute("a", j);
	RequestDispatcher rd = request.getRequestDispatcher("Cost.jsp");
	rd.forward(request,response);
	}
	}
	catch(Exception e)
	{
	out.println(0);
	}
	}
		else{
			RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
			rd.forward(request,response);
		}
	}
	}
	}



	



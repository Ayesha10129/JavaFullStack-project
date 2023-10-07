package com.shopNest3.admin;
import java.io.IOException;
import com.shopNest3.dbhandler.DataInjector;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServlet;


@WebServlet("/addP")
  public class ProductServlet extends HttpServlet {
	     public void doPost(HttpServletRequest req,HttpServletResponse resp)
	     {
	    	 int pid=Integer.parseInt(req.getParameter("product-id"));
	    	 String pname=req.getParameter("product-name");
	    	 String pdesc=req.getParameter("product-description");
	    	 int pprice=Integer.parseInt(req.getParameter("product-price"));
	    	 String pimg=req.getParameter("product-image");
	    	  
	    	 DataInjector.addProduct(pid,pname,pdesc,pprice,pimg);
	     }

}

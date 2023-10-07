
package com.shopNest.customer;

import com.shopNest3.dbhandler.DataInjector;
import java.io.IOException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServlet;

@WebServlet("/reg")
public class RegisterServlet extends HttpServlet {

	public void doPost(HttpServletRequest req,HttpServletResponse resp) throws IOException{
		String uname=req.getParameter("uname");
		String email=req.getParameter("email");
		String pass=req.getParameter("pass");
		String gender=req.getParameter("gender");
		String status=DataInjector.addCustomer(uname,email,pass,gender);
		resp.sendRedirect("login.jsp");
		
		
		// TODO Auto-generated method stub

	}

}

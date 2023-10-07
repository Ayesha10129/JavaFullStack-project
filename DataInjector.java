package com.shopNest3.dbhandler;
import java.sql.*;
public class DataInjector {
    public static String addCustomer(String uname,String email,String pass,String gender)
    {
    	String driver="com.mysql.cj.jdbc.Driver";
    	String url="jdbc:mysql://localhost:3306/project";
    	String user="root";
    	String password="root";
    	String sql="insert into cust1 values(?,?,?,?)";
    	String regStatus="";
    	try {
    	Class.forName(driver);
      	Connection con=DriverManager.getConnection(url,user,password);
      	PreparedStatement ps=con.prepareStatement(sql);
      	 ps.setString(1, uname);
      	 ps.setString(2, email);
      	 ps.setString(3, pass);
      	 ps.setString(4, gender);
      	 
      	 ps.executeUpdate();
      	 regStatus="Success";
    	}
    	catch(Exception ex)
    	{
    		System.out.println("problem in adding customer");
    		ex.printStackTrace();
    		regStatus="fail";
    	}finally {
      	 return regStatus;
    	}
     }
       public static boolean addProduct(int pid,String pname,String pdesc,int pprice,String pimg)
       {
    	    String driver="com.mysql.cj.jdbc.Driver";
          	String url="jdbc:mysql://localhost:3306/project";
       	    String user="root";
       	    String password="root";
         	String sql="insert into products values(?,?,?,?,?)";
         	try {
            	Class.forName(driver);
              	Connection con=DriverManager.getConnection(url,user,password);
              	PreparedStatement ps=con.prepareStatement(sql);
              	 ps.setInt(1, pid);
              	 ps.setString(2, pname);
              	 ps.setString(3, pdesc);
              	 ps.setInt(4, pprice);
              	 ps.setString(5, pimg);
              	 ps.executeUpdate();
       	    
       }catch(Exception e)
         	{
    	       System.out.println("problem in addng product");
    	       e.printStackTrace();
    	       return false;
         	}
         	return true;
       }
}

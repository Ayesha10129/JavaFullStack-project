package com.shopNest3.dbhandler;
import java.sql.*;
import java.util.*;
public class DataFetcher {
      public static String fetchPassword(String uname)
      {
    	  String driver="com.mysql.cj.jdbc.Driver";
          String url="jdbc:mysql://localhost:3306/project";
      	  String user="root";
      	  String password="root";
      	  String sql="SELECT pass FROM cust1 WHERE uname=?";
      	  String dbPass="";
      	  try {
      		  Class.forName(driver);
      		 Connection con=DriverManager.getConnection(url,user,password);
          	 PreparedStatement ps=con.prepareStatement(sql);
          	 ps.setString(1,uname);
          	 ResultSet rs=ps.executeQuery();
          	 rs.next();
          	 dbPass=rs.getString(1);
      	  }catch(Exception e)
      	  {
      		  System.out.println("login issues");
      		  e.printStackTrace();
      	  }
      	  return dbPass;
      }
       public static List fetchUsersInfo()
      {
    	   String driver="com.mysql.cj.jdbc.Driver";
           String url="jdbc:mysql://localhost:3306/project";
       	   String user="root";
       	   String password="root";
       	   String sql="SELECT uname,email,gender FROM cust1";
       	   List ulist=new ArrayList();
       	   try {
       		 Class.forName(driver);
      		 Connection con=DriverManager.getConnection(url,user,password);
          	 Statement st=con.createStatement();
          	 ResultSet rs=st.executeQuery(sql);
          	 while(rs.next())
          	 {
          		 String temp=rs.getString(1)+":"+rs.getString(2)+":"+rs.getString(3);
          		 ulist.add(temp);
          	 }
       	   }catch(Exception e)
       	   {
       		   System.out.println("problem in login");
       	   }
       	   return ulist;
       	   
      }
       public static List fetchProductInfo()
       {
    	   String driver="com.mysql.cj.jdbc.Driver";
           String url="jdbc:mysql://localhost:3306/project";
       	   String user="root";
       	   String password="root";
       	   String sql="SELECT pid,pname,pdesc,pprice,pimg FROM products";
       	   List ulist=new ArrayList();
       	   try {
       		Class.forName(driver);
     		 Connection con=DriverManager.getConnection(url,user,password);
         	 Statement st=con.createStatement();
         	ResultSet rs=st.executeQuery(sql);
         	 while(rs.next())
         	 {
         		 String temp=rs.getString(1)+":"+rs.getString(2)+":"+rs.getString(3)+":"+rs.getString(4)+":"+rs.getString(5);
         		 ulist.add(temp);
         	 }
       	   }catch(Exception e)
       	   {
       		   System.out.println("problem in fetching");
       	   }
       	   return ulist;
       }
}

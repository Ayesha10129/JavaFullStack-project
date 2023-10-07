<%@page import="com.shopNest3.dbhandler.DataFetcher" %>
<%@page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
  <title>Admin home</title>
  <link rel="stylesheet" href="adminStyle.css">
</head>
<body>
<%

      List userList=DataFetcher.fetchUsersInfo();

%>

  <div class="panel">
    <div class="button.container">
       <button class="active" data-tab="tab1">View customer info</button>
       <button data-tab="tab2">View products info</button>
       <button data-tab="tab3">Add new product</button>
    </div>
     <div class="content-container">
       <div class="tab active" id="tab1">
           <table border>
            <thead>
            <tr>
            <th>Username</th>
            <th>Email</th>
            <th>Gender</th>
            
          </tr>
         </thead>
         <tbody>
         
             <%
                     for(int i=0;i<userList.size();i++){
                     String[] custArr=((String)userList.get(i)).split(":");            
             %>
                <tr>
                       <td><%= custArr[0] %></td>
                       <td><%= custArr[1] %></td>
                       <td><%= custArr[2] %></td>
                       
                </tr>
                   <%
                         }
                   %>
                    <tr>
                    
                    </tr>               
            </tbody> 
        </table>
        </div>
        <br><br><br>
        <%
           List prodList=DataFetcher.fetchProductInfo();
        %>
        <div class="tab" id="tab2">
                 
                 <table border>
                  <thead>
                    <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Description</th>
                    <th>Price</th>
                    <th>Image</th>
                    </tr>
                    </thead>
                    <tbody>
                    
                    <%
                       for(int i=0;i<prodList.size();i++){
                    	   String[] prodArr=((String)prodList.get(i)).split(":");
                       
                    %>
                    <tr>
                        <td><%= prodArr[0] %></td>
                        <td><%= prodArr[1] %></td>
                        <td><%= prodArr[2] %></td>
                        <td><%= prodArr[3] %></td>
                        <td><img src="prodImg/<%= prodArr[4]%>" alt="product 1"></td>
                     </tr>
                     
                     <%
                         }
                     %>
                     <tr>
                     
                     </tr>
                     </tbody>
                     </table>
               </div>
     <br><br><br>
                        
<div class="tab" id="tab3" >
          
          <form action="addP" method="post">
            <div class="form-group">
              <label for="product-id">Product ID:</label>
              <input type="text" id="product-id" name="product-id" required>
            </div>
            <br><br>
            <div class="form-group">
                <label for="product-name">Product Name:</label>
              <input type="text" id="product-name" name="product-name" required>
            </div>
            <br><br>
            <div class="form-group">
                <label for="product-description">Product Description:</label>
              <input type="text" id="product-description" name="product-description" required>
            </div>
            <br><br>
            <div class="form-group">
                <label for="product-price">Product Price:</label>
              <input type="text" id="product-price" name="product-price" required>
            </div>
            <br><br>
            <div class="form-group">
                <label for="product-image">Product Image:</label>
              <input type="text" id="product-image" name="product-image" required>
            </div>
            <br><br>
            <button type="submit">Submit</button>
          </form>
</div>

</body>
</html>
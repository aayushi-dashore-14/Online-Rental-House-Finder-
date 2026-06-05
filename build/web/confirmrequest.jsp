<%-- 
    Document   : confirmrequest
    Created on : 27 Nov, 2024, 4:28:10 PM
    Author     : Lenovo
--%>
<%@page import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Rental House</title>
    </head>
    <body>
        <p>
            <%
            try {
      int id=Integer.parseInt(request.getParameter("id"));
      String username=(String)session.getAttribute("user");
      Connection con = null;
      con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rentalhouse","root","");
      String sql="update request set request_status=? where id=?";
     PreparedStatement p1=con.prepareStatement(sql);
     p1.setString(1,"confirm");
     p1.setInt(2,id);
     
     int row=p1.executeUpdate();
     if(row>0)
     {
         %>
         <script>
             alert("confirmed successfully");
             window.location.href='requestview.jsp';
         </script>
         <%
     }
         }
      catch(Exception e)
      {
          out.print(e.toString());
      }               
                  
      
       %>
        </p>
    </body>
</html>

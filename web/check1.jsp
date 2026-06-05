<%-- 
    Document   : check
    Created on : 11 Nov, 2024, 5:16:17 PM
    Author     : Lenovo
--%>
<%@page import="java.sql.*" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>check the login details of customer </title>
    </head>
    <body>
        <%
try
{
    String username=request.getParameter("u");
    String password=request.getParameter("p");
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rentalhouse","root","");
    Statement st=con.createStatement(); 
    ResultSet rs=st.executeQuery("Select * from customer where username='"+username+"' and password='"+password+"'");
    if(rs.next())
     {
       session.setAttribute("username",username);
        session.setAttribute("email",rs.getString("email"));
       response.sendRedirect("customerhome.jsp");
    }
    else
    {
        %>
        <script>
            alert("invalid login please try again");
            window.location='Customer login.jsp';
        </script>
        <%
    }
}         
catch(Exception e)
{
  out.print(e.toString());  
}                  
%>
    </body>
</html>

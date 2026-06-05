<%-- 
    Document   : sendrequest
    Created on : 20 Nov, 2024, 5:06:53 PM
    Author     : Lenovo
--%>
<%@page import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Rental House </title>
    </head>
    <body>
        <p>
            <%
            try
        {
                String property=request.getParameter("property");
                out.print(property);
                String location=request.getParameter("location");
                out.print(location); 
                String name=request.getParameter("name");
                out.print(name);
                ////String cnumber=request.getParameter("cnumber");
               // out.print(cnumber);
                
              //  String cnumber=request.getParameter("cnumber");
              //  out.print(cnumber);
                String email=(String)session.getAttribute("email");
                String id=(String)session.getAttribute("id");
                String uname=(String)session.getAttribute("username");
                String cnumber=(String)session.getAttribute("cnumber");
              Connection con=null;
              con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rentalhouse","root","");
                String sql="Insert INTO request(username,owner,cnumber,location,email,request_status,house_id) values(?,?,?,?,?,?,?)";
             PreparedStatement p1=con.prepareStatement(sql);
             
             p1.setString(1,uname);
             p1.setString(2,name);            
             p1.setString(3,cnumber);
             p1.setString(4,location);
             p1.setString(5,email);
             p1.setString(6,"Not Seen");
             p1.setString(7,id);
             
             int row=p1.executeUpdate();
             if(row>0) {
                 %>
                 <script>
                     alert("request send succesfully");
                     window.location.href="customerhome.jsp";
                 </script>        
                 <%
             }
     }
            catch(Exception e1)
          {
                out.print(e1.toString());
            }
            %>
        </p>
    </body>
</html>

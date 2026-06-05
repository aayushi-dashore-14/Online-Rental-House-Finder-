<%-- 
    Document   : AddPhoto
    Created on : 18 Nov, 2024, 4:34:10 PM
    Author     : Lenovo
--%>
<%@page import="java.io.InputStream" %>
<%@page import="java.sql.*"
        import="javax.servlet.annotation.MultipartConfig"
        import="javax.servlet.http.*"
        %>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Rental House </title>
    </head>
    <body>
        <%
      Connection connection=null;
      String a=(String)request.getParameter("location");
      String b=(String)request.getParameter("categories");
      String c=(String)request.getParameter("name");
      String d=(String)request.getParameter("email");
      String e=(String)request.getParameter("mob");
      String f=(String)request.getParameter("property");
      String g=(String)request.getParameter("rent");
      String h=(String)request.getParameter("rule");
      String i=(String)request.getParameter("above");
      
      try
       {
           Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rentalhouse","root","");
    
    InputStream inputStream=null;
    InputStream inputStream1=null;
    InputStream inputStream2=null;
    InputStream inputStream3=null;
    
    Part filePart=request.getPart("photo");
    Part filePart1=request.getPart("photo1");
    Part filePart2=request.getPart("photo2");
    Part filePart3=request.getPart("photo3");
    if(filePart!=null)
               {
        out.println(filePart.getName());
         out.println(filePart.getSize());
          out.println(filePart.getContentType());
          
          inputStream=filePart.getInputStream();
           inputStream1=filePart1.getInputStream();
            inputStream2=filePart2.getInputStream();
             inputStream3=filePart3.getInputStream();
             
       String sql="insert INTO addproperty(location,categories,name,email,mob,property,rent,rule,photo,photo1,photo2,photo3,approve) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
       PreparedStatement p1=con.prepareStatement(sql);
       p1.setString(1,a);
       p1.setString(2,b);
       p1.setString(3,c);
       p1.setString(4,d);
       p1.setString(5,e);
       p1.setString(6,f);
       p1.setString(7,g);
       p1.setString(8,h);
       p1.setBlob(9,inputStream);
       p1.setBlob(10,inputStream1);
       p1.setBlob(11,inputStream2);
       p1.setBlob(12,inputStream3);
       p1.setString(13,"no");
       int row=p1.executeUpdate();
       if(row>0)
      {
      %>
      
      <script>
          alert("your house is added ");
          window.location.href='AddProperty.jsp';
          
      </script>
      <%
         }
                }  
      }
      catch(Exception e1)
       {
          out.print(e1.toString());
      }
      %>
    </body>
</html>

<%-- 
    Document   : n
    Created on : 18 Nov, 2024, 3:28:05 PM
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
      <%
            try
            {
             Connection connection=null;
             String id = (String)session.getAttribute("username");
             out.print(id);
              Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rentalhouse","root","");
    Statement s = con.createStatement();
    ResultSet rst=s.executeQuery("select * from owner where username='"+id+"'");
    if(rst.next())
               {
        out.print(rst.getString("email"));
        %>
    <div class="col-md-4">
                      
    <center>
       <%=rst.getString("name")%>
        <p>
             <form action="editprofile.jsp" method="post" enctype="multipart/form-data">
                                <div class="row g-3">
                                    <div class="col-md-12">
                                        <div class="form-floating">
                                            <input type="text" class="form-control" id="name" name="fn" value="<%=rst.getString("name")%>"    placeholder="Your full Name">
                                            <label for="name"> Enter Your Name</label>
                                        </div>
                                    </div>
                                    <div class="col-md-12">
                                        <div class="form-floating">
                                            <input type="email" class="form-control" id="email" name="email" value="<%=rst.getString("email")%>"   placeholder="Your Email">
                                            <label for="email">Enter Your Email</label>
                                        </div>
                                    </div>
                                    <div class="col-md-12">
                                        <div class="form-floating">
                                            <input type="text" class="form-control" id="email" name="un"  value="<%=rst.getString("email")%>"  placeholder="Your Username">
                                            <label for="email">Enter user name</label>
                                        </div>
                                    </div> <div class="col-md-12">
                                        <div class="form-floating">
                                            <input type="password" class="form-control" id="email" name="password" value="<%=rst.getString("password")%>"     placeholder="your password">
                                            <label for="email"> Enter Password</label>
                                        </div>
                                    </div> <div class="col-md-12">
                                        <div class="form-floating">
                                            <input type="text" class="form-control" id="email" name="mob" value="<%=rst.getString("phoneno")%>"   placeholder="Your mobile no.">
                                            <label for="email"> Enter Mobile Number </label>
                                        </div>
                                    
                                    <div class="col-12">
                                        <input type="hidden" name="h" value="<%=id%>"
                                        <button class="btn btn-primary w-100 py-3" name="s" type="submit"> Edit Profile</button>
                                    </div>
                                </div>
                            </form>
</div>
                                        <p>
         <%
                 }
       }
            catch (Exception e)
              {
                e.printStackTrace();
                               }
            if(request.getParameter("s")!=null)
                               {
                try
           {
               Connection con=null;
               con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rentalhouse","root","");
               PreparedStatement p1=null;
               String sql=null;
               String fname=request.getParameter("fn");
               String email=request.getParameter("email");
               String password=request.getParameter("password");
               String mobno=request.getParameter("mob");
               String username=request.getParameter("un");
               String h1=request.getParameter("h");
               
               sql="update owner set name=?,email=?,password=?,phoneno=? where username=?";
               p1=con.prepareStatement(sql);
               p1.setString(1,fname);
               p1.setString(2,email);
               p1.setString(3,password);
               p1.setString(4,mobno);
               p1.setString(5,username);
               
               int y=p1.executeUpdate();
               if(y==1)
               {
                   %>
                   <script>
                       alert("record update");
                   </script>
                   <%}
               else
                 {%>
                 <script>
                     alert("record not found");
                 </script>
                 <%}
                  }
                catch(Exception e)
                  {
                    e.printStackTrace();
                }}
           
         %>
                
                   </p>
        </center>

    </body>
</html>

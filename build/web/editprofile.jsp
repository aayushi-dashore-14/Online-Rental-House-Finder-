
<%@page import="java.sql.*" %>
<%@page import="javax.servlet.http.*" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <title>Rental House</title>
    <meta content="width=device-width, initial-scale=1.0" name="viewport">
    <meta content="" name="keywords">
    <meta content="" name="description">

    <!-- Favicon -->
    <link href="img/favicon.ico" rel="icon">

    <!-- Google Web Fonts -->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Heebo:wght@400;500;600&family=Inter:wght@700;800&display=swap" rel="stylesheet">
    
    <!-- Icon Font Stylesheet -->
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css" rel="stylesheet">

    <!-- Libraries Stylesheet -->
    <link href="lib/animate/animate.min.css" rel="stylesheet">
    <link href="lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">

    <!-- Customized Bootstrap Stylesheet -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Template Stylesheet -->
    <link href="css/style.css" rel="stylesheet">
</head>

<body>
    
    <!-- Navbar Start -->
        <div class="container-fluid nav-bar bg-transparent">
            <nav class="navbar navbar-expand-lg bg-white navbar-light py-0 px-4">
                <a href="index.html" class="navbar-brand d-flex align-items-center text-center">
                    <div class="icon p-2 me-2">
                        <img class="img-fluid" src="img/icon-deal.png" alt="Icon" style="width: 30px; height: 30px;">
                    </div>
                    <h1 class="m-0 text-primary"><%=session.getAttribute("username")%></h1>
                </a>
                <button type="button" class="navbar-toggler" data-bs-toggle="collapse" data-bs-target="#navbarCollapse">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarCollapse">
                    <div class="navbar-nav ms-auto">
                        <a href="ownerhome.jsp" class="nav-item nav-link">Home</a>
                        <a href="editprofile.jsp" class="nav-item nav-link">Edit Profile</a>
                        <a href="requestview.jsp" class="nav-item nav-link">Request View</a>
                        <a href="logout.jsp" class="nav-item nav-link">Logout</a>
                    </div>
                   
                </div>
            </nav>
        </div>
        <!-- Navbar End -->


        <!-- Team Start -->
        <div class="container-xxl py-5">
            <div class="container">
                <div class="text-center mx-auto mb-5 wow fadeInUp" data-wow-delay="0.1s" style="max-width: 600px;">
                    <h1 class="mb-3">Welcome</h1>
                 
                </div>
                 <div class="col-md-6">
            
        </div>
        <!-- Header Start -->
        <center>
        <!-- Header End -->

            <%
            try
            {
             Connection connection=null;
             String id = (String)session.getAttribute("username");
           //  out.print(id);
              Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rentalhouse","root","");
    Statement s = con.createStatement();
    ResultSet rst=s.executeQuery("select * from owner where username='"+id+"'");
    if(rst.next())
               {
        %>
    <div class="col-md-4">
                      
    <center>
       
        <p>
             <form action="editprofile.jsp" method="post" >
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
                                            <input type="password" class="form-control" id="password" name="password" value="<%=rst.getString("password")%>"     placeholder="your password">
                                            <label for="email"> Enter Password</label>
                                        </div>
                                    </div> <div class="col-md-12">
                                        <div class="form-floating">
                                            <input type="text" class="form-control" id="mobile" name="mob" value="<%=rst.getString("phoneno")%>"   placeholder="Your mobile no.">
                                            <label for="email"> Enter Mobile Number </label>
                                        </div>
                                            <br>
                                            
                                    <div class="col-12">
                                        <input type="hidden" name="h" value="<%=id%>">
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
               //String username=request.getParameter("un");
               String h1=request.getParameter("h");
               
               sql="update owner set name=?,email=?,password=?,phoneno=? where username=?";
               p1=con.prepareStatement(sql);
               
               p1.setString(1,fname);
               p1.setString(2,email);
               p1.setString(3,password);
               p1.setString(4,mobno);
               p1.setString(5,h1);
               
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


        <!-- Back to Top -->
        <a href="#" class="btn btn-lg btn-primary btn-lg-square back-to-top"><i class="bi bi-arrow-up"></i></a>
    </div>

    <!-- JavaScript Libraries -->
    <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"></script>
    <script src="lib/wow/wow.min.js"></script>
    <script src="lib/easing/easing.min.js"></script>
    <script src="lib/waypoints/waypoints.min.js"></script>
    <script src="lib/owlcarousel/owl.carousel.min.js"></script>

    <!-- Template Javascript -->
    <script src="js/main.js"></script>
</body>

</html>
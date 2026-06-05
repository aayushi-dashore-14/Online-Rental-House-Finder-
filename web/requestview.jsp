<%@page import="java.sql.*" %>

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
<style>
     h4
     {
        
        border: 4px solid #000;
        margin: auto;
        padding: 5px;
      
    }
</style>

<body>
    <!-- Navbar Start -->
        <div class="container-fluid nav-bar bg-transparent">
            <nav class="navbar navbar-expand-lg bg-white navbar-light py-0 px-4">
                <a href="index.html" class="navbar-brand d-flex align-items-center text-center">
                    <div class="icon p-2 me-2">
                        <img class="img-fluid" src="img/icon-deal.png" alt="Icon" style="width: 30px; height: 30px;">
                    </div>
                    <h1 class="m-0 text-primary"><%=session.getAttribute("username")%> </h1>
                </a>
                <button type="button" class="navbar-toggler" data-bs-toggle="collapse" data-bs-target="#navbarCollapse">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarCollapse">
                    <div class="navbar-nav ms-auto">
                        <a href="ownerhome.jsp" class="nav-item nav-link">Home</a>
                        <a href="editprofile.jsp" class="nav-item nav-link">Edit Profile</a>
                        <a href="requestview.jsp" class="nav-item nav-link">Request View</a>
                         <a href="AddProperty.jsp" class="nav-item nav-link">Add property</a>
                        <a href="logout.jsp" class="nav-item nav-link">Logout</a>
                    </div>
                   
                </div>
            </nav>
        </div>
        <!-- Navbar End -->
        <section class="intro-single">
            <div class="container">
                <div align="center" class="style1">
                    <div id="copyright"> 
                        <p class="fl_left">&nbsp;</p>
                        
                        <%
                        Connection con=null;
                        try
                        {
            Class.forName("com.mysql.jdbc.Driver");
         con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rentalhouse","root",""); 
         
         Statement stmt= con.createStatement();
         
         String n=(String)session.getAttribute("username");
         String strQuery="select * from request where owner='"+n+"'";
         ResultSet rs=stmt.executeQuery(strQuery);
  int sno=0;
  while(rs.next())
   {
      sno++;
      int id=rs.getInt("id");
      session.setAttribute("id", id); 
 %>
 <style>
     .abc
     {
         position: relative;
         display: flex;
     }  
 </style>
 <p>
 <div class="abc">
     <div>
         <h4>
         
         Address:<%=rs.getString("location")%> <br>
         Name:<%=rs.getString("username")%> <br>
         Mobile:<%=rs.getString("cnumber")%> <br>
         <input type="button" value="Confirm Request" onclick="window.open('confirmrequest.jsp?id=<%=rs.getInt("id")%>')"/>       
     </h4>
     </div>
     
       
     </div>
 </p>
 <%
 }
  rs.close();
  con.close();
  stmt.close();
   }
                        catch(Exception e)
                          {
                            e.getMessage();
                        }
                        %>
                    </p>
                    </div></div>
            </div>

    
        <!-- Back to Top -->
        <a href="#" class="btn btn-lg btn-primary btn-lg-square back-to-top"><i class="bi bi-arrow-up"></i></a>
    </div>
</section>

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
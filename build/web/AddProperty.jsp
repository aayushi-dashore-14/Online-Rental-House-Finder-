
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
              
                <button type="button" class="navbar-toggler" data-bs-toggle="collapse" data-bs-target="#navbarCollapse">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarCollapse">
                    <div class="navbar-nav ms-auto">
                        <a href="ownerhome.jsp" class="nav-item nav-link">Home</a>
                        <a href="editprofile1.jsp" class="nav-item nav-link">Edit Profile</a>
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

    <div class="col-md-4">
                      
    <center>
       
        <p>
        <form action="AddPhoto.jsp" method="post" enctype="multipart/form-data" >
                                <div class="row g-3">
                                    <div class="col-md-12">
                                        <div class="form-floating">
                                            <input type="text" class="form-control" id="name" name="location" placeholder="Enter location">
                                            <label for="name"> Enter The Location</label>
                                        </div>
                                    </div>
                                            
                                            <select name="categories" style="border-radius: 60px;width: 100%;padding: 2%;"> >
                                                <option>--Select--</option>
                                                <option> Only For Family</option>
                                                <option>Only For Single</option>
                                                <option>Only For Girls</option>
                                                <option> Only For Boys</option>
                                            </select> 
                                            
                                            
                                     <div class="col-md-12">
                                        <div class="form-floating">
                                            <input type="text" class="form-control" id="name" name="name" value="<%=session.getAttribute("username")%>"placeholder="Enter Name">
                                            <label for="name"> Enter The Name</label>
                                        </div>
                                    </div>
                                            
                                    <div class="col-md-12">
                                        <div class="form-floating">
                                            <input type="email" class="form-control" id="email" name="email" placeholder="Your Email">
                                            <label for="email">Enter Your Email</label>
                                        </div>
                                    </div>
                                    
                                            
                                     <div class="col-md-12">
                                        <div class="form-floating">
                                            <input type="text" class="form-control" id="email" name="mob" placeholder="Your mobile no.">
                                            <label for="email"> Enter Mobile Number </label>
                                        </div>
                                     </div>
                           <select name="property" style="border-radius: 20px;width:100%;padding: 2%;"> >
                                                <option>--Select--</option>
                                                <option> 1BHK </option>
                                                <option> 2BHK</option>
                                                <option> 3BHK</option>
                                            </select>    
                                            
                                            <div class="col-md-12">
                                        <div class="form-floating">
                                            <input type="text" class="form-control" id="email" name="rent" placeholder="Your Rent">
                                            <label for="email"> Enter Rent  </label>
                                        </div>
                                     </div>
                                          
                                            <textarea name="rule" placeholder="enter rules and regulation">

                                            </textarea>
                                            
                                            <input type="file" name="photo">
                                            <br><br>
                                            
                                            <input type="file" name="photo1">
                                            <br><br>
                                            
                                            <input type="file" name="photo2">
                                            <br><br>
                                            
                                            <input type="file" name="photo3">
                                            <br><br>
                                            
                              
                                    <div class="col-12">
                                        <input type="submit" name="submit" value="submit" placeholder="submit">
                           
                                    </div>
                                </div>
                 <p>&nbsp;</p>
                 <p>&nbsp;</p>
                 <p>&nbsp;</p>
                 <p>&nbsp;</p>
                            </form>
</div>
                                        <p>
       
                
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
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
    <div class="container-xxl bg-white p-0">
        <!-- Spinner Start -->
        <div id="spinner" class="show bg-white position-fixed translate-middle w-100 vh-100 top-50 start-50 d-flex align-items-center justify-content-center">
            <div class="spinner-border text-primary" style="width: 3rem; height: 3rem;" role="status">
                <span class="sr-only">Loading...</span>
            </div>
        </div>
        <!-- Spinner End -->


        <!-- Navbar Start -->
        <div class="container-fluid nav-bar bg-transparent">
            <nav class="navbar navbar-expand-lg bg-white navbar-light py-0 px-4">
                <a href="index.html" class="navbar-brand d-flex align-items-center text-center">
                    <div class="icon p-2 me-2">
                        <img class="img-fluid" src="img/icon-deal.png" alt="Icon" style="width: 30px; height: 30px;">
                    </div>
                    <h1 class="m-0 text-primary"></h1>
                </a>
                <button type="button" class="navbar-toggler" data-bs-toggle="collapse" data-bs-target="#navbarCollapse">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarCollapse">
                    <div class="navbar-nav ms-auto">
                        <a href="index.html" class="nav-item nav-link">Home</a>
                        <a href="about.html" class="nav-item nav-link">About</a>
                        <div class="nav-item dropdown">
                            <a href="#" class="nav-link dropdown-toggle" data-bs-toggle="dropdown">Accounts</a>
                            <div class="dropdown-menu rounded-0 m-0">
                             
                                <a href="#" class="dropdown-item">Owner</a>
                                <a href="#" class="dropdown-item">Customer</a>
                            </div>
                        </div>
                        
                        <a  class="nav-item nav-link active">Contact</a>
                    </div>
                    
                </div>
            </nav>
        </div>
        <!-- Navbar End -->

        <div class="col-md-6">
            
        </div>
        <!-- Header Start -->
        <center>
        <!-- Header End -->
<div class="col-md-4">
                        <div class="wow fadeInUp" data-wow-delay="0.5s">
                          
                            <h1 align="center" > Login Here </h1>
                            
                            <form action="check.jsp">
                                <div class="row g-3">
                                    <div class="col-md-12">
                                        <div class="form-floating">
                                            <input type="text" name="u"class="form-control" id="name" placeholder="Your Name">
                                            <label for="name">Enter the user name</label>
                                        </div>
                                    </div>
                                    <div class="col-md-12">
                                        <div class="form-floating">
                                            <input type="password" name="p" class="form-control" id="email" placeholder="Your Email">
                                            <label for="email">Enter the password</label>
                                        </div>
                                    </div>
                                  
                                    <div class="col-12">
                                        <button class="btn btn-primary w-100 py-3" type="submit"> Login </button>
                                    </div>
                                     <button class="btn btn-primary w-100 py-3" onclick="window.open('Owner.jsp')">
                                   Register
                                    </button>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
</center>
        <!-- Search Start -->
        
        <!-- Search End -->


       

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
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <title> View Property</title>
    <link>
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
    
     <!-- Bootstrap CSS -->
    <link rel="stylesheet" 
          href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

</head>

<body>
    <!-- Navbar Start -->
        <div class="container-fluid nav-bar bg-transparent">
            <nav class="navbar navbar-expand-lg bg-white navbar-light py-0 px-4">
                <a href="" class="navbar-brand d-flex align-items-center text-center">
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
                        <a href="customerhome.jsp" class="nav-item nav-link">Home</a>
                        <a href="editprofile.jsp" class="nav-item nav-link">Edit Profile</a>
                        <a href="viewproperty.jsp" class="nav-item nav-link">View Property</a>
                         <a href="customerrequest.jsp" class="nav-item nav-link">My Request</a>
                        <a href="logout.jsp" class="nav-item nav-link">Logout</a>
                    </div>
                   
                </div>
            </nav>
        </div>
        <!-- Navbar End -->


        <!-- Team Start -->
        
           
                
                
                   <%
                   Connection conn = null;
                   Statement stmt = null;
                   ResultSet rs = null;
                  
                   // <form action="sendrequest.jsp">
                  //      <span class="style">
                   
                 
                /*     try
                    {
                         //load MYSQL JDBC Driver
                    Class.forName("com.mysql.jdbc.Driver");
                  
                    //Established MYSQL Connection
    conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/rentalhouse","root","");
    stmt=conn.createStatement(); 

      String strQuery="select * from addproperty";
       rs=stmt.executeQuery(strQuery);
      int sno=0;
      while(rs.next())
                   {
          String id=rs.getString("id");
          session.setAttribute("id",id);
           String cnum=rs.getString("mob");
          session.setAttribute("cnumber",cnum);
                String email=rs.getString("email");
          session.setAttribute("email",email);
            String name=rs.getString("name");
            
          session.setAttribute("name",name);*/
           %>
               <div class="container">
        <h2 align="center">Welcome</h2>
        <div class="row">
                     <% 
                // Import necessary Java packages
                // Establish database connection
                
                
                try {
                    // Load MySQL JDBC Driver
                    Class.forName("com.mysql.jdbc.Driver");
                  //  String tb=request.getParameter("tab");
                    //session.setAttribute("tb",tb);
                    // Establish MySQL connection
                    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rentalhouse", "root", "");
                    
                    // Execute SQL query to retrieve products
                    stmt = conn.createStatement();
                    String sql = "SELECT * FROM addproperty";
                    rs = stmt.executeQuery(sql);
                    
                    // Iterate over the result set and display products
                    while (rs.next()) {
                        String id = rs.getString("id");
                        session.setAttribute("id",id);
                        
                        String location = rs.getString("location");
                        session.setAttribute("location",location);
                        
                        int price = rs.getInt("rent");
                        session.setAttribute("price",price);
                        
                        String cnum=rs.getString("mob");
                        session.setAttribute("cnumber",cnum);
                        
                      
                       
                        
                      ///  String owner=rs.getString("owner");
                        //session.setAttribute("owner",owner);                        
                        
                         String name=rs.getString("name");
            
                      //  String image = rs.getString("image_url");
            %>
            <div class="col-md-3">
                <div class="card">
                  
                    <div class="card-body">
                        <img src="imagecustomer.jsp?imgid=<%=location%>" width="170" height="160">
                        <h5 class="card-title"><%= location %></h5>
                        <p class="card-text">Rent:<%= price %></p>
                         <p class="card-text">Mobile:<%= cnum %></p>
                         <p class="card-text">Name:-<%= name%></p>
                         
                        
                       
                         <input type="hidden" name="in" value="<%= location %>">
                        <div class="form-group">
                           
                
                                   
                        </div>
                        <button class="btn btn-primary" onClick="addToCart('<%=name%>','<%=price%>','<%=location%>')">Send Request</button>
                    </div>
                </div>
            </div>
            <% 
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    // Close database connections
                    try {
                        if (rs != null) rs.close();
                        if (stmt != null) stmt.close();
                        if (conn != null) conn.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            %>
        </div>
    </div>
        
    <script>
        function addToCart(name, p,l) {
            //var quantity = document.getElementById('quantity' + productId).value;
            // Perform addition to cart operation here
            //alert('Added ' );
           
            window.open("sendrequest.jsp?name="+name+"&p="+p+"&location="+l);
            alert("Request sent successfully")
        }
    </script>

    <!-- Bootstrap JS -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>


     

    <!-- JavaScript Libraries -->
   

    <!-- Template Javascript -->
    <script src="js/main.js"></script>
</body>

</html>
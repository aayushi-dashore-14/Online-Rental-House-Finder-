package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class viewproperty_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <title> View Property</title>\n");
      out.write("    <link>\n");
      out.write("    <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\n");
      out.write("    <meta content=\"\" name=\"keywords\">\n");
      out.write("    <meta content=\"\" name=\"description\">\n");
      out.write("\n");
      out.write("    <!-- Favicon -->\n");
      out.write("    <link href=\"img/favicon.ico\" rel=\"icon\">\n");
      out.write("\n");
      out.write("    <!-- Google Web Fonts -->\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Heebo:wght@400;500;600&family=Inter:wght@700;800&display=swap\" rel=\"stylesheet\">\n");
      out.write("    \n");
      out.write("    <!-- Icon Font Stylesheet -->\n");
      out.write("    <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Libraries Stylesheet -->\n");
      out.write("    <link href=\"lib/animate/animate.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"lib/owlcarousel/assets/owl.carousel.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Customized Bootstrap Stylesheet -->\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Template Stylesheet -->\n");
      out.write("    <link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("    \n");
      out.write("     <!-- Bootstrap CSS -->\n");
      out.write("    <link rel=\"stylesheet\" \n");
      out.write("          href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <!-- Navbar Start -->\n");
      out.write("        <div class=\"container-fluid nav-bar bg-transparent\">\n");
      out.write("            <nav class=\"navbar navbar-expand-lg bg-white navbar-light py-0 px-4\">\n");
      out.write("                <a href=\"\" class=\"navbar-brand d-flex align-items-center text-center\">\n");
      out.write("                    <div class=\"icon p-2 me-2\">\n");
      out.write("                        <img class=\"img-fluid\" src=\"img/icon-deal.png\" alt=\"Icon\" style=\"width: 30px; height: 30px;\">\n");
      out.write("                    </div>\n");
      out.write("                    <h1 class=\"m-0 text-primary\">");
      out.print(session.getAttribute("username"));
      out.write(" </h1>\n");
      out.write("                </a>\n");
      out.write("                <button type=\"button\" class=\"navbar-toggler\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarCollapse\">\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarCollapse\">\n");
      out.write("                    <div class=\"navbar-nav ms-auto\">\n");
      out.write("                        <a href=\"customerhome.jsp\" class=\"nav-item nav-link\">Home</a>\n");
      out.write("                        <a href=\"editprofile.jsp\" class=\"nav-item nav-link\">Edit Profile</a>\n");
      out.write("                        <a href=\"viewproperty.jsp\" class=\"nav-item nav-link\">View Property</a>\n");
      out.write("                         <a href=\"customerrequest.jsp\" class=\"nav-item nav-link\">My Request</a>\n");
      out.write("                        <a href=\"logout.jsp\" class=\"nav-item nav-link\">Logout</a>\n");
      out.write("                    </div>\n");
      out.write("                   \n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("        <!-- Navbar End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Team Start -->\n");
      out.write("        \n");
      out.write("            <div class=\"container\">\n");
      out.write("                <h2> view Property </h2>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                   ");

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
           
      out.write("\n");
      out.write("               <div class=\"container\">\n");
      out.write("        <h2>Shopping Cart</h2>\n");
      out.write("        <div class=\"row\">\n");
      out.write("                     ");
 
                // Import necessary Java packages
                // Establish database connection
                
                
                try {
                    // Load MySQL JDBC Driver
                    Class.forName("com.mysql.jdbc.Driver");
                  //  String tb=request.getParameter("tab");
                    //session.setAttribute("tb",tb);
                    // Establish MySQL connection
                    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/addproperty", "root", "");
                    
                    // Execute SQL query to retrieve products
                    stmt = conn.createStatement();
                    String sql = "SELECT * FROM addproperty";
                    rs = stmt.executeQuery(sql);
                    
                    // Iterate over the result set and display products
                    while (rs.next()) {
                        String id = rs.getString("id");
                        String location = rs.getString("location");
                        double price = rs.getDouble("rent");
                      //  String image = rs.getString("image_url");
            
      out.write("\n");
      out.write("            <div class=\"col-md-3\">\n");
      out.write("                <div class=\"card\">\n");
      out.write("                  \n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <img src=\"image.jsp?imgid=");
      out.print(id);
      out.write("\" width=\"170\" height=\"160\">\n");
      out.write("                        <h5 class=\"card-title\">");
      out.print( location );
      out.write("</h5>\n");
      out.write("                        <p class=\"card-text\">Price: $");
      out.print( price );
      out.write("</p>\n");
      out.write("                       \n");
      out.write("                         <input type=\"hidden\" name=\"in\" value=\"");
      out.print( location );
      out.write("\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"quantity\">Quantity:</label>\n");
      out.write("                \n");
      out.write("                                   \n");
      out.write("                        </div>\n");
      out.write("                        <button class=\"btn btn-primary\" onclick=\"addToCart('");
      out.print(id );
      out.write("','");
      out.print(price);
      out.write("','");
      out.print(location );
      out.write("')\">Add to Cart</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            ");
 
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
            
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap JS -->\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        function addToCart(productId, p,name) {\n");
      out.write("            var quantity = document.getElementById('quantity' + productId).value;\n");
      out.write("            // Perform addition to cart operation here\n");
      out.write("            alert('Added ' + quantity + ' of product ' + productId + ' to cart.');\n");
      out.write("            window.open(\"cart.jsp?pi=\"+productId+\"&q=\"+quantity+\"&p=\"+p+\"&iname=\"+name);\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("     \n");
      out.write("\n");
      out.write("    <!-- JavaScript Libraries -->\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.4.1.min.js\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("    <script src=\"lib/wow/wow.min.js\"></script>\n");
      out.write("    <script src=\"lib/easing/easing.min.js\"></script>\n");
      out.write("    <script src=\"lib/waypoints/waypoints.min.js\"></script>\n");
      out.write("    <script src=\"lib/owlcarousel/owl.carousel.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Template Javascript -->\n");
      out.write("    <script src=\"js/main.js\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

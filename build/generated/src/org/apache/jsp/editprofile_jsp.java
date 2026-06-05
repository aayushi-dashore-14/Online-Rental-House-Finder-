package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import javax.servlet.http.*;

public final class editprofile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <title>Rental House</title>\n");
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
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("    <!-- Navbar Start -->\n");
      out.write("        <div class=\"container-fluid nav-bar bg-transparent\">\n");
      out.write("            <nav class=\"navbar navbar-expand-lg bg-white navbar-light py-0 px-4\">\n");
      out.write("                <a href=\"index.html\" class=\"navbar-brand d-flex align-items-center text-center\">\n");
      out.write("                    <div class=\"icon p-2 me-2\">\n");
      out.write("                        <img class=\"img-fluid\" src=\"img/icon-deal.png\" alt=\"Icon\" style=\"width: 30px; height: 30px;\">\n");
      out.write("                    </div>\n");
      out.write("                    <h1 class=\"m-0 text-primary\">");
      out.print(session.getAttribute("username"));
      out.write("</h1>\n");
      out.write("                </a>\n");
      out.write("                <button type=\"button\" class=\"navbar-toggler\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarCollapse\">\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarCollapse\">\n");
      out.write("                    <div class=\"navbar-nav ms-auto\">\n");
      out.write("                        <a href=\"ownerhome.jsp\" class=\"nav-item nav-link\">Home</a>\n");
      out.write("                        <a href=\"editprofile.jsp\" class=\"nav-item nav-link\">Edit Profile</a>\n");
      out.write("                        <a href=\"requestview.jsp\" class=\"nav-item nav-link\">Request View</a>\n");
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
      out.write("        <div class=\"container-xxl py-5\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"text-center mx-auto mb-5 wow fadeInUp\" data-wow-delay=\"0.1s\" style=\"max-width: 600px;\">\n");
      out.write("                    <h1 class=\"mb-3\">Welcome</h1>\n");
      out.write("                 \n");
      out.write("                </div>\n");
      out.write("                 <div class=\"col-md-6\">\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        <!-- Header Start -->\n");
      out.write("        <center>\n");
      out.write("        <!-- Header End -->\n");
      out.write("\n");
      out.write("            ");

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
        
      out.write("\n");
      out.write("    <div class=\"col-md-4\">\n");
      out.write("                      \n");
      out.write("    <center>\n");
      out.write("       \n");
      out.write("        <p>\n");
      out.write("             <form action=\"editprofile.jsp\" method=\"post\" >\n");
      out.write("                                <div class=\"row g-3\">\n");
      out.write("                                    <div class=\"col-md-12\">\n");
      out.write("                                        <div class=\"form-floating\">\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" id=\"name\" name=\"fn\" value=\"");
      out.print(rst.getString("name"));
      out.write("\"    placeholder=\"Your full Name\">\n");
      out.write("                                            <label for=\"name\"> Enter Your Name</label>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-12\">\n");
      out.write("                                        <div class=\"form-floating\">\n");
      out.write("                                            <input type=\"email\" class=\"form-control\" id=\"email\" name=\"email\" value=\"");
      out.print(rst.getString("email"));
      out.write("\"   placeholder=\"Your Email\">\n");
      out.write("                                            <label for=\"email\">Enter Your Email</label>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                     <div class=\"col-md-12\">\n");
      out.write("                                        <div class=\"form-floating\">\n");
      out.write("                                            <input type=\"password\" class=\"form-control\" id=\"password\" name=\"password\" value=\"");
      out.print(rst.getString("password"));
      out.write("\"     placeholder=\"your password\">\n");
      out.write("                                            <label for=\"email\"> Enter Password</label>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div> <div class=\"col-md-12\">\n");
      out.write("                                        <div class=\"form-floating\">\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" id=\"mobile\" name=\"mob\" value=\"");
      out.print(rst.getString("phoneno"));
      out.write("\"   placeholder=\"Your mobile no.\">\n");
      out.write("                                            <label for=\"email\"> Enter Mobile Number </label>\n");
      out.write("                                        </div>\n");
      out.write("                                            <br>\n");
      out.write("                                            \n");
      out.write("                                    <div class=\"col-12\">\n");
      out.write("                                        <input type=\"hidden\" name=\"h\" value=\"");
      out.print(id);
      out.write("\">\n");
      out.write("                                        <button class=\"btn btn-primary w-100 py-3\" name=\"s\" type=\"submit\"> Edit Profile</button>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("</div>\n");
      out.write("                                        <p>\n");
      out.write("         ");

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
                   
      out.write("\n");
      out.write("                   <script>\n");
      out.write("                       alert(\"record update\");\n");
      out.write("                   </script>\n");
      out.write("                   ");
}
               else
                 {
      out.write("\n");
      out.write("                 <script>\n");
      out.write("                     alert(\"record not found\");\n");
      out.write("                 </script>\n");
      out.write("                 ");
}
                  }
                catch(Exception e)
                  {
                    e.printStackTrace();
                }}
           
         
      out.write("\n");
      out.write("                \n");
      out.write("                   </p>\n");
      out.write("        </center>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Back to Top -->\n");
      out.write("        <a href=\"#\" class=\"btn btn-lg btn-primary btn-lg-square back-to-top\"><i class=\"bi bi-arrow-up\"></i></a>\n");
      out.write("    </div>\n");
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

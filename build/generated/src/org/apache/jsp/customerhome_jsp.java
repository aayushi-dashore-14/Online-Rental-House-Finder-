package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class customerhome_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <title>Rental House</title>\r\n");
      out.write("    <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\r\n");
      out.write("    <meta content=\"\" name=\"keywords\">\r\n");
      out.write("    <meta content=\"\" name=\"description\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Favicon -->\r\n");
      out.write("    <link href=\"img/favicon.ico\" rel=\"icon\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Google Web Fonts -->\r\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Heebo:wght@400;500;600&family=Inter:wght@700;800&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("    \r\n");
      out.write("    <!-- Icon Font Stylesheet -->\r\n");
      out.write("    <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Libraries Stylesheet -->\r\n");
      out.write("    <link href=\"lib/animate/animate.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"lib/owlcarousel/assets/owl.carousel.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Customized Bootstrap Stylesheet -->\r\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Template Stylesheet -->\r\n");
      out.write("    <link href=\"css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write("  \r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<body background=\"p4.jpg\">\r\n");
      out.write("    <!-- Navbar Start -->\r\n");
      out.write("        <div class=\"container-fluid nav-bar bg-transparent\">\r\n");
      out.write("            <nav class=\"navbar navbar-expand-lg bg-white navbar-light py-0 px-4\">\r\n");
      out.write("                <a href=\"index.html\" class=\"navbar-brand d-flex align-items-center text-center\">\r\n");
      out.write("                    <div class=\"icon p-2 me-2\">\r\n");
      out.write("                        <img class=\"img-fluid\" src=\"img/icon-deal.png\" alt=\"Icon\" style=\"width: 30px; height: 30px;\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <h1 class=\"m-0 text-primary\">");
      out.print(session.getAttribute("username"));
      out.write(" </h1>\r\n");
      out.write("                </a>\r\n");
      out.write("                <button type=\"button\" class=\"navbar-toggler\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarCollapse\">\r\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("                </button>\r\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarCollapse\">\r\n");
      out.write("                    <div class=\"navbar-nav ms-auto\">\r\n");
      out.write("                        <a href=\"customerhome.jsp\" class=\"nav-item nav-link\">Home</a>\r\n");
      out.write("                        <a href=\"editprofile1.jsp\" class=\"nav-item nav-link\">Edit Profile</a>\r\n");
      out.write("                        <a href=\"viewproperty.jsp\" class=\"nav-item nav-link\">View Property</a>\r\n");
      out.write("                         <a href=\"customerrequest.jsp\" class=\"nav-item nav-link\">My Request</a>\r\n");
      out.write("                        <a href=\"logout.jsp\" class=\"nav-item nav-link\">Logout</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                   \r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Navbar End -->\r\n");
      out.write("       \r\n");
      out.write("       <!-- <h1> Welocme  </h1> -->\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Back to Top -->\r\n");
      out.write("        <a href=\"#\" class=\"btn btn-lg btn-primary btn-lg-square back-to-top\"><i class=\"bi bi-arrow-up\"></i></a>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- JavaScript Libraries -->\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.4.1.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("    <script src=\"lib/wow/wow.min.js\"></script>\r\n");
      out.write("    <script src=\"lib/easing/easing.min.js\"></script>\r\n");
      out.write("    <script src=\"lib/waypoints/waypoints.min.js\"></script>\r\n");
      out.write("    <script src=\"lib/owlcarousel/owl.carousel.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Template Javascript -->\r\n");
      out.write("    <script src=\"js/main.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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

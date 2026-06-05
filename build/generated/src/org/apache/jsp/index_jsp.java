package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <title> City Rentals </title>\n");
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
      out.write("    <div class=\"container-xxl bg-white p-0\">\n");
      out.write("        <!-- Spinner Start -->\n");
      out.write("        <div id=\"spinner\" class=\"show bg-white position-fixed translate-middle w-100 vh-100 top-50 start-50 d-flex align-items-center justify-content-center\">\n");
      out.write("            <div class=\"spinner-border text-primary\" style=\"width: 3rem; height: 3rem;\" role=\"status\">\n");
      out.write("                <span class=\"sr-only\">Loading...</span>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Spinner End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Navbar Start -->\n");
      out.write("        <div class=\"container-fluid nav-bar bg-transparent\">\n");
      out.write("            <nav class=\"navbar navbar-expand-lg bg-white navbar-light py-0 px-4\">\n");
      out.write("                <a href=\"index.html\" class=\"navbar-brand d-flex align-items-center text-center\">\n");
      out.write("                    <div class=\"icon p-2 me-2\">\n");
      out.write("                        <img class=\"img-fluid\" src=\"img/icon-deal.png\" alt=\"Icon\" style=\"width: 30px; height: 30px;\">\n");
      out.write("                    </div>\n");
      out.write("                    <h1 class=\"m-0 text-primary\"> City Rentals  </h1>\n");
      out.write("                </a>\n");
      out.write("                <button type=\"button\" class=\"navbar-toggler\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarCollapse\">\n");
      out.write("                    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                </button>\n");
      out.write("                <div class=\"collapse navbar-collapse\" id=\"navbarCollapse\">\n");
      out.write("                    <div class=\"navbar-nav ms-auto\">\n");
      out.write("                        <a href=\"index.jsp\" class=\"nav-item nav-link active\">Home</a>\n");
      out.write("                        <a href=\"about.jsp\" class=\"nav-item nav-link\">About</a>\n");
      out.write("                        <div class=\"nav-item dropdown\">\n");
      out.write("                            <a href=\"#\" class=\"nav-link dropdown-toggle\" data-bs-toggle=\"dropdown\">Account </a>\n");
      out.write("                            <div class=\"dropdown-menu rounded-0 m-0\">\n");
      out.write("                              \n");
      out.write("                                <a href=\"Owner Login.jsp\" class=\"dropdown-item\">Owner</a>\n");
      out.write("                                <a href=\"Customer Login.jsp\" class=\"dropdown-item\">Customer</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                       \n");
      out.write("                        <a href=\"contact.jsp\" class=\"nav-item nav-link\">Contact</a>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("        <!-- Navbar End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Header Start -->\n");
      out.write("        <div class=\"container-fluid header bg-white p-0\">\n");
      out.write("            <div class=\"row g-0 align-items-center flex-column-reverse flex-md-row\">\n");
      out.write("                <div class=\"col-md-6 p-5 mt-lg-5\">\n");
      out.write("                    <h1 class=\"display-5 animated fadeIn mb-4\">Find A <span class=\"text-primary\">Perfect Home</span> To Live With Your Family</h1>\n");
      out.write("                    <p class=\"animated fadeIn mb-4 pb-2\"></p>\n");
      out.write("                   \n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-6 animated fadeIn\">\n");
      out.write("                    <div class=\"owl-carousel header-carousel\">\n");
      out.write("                        <div class=\"owl-carousel-item\">\n");
      out.write("                            <img class=\"img-fluid\" src=\"img/carousel-1.jpg\" alt=\"\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"owl-carousel-item\">\n");
      out.write("                            <img class=\"img-fluid\" src=\"img/carousel-2.jpg\" alt=\"\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Header End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("      \n");
      out.write("\n");
      out.write("        \n");
      out.write("\n");
      out.write("\n");
      out.write("       \n");
      out.write("\n");
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

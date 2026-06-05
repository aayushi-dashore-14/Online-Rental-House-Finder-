package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class sendrequest_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title> Rental House </title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <p>\n");
      out.write("            ");

            try
        {
                String property=request.getParameter("property");
                out.print(property);
                String location=request.getParameter("location");
                out.print(location); 
                String name=request.getParameter("name");
                out.print(name);
                ////String cnumber=request.getParameter("cnumber");
               // out.print(cnumber);
                
              //  String cnumber=request.getParameter("cnumber");
              //  out.print(cnumber);
                String email=(String)session.getAttribute("email");
                String id=(String)session.getAttribute("id");
                String uname=(String)session.getAttribute("username");
                String cnumber=(String)session.getAttribute("cnumber");
              Connection con=null;
              con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rentalhouse","root","");
                String sql="Insert INTO request(username,owner,cnumber,location,email,request_status,house_id) values(?,?,?,?,?,?,?)";
             PreparedStatement p1=con.prepareStatement(sql);
             
             p1.setString(1,uname);
             p1.setString(2,name);
             p1.setString(3,cnumber);
             p1.setString(4,location);
             p1.setString(5,email);
             p1.setString(6,"Not Seen");
             p1.setString(7,id);
             
             int row=p1.executeUpdate();
             if(row>0) {
                 
      out.write("\n");
      out.write("                 <script>\n");
      out.write("                     alert(\"request send succesfully\");\n");
      out.write("                     window.location.href=\"customerhome.jsp\";\n");
      out.write("                 </script>        \n");
      out.write("                 ");

             }
     }
            catch(Exception e1)
          {
                out.print(e1.toString());
            }
            
      out.write("\n");
      out.write("        </p>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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

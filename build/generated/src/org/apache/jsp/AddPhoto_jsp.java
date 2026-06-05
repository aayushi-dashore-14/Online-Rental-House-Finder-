package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.InputStream;
import java.sql.*;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.*;

public final class AddPhoto_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

      Connection connection=null;
      String a=(String)request.getParameter("location");
      String b=(String)request.getParameter("categories");
      String c=(String)request.getParameter("name");
      String d=(String)request.getParameter("email");
      String e=(String)request.getParameter("mob");
      String f=(String)request.getParameter("property");
      String g=(String)request.getParameter("rent");
      String h=(String)request.getParameter("rule");
      String i=(String)request.getParameter("above");
      
      try
       {
           Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rentalhouse","root","");
    
    InputStream inputStream=null;
    InputStream inputStream1=null;
    InputStream inputStream2=null;
    InputStream inputStream3=null;
    
    Part filePart=request.getPart("photo");
    Part filePart1=request.getPart("photo1");
    Part filePart2=request.getPart("photo2");
    Part filePart3=request.getPart("photo3");
    if(filePart!=null)
               {
        out.println(filePart.getName());
         out.println(filePart.getSize());
          out.println(filePart.getContentType());
          
          inputStream=filePart.getInputStream();
           inputStream=filePart1.getInputStream();
            inputStream=filePart2.getInputStream();
             inputStream=filePart3.getInputStream();
             
       String sql="insert INTO addproperty(location,categories,name,email,mob,property,rent,rule,photo,photo1,photo2,photo3,approve) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
       PreparedStatement p1=con.prepareStatement(sql);
       p1.setString(1,a);
       p1.setString(2,b);
       p1.setString(3,c);
       p1.setString(4,d);
       p1.setString(5,e);
       p1.setString(6,f);
       p1.setString(7,g);
       p1.setString(8,h);
       p1.setBlob(9,inputStream);
       p1.setBlob(10,inputStream1);
       p1.setBlob(11,inputStream2);
       p1.setBlob(12,inputStream3);
       p1.setString(13,"no");
       int row=p1.executeUpdate();
       if(row>0)
      {
      
      out.write("\n");
      out.write("      \n");
      out.write("      <script>\n");
      out.write("          alert(\"your house is added \");\n");
      out.write("          window.location.href='addproperty.jsp';\n");
      out.write("          \n");
      out.write("      </script>\n");
      out.write("      ");

         }
                }  
      }
      catch(Exception e1)
       {
          out.print(e1.toString());
      }
      
      out.write("\n");
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

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class checkout_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
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

      out.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--\r\n");
      out.write("To change this license header, choose License Headers in Project Properties.\r\n");
      out.write("To change this template file, choose Tools | Templates\r\n");
      out.write("and open the template in the editor.\r\n");
      out.write("-->\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:h=\"http://xmlns.jcp.org/jsf/html\">\r\n");
      out.write("    <h:head>\r\n");
      out.write("        <title>La Boutique du Terroir - [nom du produit]</title>\r\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"resources/pictures/Icone.png\" />\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"resources/css/main.css\" />\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"resources/css/checkout.css\" />\r\n");
      out.write("    </h:head>\r\n");
      out.write("    <h:body>\r\n");
      out.write("        \r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "jspf/header.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("bl", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("bl", request.getCharacterEncoding()), out, false);
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        <div id=\"body\">\r\n");
      out.write("            <div id=\"paiement\">\r\n");
      out.write("                <h2>Information de paiement</h2>\r\n");
      out.write("                <h3>CoordonnÃ©es du dÃ©tenteur</h3>\r\n");
      out.write("                <table>\r\n");
      out.write("                    <tr><th>Nom</th>            <th><input id=\"nom\" value=\"\"/></th></tr>\r\n");
      out.write("                    <tr><th>PrÃ©nom</th>         <th><input id=\"prenom\" value=\"\"/></th></tr>\r\n");
      out.write("                    <tr><th>Code Postal</th>    <th><input id=\"cp\" value=\"\"/></th></tr>\r\n");
      out.write("                    <tr><th>Rue</th>            <th><input id=\"rue\" value=\"\"/></th></tr>\r\n");
      out.write("                </table>\r\n");
      out.write("                <h3>CoodonnÃ©es bancaires</h3>\r\n");
      out.write("                <table>\r\n");
      out.write("                    <tr><th>NÂ° de carte</th>    <th><input id=\"carte\" value=\"\"/></th></tr>\r\n");
      out.write("                    <tr><th>CVV</th>            <th><input id=\"cvv\" value=\"\"/></th></tr>\r\n");
      out.write("                    <tr><th>Expiration</th>     <th><input id=\"expiration\" value=\"\"/></th></tr>\r\n");
      out.write("                </table>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"livraison\">\r\n");
      out.write("                <h2>Information de livraison</h2>\r\n");
      out.write("                <div id=\"checkbox\">\r\n");
      out.write("                    <input type=\"checkbox\" id=\"same\" value=\"same\"/>\r\n");
      out.write("                    <label for=\"same\">MÃªme adresse que la facturation</label>\r\n");
      out.write("                </div>\r\n");
      out.write("                <h3>Adresse de livraison</h3>\r\n");
      out.write("                <table>\r\n");
      out.write("                    <tr><th>Nom</th>            <th><input id=\"nom\" value=\"\"/></th></tr>\r\n");
      out.write("                    <tr><th>PrÃ©nom</th>         <th><input id=\"prenom\" value=\"\"/></th></tr>\r\n");
      out.write("                    <tr><th>Code Postal</th>    <th><input id=\"cp\" value=\"\"/></th></tr>\r\n");
      out.write("                    <tr><th>Rue</th>            <th><input id=\"rue\" value=\"\"/></th></tr>\r\n");
      out.write("                </table>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("            \r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "jspf/footer.jspf" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("bl", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("bl", request.getCharacterEncoding()), out, false);
      out.write("\r\n");
      out.write("        \r\n");
      out.write("    </h:body>\r\n");
      out.write("</html>\r\n");
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

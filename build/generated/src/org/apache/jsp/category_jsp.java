package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class category_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n");
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
      out.write("        <link rel=\"stylesheet\" href=\"resources/css/category.css\" />\r\n");
      out.write("    </h:head>\r\n");
      out.write("    <h:body>\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "jspf/header.jspf" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("bl", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("bl", request.getCharacterEncoding()), out, false);
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        <div id=\"body\">\r\n");
      out.write("            <div id=\"left\">\r\n");
      out.write("                <h2 class=\"title\">Categories</h2>\r\n");
      out.write("                <ul id=\"categories\">\r\n");
      out.write("                    <li>Fromage</li>\r\n");
      out.write("                    <li>Charcuterie</li>\r\n");
      out.write("                    <li>PÃ¢tÃ©</li>\r\n");
      out.write("                    <li class=\"selected\">Rillettes</li>\r\n");
      out.write("                    <li>Saucisse sÃ¨che</li>\r\n");
      out.write("                    <li>Mortadelle</li>\r\n");
      out.write("                    <li>Fromage Ã  pÃ¢te cuite</li>\r\n");
      out.write("                    <li>Fromage Ã  pÃ¢te pressÃ©e</li>\r\n");
      out.write("                    <li>Bleus</li>\r\n");
      out.write("                    <li>Fromages frais</li>\r\n");
      out.write("                    <li>Fromages de chÃ¨vre</li>\r\n");
      out.write("                    <li>Fromages de brebis</li>\r\n");
      out.write("                    <li>Fromages de vache</li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"right\">\r\n");
      out.write("                <h2 class=\"title\">Rillettes</h2>\r\n");
      out.write("                <ul id=\"articles\">\r\n");
      out.write("                    <li class=\"item\"><a href=\"#\">\r\n");
      out.write("                        <h3 class=\"nom-produit\">Fromage de tÃªte</h3>\r\n");
      out.write("                        <img src=\"../resources/pictures/fromage-de-tete.jpg\" />\r\n");
      out.write("                        <div class=\"item-bottom\">\r\n");
      out.write("                            <p class=\"price\">6.66â¬</p>\r\n");
      out.write("                            <p class=\"rating\">100%</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </a></li>\r\n");
      out.write("                    <li class=\"item\"><a href=\"#\">\r\n");
      out.write("                        <h3 class=\"nom-produit\">PÃ¢tÃ© de faisan</h3>\r\n");
      out.write("                        <img src=\"../resources/pictures/pate-de-faisan.jpg\" />\r\n");
      out.write("                        <div class=\"item-bottom\">\r\n");
      out.write("                            <p class=\"price\">6.66â¬</p>\r\n");
      out.write("                            <p class=\"rating\">100%</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </a></li>\r\n");
      out.write("                    <li class=\"item\"><a href=\"#\">\r\n");
      out.write("                        <h3 class=\"nom-produit\">PÃ¢tÃ© de foies</h3>\r\n");
      out.write("                        <img src=\"../resources/pictures/pate-de-foies.jpg\" />\r\n");
      out.write("                        <div class=\"item-bottom\">\r\n");
      out.write("                            <p class=\"price\">6.66â¬</p>\r\n");
      out.write("                            <p class=\"rating\">100%</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </a></li>\r\n");
      out.write("                    <li class=\"item\"><a chref=\"#\">\r\n");
      out.write("                        <h3 class=\"nom-produit\">PÃ¢tÃ© en croute</h3>\r\n");
      out.write("                        <img src=\"../resources/pictures/pate-en-croute.jpg\" />\r\n");
      out.write("                        <div class=\"item-bottom\">\r\n");
      out.write("                            <p class=\"price\">6.66â¬</p>\r\n");
      out.write("                            <p class=\"rating\">100%</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </a></li>\r\n");
      out.write("                    <li class=\"item\"><a href=\"#\">\r\n");
      out.write("                        <h3 class=\"nom-produit\">Rillettes du Mans</h3>\r\n");
      out.write("                        <img src=\"../resources/pictures/rillettes-du-mans.jpg\" />\r\n");
      out.write("                        <div class=\"item-bottom\">\r\n");
      out.write("                            <p class=\"price\">6.66â¬</p>\r\n");
      out.write("                            <p class=\"rating\">100%</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("            \r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "jspf/footer.jspf" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("bl", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("bl", request.getCharacterEncoding()), out, false);
      out.write("\r\n");
      out.write("    </h:body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class product_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"resources/css/product.css\" />\r\n");
      out.write("    </h:head>\r\n");
      out.write("    <h:body>\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "jspf/header.jspf" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("bl", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("bl", request.getCharacterEncoding()), out, false);
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        <div id=\"body\">\r\n");
      out.write("            <div id=\"top\">\r\n");
      out.write("                <div id=\"pictures\">\r\n");
      out.write("                    <img src=\"./resources/pictures/fromage-de-tete.jpg\" />\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"description\">\r\n");
      out.write("                    <div id=\"top-row\">\r\n");
      out.write("                        <h2 class=\"nom-produit\">Fromage de tÃªte</h2>\r\n");
      out.write("                        <p class=\"producer\">de <a>[producteur]</a> </p>\r\n");
      out.write("                        <p class=\"rating\">100%</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div id=\"middle-row\">\r\n");
      out.write("                        <p id=\"quantity\">QuantitÃ© :</p>\r\n");
      out.write("                        <select id=\"select-quantity\">\r\n");
      out.write("                            <option value=\"1\">1</option>\r\n");
      out.write("                            <option value=\"2\">2</option>\r\n");
      out.write("                            <option value=\"5\">5</option>\r\n");
      out.write("                            <option value=\"10\">10</option>\r\n");
      out.write("                        </select>\r\n");
      out.write("                        <button id=\"add-to-basket\">Ajouter au panier</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <p id=\"bottom-row\">\r\n");
      out.write("                        Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum id tincidunt metus. Nullam nibh ante, bibendum in efficitur eu, placerat nec quam. Suspendisse sodales volutpat tincidunt. Aenean commodo tincidunt volutpat. Quisque euismod nec lectus vitae volutpat. Pellentesque tristique arcu id ligula ornare, in malesuada nulla efficitur. Vestibulum rutrum elementum arcu. Nam fringilla, ipsum eget venenatis placerat, sem quam sodales mi, vel euismod velit neque a est. In condimentum consequat lacus, in efficitur lacus rhoncus a. Maecenas condimentum aliquet nisl, at pretium mauris vestibulum vel. Curabitur posuere odio quis nibh hendrerit, eu volutpat augue hendrerit. Phasellus imperdiet justo eget nibh dapibus bibendum. Sed nunc enim, feugiat et efficitur ac, auctor sit amet eros. Donec at tortor ante. Vestibulum elementum ultrices urna, sit amet fermentum justo posuere eu. Nam velit erat, convallis et enim vitae, ultrices consectetur eros.\r\n");
      out.write("                    </p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"placeholder\">\r\n");
      out.write("                <h2 class=\"placeholder-name\">Articles similaires</h2>\r\n");
      out.write("                <ul class=\"articles\">\r\n");
      out.write("                    <li><a class=\"item\" href=\"#\">\r\n");
      out.write("                        <h3 class=\"nom-produit\">Fromage de tÃªte</h3>\r\n");
      out.write("                        <img src=\"../resources/pictures/fromage-de-tete.jpg\" />\r\n");
      out.write("                        <div class=\"item-bottom\">\r\n");
      out.write("                            <p class=\"price\">6.66â¬</p>\r\n");
      out.write("                            <p class=\"rating\">100%</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </a></li>\r\n");
      out.write("                    <li><a class=\"item\" href=\"#\">\r\n");
      out.write("                        <h3 class=\"nom-produit\">PÃ¢tÃ© de faisan</h3>\r\n");
      out.write("                        <img src=\"../resources/pictures/pate-de-faisan.jpg\" />\r\n");
      out.write("                        <div class=\"item-bottom\">\r\n");
      out.write("                            <p class=\"price\">6.66â¬</p>\r\n");
      out.write("                            <p class=\"rating\">100%</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </a></li>\r\n");
      out.write("                    <li><a class=\"item\" href=\"#\">\r\n");
      out.write("                        <h3 class=\"nom-produit\">PÃ¢tÃ© de foies</h3>\r\n");
      out.write("                        <img src=\"../resources/pictures/pate-de-foies.jpg\" />\r\n");
      out.write("                        <div class=\"item-bottom\">\r\n");
      out.write("                            <p class=\"price\">6.66â¬</p>\r\n");
      out.write("                            <p class=\"rating\">100%</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </a></li>\r\n");
      out.write("                    <li><a class=\"item\" href=\"#\">\r\n");
      out.write("                        <h3 class=\"nom-produit\">PÃ¢tÃ© en croute</h3>\r\n");
      out.write("                        <img src=\"../resources/pictures/pate-en-croute.jpg\" />\r\n");
      out.write("                        <div class=\"item-bottom\">\r\n");
      out.write("                            <p class=\"price\">6.66â¬</p>\r\n");
      out.write("                            <p class=\"rating\">100%</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </a></li>\r\n");
      out.write("                    <li><a class=\"item\" href=\"#\">\r\n");
      out.write("                        <h3 class=\"nom-produit\">Rillettes du Mans</h3>\r\n");
      out.write("                        <img src=\"../resources/pictures/rillettes-du-mans.jpg\" />\r\n");
      out.write("                        <div class=\"item-bottom\">\r\n");
      out.write("                            <p class=\"price\">6.66â¬</p>\r\n");
      out.write("                            <p class=\"rating\">100%</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <div id=\"comment-section\">\r\n");
      out.write("                <div class=\"commentaire\">\r\n");
      out.write("                    <img src=\"./resources/pictures/clubstartt.png\" class=\"profile-picture\"/>\r\n");
      out.write("                    <div class=\"top-row\">\r\n");
      out.write("                        <p class=\"pseudo\"><a>Benis :DDDD</a></p>\r\n");
      out.write("                        <p class=\"date\">le 06/06/2006 Ã  6h66</p>\r\n");
      out.write("                        <p class=\"rating\">100%</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <p class=\"texte\">\r\n");
      out.write("                        LÃ SO6SSON SON TRO BON :DDDDDD\r\n");
      out.write("                    </p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"commentaire\">\r\n");
      out.write("                    <img src=\"./resources/pictures/clubstartt.png\" class=\"profile-picture\"/>\r\n");
      out.write("                    <div class=\"top-row\">\r\n");
      out.write("                        <p class=\"pseudo\"><a>Benis :DDDD</a></p>\r\n");
      out.write("                        <p class=\"date\">le 06/06/2006 Ã  6h66</p>\r\n");
      out.write("                        <p class=\"rating\">100%</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <p class=\"texte\">\r\n");
      out.write("                        To be fair, you have to have a very high IQ to understand Rick and Morty. The humour is extremely subtle, and without a solid grasp of theoretical physics most of the jokes will go over a typical viewer's head. There's also Rick's nihilistic outlook, which is deftly woven into his characterisation- his personal philosophy draws heavily from Narodnaya Volya literature, for instance. The fans understand this stuff; they have the intellectual capacity to truly appreciate the depths of these jokes, to realise that they're not just funny- they say something deep about LIFE. As a consequence people who dislike Rick and Morty truly ARE idiots- of course they wouldn't appreciate, for instance, the humour in Rick's existential catchphrase \"Wubba Lubba Dub Dub,\" which itself is a cryptic reference to Turgenev's Russian epic Fathers and Sons. I'm smirking right now just imagining one of those addlepated simpletons scratching their heads in confusion as Dan Harmon's genius wit unfolds itself on their television screens. What fools.. how I pity them. And yes, by the way, i DO have a Rick and Morty tattoo. And no, you cannot see it. It's for the ladies' eyes only- and even then they have to demonstrate that they're within 5 IQ points of my own (preferably lower) beforehand. Nothin personnel kid\r\n");
      out.write("                    </p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("            \r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "jspf/footer.jspf" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("bl", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("bl", request.getCharacterEncoding()), out, false);
      out.write("\r\n");
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

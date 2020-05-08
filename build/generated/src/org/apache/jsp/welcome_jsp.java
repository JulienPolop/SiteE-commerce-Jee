package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class welcome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_query_var_dataSource;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sql_query_var_dataSource = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_sql_query_var_dataSource.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:h=\"http://xmlns.jcp.org/jsf/html\">\r\n");
      out.write("    <h:head>\r\n");
      out.write("        <title>La Boutique du Terroir - Accueil</title>\r\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"resources/pictures/Icone.png\" />\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"resources/css/main.css\" />\r\n");
      out.write("    </h:head>\r\n");
      out.write("    <h:body>\r\n");
      out.write("        <div id=\"header\">\r\n");
      out.write("            <h1 id=\"logo\">La Boutique du terroir</h1>\r\n");
      out.write("            <div id=\"account\">\r\n");
      out.write("                <a>Connexion</a>\r\n");
      out.write("                <p>ou</p>\r\n");
      out.write("                <a>CrÃ©er un compte</a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <a id=\"basket\" href=\"#\">\r\n");
      out.write("                <img src=\"resources/pictures/basket.png\" />\r\n");
      out.write("                <p>(X)</p>\r\n");
      out.write("            </a>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <div id=\"body\">\r\n");
      out.write("            <div class=\"placeholder\">\r\n");
      out.write("                <h2 class=\"placeholder-name\">Nouveaux articles</h2>\r\n");
      out.write("                <ul class=\"articles\">\r\n");
      out.write("                    \r\n");
      out.write("                    ");
      if (_jspx_meth_sql_query_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                        \r\n");
      out.write("                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                        \r\n");
      out.write("                    <!--\r\n");
      out.write("                    <li><a class=\"item\" href=\"#\">\r\n");
      out.write("                        <h3 class=\"nom-produit\">PÃ¢tÃ© de faisan</h3>\r\n");
      out.write("                        <img src=\"resources/pictures/pate-de-faisan.jpg\" />\r\n");
      out.write("                        <div class=\"item-bottom\">\r\n");
      out.write("                            <p class=\"price\">6.66â¬</p>\r\n");
      out.write("                            <p class=\"rating\">100%</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </a></li>\r\n");
      out.write("                    <li><a class=\"item\" href=\"#\">\r\n");
      out.write("                        <h3 class=\"nom-produit\">PÃ¢tÃ© de foies</h3>\r\n");
      out.write("                        <img src=\"resources/pictures/pate-de-foies.jpg\" />\r\n");
      out.write("                        <div class=\"item-bottom\">\r\n");
      out.write("                            <p class=\"price\">6.66â¬</p>\r\n");
      out.write("                            <p class=\"rating\">100%</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </a></li>\r\n");
      out.write("                    <li><a class=\"item\" href=\"#\">\r\n");
      out.write("                        <h3 class=\"nom-produit\">PÃ¢tÃ© en croute</h3>\r\n");
      out.write("                        <img src=\"resources/pictures/pate-en-croute.jpg\" />\r\n");
      out.write("                        <div class=\"item-bottom\">\r\n");
      out.write("                            <p class=\"price\">6.66â¬</p>\r\n");
      out.write("                            <p class=\"rating\">100%</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </a></li>\r\n");
      out.write("                    <li><a class=\"item\" href=\"#\">\r\n");
      out.write("                        <h3 class=\"nom-produit\">Rillettes du Mans</h3>\r\n");
      out.write("                        <img src=\"resources/pictures/rillettes-du-mans.jpg\" />\r\n");
      out.write("                        <div class=\"item-bottom\">\r\n");
      out.write("                            <p class=\"price\">6.66â¬</p>\r\n");
      out.write("                            <p class=\"rating\">100%</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </a></li>\r\n");
      out.write("                    -->\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"placeholder\">\r\n");
      out.write("                <h2 class=\"placeholder-name\">Populaires</h2>\r\n");
      out.write("                <ul class=\"articles\">\r\n");
      out.write("                    <li><a class=\"item\" href=\"#\">\r\n");
      out.write("                        <h3 class=\"nom-produit\">Fromage de tÃªte</h3>\r\n");
      out.write("                        <img src=\"resources/pictures/fromage-de-tete.jpg\" />\r\n");
      out.write("                        <div class=\"item-bottom\">\r\n");
      out.write("                            <p class=\"price\">6.66â¬</p>\r\n");
      out.write("                            <p class=\"rating\">100%</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </a></li>\r\n");
      out.write("                    <li><a class=\"item\" href=\"#\">\r\n");
      out.write("                        <h3 class=\"nom-produit\">PÃ¢tÃ© de faisan</h3>\r\n");
      out.write("                        <img src=\"resources/pictures/pate-de-faisan.jpg\" />\r\n");
      out.write("                        <div class=\"item-bottom\">\r\n");
      out.write("                            <p class=\"price\">6.66â¬</p>\r\n");
      out.write("                            <p class=\"rating\">100%</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </a></li>\r\n");
      out.write("                    <li><a class=\"item\" href=\"#\">\r\n");
      out.write("                        <h3 class=\"nom-produit\">PÃ¢tÃ© de foies</h3>\r\n");
      out.write("                        <img src=\"resources/pictures/pate-de-foies.jpg\" />\r\n");
      out.write("                        <div class=\"item-bottom\">\r\n");
      out.write("                            <p class=\"price\">6.66â¬</p>\r\n");
      out.write("                            <p class=\"rating\">100%</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </a></li>\r\n");
      out.write("                    <li><a class=\"item\" href=\"#\">\r\n");
      out.write("                        <h3 class=\"nom-produit\">PÃ¢tÃ© en croute</h3>\r\n");
      out.write("                        <img src=\"resources/pictures/pate-en-croute.jpg\" />\r\n");
      out.write("                        <div class=\"item-bottom\">\r\n");
      out.write("                            <p class=\"price\">6.66â¬</p>\r\n");
      out.write("                            <p class=\"rating\">100%</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </a></li>\r\n");
      out.write("                    <li><a class=\"item\" href=\"#\">\r\n");
      out.write("                        <h3 class=\"nom-produit\">Rillettes du Mans</h3>\r\n");
      out.write("                        <img src=\"resources/pictures/rillettes-du-mans.jpg\" />\r\n");
      out.write("                        <div class=\"item-bottom\">\r\n");
      out.write("                            <p class=\"price\">6.66â¬</p>\r\n");
      out.write("                            <p class=\"rating\">100%</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("            \r\n");
      out.write("        <div id=\"footer\">\r\n");
      out.write("            <div id=\"about\">\r\n");
      out.write("                <p>LA BOUTIQUE DU TERROIR</p>\r\n");
      out.write("                <p>2 chemin de la ferme</p>\r\n");
      out.write("                <p>11250 Caunette-sur-Lauquet</p>\r\n");
      out.write("                <p>06 66 66 66 66</p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div id=\"sns\">\r\n");
      out.write("                <p>Retrouvez nous sur les rÃ©seaux !</p>\r\n");
      out.write("                <div id=\"icon-container\">\r\n");
      out.write("                    <a id=\"facebook\" href=\"#\"/>\r\n");
      out.write("                    <a id=\"pinterest\" href=\"#\"/>\r\n");
      out.write("                    <a id=\"twitter\" href=\"#\"/>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
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

  private boolean _jspx_meth_sql_query_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:query
    org.apache.taglibs.standard.tag.rt.sql.QueryTag _jspx_th_sql_query_0 = (org.apache.taglibs.standard.tag.rt.sql.QueryTag) _jspx_tagPool_sql_query_var_dataSource.get(org.apache.taglibs.standard.tag.rt.sql.QueryTag.class);
    _jspx_th_sql_query_0.setPageContext(_jspx_page_context);
    _jspx_th_sql_query_0.setParent(null);
    _jspx_th_sql_query_0.setVar("produit");
    _jspx_th_sql_query_0.setDataSource(new String("jdbc/la_boutique_du_terroir"));
    int[] _jspx_push_body_count_sql_query_0 = new int[] { 0 };
    try {
      int _jspx_eval_sql_query_0 = _jspx_th_sql_query_0.doStartTag();
      if (_jspx_eval_sql_query_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_sql_query_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_push_body_count_sql_query_0[0]++;
          _jspx_th_sql_query_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_sql_query_0.doInitBody();
        }
        do {
          out.write("\r\n");
          out.write("                        SELECT * FROM produit\r\n");
          out.write("                    ");
          int evalDoAfterBody = _jspx_th_sql_query_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_sql_query_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
          _jspx_push_body_count_sql_query_0[0]--;
      }
      if (_jspx_th_sql_query_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_sql_query_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_sql_query_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_sql_query_0.doFinally();
      _jspx_tagPool_sql_query_var_dataSource.reuse(_jspx_th_sql_query_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("produit");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${produit.rows}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                            <li><a class=\"item\" href=\"#\">\r\n");
          out.write("                                <h3 class=\"nom-produit\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${produit.nom}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h3>\r\n");
          out.write("                                <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${initParam.productImagePath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${produit.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" />\r\n");
          out.write("                                <div class=\"item-bottom\">\r\n");
          out.write("                                    <p class=\"price\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${produit.prix}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("€</p>\r\n");
          out.write("                                    <p class=\"rating\">100%</p>\r\n");
          out.write("                                </div>\r\n");
          out.write("                            </a></li>\r\n");
          out.write("                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}

/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2023-01-06 16:38:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class restaurants_005fdetails_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Food Advisor</title>\n");
      out.write("    \n");
      out.write("        <!-- font awesome cdn link  -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css\">\n");
      out.write("    \n");
      out.write("        <!-- custom css file link  -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/style.css\">\n");
      out.write("    \n");
      out.write("    </head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <!-- header section starts  -->\n");
      out.write("\n");
      out.write("<header>\n");
      out.write("\n");
      out.write("    <a href=\"#\" class=\"logo\"><i class=\"fas fa-utensils\"></i>food advisor</a>\n");
      out.write("\n");
      out.write("    <div id=\"menu-bar\" class=\"fas fa-bars\"></div>\n");
      out.write("\n");
      out.write("    <nav class=\"navbar\">\n");
      out.write("        <a href=\"index.html\">home</a>\n");
      out.write("        <a href=\"index.html#restaurants\">restaurants</a>\n");
      out.write("        <a href=\"#review\">review</a>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("</header>\n");
      out.write("\n");
      out.write("  \n");
      out.write("<!-- popular section starts  -->\n");
      out.write("\n");
      out.write("<section class=\"popular\" id=\"popular\">\n");
      out.write("\n");
      out.write("    <h1 class=\"heading\"> most <span>popular</span> foods </h1>\n");
      out.write("\n");
      out.write("    <div class=\"box-container\">\n");
      out.write("\n");
      out.write("        <div class=\"box\">\n");
      out.write("            <span class=\"price\"> $5 - $20 </span>\n");
      out.write("            <img src=\"assets/images/p-1.jpg\" alt=\"\">\n");
      out.write("            <h3>tasty burger</h3>\n");
      out.write("            <div class=\"stars\">\n");
      out.write("                <i class=\"fas fa-star\"></i>\n");
      out.write("                <i class=\"fas fa-star\"></i>\n");
      out.write("                <i class=\"fas fa-star\"></i>\n");
      out.write("                <i class=\"fas fa-star\"></i>\n");
      out.write("                <i class=\"far fa-star\"></i>\n");
      out.write("            </div>\n");
      out.write("            <a href=\"#\" class=\"btn\">order now</a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"box\">\n");
      out.write("            <span class=\"price\"> $5 - $20 </span>\n");
      out.write("            <img src=\"assets/images/p-2.jpg\" alt=\"\">\n");
      out.write("            <h3>tasty cakes</h3>\n");
      out.write("            <div class=\"stars\">\n");
      out.write("                <i class=\"fas fa-star\"></i>\n");
      out.write("                <i class=\"fas fa-star\"></i>\n");
      out.write("                <i class=\"fas fa-star\"></i>\n");
      out.write("                <i class=\"fas fa-star\"></i>\n");
      out.write("                <i class=\"far fa-star\"></i>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"box\">\n");
      out.write("            <span class=\"price\"> $5 - $20 </span>\n");
      out.write("            <img src=\"assets/images/p-3.jpg\" alt=\"\">\n");
      out.write("            <h3>tasty sweets</h3>\n");
      out.write("            <div class=\"stars\">\n");
      out.write("                <i class=\"fas fa-star\"></i>\n");
      out.write("                <i class=\"fas fa-star\"></i>\n");
      out.write("                <i class=\"fas fa-star\"></i>\n");
      out.write("                <i class=\"fas fa-star\"></i>\n");
      out.write("                <i class=\"far fa-star\"></i>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"box\">\n");
      out.write("            <span class=\"price\"> $5 - $20 </span>\n");
      out.write("            <img src=\"assets/images/p-4.jpg\" alt=\"\">\n");
      out.write("            <h3>tasty cupcakes</h3>\n");
      out.write("            <div class=\"stars\">\n");
      out.write("                <i class=\"fas fa-star\"></i>\n");
      out.write("                <i class=\"fas fa-star\"></i>\n");
      out.write("                <i class=\"fas fa-star\"></i>\n");
      out.write("                <i class=\"fas fa-star\"></i>\n");
      out.write("                <i class=\"far fa-star\"></i>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"box\">\n");
      out.write("            <span class=\"price\"> $5 - $20 </span>\n");
      out.write("            <img src=\"assets/images/p-5.jpg\" alt=\"\">\n");
      out.write("            <h3>cold drinks</h3>\n");
      out.write("            <div class=\"stars\">\n");
      out.write("                <i class=\"fas fa-star\"></i>\n");
      out.write("                <i class=\"fas fa-star\"></i>\n");
      out.write("                <i class=\"fas fa-star\"></i>\n");
      out.write("                <i class=\"fas fa-star\"></i>\n");
      out.write("                <i class=\"far fa-star\"></i>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"box\">\n");
      out.write("            <span class=\"price\"> $5 - $20 </span>\n");
      out.write("            <img src=\"assets/images/p-6.jpg\" alt=\"\">\n");
      out.write("            <h3>cold ice-cream</h3>\n");
      out.write("            <div class=\"stars\">\n");
      out.write("                <i class=\"fas fa-star\"></i>\n");
      out.write("                <i class=\"fas fa-star\"></i>\n");
      out.write("                <i class=\"fas fa-star\"></i>\n");
      out.write("                <i class=\"fas fa-star\"></i>\n");
      out.write("                <i class=\"far fa-star\"></i>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"box\">\n");
      out.write("            <!-- <span class=\"price\"> </span>-->\n");
      out.write("            <!-- <img src=\"images/p-6.jpg\" alt=\"\">-->\n");
      out.write("             ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("             <form method=\"post\" action=\"\">\n");
      out.write("            <h3>add comment to our restaurant</h3><br>\n");
      out.write("            <textarea placeholder=\"Leave us your feedback here\" id=\"commentaire\" name=\"commentaire\" rows=\"5\" cols=\"33\" style=\"width: 70%; padding: 12px 20px; border: 2px solid #ccc; border-radius: 4px; background-color: #f8f8f8; resize: none;\"> </textarea>         \n");
      out.write("         \n");
      out.write("            <br><br>\n");
      out.write("            <h3>add note</h3>\n");
      out.write("            <input  type=\"number\" min=\"1\" max=\"5\" id=\"note\" name=\"note\" style=\" border: 2px solid #ccc; border-radius: 4px; background-color: #f8f8f8; resize: none;\" />\n");
      out.write("            <br><br>\n");
      out.write("            <input class=\"btn\" type=\"submit\" value=\"Submit\">\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("<!-- popular section ends -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- review section starts  -->\n");
      out.write("\n");
      out.write("<section class=\"review\" id=\"review\">\n");
      out.write("\n");
      out.write("    <h1 class=\"heading\"> restaurant <span>reviews</span> </h1>\n");
      out.write("\n");
      out.write("    <div class=\"box-container\">\n");
      out.write("\n");
      out.write("        <div class=\"box\">\n");
      out.write("            <img src=\"assets/images/pic1.png\" alt=\"\">\n");
      out.write("            <h3>mona linda</h3>\n");
      out.write("            <div class=\"stars\">\n");
      out.write("                <i class=\"fas fa-star\"></i>\n");
      out.write("                <i class=\"fas fa-star\"></i>\n");
      out.write("                <i class=\"fas fa-star\"></i>\n");
      out.write("                <i class=\"fas fa-star\"></i>\n");
      out.write("                <i class=\"far fa-star\"></i>\n");
      out.write("            </div>\n");
      out.write("            <p>I think this site is known to all food lovers in calais. The volume of information presented in it about everything that may be needed when choosing a restaurant.</p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"box\">\n");
      out.write("            <img src=\"assets/images/pic2.png\" alt=\"\">\n");
      out.write("            <h3>Adam Ryan</h3>\n");
      out.write("            <div class=\"stars\">\n");
      out.write("                <i class=\"fas fa-star\"></i>\n");
      out.write("                <i class=\"fas fa-star\"></i>\n");
      out.write("                <i class=\"fas fa-star\"></i>\n");
      out.write("                <i class=\"fas fa-star\"></i>\n");
      out.write("                <i class=\"far fa-star\"></i>\n");
      out.write("            </div>\n");
      out.write("            <p>Never leave without checking on FoodAdvisor first. Others comments are always very welcomed and are a must! FoodAdvisor is very well done and you can easily find what you are looking for.</p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"box\">\n");
      out.write("            <img src=\"assets/images/pic3.png\" alt=\"\">\n");
      out.write("            <h3>Elisabeth Neveux</h3>\n");
      out.write("            <div class=\"stars\">\n");
      out.write("                <i class=\"fas fa-star\"></i>\n");
      out.write("                <i class=\"fas fa-star\"></i>\n");
      out.write("                <i class=\"fas fa-star\"></i>\n");
      out.write("                <i class=\"fas fa-star\"></i>\n");
      out.write("                <i class=\"far fa-star\"></i>\n");
      out.write("            </div>\n");
      out.write("            <p>I really find food advisor fantastic for one reason. Frequently you go to places, and you want to give great feedback, because you want people to enjoy the same fantastic experience..</p>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("<!-- review section ends -->\n");
      out.write("\n");
      out.write("<!-- order section starts  -->\n");
      out.write("\n");
      out.write("<section class=\"order\" id=\"order\">\n");
      out.write("\n");
      out.write("    <h1 class=\"heading\"> <span>Contact Us</span> now </h1>\n");
      out.write("\n");
      out.write("    <div class=\"row\">\n");
      out.write("        \n");
      out.write("        <div class=\"image\">\n");
      out.write("            <img src=\"assets/images/order-img.jpg\" alt=\"\">\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <form action=\"\">\n");
      out.write("\n");
      out.write("            <div class=\"inputBox\">\n");
      out.write("                <input type=\"text\" placeholder=\"name\">\n");
      out.write("                <input type=\"email\" placeholder=\"email\">\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <textarea placeholder=\"Leave your comment here\" name=\"\" id=\"\" cols=\"30\" rows=\"10\"></textarea>\n");
      out.write("\n");
      out.write("            <input type=\"submit\" value=\"order now\" class=\"btn\">\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("<!-- order section ends -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- footer section  -->\n");
      out.write("\n");
      out.write("<section class=\"footer\">\n");
      out.write("\n");
      out.write("    <h1 class=\"credit\"> created by <span> TeamI6 </span> | all rights reserved! </h1>\n");
      out.write("\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("<!-- scroll top button  -->\n");
      out.write("<a href=\"#gallery\" class=\"fas fa-angle-up\" id=\"scroll-top\"></a>\n");
      out.write("\n");
      out.write("<!-- loader  -->\n");
      out.write("<div class=\"loader-container\">\n");
      out.write("    <img src=\"assets/images/loader.gif\" alt=\"\">\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- custom js file link  -->\n");
      out.write("<script src=\"assets/js/script.js\"></script>\n");
      out.write("    \n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /WEB-INF/views/restaurants_details.jsp(122,13) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ !empty note }", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write('<');
        out.write('p');
        out.write('>');
        if (_jspx_meth_c_005fout_005f0(_jspx_th_c_005fif_005f0, _jspx_page_context))
          return true;
        out.write("</p>");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    // /WEB-INF/views/restaurants_details.jsp(122,46) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ note }", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
    if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
    return false;
  }
}

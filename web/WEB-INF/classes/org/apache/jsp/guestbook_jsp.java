package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import javax.jdo.PersistenceManager;
import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;

public final class guestbook_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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

      out.write("<!DOCTYPE html>\n\n\n\n\n\n\n\n\n\n<html>\n    <head>\n\n        <meta charset=\"utf-8\">\n        <meta name=\"description\" content=\"Draw images with letters! And then you can download them!.\" />\n        <meta name=\"keywords\" content=\"html5,canvas,developer,javascript,processing,processingjs,letters,draw,image,bryan,alvarado,bryan alvarado\" />\n        <meta name=\"author\" content=\"Bryan Alvarado\" />\n        <title>Letter Draw</title>\n        <script src=\"base64.js\"></script>\n        <script src=\"canvas2image.js\"></script>\n        <script src=\"pfunctions.js\"></script>\n        <link href=\"http://fonts.googleapis.com/css?family=Amaranth:regular,400italic,700,700italic\" rel=\"stylesheet\" type=\"text/css\">\n\n        <style>\n            * {\n                font-family: 'Amaranth', serif;\n            }\n        </style>\n        <link type=\"text/css\" rel=\"stylesheet\" href=\"/stylesheets/main.css\" media=\"screen\" />\n        <script type=\"text/javascript\">\n\n            var _gaq = _gaq || [];\n            _gaq.push(['_setAccount', 'UA-20203105-4']);\n");
      out.write("            _gaq.push(['_trackPageview']);\n\n            (function() {\n                var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;\n                ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';\n                var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);\n            })();\n\n        </script>\n\n    </head>\n\n    <body>\n    <header>\n        <h1>LetterDraw</h1>\n        <span class=\"header-instruction\">Expand for more info.</span>\n\n        <!-- The extra content that can be expanded -->\n        <div class=\"extra\">\n\n            <!-- About the game in general -->\n            <section id=\"about\">\n                <h3>About</h3>\n                <p>\n\t    \t\t\t\tLetterDraw lets you draw anything you want, and with letters!!.<br>\n\t    \t\t\t\tAfter you finish your masterpiece you can download it too!<br>\n\t    \t\t\t\tEnjoy!\n                </p>\n                <p class=\"credits\">\n\t    \t\t\t\tCreated by <a href=\"http://about.me/bryan.\">Bryan Alvarado</a> | <a href=\"http://twitter.com/foobraco\">@foobraco</a>\n");
      out.write("                </p>\n            </section>\n\n            <!-- Different methods for sharing the game -->\n            <section id=\"share\">\n                <h3>Share</h3>\n                <div id=\"retweet-button\">\n                    <a href=\"http://twitter.com/share\" class=\"twitter-share-button\" data-url=\"http://letterdraw.appspot.com\" data-text=\"Draw and download images made with letters by @foobraco\" data-count=\"vertical\" data-related=\"foobraco\">Tweet</a>\n                    <script type=\"text/javascript\" src=\"http://platform.twitter.com/widgets.js\"></script>\n                </div>\n\n            </section>\n\n            <!-- Requirements -->\n            <section id=\"requirements\">\n                <h3>Requirements</h3>\n                <p>\n\t    \t\t\t\tLetterDraw has been tested and confirmed to work<br>\n\t    \t\t\t\tin Chrome, Safari and Firefox 4.\n                </p>\n            </section>\n\n        </div>\n        \t\t\t\t<form>\n\n        <input type=\"button\" onclick=\"saveImage('mycanvas');\" value=\"Download\">\n        <input type=\"button\" onclick=\"eraseImage('mycanvas');\" value=\"Reset\">\n");
      out.write("\n           Choose your text: <input type=\"text\" id=\"texto\">\n            <input type=\"button\" onclick=\"changetext('mycanvas','texto');\" value=\"Change\">\n        </form>\n    </header>\n    <script type=\"text/javascript\"><!--\n        google_ad_client = \"ca-pub-9937813903719414\";\n        /* LetterDraw Adds */\n        google_ad_slot = \"5349433930\";\n        google_ad_width = 728;\n        google_ad_height = 90;\n        //-->\n    </script>\n    <script type=\"text/javascript\"\n            src=\"http://pagead2.googlesyndication.com/pagead/show_ads.js\">\n    </script>\n     <center>\n         </br>\n        <script src=\"processing-1.1.0.js\"></script>\n        <canvas id=\"mycanvas\" data-processing-sources=\"prueba.pjs\"></canvas>\n        \n    </center>\n    \n   </br></br>\n           \n</body>\n</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

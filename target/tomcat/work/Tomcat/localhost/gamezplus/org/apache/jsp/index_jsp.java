/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2024-04-23 17:39:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.DB.DBConnect;
import java.sql.Connection;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/all_component/navbar.jsp", Long.valueOf(1713408653905L));
    _jspx_dependants.put("/all_component/allCSS.jsp", Long.valueOf(1713408089859L));
    _jspx_dependants.put("/all_component/footer.jsp", Long.valueOf(1713408121030L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- \r\n");
      out.write("    JSP file for displaying the home page of GamezPlus\r\n");
      out.write("-->\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <title>GamezPlus: Index</title>\r\n");
      out.write("    ");
      out.write("<!--\r\n");
      out.write("    JSP file that includes various external dependencies such as Bootstrap, jQuery, Popper.js, Font Awesome, and a custom CSS file.\r\n");
      out.write("-->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\"\r\n");
      out.write("    integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\"\r\n");
      out.write("    integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\"\r\n");
      out.write("    crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js\"\r\n");
      out.write("    integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\"\r\n");
      out.write("    crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js\"\r\n");
      out.write("    integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\"\r\n");
      out.write("    crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css\"\r\n");
      out.write("    integrity=\"sha512-DTOQO9RWCH3ppGqcWaEA1BIZOC6xxalwEsw9c2QQeAIftl+Vegovlnee1c9QX4TctnWMn13TZye+giMm8e2LwA==\"\r\n");
      out.write("    crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"all_component/style.css\">\r\n");
      out.write("\r\n");
      out.write("        <style type=\"text/css\">\r\n");
      out.write("            .back-img {\r\n");
      out.write("                background: url(\"img/wallpaper.jpg\");\r\n");
      out.write("                object-fit: cover;\r\n");
      out.write("                background-repeat: no-repeat;\r\n");
      out.write("                background-size: cover;\r\n");
      out.write("                background-position: center;\r\n");
      out.write("                height: 25vh;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .crd-ho:hover {\r\n");
      out.write("                background-color: #f7f7f7;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body style=\"background-color: #f7f7f7;\">\r\n");
      out.write("    ");
      out.write("<!--\r\n");
      out.write("    JSP file for the navbar section of the website.\r\n");
      out.write("-->\r\n");
      out.write("<div class=\"container-fluid\" style=\"height: 10px; background-color:#303f9f;\"></div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container-fluid p-3\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <div class=\"col-md-3 text-success\">\r\n");
      out.write("            <h3><a class=\"nav-link text-success\" href=\"./\"><i class=\"fa-solid fa-gamepad\"></i> GamezPlus</a></h3>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-md-6\">\r\n");
      out.write("            <form class=\"form-inline my-2 my-lg-0\">\r\n");
      out.write("                <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\r\n");
      out.write("                <button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\">Search</button>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-md-3\">\r\n");
      out.write("            <a href=\"login.jsp\" class=\"btn btn-success\"><i class=\"fa-solid fa-right-to-bracket\"></i> Login</a>\r\n");
      out.write("            <a href=\"register.jsp\" class=\"btn btn-primary\"><i class=\"fa-solid fa-user-plus\"></i> Register</a>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark bg-custom\">\r\n");
      out.write("    <a class=\"navbar-brand\" href=\"#\"><i class=\"fa fa-home\" aria-hidden=\"true\"></i></a>\r\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\"\r\n");
      out.write("        aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("        <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("    </button>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("        <ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("            <li class=\"nav-item active\">\r\n");
      out.write("                <a class=\"nav-link\" href=\"#\">Home<span class=\"sr-only\">(current)</span></a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item active\">\r\n");
      out.write("                <a class=\"nav-link\" href=\"#\"><i class=\"fa-solid fa-compact-disc\"></i> Recent Games</a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item active\">\r\n");
      out.write("                <a class=\"nav-link\" href=\"#\"><i class=\"fa-solid fa-compact-disc\"></i> New Games</a>\r\n");
      out.write("            </li>\r\n");
      out.write("\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("                <a class=\"nav-link active\" href=\"#\"><i class=\"fa-solid fa-compact-disc\"></i> Used Games</a>\r\n");
      out.write("            </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        <form class=\"form-inline my-2 my-lg-0\">\r\n");
      out.write("            <button class=\"btn btn-light my-2 my-sm-0\" type=\"submit\"><i class=\"fa-solid fa-gear\"></i> Settings</button>\r\n");
      out.write("            <button class=\"btn btn-light my-2 my-sm-0 ml-1\" type=\"submit\"><i class=\"fa-solid fa-phone\"></i> Contact\r\n");
      out.write("                Us</button>\r\n");
      out.write("        </form>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("</nav>");
      out.write("\r\n");
      out.write("        <div class=\"container-fluid back-img\"></div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Start Recent Book -->\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <h3 class=\"text-center\">Recent Games</h3>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-3\">\r\n");
      out.write("                    <div class=\"card crd-ho\">\r\n");
      out.write("                        <div class=\"card-body text-center\">\r\n");
      out.write("                            <img alt=\"\" src=\"GameImg/RedDead.jpg\" style=\"width: 150px; height: 200px;\"\r\n");
      out.write("                                class=\"img-thumblin\">\r\n");
      out.write("                            <p>Introduction To Java Programming</p>\r\n");
      out.write("                            <p>K. Somasundaram</p>\r\n");
      out.write("                            <p>Category: New</p>\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <a href=\"\" class=\"btn btn-danger ml-2\"><i class=\"fa-solid fa-cart-shopping\"></i> Add to\r\n");
      out.write("                                    Cart</a>\r\n");
      out.write("                                <a href=\"\" class=\"btn btn-success ml-1\">View Details</a>\r\n");
      out.write("                                <a href=\"\" class=\"btn btn-danger ml-1\">2.99</a>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"col-md-3\">\r\n");
      out.write("                    <div class=\"card crd-ho\">\r\n");
      out.write("                        <div class=\"card-body text-center\">\r\n");
      out.write("                            <img alt=\"\" src=\"GameImg/RedDead.jpg\" style=\"width: 150px; height: 200px;\"\r\n");
      out.write("                                class=\"img-thumblin\">\r\n");
      out.write("                            <p>Red Dead Redemption II</p>\r\n");
      out.write("                            <p>Rockstar Games</p>\r\n");
      out.write("                            <p>Category: New</p>\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <a href=\"\" class=\"btn btn-danger ml-2\"><i class=\"fa-solid fa-cart-shopping\"></i> Add to\r\n");
      out.write("                                    Cart</a>\r\n");
      out.write("                                <a href=\"\" class=\"btn btn-success ml-1\">View Details</a>\r\n");
      out.write("                                <a href=\"\" class=\"btn btn-danger ml-1\">2.99</a>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"col-md-3\">\r\n");
      out.write("                    <div class=\"card crd-ho\">\r\n");
      out.write("                        <div class=\"card-body text-center\">\r\n");
      out.write("                            <img alt=\"\" src=\"GameImg/RedDead.jpg\" style=\"width: 150px; height: 200px;\"\r\n");
      out.write("                                class=\"img-thumblin\">\r\n");
      out.write("                            <p>Red Dead Redemption II</p>\r\n");
      out.write("                            <p>Rockstar Games</p>\r\n");
      out.write("                            <p>Category: New</p>\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <a href=\"\" class=\"btn btn-danger ml-2\"><i class=\"fa-solid fa-cart-shopping\"></i> Add to\r\n");
      out.write("                                    Cart</a>\r\n");
      out.write("                                <a href=\"\" class=\"btn btn-success ml-1\">View Details</a>\r\n");
      out.write("                                <a href=\"\" class=\"btn btn-danger ml-1\">2.99</a>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"col-md-3\">\r\n");
      out.write("                    <div class=\"card crd-ho\">\r\n");
      out.write("                        <div class=\"card-body text-center\">\r\n");
      out.write("                            <img alt=\"\" src=\"GameImg/RedDead.jpg\" style=\"width: 150px; height: 200px;\"\r\n");
      out.write("                                class=\"img-thumblin\">\r\n");
      out.write("                            <p>Red Dead Redemption II</p>\r\n");
      out.write("                            <p>Rockstar Games</p>\r\n");
      out.write("                            <p>Category: New</p>\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <a href=\"\" class=\"btn btn-danger ml-2\"><i class=\"fa-solid fa-cart-shopping\"></i> Add to\r\n");
      out.write("                                    Cart</a>\r\n");
      out.write("                                <a href=\"\" class=\"btn btn-success ml-1\">View Details</a>\r\n");
      out.write("                                <a href=\"\" class=\"btn btn-danger ml-1\">2.99</a>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"text-center mt-1\">\r\n");
      out.write("            <a href=\"\" class=\"btn btn-danger btn-small\">View All</a>\r\n");
      out.write("        </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- End Recent Book -->\r\n");
      out.write("\r\n");
      out.write("        <hr>\r\n");
      out.write("        <!-- Start New Book -->\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <h3 class=\"text-center\">New Games</h3>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-3\">\r\n");
      out.write("                    <div class=\"card crd-ho\">\r\n");
      out.write("                        <div class=\"card-body text-center\">\r\n");
      out.write("                            <img alt=\"\" src=\"GameImg/RedDead.jpg\" style=\"width: 150px; height: 200px;\"\r\n");
      out.write("                                class=\"img-thumblin\">\r\n");
      out.write("                            <p>Red Dead Redemption II</p>\r\n");
      out.write("                            <p>Rockstar Games</p>\r\n");
      out.write("                            <p>Category: New</p>\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <a href=\"\" class=\"btn btn-danger ml-2\"><i class=\"fa-solid fa-cart-shopping\"></i> Add to\r\n");
      out.write("                                    Cart</a>\r\n");
      out.write("                                <a href=\"\" class=\"btn btn-success ml-1\">View Details</a>\r\n");
      out.write("                                <a href=\"\" class=\"btn btn-danger ml-1\">2.99</a>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"col-md-3\">\r\n");
      out.write("                    <div class=\"card crd-ho\">\r\n");
      out.write("                        <div class=\"card-body text-center\">\r\n");
      out.write("                            <img alt=\"\" src=\"GameImg/RedDead.jpg\" style=\"width: 150px; height: 200px;\"\r\n");
      out.write("                                class=\"img-thumblin\">\r\n");
      out.write("                            <p>Red Dead Redemption II</p>\r\n");
      out.write("                            <p>Rockstar Games</p>\r\n");
      out.write("                            <p>Category: New</p>\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <a href=\"\" class=\"btn btn-danger ml-2\"><i class=\"fa-solid fa-cart-shopping\"></i> Add to\r\n");
      out.write("                                    Cart</a>\r\n");
      out.write("                                <a href=\"\" class=\"btn btn-success ml-1\">View Details</a>\r\n");
      out.write("                                <a href=\"\" class=\"btn btn-danger ml-1\">2.99</a>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"col-md-3\">\r\n");
      out.write("                    <div class=\"card crd-ho\">\r\n");
      out.write("                        <div class=\"card-body text-center\">\r\n");
      out.write("                            <img alt=\"\" src=\"GameImg/RedDead.jpg\" style=\"width: 150px; height: 200px;\"\r\n");
      out.write("                                class=\"img-thumblin\">\r\n");
      out.write("                            <p>Red Dead Redemption II</p>\r\n");
      out.write("                            <p>Rockstar Games</p>\r\n");
      out.write("                            <p>Category: New</p>\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <a href=\"\" class=\"btn btn-danger ml-2\"><i class=\"fa-solid fa-cart-shopping\"></i> Add to\r\n");
      out.write("                                    Cart</a>\r\n");
      out.write("                                <a href=\"\" class=\"btn btn-success ml-1\">View Details</a>\r\n");
      out.write("                                <a href=\"\" class=\"btn btn-danger ml-1\">2.99</a>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"col-md-3\">\r\n");
      out.write("                    <div class=\"card crd-ho\">\r\n");
      out.write("                        <div class=\"card-body text-center\">\r\n");
      out.write("                            <img alt=\"\" src=\"GameImg/RedDead.jpg\" style=\"width: 150px; height: 200px;\"\r\n");
      out.write("                                class=\"img-thumblin\">\r\n");
      out.write("                            <p>Red Dead Redemption II</p>\r\n");
      out.write("                            <p>Rockstar Games</p>\r\n");
      out.write("                            <p>Category: New</p>\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <a href=\"\" class=\"btn btn-danger ml-2\"><i class=\"fa-solid fa-cart-shopping\"></i> Add to\r\n");
      out.write("                                    Cart</a>\r\n");
      out.write("                                <a href=\"\" class=\"btn btn-success ml-1\">View Details</a>\r\n");
      out.write("                                <a href=\"\" class=\"btn btn-danger ml-1\">2.99</a>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"text-center mt-1\">\r\n");
      out.write("            <a href=\"\" class=\"btn btn-danger btn-small\">View All</a>\r\n");
      out.write("        </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- End New Book -->\r\n");
      out.write("        <hr>\r\n");
      out.write("\r\n");
      out.write("        <!-- Start Old Book -->\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <h3 class=\"text-center\">Used Games</h3>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-3\">\r\n");
      out.write("                    <div class=\"card crd-ho\">\r\n");
      out.write("                        <div class=\"card-body text-center\">\r\n");
      out.write("                            <img alt=\"\" src=\"GameImg/RedDead.jpg\" style=\"width: 150px; height: 200px;\"\r\n");
      out.write("                                class=\"img-thumblin\">\r\n");
      out.write("                            <p>Red Dead Redemption II</p>\r\n");
      out.write("                            <p>Rockstar Games</p>\r\n");
      out.write("                            <p>Category: Used</p>\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <a href=\"\" class=\"btn btn-success ml-5\">View Details</a>\r\n");
      out.write("                                <a href=\"\" class=\"btn btn-danger ml-1\">2.99</a>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"col-md-3\">\r\n");
      out.write("                    <div class=\"card crd-ho\">\r\n");
      out.write("                        <div class=\"card-body text-center\">\r\n");
      out.write("                            <img alt=\"\" src=\"GameImg/RedDead.jpg\" style=\"width: 150px; height: 200px;\"\r\n");
      out.write("                                class=\"img-thumblin\">\r\n");
      out.write("                            <p>Red Dead Redemption II</p>\r\n");
      out.write("                            <p>Rockstar Games</p>\r\n");
      out.write("                            <p>Category: New</p>\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <a href=\"\" class=\"btn btn-success ml-5\">View Details</a>\r\n");
      out.write("                                <a href=\"\" class=\"btn btn-danger ml-1\">2.99</a>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"col-md-3\">\r\n");
      out.write("                    <div class=\"card crd-ho\">\r\n");
      out.write("                        <div class=\"card-body text-center\">\r\n");
      out.write("                            <img alt=\"\" src=\"GameImg/RedDead.jpg\" style=\"width: 150px; height: 200px;\"\r\n");
      out.write("                                class=\"img-thumblin\">\r\n");
      out.write("                            <p>Red Dead Redemption II</p>\r\n");
      out.write("                            <p>Rockstar Games</p>\r\n");
      out.write("                            <p>Category: Used</p>\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <a href=\"\" class=\"btn btn-success ml-5\">View Details</a>\r\n");
      out.write("                                <a href=\"\" class=\"btn btn-danger ml-1\">2.99</a>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"col-md-3\">\r\n");
      out.write("                    <div class=\"card crd-ho\">\r\n");
      out.write("                        <div class=\"card-body text-center\">\r\n");
      out.write("                            <img alt=\"\" src=\"GameImg/RedDead.jpg\" style=\"width: 150px; height: 200px;\"\r\n");
      out.write("                                class=\"img-thumblin\">\r\n");
      out.write("                            <p>Red Dead Redemption II</p>\r\n");
      out.write("                            <p>Rockstar Games</p>\r\n");
      out.write("                            <p>Category: Used</p>\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <a href=\"\" class=\"btn btn-success ml-5\">View Details</a>\r\n");
      out.write("                                <a href=\"\" class=\"btn btn-danger ml-1\">2.99</a>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"text-center mt-1\">\r\n");
      out.write("                <a href=\"\" class=\"btn btn-danger btn-small\">View All</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- End Old Book -->\r\n");
      out.write("        ");
      out.write("<!--\r\n");
      out.write("    JSP file for representing the footer section of a web page, displaying copyright information.\r\n");
      out.write("-->\r\n");
      out.write("<div class=\"container-fluid text-center text-white p-3 mt-2\" style=\"background-color: #303f9f;\">\r\n");
      out.write("    <h5>@Copyright Nishant Kharel</h5>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
}
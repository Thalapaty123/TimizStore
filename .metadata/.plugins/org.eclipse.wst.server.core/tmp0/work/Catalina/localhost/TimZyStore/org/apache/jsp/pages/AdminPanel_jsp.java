/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.99
 * Generated at: 2024-04-30 16:24:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdminPanel_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
      return;
    }

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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Boxicons -->\r\n");
      out.write("    <link href='https://unpkg.com/boxicons@2.0.9/css/boxicons.min.css' rel='stylesheet'>\r\n");
      out.write("    <!-- My CSS -->\r\n");
      out.write("     <link rel=\"stylesheet\" href=\"");
      out.print( request.getContextPath() );
      out.write("/Stylesheet/AdminPanel.css\">\r\n");
      out.write("\r\n");
      out.write("    <title>Admin</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- SIDEBAR -->\r\n");
      out.write("<section id=\"sidebar\">\r\n");
      out.write("    <a href=\"#\" class=\"brand\">\r\n");
      out.write("        <i class='bx bxs-smile'></i>\r\n");
      out.write("        <span class=\"text\">Admin</span>\r\n");
      out.write("    </a>\r\n");
      out.write("    <ul class=\"side-menu top\">\r\n");
      out.write("        <li class=\"active\">\r\n");
      out.write("            <a href=\"#\">\r\n");
      out.write("                <i class='bx bxs-dashboard' ></i>\r\n");
      out.write("                <span class=\"text\">Dashboard</span>\r\n");
      out.write("            </a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li>\r\n");
      out.write("            <a href=\"#\">\r\n");
      out.write("                <i class='bx bxs-shopping-bag-alt' ></i>\r\n");
      out.write("                <span class=\"text\">My Store</span>\r\n");
      out.write("            </a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li>\r\n");
      out.write("            <a href=\"#\">\r\n");
      out.write("                <i class='bx bxs-doughnut-chart' ></i>\r\n");
      out.write("                <span class=\"text\">Categories</span>\r\n");
      out.write("            </a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li>\r\n");
      out.write("            <a href=\"#\">\r\n");
      out.write("                <i class='bx bxs-message-dots' ></i>\r\n");
      out.write("                <span class=\"text\">Message</span>\r\n");
      out.write("            </a>\r\n");
      out.write("        </li>\r\n");
      out.write("       \r\n");
      out.write("    </ul>\r\n");
      out.write("    <ul class=\"side-menu\">\r\n");
      out.write("        <li>\r\n");
      out.write("            <a href=\"#\">\r\n");
      out.write("                <i class='bx bxs-cog' ></i>\r\n");
      out.write("                <span class=\"text\">Add Product</span>\r\n");
      out.write("            </a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li>\r\n");
      out.write("            <a href=\"#\" class=\"Admin\">\r\n");
      out.write("                <i class='bx bxs-log-out-circle' ></i>\r\n");
      out.write("                <span class=\"text\">Add Admin</span>\r\n");
      out.write("            </a>\r\n");
      out.write("        </li>\r\n");
      out.write("        <li>\r\n");
      out.write("            <a href=\"#\" class=\"logout\">\r\n");
      out.write("                <i class='bx bxs-log-out-circle' ></i>\r\n");
      out.write("                <span class=\"text\">Logout</span>\r\n");
      out.write("            </a>\r\n");
      out.write("        </li>\r\n");
      out.write("</section>\r\n");
      out.write("<!-- SIDEBAR -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- CONTENT -->\r\n");
      out.write("<section id=\"content\">\r\n");
      out.write("    <!-- NAVBAR -->\r\n");
      out.write("    <nav>\r\n");
      out.write("        <i class='bx bx-menu' ></i>\r\n");
      out.write("        <a href=\"#\" class=\"nav-link\">Categories</a>\r\n");
      out.write("        <form action=\"#\">\r\n");
      out.write("            <div class=\"form-input\">\r\n");
      out.write("                <input type=\"search\" placeholder=\"Search...\">\r\n");
      out.write("                <button type=\"submit\" class=\"search-btn\"><i class='bx bx-search' ></i></button>\r\n");
      out.write("            </div>\r\n");
      out.write("        </form>\r\n");
      out.write("        <input type=\"checkbox\" id=\"switch-mode\" hidden>\r\n");
      out.write("        <label for=\"switch-mode\" class=\"switch-mode\"></label>\r\n");
      out.write("        <a href=\"#\" class=\"notification\">\r\n");
      out.write("            <i class='bx bxs-bell' ></i>\r\n");
      out.write("            <span class=\"num\">8</span>\r\n");
      out.write("        </a>\r\n");
      out.write("        <a href=\"#\" class=\"profile\">\r\n");
      out.write("            <img src=\"img/people.png\">\r\n");
      out.write("        </a>\r\n");
      out.write("    </nav>\r\n");
      out.write("    <!-- NAVBAR -->\r\n");
      out.write("\r\n");
      out.write("    <!-- MAIN -->\r\n");
      out.write("    <main>\r\n");
      out.write("        <div class=\"head-title\">\r\n");
      out.write("            <div class=\"left\">\r\n");
      out.write("                <h1>Dashboard</h1>\r\n");
      out.write("                <ul class=\"breadcrumb\">\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a href=\"#\">Dashboard</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li><i class='bx bx-chevron-right' ></i></li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a class=\"active\" href=\"#\">Home</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <ul class=\"box-info\">\r\n");
      out.write("            <li>\r\n");
      out.write("                <i class='bx bxs-calendar-check' ></i>\r\n");
      out.write("                <span class=\"text\">\r\n");
      out.write("                    <h3>1020</h3>\r\n");
      out.write("                    <p>Add Product</p>\r\n");
      out.write("                </span>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("                <i class='bx bxs-group' ></i>\r\n");
      out.write("                <span class=\"text\">\r\n");
      out.write("                    <h3>2834</h3>\r\n");
      out.write("                    <p>Total User</p>\r\n");
      out.write("                </span>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("                <i class='bx bxs-dollar-circle' ></i>\r\n");
      out.write("                <span class=\"text\">\r\n");
      out.write("                    <h3>$2543</h3>\r\n");
      out.write("                    <p>Recent Order</p>\r\n");
      out.write("                </span>\r\n");
      out.write("            </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"table-data\">\r\n");
      out.write("            <div class=\"order\">\r\n");
      out.write("                <div class=\"head\">\r\n");
      out.write("                    <h3>Recent Orders</h3>\r\n");
      out.write("                    <i class='bx bx-search' ></i>\r\n");
      out.write("                    <i class='bx bx-filter' ></i>\r\n");
      out.write("                </div>\r\n");
      out.write("                <table>\r\n");
      out.write("                    <thead>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <th>User</th>\r\n");
      out.write("                        <th>Product</th>\r\n");
      out.write("                        <th>Price</th>\r\n");
      out.write("                        <th>Action</th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    </thead>\r\n");
      out.write("                    <tbody>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <img src=\"\">\r\n");
      out.write("                            <p>John Doe</p>\r\n");
      out.write("                        </td>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <img src=\" \" alt=\"Product Image\">\r\n");
      out.write("                            <p>Product Name</p>\r\n");
      out.write("                        </td>\r\n");
      out.write("                        <td>$50</td>\r\n");
      out.write("                        <td>\r\n");
      out.write("                            <select>\r\n");
      out.write("                                <option value=\"pending\">Pending</option>\r\n");
      out.write("                                <option value=\"confirmed\">Confirmed</option>\r\n");
      out.write("                                <option value=\"delivered\">Delivered</option>\r\n");
      out.write("                            </select>\r\n");
      out.write("                        </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <!-- Add more rows as needed -->\r\n");
      out.write("                    </tbody>\r\n");
      out.write("                </table>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </main>\r\n");
      out.write("    <!-- MAIN -->\r\n");
      out.write("</section>\r\n");
      out.write("<!-- CONTENT -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"script.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
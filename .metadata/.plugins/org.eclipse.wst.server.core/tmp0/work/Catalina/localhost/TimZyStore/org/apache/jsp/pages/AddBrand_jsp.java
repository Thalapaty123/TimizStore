/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.99
 * Generated at: 2024-05-09 16:26:08 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import models.BrandModel;

public final class AddBrand_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.LinkedHashSet<>(2);
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("models.BrandModel");
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Add Brand</title>\n");
      out.write("    <style>\n");
      out.write("        /* General styles */\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("        }\n");
      out.write("        /* Back button */\n");
      out.write(".back-button {\n");
      out.write("    display: inline-block;\n");
      out.write("    padding: 8px 16px;\n");
      out.write("    background-color: #007bff;\n");
      out.write("    color: #fff;\n");
      out.write("    text-decoration: none;\n");
      out.write("    border-radius: 4px;\n");
      out.write("    transition: background-color 0.3s ease;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".back-button:hover {\n");
      out.write("    background-color: #0056b3;\n");
      out.write("}\n");
      out.write("        .container {\n");
      out.write("            width: 80%;\n");
      out.write("            margin: 20px auto;\n");
      out.write("        }\n");
      out.write("        .error-message, .success-message {\n");
      out.write("            background-color: #f2dede;\n");
      out.write("            color: #a94442;\n");
      out.write("            padding: 10px;\n");
      out.write("            margin-bottom: 10px;\n");
      out.write("            border-radius: 5px;\n");
      out.write("        }\n");
      out.write("        .success-message {\n");
      out.write("            background-color: #dff0d8;\n");
      out.write("            color: #3c763d;\n");
      out.write("        }\n");
      out.write("        .form {\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("        }\n");
      out.write("        .form h2 {\n");
      out.write("            margin-bottom: 10px;\n");
      out.write("        }\n");
      out.write("        .form label {\n");
      out.write("            display: block;\n");
      out.write("            margin-bottom: 5px;\n");
      out.write("        }\n");
      out.write("        .form input[type=\"text\"] {\n");
      out.write("            width: 100%;\n");
      out.write("            padding: 8px;\n");
      out.write("            margin-bottom: 10px;\n");
      out.write("            border: 1px solid #ccc;\n");
      out.write("            border-radius: 4px;\n");
      out.write("            box-sizing: border-box;\n");
      out.write("        }\n");
      out.write("        .form input[type=\"submit\"] {\n");
      out.write("            background-color: #007bff;\n");
      out.write("            color: white;\n");
      out.write("            padding: 10px 20px;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 4px;\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("        .form input[type=\"submit\"]:hover {\n");
      out.write("            background-color: #0056b3;\n");
      out.write("        }\n");
      out.write("        .table h2 {\n");
      out.write("            margin-bottom: 10px;\n");
      out.write("        }\n");
      out.write("        table {\n");
      out.write("            width: 100%;\n");
      out.write("            border-collapse: collapse;\n");
      out.write("        }\n");
      out.write("        th, td {\n");
      out.write("            border: 1px solid #dddddd;\n");
      out.write("            text-align: left;\n");
      out.write("            padding: 8px;\n");
      out.write("        }\n");
      out.write("        th {\n");
      out.write("            background-color: #f2f2f2;\n");
      out.write("        }\n");
      out.write("        tr:nth-child(even) {\n");
      out.write("            background-color: #f2f2f2;\n");
      out.write("        }\n");
      out.write("        /* Buttons */\n");
      out.write("        .actions {\n");
      out.write("            white-space: nowrap;\n");
      out.write("        }\n");
      out.write("        .actions a, .actions input[type=\"submit\"] {\n");
      out.write("            padding: 5px 10px;\n");
      out.write("            text-decoration: none;\n");
      out.write("            color: #fff;\n");
      out.write("            background-color: #007bff;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            cursor: pointer;\n");
      out.write("            margin-right: 5px; /* Add space between buttons */\n");
      out.write("        }\n");
      out.write("        .actions input[type=\"submit\"] {\n");
      out.write("            background-color: #dc3545; /* Red color for delete button */\n");
      out.write("        }\n");
      out.write("        .actions input[type=\"submit\"]:hover {\n");
      out.write("            background-color: #c82333; /* Darker red on hover */\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write(" <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/pages/AdminPanel.jsp\" class=\"back-button\">Admin Panel</a>\n");
      out.write("<body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"error-message\">\n");
      out.write("            ");
      out.write("\n");
      out.write("            ");
 String message = (String) request.getAttribute("message");
      out.write("\n");
      out.write("            ");
if (message != null) {
      out.write("\n");
      out.write("            <div class=\"success-message\">");
      out.print(message);
      out.write("</div>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("            ");

            String errorMessage = (String) request.getAttribute("errorMessage");
            
      out.write("\n");
      out.write("            ");

            if (errorMessage != null) {
            
      out.write("\n");
      out.write("            <div class=\"error-message\">");
      out.print(errorMessage);
      out.write("</div>\n");
      out.write("            ");

            }
            
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form\">\n");
      out.write("            <h2>Add Brand</h2>\n");
      out.write("            <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/AddBrandsServlet\"\n");
      out.write("                method=\"POST\">\n");
      out.write("                <label for=\"brand_name\">Brand Name:</label><br> <input\n");
      out.write("                    type=\"text\" id=\"brand_name\" name=\"brand_name\" required><br>\n");
      out.write("                <br> <label for=\"country_of_origin\">Country of Origin:</label><br>\n");
      out.write("                <input type=\"text\" id=\"country_of_origin\" name=\"country_of_origin\"><br>\n");
      out.write("                <br> <label for=\"website\">Website:</label><br> <input\n");
      out.write("                    type=\"text\" id=\"website\" name=\"website\"><br>\n");
      out.write("                <br> <input type=\"submit\" value=\"Submit\">\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"table\">\n");
      out.write("        	<div class=brand-delte-msg>\n");
      out.write("        	\n");
      out.write("        	</div>\n");
      out.write("            <h2>All Brands</h2>\n");
      out.write("            <table>\n");
      out.write("                <thead>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Brand Name</th>\n");
      out.write("                        <th>Country of Origin</th>\n");
      out.write("                        <th>Website</th>\n");
      out.write("                        <th>Actions</th> <!-- Added Actions column -->\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    ");

                    List<BrandModel> brands = (List<BrandModel>) request.getAttribute("brands");
                    if (brands != null) {
                        for (BrandModel brand : brands) {
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print(brand.getBrand_name());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(brand.getCountry_of_origin());
      out.write("</td>\n");
      out.write("                        <td><a href=\"");
      out.print(brand.getWebsite());
      out.write('"');
      out.write('>');
      out.print(brand.getWebsite());
      out.write("</a></td>\n");
      out.write("                        <td class=\"actions\">\n");
      out.write("                            <!-- Edit button -->\n");
      out.write("                            <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/ModifyBrandServlet?brandId=");
      out.print( brand.getBrand_id() );
      out.write("\">Edit</a>\n");
      out.write("                            <!-- Delete button -->\n");
      out.write("                            <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/ModifyBrandServlet\" method=\"POST\">\n");
      out.write(" 								<input type=\"hidden\" name=\"_method\" value=\"DELETE\">\n");
      out.write("                        		<input type=\"hidden\" name=\"brandId\" value=\"");
      out.print( brand.getBrand_id() );
      out.write("\">\n");
      out.write("                        		<input type=\"submit\" value=\"Delete\">\n");
      out.write("                            </form>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");

                        }
                    } else {
                    
      out.write("\n");
      out.write("                    <tr>\n");
      out.write("                        <td colspan=\"4\">No brands found</td>\n");
      out.write("                    </tr>\n");
      out.write("                    ");

                    }
                    
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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

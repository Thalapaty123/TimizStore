/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.99
 * Generated at: 2024-05-02 02:33:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addtocart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<title>Shopping Cart</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.print( request.getContextPath() );
      out.write("/Stylesheet/addtocart.css\">\r\n");
      out.write("<style>\r\n");
      out.write("  /* Your CSS styles here */\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"header\">\r\n");
      out.write("  <h1>Shopping Cart</h1>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("  <h2>Products</h2>\r\n");
      out.write("  <div class=\"product\">\r\n");
      out.write("    <h3>Product 1</h3>\r\n");
      out.write("    <p>Description: Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>\r\n");
      out.write("    <p>Price: $19.99</p>\r\n");
      out.write("    <input type=\"number\" id=\"quantity-product1\" value=\"1\" min=\"1\"> <!-- Quantity field -->\r\n");
      out.write("    <button onclick=\"addToOrder('Product 1', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit.', '$19.99', 'quantity-product1')\">Add to Cart</button> <!-- Buy Now button -->\r\n");
      out.write("    <button onclick=\"removeFromCart('quantity-product1')\">Delete</button> <!-- Delete button -->\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"product\">\r\n");
      out.write("    <h3>Product 2</h3>\r\n");
      out.write("    <p>Description: Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>\r\n");
      out.write("    <p>Price: $29.99</p>\r\n");
      out.write("    <input type=\"number\" id=\"quantity-product2\" value=\"1\" min=\"1\"> <!-- Quantity field -->\r\n");
      out.write("    <button onclick=\"addToOrder('Product 2', 'Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.', '$29.99', 'quantity-product2')\">Add to Cart</button> <!-- Buy Now button -->\r\n");
      out.write("    <button onclick=\"removeFromCart('quantity-product2')\">Delete</button> <!-- Delete button -->\r\n");
      out.write("  </div>\r\n");
      out.write("  <button onclick=\"goToOrderHistory()\">Order History</button> <!-- Button to go to order history page -->\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("// Function to add product to order history and calculate total price\r\n");
      out.write("function addToOrder(productName, description, price, quantityId) {\r\n");
      out.write("  var quantity = parseInt(document.getElementById(quantityId).value); // Get quantity from input field\r\n");
      out.write("\r\n");
      out.write("  // Create a new row for the product\r\n");
      out.write("  var newRow = document.createElement(\"tr\");\r\n");
      out.write("  newRow.innerHTML = `\r\n");
      out.write("    <td><img src=\"product_image.jpg\" alt=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${productName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"></td>\r\n");
      out.write("    <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${productName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("    <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${description}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("    <td class=\"price\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${price}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("    <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${quantity}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</td>\r\n");
      out.write("  `;\r\n");
      out.write("  document.getElementById(\"order-list\").appendChild(newRow);\r\n");
      out.write("\r\n");
      out.write("  // Update total price\r\n");
      out.write("  var totalPrice = parseFloat(document.getElementById(\"total-price\").innerText.replace(\"$\", \"\"));\r\n");
      out.write("  totalPrice += parseFloat(price.replace(\"$\", \"\")) * quantity;\r\n");
      out.write("  document.getElementById(\"total-price\").innerText = \"$\" + totalPrice.toFixed(2);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("// Function to remove product from cart\r\n");
      out.write("function removeFromCart(quantityId) {\r\n");
      out.write("  var quantity = parseInt(document.getElementById(quantityId).value); // Get quantity from input field\r\n");
      out.write("  var pricePerItem = parseFloat(document.querySelector('.price').innerText.replace(\"$\", \"\")); // Get price per item\r\n");
      out.write("\r\n");
      out.write("  // Update total price\r\n");
      out.write("  var totalPrice = parseFloat(document.getElementById(\"total-price\").innerText.replace(\"$\", \"\"));\r\n");
      out.write("  totalPrice -= pricePerItem * quantity;\r\n");
      out.write("  document.getElementById(\"total-price\").innerText = \"$\" + totalPrice.toFixed(2);\r\n");
      out.write("\r\n");
      out.write("  // Remove product from the cart\r\n");
      out.write("  var productContainer = document.getElementById(quantityId).parentNode; // Get the parent container of the product\r\n");
      out.write("  productContainer.parentNode.removeChild(productContainer); // Remove the product container from the DOM\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("// Function to go to order history page\r\n");
      out.write("function goToOrderHistory() {\r\n");
      out.write("  window.location.href = \"orderhistory.jsp\"; // Replace \"orderhistory.jsp\" with the actual URL of the order history page\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
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

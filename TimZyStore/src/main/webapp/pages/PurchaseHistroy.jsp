<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<%@ page import="models.PurchaseHistroyModel" %>
 <jsp:include page="footer.jsp" />
<link rel="stylesheet" href="<%= request.getContextPath() %>/css/purchasehistory.css">


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product Display</title>
<style>
     body {
    font-family: Arial, sans-serif;
    margin: 0;
    padding: 0;
    background-color: #f8f9fa;
}

.container {
    max-width: 1200px;
    margin: 0 auto;
    padding: 0 15px;
}

header {
    background-color: #007bff; /* Change navbar background color */
    color: #fff; /* Change text color */
    padding: 10px 0;
    margin-bottom: 20px; /* Add margin bottom to create gap */
}

nav {
    display: flex;
    justify-content: center; /* Center navbar items horizontally */
}

nav h1 {
    margin: 0;
    font-size: 1.5rem;
}

main {
    padding: 20px 0;
}

table {
    width: 100%;
    background-color: #fff;
    border-collapse: collapse;
    border-radius: 5px;
    overflow: hidden;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

th, td {
    padding: 12px;
    border-bottom: 1px solid #ddd;
    text-align: left;
}

th {
    background-color: #f2f2f2;
}

tr:hover {
    background-color: #f5f5f5;
}

img {
    max-width: 100px;
    height: auto;
    display: block;
    margin: 0 auto;
}
   
    
</style>
</head>
<body>
    <h1>Product Display Page</h1>
    <table border="1">
        <thead>
            <tr>
                <th>Order Date</th>
                <th>Name</th>
                <th>Quantity</th>
                <th>Total Price</th>
                <th>Order Status</th>
                <th>Image</th>
            </tr>
        </thead>
        <tbody>
            <% for (models.PurchaseHistroyModel product : (List<models.PurchaseHistroyModel>) request.getAttribute("purchaseHistroy")) { %>
                <tr>
                    <td><%= product.getOrder_date() %></td>
                    <td><%= product.getProduct_name() %></td>
                    <td><%= product.getQuantity() %></td>
                    <td><%= product.getTotal_amount() %></td>
                    <td><%= product.getStatus() %></td>
                    <td><img src="${pageContext.request.contextPath}/Uploads/ProductPictures/<%= product.getProduct_image() %>" alt="<%= product.getProduct_image() %>" width="100"></td>
                </tr>
            <% } %>
        </tbody>
    </table>
</body>
</html>

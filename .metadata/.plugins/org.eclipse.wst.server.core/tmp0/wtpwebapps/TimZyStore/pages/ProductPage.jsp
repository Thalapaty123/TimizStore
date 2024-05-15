<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<%@ page import="models.ProductModel" %>
<!DOCTYPE html>
<html>
<jsp:include page="footer.jsp" />
<head>
<meta charset="ISO-8859-1">
<title>Product Page</title>
<style>
    body {
        font-family: Arial, sans-serif;
        margin: 0;
        padding: 0;
    }
    .container {
        width: 90%;
        margin: 0 auto;
        padding-top: 20px;
        display: flex;
        flex-wrap: wrap;
        justify-content: space-between;
    }
    h1 {
        text-align: center;
    }
    .alert {
        padding: 5px;
        margin-bottom: 10px;
        border: 1px solid transparent;
        border-radius: 4px;
    }
    .alert-success {
        color: #3c763d;
        background-color: #dff0d8;
        border-color: #d6e9c6;
    }
    .alert-danger {
        color: #a94442;
        background-color: #f2dede;
        border-color: #ebccd1;
    }
    .card {
        width: calc(20% - 20px); /* Adjust based on the number of cards per row */
        margin-bottom: 15px;
        border: 1px solid #ccc;
        border-radius: 5px;
        box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
    }
    .card img {
        width: 100%;
        height: auto;
        border-top-left-radius: 5px;
        border-top-right-radius: 5px;
    }
    .card-body {
        padding: 5px;
    }
    .card-title {
        margin-top: 0;
        margin-bottom: 5px;
        font-size: 12px;
    }
    .card-text {
        margin-bottom: 5px;
        font-size: 12px;
    }
    .btn {
        display: inline-block;
        padding: 2px 4px;
        margin-bottom: 0;
        font-size: 10px;
        font-weight: 400;
        line-height: 1.42857143;
        text-align: center;
        white-space: nowrap;
        vertical-align: middle;
        -ms-touch-action: manipulation;
        touch-action: manipulation;
        cursor: pointer;
        -webkit-user-select: none;
        -moz-user-select: none;
        -ms-user-select: none;
        user-select: none;
        background-image: none;
        border: 1px solid transparent;
        border-radius: 4px;
    }
    .btn-primary {
        color: #fff;
        background-color: #007bff;
        border-color: #007bff;
    }
    .btn-success {
        color: #fff;
        background-color: #28a745;
        border-color: #28a745;
    }
</style>
</head>
<body>
<h1>Products</h1>
<div class="container">
    <% 
    // Check if a success or error message exists in the request scope
    String successMessage = (String) request.getAttribute("successMessage");
    String errorMessage = (String) request.getAttribute("errorMessage");
    
    if (successMessage != null) {
    %>
        <div class="alert alert-success" role="alert">
            <%= successMessage %>
        </div>
    <% 
    }
    
    if (errorMessage != null) {
    %>
        <div class="alert alert-danger" role="alert">
            <%= errorMessage %>
        </div>
    <% 
    }
     
    List<ProductModel> products = (List<ProductModel>) request.getAttribute("products");
    if (products != null) {
        for (ProductModel product : products) { 
    %>
    <div class="card">
        <img src="${pageContext.request.contextPath}/Uploads/ProductPictures/<%= product.getProduct_image()%>" class="card-img-top" alt="<%= product.getProduct_name() %>">
        <div class="card-body">
            <h5 class="card-title"><%= product.getProduct_name() %></h5>
            
            <p class="card-text">Price: $<%= product.getPrice() %></p>
            <form action="${pageContext.request.contextPath}/AddToCartServlet" method="post">
            	<input type="hidden" value="<%= product.getProduct_id()%>"name="product_id">
            	<input type="hidden" value = 1 name="quantity">
            	<input type="hidden" value="<%= session.getAttribute("user_id") %>" name="user_id">
            	<button type="submit" class="btn btn-primary">Add to cart</button>
            </form>
            <br>
            <form action="${pageContext.request.contextPath}/PurchaseServlet" method="post">
            	<input type="hidden" value="<%= product.getProduct_id()%>" name="product_id">
            	<input type="hidden" value = 1 name="quantity">
            	<input type="hidden" value =<%= product.getPrice() %> name="price">
            	<input type="hidden" value="<%= session.getAttribute("userId") %>" name="user_id">
            	<button type="submit" class="btn btn-success">Buy Now</button>
            </form>
        </div>
    </div>
    <% 
        }
    } else {
    	%>
        <h1>No products have been added. Please add them.</h1>
        <% } %>
</div>

<jsp:include page="footer.jsp" />
</body>
</html>

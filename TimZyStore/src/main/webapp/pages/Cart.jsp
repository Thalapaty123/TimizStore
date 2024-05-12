<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<%@ page import="models.DisplayCartModel" %>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="footer.jsp" />
<meta charset="ISO-8859-1">
<title>Cart Details</title>
<!-- Include Bootstrap CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f8f9fa; /* Light gray background */
    }
    .container {
        padding-top: 20px;
    }
    h1 {
        color: #212529; /* Dark grayish font color */
        text-align: center;
        margin-bottom: 30px;
    }
    .cart-item {
        background-color: #fff; /* White background for each item */
        border-radius: 5px; /* Rounded corners */
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1); /* Shadow */
        padding: 20px;
        margin-bottom: 20px;
    }
    .cart-item h3 {
        color: #212529; /* Dark grayish font color */
        margin-bottom: 10px;
    }
    .quantity-controls {
        display: flex;
        align-items: center;
    }
    .quantity-controls button {
        background-color: #f8f9fa; /* Light gray background */
        color: #212529; /* Dark grayish font color */
        border: none;
        cursor: pointer;
        padding: 5px 10px;
        margin: 0 5px;
    }
    .quantity-controls button:hover {
        background-color: #e9ecef; /* Light gray background on hover */
    }
    /* Adjusted the max-width of the images */
    .col-md-8 img {
        max-width: 150px; /* Adjust the width as needed */
        border-radius: 5px; /* Rounded corners */
        margin-bottom: 10px;
    }
    .col-md-2 {
        display: flex;
        align-items: center;
    }
    .col-md-2, .col-md-8 {
        padding: 0 15px;
    }
</style>
</head>
<body>
    <div class="container">
        <h1>Cart Details</h1>
        <div class="cart-items">
            <% 
            List<DisplayCartModel> cartDetails = (List<DisplayCartModel>) request.getAttribute("cart_details");
            if (cartDetails != null && !cartDetails.isEmpty()) {
                for (DisplayCartModel item : cartDetails) { 
            %>
            <div class="cart-item">
                <div class="row">
                    <div class="col-md-8">
                        <h3><%= item.getProduct_name() %></h3>
                        <!--<p>Product ID: <%= item.getProduct_id() %></p> -->
                        <img src="${pageContext.request.contextPath}/Uploads/ProductPictures/<%= item.getProduct_image() %>" alt="<%= item.getProduct_name() %>" class="img-fluid">
                    </div>
                    <div class="col-md-2">
                        <div class="quantity-controls">
                            <button class="btn btn-sm btn-secondary">-</button>
                            Quantity: <%= item.getQuantity() %>
                            <button class="btn btn-sm btn-secondary">+</button>
                        </div>
                    </div>
                    <div class="col-md-2">
                        Price: $<%= item.getPrice() %>
                    </div>
                </div>
            </div>
            <% 
                }
            } else {
            	%>
                <h2>No items in the cart</h2>
                <% } %>
        </div>
    </div>
<!-- Include Bootstrap JS -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>

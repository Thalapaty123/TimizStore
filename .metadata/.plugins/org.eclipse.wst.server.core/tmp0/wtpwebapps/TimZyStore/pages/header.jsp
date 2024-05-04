<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<style>

/* Style.css */

body, html {
    height: 100%;
    margin: 0;
    padding: 0;
}

.container {
    max-width: 1200px;
    margin: 0 auto;
    padding: 0 20px;
    min-height: 100%;
    display: flex;
    flex-direction: column;
}

.navbar {
    background-color: #333;
    padding: 10px 0;
}

.navlist {
    list-style-type: none;
    margin: 0;
    padding: 0;
}

.navlist li {
    display: inline;
    margin-right: 20px;
}

.navlist li a {
    color: #fff;
    text-decoration: none;
}

.navlist li a:hover {
    color: #ccc;
}

button {
    background-color: #4CAF50;
    border: none;
    color: white;
    padding: 10px 20px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin-top: 10px;
    cursor: pointer;
}

.hero {
    display: flex;
    justify-content: space-between;
    align-items: center;
    margin-top: auto; /* Push hero section to the top */
}

.content {
    max-width: 500px;
}

.Img_box img {
    max-width: 300px;
}

.features {
    display: flex;
    justify-content: space-between;
    margin-top: 50px;
}

.card {
    text-align: center;
}

.card img {
    max-width: 100px;
}

.card h3 {
    margin-top: 10px;
}

/* Add your additional styles here */


</style>

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Smart Watch</title>
    <link rel="stylesheet" href="<%= request.getContextPath() %>/Stylesheet/Style.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta2/css/all.min.css">
</head>

<body>
    <div class="container">
        <div class="ecommerce-name"></div>
        <div class="navbar">
            <ul class="navlist">
                <li><a href="watch.jsp">Home</a></li>
                <li><a href="Product.jsp">Product</a></li>
                <li><a href="#">About Us</a></li>
                <li><a href="#">LogOut</a></li>
                <li><a href="#" id="profile-link"><i class="fa-solid fa-user"></i></a></li>
                <li><a href="{% url "view_cart"%}"><i class="fa-solid fa-cart-shopping"></i></a></li>
            </ul>
  
        </div>
    </div>
</body>

</html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<style>
 nav {
    background-color: #000000;
    color: #fff;
    padding: 0px 0;
    width:100%;
}

nav .logo {
    font-size: 1.5rem;
    margin-left: 20px;
}

nav ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    text-align: right;
}

nav ul li {
    display: inline;
    margin-right: 20px;
}

nav ul li a {
    color: #fff;
    text-decoration: none;
}

footer {
    background-color: #000000;
    color: #fff;
    text-align: center;
    padding: 0px 0;
    position: fixed;
    bottom: 0;
    width: 100%;
    margin-top: 23px;
</style>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Navbar and Footer</title>
    <link rel="stylesheet" href="style.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">
</head>
<body>
    <nav>
        <div class="logo">TimZy</div>
    
      <ul>
        <li><a href="${pageContext.request.contextPath}/pages/Index.jsp">Home</a></li>
        <li><a href="<%= request.getContextPath() %>/DisplayProductUser">Products</a></li>
        <li><a href="<%= request.getContextPath() %>/pages/AboutUs.jsp">About Us</a></li>
        <li><a href="<%= request.getContextPath() %>/UserProfile"><i class="fas fa-user"></i></a></li>
        <li><a href="<%= request.getContextPath() %>/UserCartServlet"><i class="fas fa-shopping-cart"></i></a></li>
    </ul>
       <div class="search-bar">
            <input type="text" placeholder="Search...">
            <button><i class="fas fa-search"></i></button>
        </div>
    </nav>

    <footer>
        <div class="footer-content">
            <p>&copy; 2024 WatchZone. All rights reserved.</p>
            <p>Contact us: contact@watchzone.com</p>
        </div>
    </footer>
</body>
</html>

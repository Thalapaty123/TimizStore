<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Smart Watch</title>
    <link rel="stylesheet" href="<%= request.getContextPath() %>/css/Style.css">
 
    
    <!-- Include Font Awesome CSS -->
    
</head>
<body>
    <div class="container">
        <div class="ecommerce-name"></div>
        <div class="navbar">
            <ul class="navlist">
                <li><a href="${pageContext.request.contextPath}/pages/Index.jsp">Home</a></li>
                <li><a href="${pageContext.request.contextPath}/DisplayProductUser">Product</a></li>
                <li><a href="${pageContext.request.contextPath}/pages/AboutUs.jsp">About Us</a></li>
                <% 
                if (session.getAttribute("username") == null) {
                %>
                <li><a href="${pageContext.request.contextPath}/pages/Login.jsp">Login</a></li>
                <% } else { %>
                <li><a href="${pageContext.request.contextPath}/LogOutServlet">Logout</a></li>
                <% } %>
                   <li><a href="${pageContext.request.contextPath}/UserProfile">User</a></li>
                 <li><a href="${pageContext.request.contextPath}UserCartServlet">Cart</a></li>
            </ul>
            <!-- User Profile and Cart Links -->
            
            </ul>
            <!-- Get Started Button -->
            <button> Get Started</button>
        </div>
        <!-- Hero Section -->
        <section class="hero">
            <div class="content">
                <h1>Choose TimZy For <span>Luxurious Life</span></h1>
                <p>TimZy is a well-reputed smartWatch brand renowned for its innovative design, cutting-edge technology, and user-friendly features.</p>
                <button onclick="exploreMore()">Explore More</button>
            </div>
            <div class="Img_box">
                <img src="${pageContext.request.contextPath}/images/smart watch.png" alt="Smart Watch">
            </div>
            <div class="features">
                <div class="card">
                    <img src="${pageContext.request.contextPath}/images/mark location.png" alt="Smart Watch">
                    <h3>GPS Tracking</h3>
                </div>
                <div class="card">
                    <img src="${pageContext.request.contextPath}/images/heart pulse.png" alt="Smart Watch">
                    <h3>Heart Rate Sensor</h3>
                </div>
                <div class="card">
                    <img src="${pageContext.request.contextPath}/images/calories.png" alt="Smart Watch">
                    <h3>Calories Count</h3>
                </div>
            </div>
        </section>
    </div>
</body>
</html>

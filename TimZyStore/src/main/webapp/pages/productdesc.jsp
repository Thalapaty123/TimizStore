<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
 <link rel="stylesheet" href="<%= request.getContextPath() %>/css/productdesc.css">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Product </title>
    <link rel="stylesheet" href="style.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">
</head>
<body>
    <nav>
        <div class="logo">TimZy </div>
    
        <ul>
            <li><a href="#">Home</a></li>
            <li><a href="#">Products</a></li>
            <li><a href="#">About Us</a></li>
            <li><a href="#"><i class="fas fa-user"></i></a></li>
            <li><a href="#"><i class="fas fa-shopping-cart"></i></a></li>
        </ul>
        <div class="search-bar">
            <input type="text" placeholder="Search...">
            <button><i class="fas fa-search"></i></button>
        </div>
    </nav>

    <div class="container">
        <div class="flex-box">
            <div class="left">
                <div class="big-img">
                    <img src="img/p1.png">
                </div>
       
            </div>

            <div class="right">
                <div class="pname">Apple Watch </div>
                <div class="ratings">
                    <i class="fas fa-star"></i>
                    <i class="fas fa-star"></i>
                    <i class="fas fa-star"></i>
                    <i class="fas fa-star"></i>
                    <i class="fas fa-star-half-alt"></i>
                </div>
                <div class="price">$150</div>
                <div class="description">
                    <p>Description:</p>
                    <p>This elegant smartwatch combines style and functionality, offering features like heart rate monitoring, sleep tracking, and notifications.</p>
                </div>
                <div class="brand">Brand: Timex</div>
                <div class="screensize">Screen Size: 1.3 inches</div>
                <div class="color">Color: Silver</div>
                <div class="connectivity">Connectivity: Bluetooth 5.0</div>
                <div class="os">Operating System: Wear OS</div>
                <div class="features">
                    <p>Features:</p>
                </div>
                <div class="quantity">
                    <p>Quantity :</p>
                    <input type="number" min="1" max="5" value="1">
                </div>
                <div class="btn-box">
                    <button class="cart-btn">Add to Cart</button>
                    <button class="buy-btn">Buy Now</button>
                    <div class="btn-box">
                        <button class="go-back-btn">Go Back</button>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <footer>
        <div class="footer-content">
            <p>&copy; <%= new java.util.Date().getYear() + 1900 %> WatchZone. All rights reserved.</p>
            <p>Contact us: contact@watchzone.com</p>
        </div>
    </footer>

    <script>
        let bigImg = document.querySelector('.big-img img');
        function showImg(pic){
            bigImg.src = pic;
        }
    </script>
</body>
</html>

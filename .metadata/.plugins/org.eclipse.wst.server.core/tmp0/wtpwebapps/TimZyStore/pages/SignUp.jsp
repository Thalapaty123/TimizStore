<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sign Up</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 100vh;
            background-color: #aaaaaa;
        }

        .container {
            display: flex;
            width: 100%;
            max-width: 800px;
            border-radius: 10px;
            overflow: hidden;
            box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);
            background-color: #7b9bf5;
        }

        .image-container {
            flex: 1;
            display: flex;
            align-items: center;
            justify-content: center;
            overflow: hidden;
            background-color: #ffffff;
        }

        .image-container img {
            width: 100%;
            height: auto;
            object-fit: cover;
        }

        .form-container {
            flex: 1;
            padding: 40px;
        }

        h1 {
            margin-bottom: 30px;
            font-size: 24px;
            text-align: center;
            color: #ffffff;
        }

        form {
            display: flex;
            flex-direction: column;
        }

        label {
            margin-bottom: 8px;
            font-size: 14px;
            color: #ffffff;
        }

        input[type="text"],
        input[type="email"],
        input[type="password"],
        input[type="tel"],
        select {
            padding: 10px;
            border: 2px solid #fcfcfc;
            border-radius: 5px;
            margin-bottom: 15px;
            font-size: 16px;
            outline: none;
        }

        select {
            appearance: none;
            background: url('data:image/svg+xml;utf8,<svg fill="#ffffff" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24" width="24px" height="24px"><path d="M7 10l5 5 5-5z"/><path d="M0 0h24v24H0z" fill="none"/></svg>') no-repeat right #fff;
            background-size: 16px;
            padding-right: 30px;
        }

        .checkbox-container {
            display: flex;
            align-items: center;
            margin-bottom: 20px;
            font-size: 14px;
            color: #ffffff;
        }

        .checkbox-container input[type="checkbox"] {
            margin-right: 8px;
        }

        button {
            background-color: #ff6d02;
            color: #fff;
            padding: 12px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            font-size: 16px;
            transition: background-color 0.3s ease;
        }

        button:hover {
            background-color: #ff8700;
        }

        p {
            text-align: center;
            margin-top: 20px;
            font-size: 14px;
            color: #ffffff;
        }

        a {
            color: #ff6d02;
            text-decoration: none;
        }

    </style>
</head>
<body>
    <div class="container">
        <div class="image-container">
            <!-- Replace the image source with a JSP expression -->
            <img src="${pageContext.request.contextPath}/images/hand.jpg" alt="Background Image">
        </div>
        <div class="form-container">
            <h1>Create Your  Account</h1>
            <form action="#">
                <label for="user-name">User Name</label>
                <input type="text" id="user-name" name="user-name" required>
                <label for="first-name">First Name</label>
                <input type="text" id="first-name" name="first-name" required>
                <label for="last-name">Last Name</label>
                <input type="text" id="last-name" name="last-name" required>
                <label for="email">Email</label>
                <input type="email" id="email" name="email" required>
                <label for="phone-number">Phone Number</label>
                <input type="tel" id="phone-number" name="phone-number" required>
                <label for="password">Password</label>
                <input type="password" id="password" name="password" required>
                <label for="confirm-password">Confirm Password</label>
                <input type="password" id="confirm-password" name="confirm-password" required>
                <div class="checkbox-container">
                    <input type="checkbox" id="agree-terms" name="agree-terms" required>
                    <label for="agree-terms">I agree to the <a href="#">terms and conditions</a></label>
                </div>
                <button type="submit">Sign Up</button>
                <p> Already have an Account <a href="Login.jsp">Login</a></p> <!-- Changed the file extension to .jsp -->
            </form>
        </div>
    </div>
</body>
</html>

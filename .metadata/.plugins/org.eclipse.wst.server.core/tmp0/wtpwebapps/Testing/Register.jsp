<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Insert title here</title>
 <link rel= "stylesheet" type = "text/css" href = "<%= request.getContextPath()%>/stylesheet/regLog.css"/>
     <style>
        body {
            font-family: Arial, sans-serif;
            padding: 20px;
            background-color: #f4f4f4;
        }
        .container {
            background: white;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
            display: grid;
            
        }
        input, select {
            width: 100%;
            padding: 8px;
            margin: 10px 0;
            display: inline-block;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
            width: 500px;
        }
        button {
            width: 100%;
            background-color: #4CAF50;
            color: white;
            padding: 14px 20px;
            margin: 8px 0;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }
        button:hover {
            background-color: #45a049;
        }
        
    </style>
</head>
<body>
    <div class="container">
        
        <div class="sub-container">
            <div class="images">
                <img src="reg.jpg" alt="reg">
            </div>
            <div class="forms" >
                <h2 style="text-align: center;">Register</h2>
                <p>Let's Sign up First to enter into lens Craft Clicks</p>
                <form action="../registerForm" method="post">
                    <div class="two-sep">
                        <div class="sep">
                            <label for="username">Username</label>
                            <input type="text" id="username" name="username" placeholder="Ex: Eliza">

                        </div>

                        <div class="sep">

                            <label for="contactNo">Contact No.</label>
                            <input type="text" id="contactNo" name="contactNo" placeholder="Ex: 9832293293">

                        </div>
            


                    </div>

                    <div class="two-sep">

                        <div class="sep">

                            <label for="firstName">First Name</label>
                            <input type="text" id="firstName" name="firstName" placeholder="Ex: Eliza">

                        </div>

                        
                        <div class="sep">
                            <label for="lastName">Last Name</label>
                            <input type="text" id="lastName" name="lastName" placeholder="Ex: Maguire">

                        </div>
            


                    </div>

                    <div class="two-sep">

                        <div class="sep">
                            <label for="email">Your Email</label>
                            <input type="email" id="email" name="email" placeholder="Ex: maguire@FlexUI.com">

                        </div>


                        <div class="sep">
                            <label for="address">Your Address</label>
                            <input type="text" id="address" name="address" placeholder="Your full address">

                        </div>
            


                    </div>
                         
                    <div class="two-sep">

                        <div class="sep">
                            <label for="dob">Date of Birth</label>
                            <input type="date" id="dob" name="dob" placeholder="YYYY/MM/DD">

                        </div>


                        <div class="sep">

                            <label for="gender">Gender</label>
                            <select id="gender" name="gender">
                                <option value="male">Male</option>
                                <option value="female">Female</option>
                                <option value="other">Other</option>
                            </select>

                        </div>

                        <div class="sep">

                            <label for="userType">User Type</label>
                            <select id="userType" name="userType">
                                <option value="customer">Customer</option>
                                <option value="customer">Admin</option>
                            </select>

                        </div>


                    </div>
            

                    <div class="two-sep">

                        <div class="sep">

                            <label for="password">Password</label>
                            <input type="password" id="password" name="password" placeholder="Enter Password">

                        </div>
                        
                        <div class="sep">

                            <label for="confirmPassword">Confirm Password</label>
                            <input type="password" id="confirmPassword" name="confirmPassword" placeholder="Confirm Password">
                            
                        </div>

                      

                    </div>


                    
        
        
             <p>By creating an account, you agree to our <a href="#">Terms & Conditions</a>.</p>
                    
                    <button type="submit" value="Register">Register</button>
                </form>
            </div>
        </div>
        
    </div>
</body>
</html>
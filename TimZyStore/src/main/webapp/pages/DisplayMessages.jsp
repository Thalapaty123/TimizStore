<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="models.AboutUsModel" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Admin Messages</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f8f9fa; /* Light gray background */
            margin: 0;
            padding: 0;
        }
        h1 {
            color: #212529; /* Dark grayish font color */
            text-align: center;
            margin-top: 20px;
            
            
        }
        
        /* Back button */
.back-button {
    display: inline-block;
    padding: 8px 16px;
    background-color: #007bff;
    color: #fff;
    text-decoration: none;
    border-radius: 4px;
    transition: background-color 0.3s ease;
}

.back-button:hover {
    background-color: #0056b3;
}
        table {
            width: 100%;
            border-collapse: collapse;
            margin: 20px auto;
            background-color: #fff;
            border-radius: 5px; /* Rounded corners */
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1); /* Shadow */
        }
        th, td {
            border: 1px solid #dee2e6; /* Light gray border */
            padding: 10px;
            text-align: left;
        }
        th {
            background-color: #f8f9fa; /* Light gray background for header */
            font-weight: bold;
            color: #6c757d; /* Gray font color */
            padding-top: 12px;
            padding-bottom: 12px;
        }
        tr:nth-child(even) {
            background-color: #f8f9fa; /* Light gray background for even rows */
        }
    </style>
</head>
  <a href="${pageContext.request.contextPath}/pages/AdminPanel.jsp" class="back-button">Admin Panel</a>
<body>

    <h1>User Messages For Company</h1>
    <table>
        <tr>
            <th>Sender Name</th>
            <th>Sender Email</th>
            <th>Subject</th>
            <th>Message</th>
            <th>Timestamp</th>
        </tr>
        <% 
        List<AboutUsModel> messages = (List<AboutUsModel>) request.getAttribute("messages");
        if (messages != null) {
            java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            for (AboutUsModel message : messages) { %>
                <tr>
                    <td><%= message.getSender_name() %></td>
                    <td><%= message.getSender_email() %></td>
                    <td><%= message.getSubject() %></td>
                    <td><%= message.getMessage() %></td>
                    <td><%= sdf.format(message.getTimestamp()) %></td>
                </tr>
        <% } 
        } %>
    </table>
</body>
</html>

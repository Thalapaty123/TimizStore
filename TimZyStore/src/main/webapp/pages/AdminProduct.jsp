<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="models.ProductModel" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Product List</title>
    <style>
       body {
            font-family: Arial, sans-serif;
            background-color: #f5f5f5;
            margin: 0;
            padding: 0;
        }

        .container {
            width: 100%;
            margin: 20px auto;
            padding: 10px;
        }
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

        h2 {
            text-align: center;
            margin-top: 20px;
            font-size: 24px;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            background-color: #fff;
            box-shadow: 0 0 5px rgba(0, 0, 0, 0.1);
        }

        th, td {
            padding: 8px;
            text-align: left;
            border-bottom: 1px solid #ddd;
            font-size: 14px;
        }

        th {
            background-color: #f7f7f7;
        }

        tr:hover {
            background-color: #f2f2f2;
        }

        .product-image {
            text-align: center;
        }

        .product-image img {
            max-width: 50px;
            height: auto;
            display: inline-block;
        }

        .actions {
            white-space: nowrap;
            text-align: center;
        }

        .actions button, .actions a {
            padding: 5px 10px;
            text-decoration: none;
            color: #fff;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            font-size: 12px;
        }

        .actions button {
            background-color: #4CAF50;
        }

        .actions a {
            background-color: #007bff;
        }

        .actions button:hover, .actions a:hover {
            background-color: #45a049;
        }

        @media screen and (max-width: 768px) {
            th, td {
                padding: 6px;
                font-size: 12px;
            }

            .product-image img {
                max-width: 40px;
            }

            .actions button, .actions a {
                padding: 4px 8px;
                font-size: 10px;
            }
        }
    </style>
</head>
 <a href="${pageContext.request.contextPath}/pages/AdminPanel.jsp" class="back-button">Admin Panel</a>
<body>
    <div class="container">
        <h2>Product List</h2>
        
        <table border="1">
            <tr>
                <th>Product Image</th>
                <th>Product Name</th>
                <th>Product Description</th>
                <th>Price</th>
                <th>Quantity</th>
                <th>Actions</th>
            </tr>
            <% 
                List<ProductModel> products = (List<ProductModel>) request.getAttribute("products");
                if (products != null) {
                    for (ProductModel product : products) { 
            %>
                <tr>
                    <td class="product-image">
                        <img src="${pageContext.request.contextPath}/Uploads/ProductPictures/<%= product.getProduct_image() %>" alt="<%= product.getProduct_name() %>">
                    </td>
                    <td><%= product.getProduct_name() %></td>
                    <td><%= product.getProduct_description() %></td>
                    <td><%= product.getPrice() %></td>
                    <td><%= product.getQuantity() %></td>
                    <td class="actions">
                        <form method="post" action="${pageContext.request.contextPath}/editProductServlet">
                            <input type="hidden" name="product_id" value="<%= product.getProduct_id() %>">
                            <button type="submit">edit</button>
                        </form>

                        <br>
						<form id="deleteForm<%=product.getProduct_id()%>" method="post" action="${pageContext.request.contextPath}/ModifyProductServlet">
					    <input type="hidden" name="productId" value="<%=product.getProduct_id()%>">
					    <input type="hidden" name="action" value="Delete" > 
					    <button  value="submit">Delete</button>
						</form>
                    </td>
                </tr>
            <% 
                    } 
                } 
            %>
        </table>
    </div>
</body>
</html>

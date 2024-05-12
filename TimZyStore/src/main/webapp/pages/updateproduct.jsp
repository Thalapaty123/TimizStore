<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit Product</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="style.css">
    <script>
        function showPopup() {
            alert("Product updated successfully!");
        }
    </script>
</head>
<body>
    <div class="container mt-5">
        <h2>Edit Product</h2>
        <form action="editProductServlet" method="post" enctype="multipart/form-data" onsubmit="showPopup()">
            <div class="form-group">
                <label for="product_image">Product Image:</label>
                <input type="file" class="form-control-file" id="product_image" name="product_image">
            </div>
            <div class="form-group">
                <label for="product_description">Product Description:</label>
                <textarea class="form-control" id="product_description" name="product_description">${product.product_description}</textarea>
            </div>
            <div class="form-group">
                <label for="price">Price:</label>
                <input type="text" class="form-control" id="price" name="price" value="${product.price}">
            </div>
            <div class="form-group">
                <label for="quantity">Quantity:</label>
                <input type="text" class="form-control" id="quantity" name="quantity" value="${product.quantity}">
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
        <a href="productList.jsp" class="btn btn-secondary mt-3">Back to Product List</a>
    </div>
</body>
</html>

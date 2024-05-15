<%@ page import="java.util.List" %>
<%@ page import="models.ProductModel" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search Results</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f8f9fa;
        margin: 0;
        padding: 20px;
    }

    .display-result {
        max-width: 800px;
        margin: 0 auto;
    }

    h1 {
        text-align: center;
        margin-bottom: 20px;
    }

    .result-item {
        border: 1px solid #ccc;
        border-radius: 5px;
        padding: 20px;
        margin-bottom: 20px;
        background-color: #fff;
    }

    .result-item img {
        max-width: 100%;
        height: auto;
        margin-bottom: 10px;
    }

    .result-item h3 {
        margin-top: 0;
    }

    .result-item p {
        margin: 5px 0;
    }
</style>
</head>
<body>
    <div class="display-result">
        <h1>Search Results</h1>
        <% 
        List<ProductModel> searchResults = (List<ProductModel>) request.getAttribute("search_result");
        if (searchResults != null && !searchResults.isEmpty()) {
            for (ProductModel product : searchResults) { %>
                <div class="result-item">
                    <img src="${pageContext.request.contextPath}/Uploads/ProductPictures/<%= product.getProduct_image() %>" class="card-img-top" alt="<%= product.getProduct_name() %>">
                    <h3><%= product.getProduct_name() %></h3>
                    <p>Description: <%= product.getProduct_description() %></p>
                    <p>Price: <%= product.getPrice() %></p>
                    <p>Available Quantity: <%= product.getQuantity() %></p>
                </div>
            <% }
        } else { %>
            <p>No results found.</p>
        <% }
        %>
    </div>
</body>
</html>

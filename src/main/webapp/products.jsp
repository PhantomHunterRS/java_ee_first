<%@ page import="com.phantom.Product" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: phantomhunter
  Date: 25.03.2022
  Time: 00:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Products Lists</title>
</head>
<body>
<h1>Products Lists</h1>
<ul>
    <% for (Product product:(List<Product>)(request.getAttribute("products"))) { %>
    <li>id: <%=product.getId()%>, title: <%=product.getTitle()%>, cost: <%=product.getCost()%>
    </li>
    <% } %>
</ul>
</body>
</html>

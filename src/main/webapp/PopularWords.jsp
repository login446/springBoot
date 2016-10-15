<%--
  Created by IntelliJ IDEA.
  User: alex
  Date: 12.10.2016
  Time: 1:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Popular words</title>
</head>
<body>
<h1>Popular words</h1>
<div>${popularWords}</div>
<form method="get" action="/index">
    <p><input type="submit" value="return"></p>
</form>
</body>
</html>

<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="LoginServlet">Log ind</a>

<c:forEach var="emne" items="${requestScope.personer}">


    <br>
    ${emne.value.navn}


</c:forEach>

<br>
<br>
${requestScope.msg}
<br>
<h2>Her kan du logge ind</h2>

<form action="LoginServlet" method="post">
    <label >angiv navn </label><br>
    <input type="text" name="navn" value="navn"><br>
    <label>angiv kode </label><br>
    <input type="text" name="kode" value="kode"><br>
    <input type="submit" value="login">
</form>



</body>
</html>
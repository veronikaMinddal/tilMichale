<%--
  Created by IntelliJ IDEA.
  User: vmind
  Date: 14/03/2023
  Time: 20.05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
Velkommen ${sessionScope.person.navn}<br>

<h1>Din huskeliste:</h1><br>
<form method="post">
    <table class="table table-striped">
        <thead>
        <tr>
            <th>ting</th>
            <th>slet</th>
        </tr>
        </thead>

        <tbody>
        <c:forEach var="emne" items="${sessionScope.person.stringArrayList}"></th>
        <tr>
            <td>${emne}</td>
            <td>
                <button name="fjern" value="${emne}" formaction="ServletSletTing">fjern</button>
            </td>
        </tr>
        </c:forEach>
        </tbody>
    </table>
</form>

<form action="ServletEditListe" method="get">

    <label>tilføj emne til listen </label><br>
    <input type="text" name="emne" value="emne"><br>

    <input type="submit" value="tilføj">
</form>
<br><br><br>

<h2>${requestScope.msg}</h2>

<form action="ServletSave" method="get">
    <label></label><br>
    <input type="submit" value="gem bruger">
</form>

<form action="ServletSave" method="post">
    <label></label><br>
    <input type="submit" value="log ud">


</form>


</body>
</html>

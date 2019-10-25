<%--
  Created by IntelliJ IDEA.
  User: Dima
  Date: 14.10.2019
  Time: 10:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ShowUser</title>
</head>
<body>
<form method="post" action="TheMostRichest">
    <input type="submit" value="Самый богатый">
    <div> Самый богатый : ${theMostRichest}</div>
</form>
<form method="post" action="AccountsSum">
    <input type="submit" value="Сумма денег в банке">
    <div>Сумма денег в банке: ${accountsSum}</div>
</form>
</body>
</html>

<%--<!DOCTYPE html>--%>
<%--<html lang="en">--%>
<%--<head>--%>
<%--    <meta charset="UTF-8">--%>
<%--    <title>StartPage</title>--%>
<%--</head>--%>
<%--<body>--%>

<%--</body>--%>
<%--</html>--%>
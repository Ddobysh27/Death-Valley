<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Death Valley</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/Servlet"  method="post">
    <%=request.getAttribute("ru")%>
</form>

</body>
</html>
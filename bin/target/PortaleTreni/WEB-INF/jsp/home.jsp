<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Treni</title>
</head>
<body >
<%=request.getAttribute("message")%>
<jsp:include page="menu.jsp"></jsp:include>
<%//out.write(session.getSessionContext()) ; %>
</body>
</html>

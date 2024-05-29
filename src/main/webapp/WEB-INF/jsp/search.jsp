<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import ="java.util.*" %>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cerca</title>
</head>
<body>
<jsp:include page="menu.jsp"></jsp:include>
<!--  ${categorie} -->

<%
/*
List<Categoria> categorie = (List<Categoria>) request.getAttribute("categorie"); 

for (Categoria categoria:categorie){
	%>
	    <p> nome: <%= categoria.getNome() %>  </p>
	<% 
}*/
%>

<c:forEach var="c" items="${categorie}">
    <li style="color:red" >${c.nome}-${c.descrizione}
</c:forEach>



</body>
</html>
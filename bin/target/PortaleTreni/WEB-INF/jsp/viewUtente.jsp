<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.corso.treno.model.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:include page="menu.jsp"></jsp:include>

<br><br><br>
 bravo! hai inserito l'utente:   
 <!--  ${utente.nome}
 - ${utente.cognome}-->
 
 <% Utente u = (Utente) request.getAttribute("utente") ; 
 	out.write(u.getNome() + " " + u.getCognome()) ; 
 %>
 
</body>
</html>
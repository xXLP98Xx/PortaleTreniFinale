
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.corso.vo.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:include page="menu.jsp"></jsp:include>

<br><br><br>
 bravo! hai inserito il treno:   
 <!--  ${utente.nome}
 - ${utente.cognome}-->
 
 <% TrenoVO t = (TrenoVO) request.getAttribute("treno") ; 
 	//out.write(t.getId() + " " + t.getCompagnia()) ; 
 	out.write(t.getCompagnia() + " " + t.getUtenteId());
 %>
 
</body>

  </html>
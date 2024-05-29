<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.corso.treno.model.*, java.util.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Treni creati</title>
</head>
<body>

<jsp:include page="menu.jsp"></jsp:include>

<br><br><br>


 Lista treni creati:   

 <% 
 List<Treno> treni = (List<Treno>)request.getAttribute("treni");
 
 %>
 <tr>
 <%
 for(Treno t:treni){
	 out.write(t.getId() + " " + t.getCompagnia() + "<br>");
 } 
 %>
 
</body>
</html>
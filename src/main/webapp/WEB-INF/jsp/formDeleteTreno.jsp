<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Elimina treno</title>
</head>
<body>

 <form action="delete_treno" method="POST"  modelAttribute="treno">
  <label for="id">Treno da eliminare (id treno):</label><br>
  <input type="text" id="id" name="id" value="15"><br><br>
  <input type="submit" value="Submit">
</form> 

</body>
</html> --%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Elimina treno</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css">
<style>
    .hover\:underline:hover {
        text-decoration: underline;
    }
    body {
        background-color: #1fb6ff;
    }
    .bg-sky-500 {
        background-color: #1fb6ff;
    }
    .bg-sky-800 {
        background-color: #005c99;
    }
</style>
</head>
<body>

<div class="bg-sky-500 text-white flex justify-between items-center p-4">
    <div class="flex space-x-4">
        <a href="form_add_treno" class="hover:underline">CREA TRENO</a>
        <a href="form_search_treno" class="hover:underline">CERCA TRENO</a>
        <a href="form_delete_treno" class="hover:underline">CANCELLA TRENO</a>
        <a href="form_edit_treno" class="hover:underline">MODIFICA TRENO</a>
        <a href="form_show_treni" class="hover:underline">LISTA TRENI</a>
    </div>
    <div class="relative">
        <%= (request.getAttribute("utenteL") == null) 
            ? "<a href='form_login_utente' class='bg-sky-800 px-4 py-2 rounded inline-block'>ACCEDI</a>" 
            : "<a href='logout_utente' class='bg-sky-800 px-4 py-2 rounded inline-block'>LOGOUT</a>" 
        %>
    </div>
</div>

<form class="bg-white p-6 rounded-lg shadow-lg w-full max-w-4xl mx-auto mt-8" action="delete_treno" method="POST" modelAttribute="treno">  
    <label for="id" class="block mb-2">Treno da eliminare (id treno):</label>
    <input type="text" id="id" name="id" value="15" class="w-full px-4 py-2 rounded-md mb-4 border border-gray-300 focus:outline-none focus:border-blue-500">
    <input type="submit" value="Conferma" class="bg-blue-500 text-white px-4 py-2 rounded-md hover:bg-blue-600 cursor-pointer">
</form>

</body>
</html>

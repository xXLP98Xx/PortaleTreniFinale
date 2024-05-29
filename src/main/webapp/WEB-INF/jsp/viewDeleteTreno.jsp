<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.corso.treno.model.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Treno eliminato</title>
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

<main class="bg-sky-500 flex justify-center py-8">
    <div class="bg-white p-6 rounded-lg shadow-lg w-full max-w-4xl">  
        Treno eliminato:   

        <% Treno t = (Treno) request.getAttribute("treno") ; 
            out.write(t.getId() + " " + t.getCompagnia() + " " + t.getUtenteId()) ; 
        %>
    </div>
</main>
 
</body>
</html>

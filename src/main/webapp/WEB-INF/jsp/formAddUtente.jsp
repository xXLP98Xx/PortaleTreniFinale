<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html lang="it">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="https://cdn.tailwindcss.com"></script>
    <title>Registrazione</title>
</head>
<body class="bg-sky-500 min-h-screen flex items-center justify-center">
    <!-- Header -->
    <div class="absolute top-0 w-full bg-indigo-300 text-center py-2 text-sm">
        BENVENUTO <%= (request.getAttribute("utenteL") == null) ? "OSPITE" : request.getAttribute("utenteL") %> SU PORTALE TRENI - IDM ACADEMY 19 - 04/24 -
    </div>

    <!-- Navigation Bar -->
    <div class="absolute top-10 w-full bg-sky-500 text-white flex justify-between items-center p-0">
        <div class="flex items-center space-x-4">
            <img src="https://upload.wikimedia.org/wikipedia/commons/f/fe/Apache_Tomcat_logo.svg" alt="Treni Logo" class="h-10">
            <div class="hidden md:flex space-x-4">
                <a href="form_add_utente" class="hover:underline">Registra Utente</a>
                <a href="#" class="hover:underline">Gestisci prenotazioni</a>
            </div>
        </div>
        <div class="flex items-center space-x-4">
            <div class="relative">
            	<button class="hover:underline">IT</button>
            </div>
            <button class="md:hidden">Menu</button>
        </div>
    </div>

    <!-- Secondary Navigation Bar -->
    <div class="absolute top-20 w-full bg-sky-500 text-white flex justify-between items-center p-4">
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

    <!-- Main Content Area -->
    <main class="flex items-center justify-center w-full py-8">
        <div class="bg-white p-6 rounded-lg shadow-lg w-full max-w-xl">
            <h2 class="text-lg font-bold mb-4">Inserisci Utente</h2>
            <form:form method="POST" action="add_utente" modelAttribute="utente" class="space-y-4">
                <div>
                    <form:label path="username" class="block text-sky-800">Username</form:label>
                    <form:input path="username" cssErrorClass="error_input" required="required" class="w-full p-2 border border-sky-300 rounded"/>
                    <form:errors path="username" cssClass="error_message text-red-500" />
                </div>
                <div>
                    <form:label path="password" class="block text-sky-800">Password</form:label>
                    <form:input path="password" type="password" cssErrorClass="error_input" required="required" class="w-full p-2 border border-sky-300 rounded"/>
                    <form:errors path="password" cssClass="error_message text-red-500" />
                </div>
                <div>
                    <form:label path="nome" class="block text-sky-800">Nome</form:label>
                    <form:input path="nome" cssErrorClass="error_input" required="required" class="w-full p-2 border border-sky-300 rounded"/>
                    <form:errors path="nome" cssClass="error_message text-red-500" />
                </div>
                <div>
                    <form:label path="cognome" class="block text-sky-800">Cognome</form:label>
                    <form:input path="cognome" cssErrorClass="error_input" required="required" class="w-full p-2 border border-sky-300 rounded"/>
                    <form:errors path="cognome" cssClass="error_message text-red-500" />
                </div>
                <div>
                    <form:label path="dataDiNascita" class="block text-sky-800">Data di Nascita</form:label>
                    <form:input path="dataDiNascita" type="date" cssErrorClass="error_input" class="w-full p-2 border border-sky-300 rounded"/>
                    <form:errors path="dataDiNascita" cssClass="error_message text-red-500" />
                </div>
                <div class="flex justify-center">
                    <input type="submit" value="Registrati" class="bg-sky-500 text-white px-4 py-2 rounded cursor-pointer"/>
                </div>
            </form:form>
        </div>
    </main>
</body>
</html>



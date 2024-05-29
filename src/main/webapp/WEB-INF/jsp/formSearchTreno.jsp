<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="it">
<head>
    <meta charset="ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="https://cdn.tailwindcss.com"></script>
    <title>Cerca treno</title>
</head>
<body class="bg-sky-500">
    <!-- Header -->
    <div class="bg-indigo-300 text-center py-2 text-sm">
        BENVENUTO <%= (request.getAttribute("utenteL") == null) ? "OSPITE" : request.getAttribute("utenteL") %> SU PORTALE TRENI - IDM ACADEMY 19 - 04/24 -
    </div>

    <!-- Navigation Bar -->
    <div class="bg-sky-500 text-white flex justify-between items-center p-4">
        <div class="flex items-center space-x-4">
            <img src="https://upload.wikimedia.org/wikipedia/commons/f/fe/Apache_Tomcat_logo.svg" alt="Treni Logo" class="h-10">
            <div class="hidden md:flex space-x-4">
                <a href="form_add_utente" class="hover:underline">Registra Utente</a>
                <a href="#" class="hover:underline">Gestisci prenotazioni</a>
            </div>
        </div>
        <div class="flex items-center space-x-4">
            <button class="hover:underline">IT</button>
            <button class="md:hidden">Menu</button>
        </div>
    </div>

    <!-- Secondary Navigation Bar -->
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

    <!-- Main Content Area -->
    <main class="flex justify-center py-8">
        <div class="bg-white p-6 rounded-lg shadow-lg w-full max-w-4xl">
            <h2 class="text-lg font-bold mb-4">CERCA TRENO</h2>
            <form action="search_treno" method="POST" modelAttribute="treno" class="space-y-4">
                <div>
                    <label for="id" class="block text-sky-800">Cerca treno (id):</label>
                    <input type="text" id="id" name="id" value="15" class="w-full p-2 border border-sky-300 rounded">
                </div>
                <div>
                    <input type="submit" value="Cerca" class="bg-sky-500 text-white px-4 py-2 rounded cursor-pointer">
                </div>
            </form>
        </div>
    </main>
</body>
</html>


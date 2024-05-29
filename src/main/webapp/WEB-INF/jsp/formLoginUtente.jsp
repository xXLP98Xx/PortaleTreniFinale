<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="bg-sky-500">
${message }
<div class="max-w-sm mx-auto p-6 bg-white rounded-lg shadow-md">
    <div class="flex justify-between items-center mb-4">
        <h2 class="text-xl font-bold text-center w-full">ACCEDI</h2>
        <button class="text-zinc-500 dark:text-zinc-400">
            <span class="sr-only">Close</span>
            &times;
        </button>
    </div>
    <form method="POST" action="login_utente" modelAttribute="utenteVO">
        <div class="mb-4">
            <label class="sr-only">Username</label>
            <input type="text" name="username" class="w-full px-3 py-2 border border-zinc-300 dark:border-zinc-700 rounded-lg focus:outline-none focus:ring-2 focus:ring-blue-500" placeholder="Username"/>
        </div>
        <div class="mb-4 relative">
            <label class="sr-only">Password</label>
            <input type="password" name="password" class="w-full px-3 py-2 border border-zinc-300 dark:border-zinc-700 rounded-lg focus:outline-none focus:ring-2 focus:ring-blue-500" placeholder="Password"/>
            <button type="button" class="absolute inset-y-0 right-3 flex items-center text-zinc-500 dark:text-zinc-400">
                <img aria-hidden="true" alt="eye icon" src="https://placehold.co/20x20" />
            </button>
        </div>
        <div class="flex justify-between items-center mb-4">
            <label class="flex items-center text-zinc-700 dark:text-zinc-300">
                <input type="checkbox" name="remember" class="form-checkbox h-4 w-4 text-blue-600 dark:text-blue-400"/>
                <span class="ml-2 text-black">Ricordami</span>
            </label>
            <a href="#" class="text-sm text-white dark:text-blue-400 hover:underline">Password dimenticata?</a>
        </div>
        <input type="submit" class="w-full bg-blue-500 text-white py-2 rounded-lg hover:bg-blue-600 focus:outline-none focus:ring-2 focus:ring-blue-500" value="Accedi"/>
    </form>
    <p class="mt-4 text-center text-white">
        Non sei ancora iscritto? <a href="form_add_utente" class="font-bold text-black dark:text-white hover:underline">Iscriviti!</a>
    </p>
</div>
</body>
</html>


 
<%-- <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> --%>
<%-- <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> --%>

<!-- <!DOCTYPE html> -->
<!-- <html> -->
<!-- <head> -->
<!-- <meta charset="UTF-8"> -->
<!-- <title>Login</title> -->

<!-- <style> -->
/*         body { */
/*             margin-left: 5%; */
/*         } */
/*         form div div span { */
/*             margin: 0px 0px 0px 5px */
/*         } */
/*         form div div { */
/*             margin: 0px 0px 5px 0px; */
/*         } */
/*         .error_message { */
/*             color: red; */
/*         } */
/*         .error_input { */
/*             border-width: 1px; */
/*             border-color: red; */
/*         } */
<!--     </style> -->


<!-- </head> -->
<!-- <body> -->
<%-- <%=request.getAttribute("message")%> --%>
<%-- <%--${message}  --%> --%>
<!-- <br> -->
<!--  Inserisci Utente: -->
<%--       <form:form method="POST"  --%>
<%--           action="login_utente"  modelAttribute="utenteVO" > --%>
<%--           <td><form:errors path = "*" cssClass="error_message" >Ci sono Errori!!</form:errors></td> --%>
<!--            <table> -->
<!--             	 <tr> -->
<%--                     <td><form:label path="username">Username</form:label></td> --%>
<%--                     <td><form:input path="username" cssErrorClass="error_input" /></td> --%>
<%--                     <td><form:errors path="username" cssClass="error_message" /></td> --%>
<!--                 </tr> -->
<!-- 				 <tr> -->
<%--                     <td><form:label path="password">Password</form:label></td> --%>
<%--                     <td><form:input path="password" type="password" cssErrorClass="error_input" /></td> --%>
<%--                     <td><form:errors path="password" cssClass="error_message" /></td> --%>
<!--                 </tr> -->
<!-- 				</tr> -->
<!--                     <td><input type="submit" value="Submit"/></td> -->
<!--                 </tr> -->
<!--             </table> -->
<%--         </form:form> --%>

<!-- </body> -->
<!-- </html> -->

<html>
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="https://cdn.tailwindcss.com"></script>
  </head>
  <body>
    <div class="max-w-sm mx-auto p-6 bg-white dark:bg-zinc-800 rounded-lg shadow-md">
  <div class="flex justify-between items-center mb-4">
    <h2 class="text-xl font-bold text-center w-full">Accedi</h2>
    <button class="text-zinc-500 dark:text-zinc-400">
      <span class="sr-only">Close</span>
      &times;
    </button>
  </div>
  <form form:form method="POST"
           action="login_utente"  modelAttribute="utenteVO">
    <div class="mb-4">
      <label for="username" class="sr-only">Username</label>
      <input type="text" id="username" class="w-full px-3 py-2 border border-zinc-300 dark:border-zinc-700 rounded-lg focus:outline-none focus:ring-2 focus:ring-blue-500" placeholder="Username">
    </div>
    <div class="mb-4 relative">
      <label for="password" class="sr-only">Password</label>
      <input type="password" id="password" class="w-full px-3 py-2 border border-zinc-300 dark:border-zinc-700 rounded-lg focus:outline-none focus:ring-2 focus:ring-blue-500" placeholder="Password">
      <button type="button" class="absolute inset-y-0 right-3 flex items-center text-zinc-500 dark:text-zinc-400">
        <img aria-hidden="true" alt="eye icon" src="https://placehold.co/20x20" />
      </button>
    </div>
    <div class="flex justify-between items-center mb-4">
      <label class="flex items-center text-zinc-700 dark:text-zinc-300">
        <input type="checkbox" class="form-checkbox h-4 w-4 text-blue-600 dark:text-blue-400">
        <span class="ml-2">Ricordami</span>
      </label>
      <a href="#" class="text-sm text-blue-600 dark:text-blue-400 hover:underline">Password dimenticata?</a>
    </div>
    <button type="submit" class="w-full bg-red-700 text-white py-2 rounded-lg hover:bg-red-800 focus:outline-none focus:ring-2 focus:ring-red-500">Accedi</button>
  </form>
  <p class="mt-4 text-center text-zinc-700 dark:text-zinc-300">
    Non sei ancora iscritto? <a href="form_add_utente" class="font-bold text-black dark:text-white hover:underline">Iscriviti!</a>
  </p>
</div>
  </body>
</html>

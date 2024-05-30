<html>
  <head>
    <meta charset="ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="https://cdn.tailwindcss.com"></script>
  </head>
  <body>

    <div class="bg-indigo-300 text-center py-2 text-sm">
    
  BENVENUTO <%=(request.getAttribute("utenteL")==null) ? "OSPITE" : request.getAttribute("utenteL") %> SU PORTALE TRENI - IDM ACADEMY 19 - 04/24 - 
</div>
<div class="bg-sky-500 text-white flex justify-between items-center p-4">
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

 <form method="POST" action="crea_treno" modelAttribute="treno">
	<div class="bg-sky-500 flex justify-center py-8">
	  <div class="bg-white p-6 rounded-lg shadow-lg w-full max-w-4xl">
	    <h2 class="text-lg font-bold mb-4">CREA TRENO</h2>
	    <center>
	    <div class="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-4 gap-4">
	      <div>
	        <label class="block text-sky-800">Compagnia</label>
	<div class="lx yz ze alm aqv">
	<div class="gx tn ul">
	<div>
	
	<select id="compagnia" name="compagnia" class="w-full p-2 border border-sky-300 rounded">
	<option>Trenord</option>
	<option selected="">Trenitalia</option>
	<option>FrecciaRossa</option>
	</select>
	</div>
	</div>
	</div>
	      </div>
	      <div>
	        <label class="block text-sky-800">Stringa</label>
	        <input type="text" placeholder="Inserisci città  o stazione" class="w-full p-2 border border-sky-300 rounded">
	      </div>
	      <div class="flex items-end">
	        <input type="submit" class="bg-sky-500 text-white px-4 py-2 rounded">CREA</input>
	      </div>
	    </div>
	        </center>
	  </div>
	</div>
</form>
	
<div class="bg-sky-500 text-white py-8">
  <div class="max-w-6xl mx-auto px-4">
    <div class="flex flex-col md:flex-row items-center">
      <img src="https://www.unviaggioinfiniteemozioni.it/wp-content/uploads/2016/10/Treno-in-Cina-2.jpg" alt="Train" class="w-full md:w-1/2 rounded-lg shadow-lg">
      <div class="md:ml-8 mt-4 md:mt-0">
        <h3 class="text-lg font-bold">ULTIME NOVITA'</h3>
        <p class="mt-2">E' ORA POSSIBILE CREARE TRENI</p>
        <button class="bg-white text-sky-500 px-4 py-2 rounded mt-4">SCOPRI DI PIU'</button>
      </div>
    </div>
  </div>
</div>
  </body>
</html>

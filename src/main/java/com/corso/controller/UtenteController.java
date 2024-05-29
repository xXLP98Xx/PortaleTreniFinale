package com.corso.controller;

import javax.servlet.http.HttpSession;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.HttpServerErrorException;

import com.corso.treno.model.Treno;
import com.corso.treno.model.Utente;
import com.corso.treno.service.UtenteService;
import com.corso.vo.TrenoVO;
import com.corso.vo.UtenteVO;

@Controller /* figlia di @Component */
public class UtenteController {
/*
	 esempio validazione:
	 https://rentius2407dev.medium.com/how-to-use-bean-validation-in-spring-mvc-757e10ee9306
	
	*/		
	@Autowired
	private UtenteService service;


	@RequestMapping(path = { "/", "/index" }
	   , method = { RequestMethod.GET, RequestMethod.POST })
	public String home() {
		return "index";
	}
	
	@RequestMapping(path = { "/form_add_utente"}
	   , method = { RequestMethod.GET, RequestMethod.POST })
	public String formAdd(Model m, @ModelAttribute("utente") Utente utente) {
		
		m.addAttribute("utente", utente);
		return "formAddUtente";
	}
	
	@PostMapping("/add_utente")
	public String add(@ModelAttribute("utente") @Valid Utente utente, BindingResult bindingResult, Model model) {
		
//		System.out.println("form:" + utente); 
//		System.out.println("br:" + bindingResult);
	
		/*
		ObjectError e = new ObjectError("error.nome","il nome � sbagliato!");
		ObjectError e2 = new ObjectError("nome","il sssnome � sbagliato!");
		*/
		
		//bindingResult.addError(e);
		//bindingResult.addError(e2);
		
		if (bindingResult.hasErrors()) {

			model.addAttribute("message", "ci sono errori, ricompila!!");
			
			return "formAddUtente";
		}
		service.add(utente); 
		model.addAttribute("utente", utente) ;
		return "viewUtente";
	}

	
	@GetMapping("/form_login_utente")
	public String formLogin(Model m, @ModelAttribute("utenteVO") UtenteVO utenteVO, HttpSession session) {
//		utente.setUsername("");
//		utente.setPassword("");
		if(session.getAttribute("utenteL")!=null) {
			// se null la sessione va creata
			m.addAttribute("message", "Login gia fatto con " + session.getAttribute("utenteL") + "\n");
			return "index" ;
		}
		m.addAttribute("utenteVO", utenteVO);
		return "formLoginUtente";
	}
	
	
	@PostMapping("/login_utente")
	public String login(@ModelAttribute("utenteVO") @Valid UtenteVO utenteVO, HttpSession session, BindingResult bindingResult, Model model) {

		if (bindingResult.hasErrors()) {
			model.addAttribute("message", "ci sono errori, ricompila!");
		}
		UtenteVO uVO = (UtenteVO) session.getAttribute("utenteVO");
		
			//try-catch
			Utente utenteL = service.findByUsername(utenteVO.getUsername()) ;
			
			if(utenteL == null) {
				model.addAttribute("message", "Utente non trovato con questo username");
				return "formLoginUtente" ;
			
			} else {
				
				if(!utenteVO.getPassword().equals(utenteL.getPassword())) {
					//TODO non dare all'utente la conferma della password errata in questo modo
					model.addAttribute("message", "Credenziali non corrette");
					return "formLoginUtente" ;
				} else {
					session.setAttribute("utenteL", utenteL);
					model.addAttribute("utenteL", utenteL);
				}		
			}	
		Utente sessione = (Utente) session.getAttribute("utenteL") ;
		model.addAttribute("message", "Giusto " + sessione.getUsername());
		return "..\\..\\index" ;
	}

	@GetMapping("/logout_utente")
	public String logout(HttpSession session, Model model) {
		session.invalidate();
		model.addAttribute("message","logout effettuato correttamente.");
		return "..\\..\\index";
	}
	
//	@GetMapping("/form_search_utente")
//	public String formSearch(Model m) {
//		return "formSearch";
//	}

//	@GetMapping("/search")
//	public String search(@RequestParam("nome") /* @WebParam(name="nome") */ String nome, Model model ) {
//		
//		System.out.println("parametro passato 2: " + nome); 
//		
//		List<Categoria> categorie = service.getCategoriaByName(nome);
//		
//		model.addAttribute("categorie",categorie); 
//		return "search";
//	}
//	
//	@GetMapping("/search/{nome}")
//	public String searchWithPathVariable(@PathVariable String nome ) {
//		
//		System.out.println("path variable: " + nome); 
//		
//		return "formSearch";
//	}
//	
//	@DeleteMapping("/delete/{id}")
//	public String searchWithPathVariable(@PathVariable int id ) {
//		
//		System.out.println("cancella categoria " + id); 
//		
//		return "formSearch";
//	}
//	
//	
//	
//	
}

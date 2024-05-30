package com.corso.controller;

import java.util.ArrayList;

import java.util.List;


import javax.jws.WebParam;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.corso.treno.model.Treno;
import com.corso.treno.model.Utente;
import com.corso.treno.service.TrenoService;
import com.corso.treno.service.UtenteService;
import com.corso.vo.FormCategoria;
import com.corso.vo.TrenoVO;
import com.corso.vo.UtenteVO;

@Controller /* figlia di @Component */
//@RequestMapping("/treno")
public class TrenoController {
/*
	 esempio validazione:
	 https://rentius2407dev.medium.com/how-to-use-bean-validation-in-spring-mvc-757e10ee9306
	
	*/		
//	@Autowired
//	private UtenteService service; 
	@Autowired
	private TrenoService trenoService; 


	@RequestMapping(path = { "/", "/home" }
	   , method = { RequestMethod.GET, RequestMethod.POST })
	public String home() {
		return "home";
	}
	
//	@RequestMapping(path = { "/form_add_treno"}
//	   , method = { RequestMethod.GET, RequestMethod.POST })
//	public String formAdd(Model m, @ModelAttribute("utente") Utente utente) {
//		
//		m.addAttribute("utente", utente);
//		return "formAdd";
//	}
	
//	@PostMapping("/add")
//	public String add(@ModelAttribute("utente") @Valid Utente utente, BindingResult bindingResult, Model model) {
//		
////		System.out.println("form:" + utente); 
////		System.out.println("br:" + bindingResult); 
//	
//		/*
//		ObjectError e = new ObjectError("error.nome","il nome � sbagliato!");
//		ObjectError e2 = new ObjectError("nome","il sssnome � sbagliato!");
//		*/
//		
//		//bindingResult.addError(e);
//		//bindingResult.addError(e2);
//		
//		if (bindingResult.hasErrors()) {
//
//			model.addAttribute("message", "ci sono errori, ricompila!!");
//			return "formAdd";
//		}
//		service.add(utente); 
//		model.addAttribute("utente", utente) ;
//		
//		return "viewUtente";
//	}
	
	
	@RequestMapping(path = { "/form_search_treno"}
	   , method = { RequestMethod.GET, RequestMethod.POST })
	public String formAdd(Model m, @ModelAttribute("treno") Treno treno) {
		
		m.addAttribute("treno", treno);
		return "formSearchTreno";
	}
	
	@PostMapping("/search_treno")
	public String find(@ModelAttribute("treno") @Valid Treno treno, BindingResult bindingResult, Model model) {
		
		if (bindingResult.hasErrors()) {

			model.addAttribute("message", "ci sono errori, ricompila!!");
			
			return "formSearchTreno";
		}
		treno = trenoService.find(treno.getId()); 
		model.addAttribute("treno", treno) ;
		return "viewCercaTreno";
	}
	
	
	@RequestMapping(path = { "/form_show_treni"}
	   , method = { RequestMethod.GET, RequestMethod.POST })
	public String showListaTreni(Model m, HttpSession session) {
		List treni = new ArrayList<>();
		Utente utente = (Utente)session.getAttribute("utenteL");
		if(utente!=null) {
			treni = trenoService.findByUtente(utente.getId());
			m.addAttribute("treni", treni);
			
			return "viewShowTreni";
		} else {
			m.addAttribute("message", "è necessario effettuare il login!");
			return "formLoginUtente";
		}
		
	}
	
	
	@RequestMapping(path = { "/form_delete_treno"}
	   , method = { RequestMethod.GET, RequestMethod.POST })
	public String formDelete(Model m, @ModelAttribute("treno") Treno treno) {
		
		m.addAttribute("treno", treno);
		return "formDeleteTreno";
	}
	
	@PostMapping("/delete_treno")
	public String delete(@ModelAttribute("treno") @Valid Treno treno, BindingResult bindingResult, Model model) {
		
		if (bindingResult.hasErrors()) {

			model.addAttribute("message", "ci sono errori, ricompila!!");
			
			return "formSearchTreno";
		}
		treno = trenoService.find(treno.getId()); 
		model.addAttribute("treno", treno);
		trenoService.remove(treno.getId());
		return "viewDeleteTreno";
	}
	
	
	@PostMapping("/crea_treno")
	public String addTreno(@ModelAttribute("treno") @Valid Treno treno, BindingResult bindingResult, Model model) {
		
		if (bindingResult.hasErrors()) {
			model.addAttribute("message", "ci sono errori, ricompila!!");
			return "formAddUtente";
		}
		
		trenoService.add(treno); 
		model.addAttribute("treno", treno);
		return "viewTreno";
	}

}

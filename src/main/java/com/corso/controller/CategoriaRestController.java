package com.corso.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.corso.vo.FormCategoria;

@RestController   /* classe figlia di Controller che imposta in automatico ResponseBody e formato json*/
@RequestMapping("/categoriaRest")
public class CategoriaRestController {
//	
//	@Autowired
//	private CategoriaService service; 
//	
//	@GetMapping(path={"/search"}, 
//	     //    produces = {"application/json"}, 
//	        produces  = {MediaType.APPLICATION_JSON_VALUE})
//	//@ResponseBody
//	public List<Categoria> search(@RequestParam("nome") /* @WebParam(name="nome") */ String nome, Model model ) {
//		
//		System.out.println("parametro passato 2: " + nome); 
//		
//		List<Categoria> categorie = service.getCategoriaByName(nome);
//		
//		model.addAttribute("categorie",categorie); 
//		return categorie;
//	}
//	
//	
//	@PostMapping(
//			path={"/add"}
//	)
//	@ResponseBody
// 
//	public String add(@RequestBody  FormCategoria categoria) {
//		
//		Categoria dto = new Categoria(); 
//		
//		org.springframework.beans.BeanUtils.copyProperties(categoria, dto); 
//		
//		System.out.println("form:" + categoria); 
//
//		Categoria c = service.creaCategoria(dto); 
//		System.out.println("creata:" + categoria); 
//		
//		return "categoria Inserita correttamente!";
//	}
//	
//	@ResponseBody @GetMapping(   "/aaa")	public String provaGet ()  { return "Prova della get!"; }
//	@ResponseBody @PostMapping(  "/aaa")	public String provaPost () { return "Prova della post!";}
//	@ResponseBody @PutMapping(   "/aaa")	public String provaPut ()  { return "Prova della put!"; }
//	@ResponseBody @DeleteMapping("/aaa")	public String provaDelete(){ return "Prova della delete!";}
//	@ResponseBody @PatchMapping( "/aaa")	public String provaPatch() { return "Prova della patch!"; }
//
}

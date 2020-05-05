package com.carricas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CategoriasController {

	// GetMapping("/index")
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String mostrarIndex() {
		return "categorias/listaCategorias";
	}

	// GetMApping("/create")
	@RequestMapping(value="/create", method= RequestMethod.GET)
	public String crear() {
		return "categorias/formCategoria";
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String guardar() {
		return "categorias/listaCategorias";
	}

}

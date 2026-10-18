package com.midominio.portal_de_instituto.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.midominio.portal_de_instituto.model.Proverbios;

@Controller
public class BienvenidaController {
	
	
	@ModelAttribute(name = "titulo")
	public String titulo() {
		return "Inicio";
	}

	@GetMapping({ "/", "/home" })
	public String home(Model model) {
		model.addAttribute("proverbio", Proverbios.dameUnoAleatorio());
		return "home/home";
	}

}

package com.midominio.portal_de_instituto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.midominio.portal_de_instituto.utils.Lotos;

@Controller
@RequestMapping("/loto")
public class LotoController {
	
	@ModelAttribute(name = "titulo")
	public String titulo() {
		return "Lotería";
	}
	
	@GetMapping("/menu")
	public String menu(Model model) {
		model.addAttribute("titular", "Lotería");
		model.addAttribute("loterias", Lotos.LOTERIAS);
		return "loto/menu";
	}
	
	@GetMapping("/genera/{max}/{cantidad}/{pais}")
	public String genera(Model model, @PathVariable int max, @PathVariable int cantidad, @PathVariable String pais) {
		model.addAttribute("pais", pais);
		model.addAttribute("combinacion", Lotos.dameLoto(max, cantidad));
		return "loto/combinacion";
	}

}

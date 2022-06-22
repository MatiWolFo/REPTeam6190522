package com.generationg6.controllers;


import javax.validation.Valid;

import com.generationg6.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.generationg6.models.Usuario;


@Controller()
@RequestMapping("/home/registro")

public class RegistroController {

	@Autowired
	UsuarioService usuarioService;


	@RequestMapping ("")
	public String registro(@ModelAttribute("usuario") Usuario usuario){//Objeto Usuario esta vacio

		return "registroUsuario.jsp";
	}


	@RequestMapping("/completo")

	public String guardarUsuario(@Valid @ModelAttribute("usuario") Usuario usuario,
								 BindingResult resultado,
								 Model model) {

		if (resultado.hasErrors()) {
			model.addAttribute("msgError", "Datos incorrectos. Comprueba la información.");
			return "registroUsuario.jsp";
		} else


            usuarioService.GuardarUsuario(usuario);
			return "home.jsp";


	}
}

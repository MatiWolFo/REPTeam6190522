package com.generationg6.controllers;


import javax.validation.Valid;

import com.generationg6.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.generationg6.models.Usuario;

import java.util.List;


@Controller()


public class RegistroController {

	@Autowired
	UsuarioService usuarioService;


	@RequestMapping ("/home/registro")
	public String registro(@ModelAttribute("usuario") Usuario usuario){//Objeto Usuario esta vacio

		return "registroUsuario.jsp";
	}


	@RequestMapping ("/home/registro/mostrar")
	public String mostrar( Model model){//Objeto Usuario esta vacio
		List<Usuario> listaUsuario = usuarioService.findAll();
		model.addAttribute("ListaUsuarios", listaUsuario);
		return "mostrarUsuario.jsp";
	}

	@RequestMapping("/home/registro/completo")

	public String guardarUsuario(@Valid @ModelAttribute("usuario") Usuario usuario,
								 BindingResult resultado,
								 Model model) {

		if (resultado.hasErrors()) {
			model.addAttribute("msgError", "Datos incorrectos. Comprueba la información.");
			return "registroUsuario.jsp";
		} else {

			usuarioService.GuardarUsuario(usuario);
			List<Usuario> listaUsuario = usuarioService.findAll();
			model.addAttribute("ListaUsuarios", listaUsuario);
			return "mostrarUsuario.jsp";
		}

	}
	@RequestMapping("/editar/{id}")
	public String editar(@PathVariable("id") Long id, Model model) {

		Usuario usuario= usuarioService.buscarId(id);
		model.addAttribute("usuario", usuario);
		return "editarregistroUsuario.jsp";

	}

	//Para actualizar la BBDD
	@PostMapping("home/registro/actualizar/{id}")
	public String actualizarRegistro(@PathVariable("id") Long id, @Valid @ModelAttribute("usuario") Usuario usuario, //Objeto Usuario esta vacio
									 BindingResult resultado,
									 Model model) {


		if (resultado.hasErrors()) {//Validar si resultado tiene errores
			model.addAttribute("msgError", "Uno de los datos esta erroneo, porfavor arreglar");

			return "registroUsuario.jsp";

		} else {

			usuario.setId(id);
			usuarioService.GuardarUsuario(usuario);
			List<Usuario> listaUsuario = usuarioService.findAll();
			model.addAttribute("ListaUsuarios", listaUsuario);
			return "mostrarUsuario.jsp";


		}
	}

	@RequestMapping("/eliminar/{id}")
	public String eliminarUser(@PathVariable("id") Long id){

		usuarioService.eliminarUsuario(id);

		return "redirect:/home/registro/mostrar"; //redirect manda a la ruta asociada
	}

}

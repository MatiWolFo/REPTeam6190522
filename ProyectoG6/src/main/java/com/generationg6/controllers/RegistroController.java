package com.generationg6.controllers;


import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import com.generationg6.models.Rol;
import com.generationg6.services.RolService;
import com.generationg6.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import com.generationg6.models.Usuario;

import java.util.List;


@Controller()
public class RegistroController {

	@Autowired
	RolService rolService;

	@Autowired

	UsuarioService usuarioService;

	@RequestMapping ("/home/registro")
	public String registro(@ModelAttribute("usuario") Usuario usuario, Model model){

		List<Rol> listaRoles = rolService.findAll();
		model.addAttribute("listaRoles", listaRoles);

		return "registroUsuario.jsp";
	}


	@RequestMapping ("/home/registro/mostrar")
	public String mostrar( Model model){//Objeto Usuario esta vacio

		List<Usuario> listaUsuario = usuarioService.findAll();
		model.addAttribute("ListaUsuarios", listaUsuario);
		return "mostrarUsuario.jsp";
	}

	@PostMapping("/home/registro/completo")
	public String guardarUsuario(@ModelAttribute("usuario") Usuario usuario,
								 BindingResult resultado,
								 Model model) {

		if (resultado.hasErrors()) {
			model.addAttribute("msgError", "Datos incorrectos. Comprueba la información.");
			return "registroUsuario.jsp";
		} else {

			//Ya no es necesario agregar esta lista al atributo porque no estamos cargando el "mostrarUsuario.jsp"
			//List<Usuario> listaUsuario = usuarioService.findAll();
			//model.addAttribute("ListaUsuarios", listaUsuario);

			//Creamos la variable usuarioExistente como booleano para ser usada en el if
			//Llamamos a GuardarUsuario con la variable usuario cargada para que haga los comandos que
			//se hicieron en la clase UsuarioService
			boolean usuarioExistente = usuarioService.GuardarUsuario(usuario);

			//Verificamos el booleano y se hacen las acciones correspondientes
			if(usuarioExistente) {
				model.addAttribute("msgError", "El email ya esta registrado");
				return "registro.jsp";
			}else {
				return "login.jsp";
			}

		}

	}

	@RequestMapping("/home/registro/login")
	public String ingresoUsuario(@RequestParam(value="email") String email,
								 @RequestParam(value="password") String password,
								 Model model, HttpSession session) {
		/*validaciones a realizar*/
		//validar que los parametros no son null o vacios
		if(email==null || password ==null ||  email.isEmpty() || password.isEmpty()) {
			model.addAttribute("msgError", "Todos los campos son obligatorios");
			return "login.jsp";
		}
		//si es true, indica que hay un error el bd
		boolean usuarioValidado = usuarioService.validarUsuario(email,password);

		if(usuarioValidado){
			model.addAttribute("msgError", "Error en el ingreso al sistema");
			return "login.jsp";
		}else {
			//no hay error, puede ingresar al sistema
			session.setAttribute("email", email);

			return "redirect:/home";
		}
	}

	@RequestMapping("/editar/{id}")
	public String editar(@PathVariable("id") Long id, Model model) {

		Usuario usuario= usuarioService.buscarId(id);
		model.addAttribute("usuario", usuario);
		List<Usuario> listaUsuario = usuarioService.findAll();
		model.addAttribute("ListaUsuarios", listaUsuario);
		return "editarregistroUsuario.jsp";

	}

	//Para actualizar la BBDD
	@PostMapping("home/registro/actualizar/{id}")
	public String actualizarRegistro(@PathVariable("id") Long id, @Valid @ModelAttribute("usuario") Usuario usuario,
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

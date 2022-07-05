package com.generationg6.controllers;

/*import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.generationg6.models.Usuario;


@Controller
@RequestMapping("/registro")*/

public class RegistroController {
	/*// http://localhost:8080/
	// para desplegar JSP
	@RequestMapping("")
	// MODELATTRIBUTE pasa un objeto vacio al JSP
	public String registro(@ModelAttribute("usuario") Usuario usuario) {
		return "registro.jsp"; // la pagina a desplegar
	}

	@PostMapping("/usuario")
	// VALID y BINDINGRESULT pregunta al objeto si los atributos que van a pasar al
	// JSP cumplen las condiciones de dichas anotaciones
	public String guardarUsuario(@Valid @ModelAttribute("usuario") Usuario usuario, BindingResult resultado,
			Model model) {
		// si el resultado de la validacion de BINDINGRESULT tiene errores, arroja
		// mensaje de error y vuelve a cargar la pagina para ingresar datos
		if (resultado.hasErrors()) {
			model.addAttribute("msgError", "Datos incorrectos. Comprueba la información.");
			return "registro.jsp";
		}
		// capturar OBJECT con ATTRIBUTES ya llenados con inputs en el JSP
		System.out.println("REGISTRO EXITOSO.");
		System.out.println(usuario.getNombre() + usuario.getApellido() + usuario.getEdad() + usuario.getPassword() + usuario.getUsername() + usuario.getEmail() + usuario.getRut() + usuario.getRutdv());
		// si todo esta en orden, el ultimo RETURN envia a otra pagina, generalmente una
		// home o login 
	
		return "index.jsp";
	}*/
}

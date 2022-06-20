package com.paginas.controllers;

/* IMPORTAR LAS LIBRERIAS REQUERIDAS*/
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.paginas.models.Paginas;
import com.paginas.services.PaginasService;


/* ASIGNAR LA ANOTACION PARA EL CONTROLLER*/
@Controller
@RequestMapping("/pagina")
public class PaginasController {
	/* ASIGNAR LA ANOTACION PARA INJECTAR EL SERVICE */
	@Autowired
	PaginasService paginasService;

	@RequestMapping("")
	public String inicio(@ModelAttribute("pagina") Paginas paginas) {

		return "index.jsp";

	}

	@PostMapping("/guardar")
	public String guardarPagina(@ModelAttribute("pagina") Paginas paginas, BindingResult resultado, Model model) {
		/*
		 * AGREGA UNA VERIFICACION DE CONDICIONAL PARA VERIFICAR QUE LA INFORMACION NO
		 * TIENE ERRORES A TRAVES DEL BINDINRESULT
		 */
		if (resultado.hasErrors()) {
			model.addAttribute("msgError", "DATOS INCORRECTOS.");
			return "index.jsp";
		} else {
			/* ENVIA OBJETO A LA BASE DE DATOS */
			paginasService.guardarPagina(paginas);
			/* OBTENER UNA LISTA DE LOS AUTOS */
			List<Paginas> listaPaginas = paginasService.findAll();
			/* PASA LA LISTA DE AUTOS OBTENIDA AL JSP CORRESPONDIENTE */
			model.addAttribute("listaPaginas", listaPaginas);
			/* REDIRECCIONA A LA PAGINA DESEADA */
			return "tablaPaginas.jsp";

		}

	}

	/* SOLO MOSTRAR EL LISTADO DE AUTOS USANDO REQUESTMAPPING */
	@RequestMapping("/mostrar")
	public String mostrar(Model model) {
		/* OBTENER UNA LISTA DE LOS AUTOS */
		List<Paginas> listaPaginas = paginasService.findAll();
		/* PASA LA LISTA DE AUTOS OBTENIDA AL JSP CORRESPONDIENTE */
		model.addAttribute("listaPaginas", listaPaginas);
		/* REDIRECCIONA A LA PAGINA DESEADA */
		return "tablaPaginas.jsp";
	}

	@RequestMapping("/editar/{id}")
	/* METODO PARA CAPTURAR LAS RUTAS DINAMICAS DE UNA URL DESDE UN JSP 
	 * 1. CAPTURAR LA ID */
	public String editar(@PathVariable("id") Long id, Model model) {
		/* 2. BUSCAR OBJETO COMPLETO A LA DB */
		Paginas paginas = paginasService.buscarId(id);
		/* 3. PASA EL OBJETO COMPLETO AL JSP */
		model.addAttribute("pagina", paginas);
		/* REDIRECCIONA A OTRO PATH EN UN JSP */
		return "editarPaginas.jsp";
	}
	
	/*PARA ACTUALIZAR LA INFORMACION Y MANDARLA A LA DB*/
	@PostMapping("/actualizar/{id}")
	public String actualizarPagina(@PathVariable("id") Long id, @ModelAttribute("pagina") Paginas pagina, BindingResult resultado, Model model) {
		/*
		 * AGREGA UNA VERIFICACION DE CONDICIONAL PARA VERIFICAR QUE LA INFORMACION NO
		 * TIENE ERRORES A TRAVES DEL BINDINRESULT
		 */
		if (resultado.hasErrors()) {
			model.addAttribute("msgError", "DATOS INCORRECTOS.");
			return "editarPaginas.jsp";
		} else {
			/* AGREGA EL CAMBIO AL OBJETO DEL ID CAPTURADO PARA MODIFICAR 
			 * 5. MODIFICAR ALGUN DATO DEL OBJETO, SALVO EL ID */
			pagina.setId(id);
			/* ENVIA OBJETO A LA BASE DE DATOS */
			paginasService.guardarPagina(pagina);
			/* OBTENER UNA LISTA DE LOS AUTOS */
			List<Paginas> listaPaginas = paginasService.findAll();
			/* PASA LA LISTA DE AUTOS OBTENIDA AL JSP CORRESPONDIENTE */
			model.addAttribute("listaPaginas", listaPaginas);
			/* REDIRECCIONA A LA PAGINA DESEADA */
			return "tablaPaginas.jsp";

		}

	}
}

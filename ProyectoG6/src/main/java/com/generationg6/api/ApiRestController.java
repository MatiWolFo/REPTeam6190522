package com.generationg6.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generationg6.models.Asignatura;
import com.generationg6.models.Contenido;
import com.generationg6.models.Etapa;
import com.generationg6.models.Juego;
import com.generationg6.models.Modulo;
import com.generationg6.models.PreguntaEtapa;
import com.generationg6.models.RespuestaEtapa;
import com.generationg6.services.AsignaturaService;
import com.generationg6.services.ContenidoService;
import com.generationg6.services.EtapaService;
import com.generationg6.services.JuegoService;
import com.generationg6.services.ModuloService;
import com.generationg6.services.PreguntaEtapaService;
import com.generationg6.services.RespuestaEtapaService;

/*INYECTAR LIBRERIA REST API*/
@RestController
@RequestMapping("/api/obtener")
public class ApiRestController {

	/* INYECTAR DEPENDENCIAS CLASES A MOSTRAR */
	@Autowired
	EtapaService etapaService;
	@Autowired
	AsignaturaService asignaturaService;
	@Autowired
	ModuloService moduloService;
	@Autowired
	ContenidoService contenidoService;
	@Autowired
	JuegoService juegoService;
	@Autowired
	PreguntaEtapaService preguntaEtapaService;
	@Autowired
	RespuestaEtapaService respuestaEtapaService;

	/* CREAR UNA RUTA PARA RETORNAR E INICIARLA */
	@RequestMapping("/etapas")
	/* SE VA A RETORNAR UN JSON, EN ESTE CASO UNA LISTA DE ETAPAS */
	/* NO OLVIDAR IMPORTAR LO NECESARIO */
	public List<Etapa> obtenerListaEtapas() {
		/* VA A BUSCAR AL SERVICE EL METODO */
		List<Etapa> listaEtapas = etapaService.findAll();
		/* UNA VEZ EL SERVICE VA AL REPOSITORY, RETORNA LA VARIABLE DESEADA */
		return listaEtapas;

	}

	public List<Asignatura> obtenerListaAsignaturas() {
		List<Asignatura> listaAsignaturas = asignaturaService.findAll();
		return listaAsignaturas;
	}

	public List<Modulo> obtenerListaModulos() {
		List<Modulo> listaModulos = moduloService.findAll();
		return listaModulos;
	}
	
	public List<Contenido> obtenerListaContenidos() {
		List<Contenido> listaContenidos = contenidoService.findAll();
		return listaContenidos;
	}
	
	public List<Juego> obtenerListaJuegos() {
		List<Juego> listaJuegos = juegoService.findAll();
		return listaJuegos;
	}
	
	public List<PreguntaEtapa> obtenerListaPreguntas() {
		List<PreguntaEtapa> listaPreguntas = preguntaEtapaService.findAll();
		return listaPreguntas;
	}
	
	public List<RespuestaEtapa> obtenerListaRespuestas() {
		List<RespuestaEtapa> listaRespuestas = respuestaEtapaService.findAll();
		return listaRespuestas;
	}
	/*
	 * LO QUE VA A RETORNAR, ES UN JSON, UNA API REST PARA QUE SEA CONSUMIDA
	 * EXTERNAMENTE
	 */
	/*
	 * LA REST API TOMA UN OBJETO Y LO MUESTRA COMO STRINGS PARA SER USADO POR
	 * REACT, POR EJEMPLO
	 */

}

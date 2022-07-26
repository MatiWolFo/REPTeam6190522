package com.generationg6.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.generationg6.models.Alternativa;
import com.generationg6.models.Asignatura;
import com.generationg6.models.Contenido;
import com.generationg6.models.Etapa;
import com.generationg6.models.Modulo;
import com.generationg6.models.Pregunta;
import com.generationg6.models.ScoreUsuario;
import com.generationg6.services.AlternativaService;
import com.generationg6.services.AsignaturaService;
import com.generationg6.services.ContenidoService;
import com.generationg6.services.EtapaService;
import com.generationg6.services.ModuloService;
import com.generationg6.services.PreguntaService;
import com.generationg6.services.ScoreUsuarioService;

/*INYECTAR LIBRERIA REST API*/
@RestController
/*INYECTAR PARA ERROR CROSS ORIGIN (CRISTOBAL SABE EL DETALLE)*/
@CrossOrigin(origins = "*", methods= {RequestMethod.GET, RequestMethod.POST})
@RequestMapping("/api/obtener")
public class ApiRestController {

	/* INYECTAR DEPENDENCIAS CLASES A MOSTRAR EN API */
	@Autowired
	EtapaService etapaService;
	@Autowired
	AsignaturaService asignaturaService;
	@Autowired
	ModuloService moduloService;
	@Autowired
	ContenidoService contenidoService;
	@Autowired
	ScoreUsuarioService	scoreUsuarioService;
	@Autowired
	PreguntaService preguntaService;
	@Autowired
	AlternativaService alternativaService;

	/* CREAR UNA RUTA PARA RETORNAR E INICIARLA */
	@RequestMapping("/etapa")
	/* SE VA A RETORNAR UN JSON, EN ESTE CASO UNA LISTA DE ETAPAS */
	/* NO OLVIDAR IMPORTAR LO NECESARIO */
	public List<Etapa> obtenerListaEtapas() {
		/* VA A BUSCAR AL SERVICE EL METODO */
		List<Etapa> listaEtapas = etapaService.findAll();
		/* UNA VEZ EL SERVICE VA AL REPOSITORY, RETORNA LA VARIABLE O LISTA DESEADA */
		return listaEtapas;
	}

	/* FAVOR CHECAR SI SE TIENEN QUE AGREGAR O QUITAR APIREST */

	@RequestMapping("/asignatura")
	public List<Asignatura> obtenerListaAsignaturas() {
		List<Asignatura> listaAsignaturas = asignaturaService.findAll();
		return listaAsignaturas;
	}

	@RequestMapping("/modulo")
	public List<Modulo> obtenerListaModulos() {
		List<Modulo> listaModulos = moduloService.findAll();
		return listaModulos;
	}

	@RequestMapping("/contenido")
	public List<Contenido> obtenerListaContenidos() {
		List<Contenido> listaContenidos = contenidoService.findAll();
		return listaContenidos;
	}

	@RequestMapping("/puntaje")
	public List<ScoreUsuario> obtenerListaPuntajes() {
		List<ScoreUsuario> listaPuntajes = scoreUsuarioService.findAll();
		return listaPuntajes;
	}
	
	/*
	 * QUE SE HARAN CON ESTAS DOS DE ABAJO, COMO SE PLANEAN MOSTRAR EN PANTALLA LAS
	 * PREGUNTAS Y ALTERNATIVAS EN UNA MISMA MAPPING?
	 */
	@RequestMapping("/pregunta")
	public List<Pregunta> obtenerListaPreguntas() {
		List<Pregunta> listaPreguntas = preguntaService.findAll();
		return listaPreguntas;
	}

	@RequestMapping("/alternativa")
	public List<Alternativa> obtenerListaRespuestasAlternativas() {
		List<Alternativa> listaRespuestas = alternativaService.findAll();
		return listaRespuestas;
	}

}

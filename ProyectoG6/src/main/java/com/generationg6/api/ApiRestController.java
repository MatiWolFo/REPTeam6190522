package com.generationg6.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
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
=======
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
>>>>>>> MatiRebolledo
	@Autowired
	EtapaService etapaService;
	@Autowired
	AsignaturaService asignaturaService;
	@Autowired
	ModuloService moduloService;
	@Autowired
	ContenidoService contenidoService;
	@Autowired
<<<<<<< HEAD
	JuegoService juegoService;
	@Autowired
	PreguntaEtapaService preguntaEtapaService;
	@Autowired
	RespuestaEtapaService respuestaEtapaService;
=======
	ScoreUsuarioService	scoreUsuarioService;
	@Autowired
	PreguntaService preguntaService;
	@Autowired
	AlternativaService alternativaService;
>>>>>>> MatiRebolledo

	/* CREAR UNA RUTA PARA RETORNAR E INICIARLA */
	@RequestMapping("/etapa")
	/* SE VA A RETORNAR UN JSON, EN ESTE CASO UNA LISTA DE ETAPAS */
	/* NO OLVIDAR IMPORTAR LO NECESARIO */
	public List<Etapa> obtenerListaEtapas() {
		/* VA A BUSCAR AL SERVICE EL METODO */
		List<Etapa> listaEtapas = etapaService.findAll();
<<<<<<< HEAD
		/* UNA VEZ EL SERVICE VA AL REPOSITORY, RETORNA LA VARIABLE DESEADA */
		return listaEtapas;

	}

=======
		/* UNA VEZ EL SERVICE VA AL REPOSITORY, RETORNA LA VARIABLE O LISTA DESEADA */
		return listaEtapas;
	}

	/* FAVOR CHECAR SI SE TIENEN QUE AGREGAR O QUITAR APIREST */

>>>>>>> MatiRebolledo
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

<<<<<<< HEAD
	@RequestMapping("/juego")
	public List<Juego> obtenerListaJuegos() {
		List<Juego> listaJuegos = juegoService.findAll();
		return listaJuegos;
	}

	/*
	 * ESTAS HAY QUE CORREGIRLAS PARA QUE SE MUESTREN COMO QUIZ FINAL DE ETAPAS,
	 * MODIFICAR SEGUN SE NECESITE
	 */
	@RequestMapping("/pregunta")
	public List<PreguntaEtapa> obtenerListaPreguntas() {
		List<PreguntaEtapa> listaPreguntas = preguntaEtapaService.findAll();
		return listaPreguntas;
	}

	/*
	 * ESTAS HAY QUE CORREGIRLAS PARA QUE SE MUESTREN COMO QUIZ FINAL DE ETAPAS,
	 * MODIFICAR SEGUN SE NECESITE
	 */
	@RequestMapping("/respuesta")
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

=======
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

>>>>>>> MatiRebolledo
}

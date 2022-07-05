package com.generationg6.controllers;

import com.generationg6.models.*;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController()
@RequestMapping("/")

public class IndexController {
	@GetMapping(produces= MediaType.APPLICATION_JSON_VALUE)//Aqui transformo una clase del modelo(objeto) a JSON.
	@RequestMapping("getAsignaturaById")
	public Asignatura getAsignaturaById(int idAsignatura) {
		Asignatura asig = new Asignatura();
		asig.setId_asignatura(idAsignatura);
		asig.setNombre_asignatura("html");
		asig.setDescripcion_asignatura("En esta asignatura se veran las partes que componen un archivo html");

		List<Modulos> listaModulos = new ArrayList<>();
		Modulos modulo1 = new Modulos(1,"etiquetas","En este modulo aprenderas que es una etiqueta",idAsignatura);
		Modulos modulo2 = new Modulos(2,"estructura","En este modulo aprenderas la estructura de las etiquetas",idAsignatura);

		Contenido contenido1modulo1 = new Contenido(1,"doctype","Aprenderas que es la etiqueta doctype",1);
		Contenido contenido2modulo1 = new Contenido(2,"head","Aprenderas que es la etiqueta head",1);

		List<EtapaPreguntaEtapa> listaEtapaPreguntaEtapa = new ArrayList<>();
		EtapaPreguntaEtapa etapaPreguntaEtapa1 = new EtapaPreguntaEtapa(1,1);
		PreguntasEtapa preguntasEtapa = new PreguntasEtapa(1,"¿Cual de estos elementos es el doctype?","",1);
		List<ValidacionRespuestasEtapa> listaValidacionRespuestasEtapas = new ArrayList<>();
		AlternativasEtapa alternativasEtapa1 = new AlternativasEtapa(1,"<doctype>");
		AlternativasEtapa alternativasEtapa2 = new AlternativasEtapa(2,"</doctype>");
		AlternativasEtapa alternativasEtapa3 = new AlternativasEtapa(3,"<doctype/>");
		AlternativasEtapa alternativasEtapa4 = new AlternativasEtapa(4,"<doctype>!");

		ValidacionRespuestasEtapa validacion1 = new ValidacionRespuestasEtapa(true,1,1,1, alternativasEtapa1);
		ValidacionRespuestasEtapa validacion2 = new ValidacionRespuestasEtapa(false,1,2,2, alternativasEtapa2);
		ValidacionRespuestasEtapa validacion3 = new ValidacionRespuestasEtapa(false,1,3,3, alternativasEtapa3);
		ValidacionRespuestasEtapa validacion4 = new ValidacionRespuestasEtapa(false,1,4,4, alternativasEtapa4);

		listaValidacionRespuestasEtapas.add(validacion1);
		listaValidacionRespuestasEtapas.add(validacion2);
		listaValidacionRespuestasEtapas.add(validacion3);
		listaValidacionRespuestasEtapas.add(validacion4);

		preguntasEtapa.setListaValidacionRespuestaEtapa(listaValidacionRespuestasEtapas);

		etapaPreguntaEtapa1.setPreguntasEtapa(preguntasEtapa);
		Etapas etapa1 = new Etapas(1,"etapa uno","Aquí aprenderas la importancia del doctype",1);

		listaEtapaPreguntaEtapa.add(etapaPreguntaEtapa1);
		etapa1.setListaEtapaPreguntaEtapa(listaEtapaPreguntaEtapa);
		List<Etapas> listaEtapas = new ArrayList<>();
		listaEtapas.add(etapa1);

		contenido1modulo1.setListaEtapas(listaEtapas);

		List<Contenido> listaContenido = new ArrayList<>();
		listaContenido.add(contenido1modulo1);
		listaContenido.add(contenido2modulo1);

		modulo1.setListaContenido(listaContenido);
		listaModulos.add(modulo1);
		listaModulos.add(modulo2);

		asig.setListaModulos(listaModulos);


		// PASA OBJETO A VISTA JSP
		return asig;
	}

	@RequestMapping("/")
	public String index(Model model) {

		// PASA OBJETO A VISTA JSP
		return "index.jsp";
	}
}

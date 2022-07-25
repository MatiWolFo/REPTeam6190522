package com.generationg6.services;

import com.generationg6.models.Pregunta;
import com.generationg6.repositories.PreguntaRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PreguntaService {

    /* INYECCION DE DEPENDENCIA A REPOSITORIO */
    @Autowired
    PreguntaRepository preguntaRepository;
    
    /* METODOS INYECTADOS DESDE API REST CONTROLLER */
	public List<Pregunta> findAll() {
		
		return preguntaRepository.findAll();
	}
}

package com.generationg6.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generationg6.repositories.PreguntaJuegoRepository;

@Service
public class PreguntaJuegoService {

	/* INYECCION DE DEPENDENCIA A REPOSITORIO */
	@Autowired
	PreguntaJuegoRepository preguntaJuegoRepository;
}

package com.generationg6.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generationg6.repositories.RespuestaJuegoRepository;

@Service
public class RespuestaJuegoService {

	/* INYECCION DE DEPENDENCIA A REPOSITORIO */
	@Autowired
	RespuestaJuegoRepository respuestaJuegoRepository;
}

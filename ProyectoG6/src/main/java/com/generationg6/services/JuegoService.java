package com.generationg6.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generationg6.repositories.JuegoRepository;

@Service
public class JuegoService {

	/* INYECCION DE DEPENDENCIA A REPOSITORIO */
	@Autowired
	JuegoRepository juegoRepository;
}

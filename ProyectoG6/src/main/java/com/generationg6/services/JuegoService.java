package com.generationg6.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generationg6.models.Juego;
import com.generationg6.repositories.JuegoRepository;

@Service
public class JuegoService {

	/* INYECCION DE DEPENDENCIA A REPOSITORIO */
	@Autowired
	JuegoRepository juegoRepository;

	/*METODOS INYECTADOS DESDE API REST CONTROLLER*/
	public List<Juego> findAll() {
		
		return juegoRepository.findAll();
	}
}

package com.generationg6.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generationg6.models.PreguntaEtapa;
import com.generationg6.repositories.PreguntaEtapaRepository;

@Service
public class PreguntaEtapaService {

	/* INYECCION DE DEPENDENCIA A REPOSITORIO */
	@Autowired
	PreguntaEtapaRepository preguntaEtapaRepository;

	/*METODOS INYECTADOS DESDE API REST CONTROLLER*/
	public List<PreguntaEtapa> findAll() {
		
		return preguntaEtapaRepository.findAll();
	}
}

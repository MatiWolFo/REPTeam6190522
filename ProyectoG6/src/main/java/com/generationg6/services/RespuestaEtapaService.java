package com.generationg6.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generationg6.models.RespuestaEtapa;
import com.generationg6.repositories.RespuestaEtapaRepository;

@Service
public class RespuestaEtapaService {

	/* INYECCION DE DEPENDENCIA A REPOSITORIO */
	@Autowired
	RespuestaEtapaRepository respuestaEtapaRepository;

	public List<RespuestaEtapa> findAll() {
		/*METODOS INYECTADOS DESDE API REST CONTROLLER*/
		return respuestaEtapaRepository.findAll();
	}

}

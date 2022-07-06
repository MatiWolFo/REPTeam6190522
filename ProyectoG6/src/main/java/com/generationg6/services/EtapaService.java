package com.generationg6.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generationg6.models.Etapa;
import com.generationg6.repositories.EtapaRepository;

@Service
public class EtapaService {

	/* INYECCION DE DEPENDENCIA A REPOSITORIO */
	@Autowired
	EtapaRepository etapaRepository;

	/*METODOS INYECTADOS DESDE API REST CONTROLLER*/
	public List<Etapa> findAll() {
		return etapaRepository.findAll();
	}
}

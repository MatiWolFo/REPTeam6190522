package com.generationg6.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generationg6.repositories.EtapaJuegoRepository;

@Service
public class EtapaJuegoService {

	/* INYECCION DE DEPENDENCIA A REPOSITORIO */
	@Autowired
	EtapaJuegoRepository etapaJuegoRepository;
}

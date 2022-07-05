package com.generationg6.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generationg6.repositories.EtapaUsuarioRepository;

@Service
public class EtapaUsuarioService {

	/* INYECCION DE DEPENDENCIA A REPOSITORIO */
	@Autowired
	EtapaUsuarioRepository etapaUsuarioRepository;
}

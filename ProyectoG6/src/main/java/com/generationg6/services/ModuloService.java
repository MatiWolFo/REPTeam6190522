package com.generationg6.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generationg6.repositories.ModuloRepository;

@Service
public class ModuloService {

	/* INYECCION DE DEPENDENCIA A REPOSITORIO */
	@Autowired
	ModuloRepository moduloRepository;
}

package com.generationg6.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generationg6.repositories.UsuarioRepository;

@Service
public class AsignaturaService {
	
	/* INYECCION DE DEPENDENCIA A REPOSITORIO */
	@Autowired
	UsuarioRepository usuarioRepository;
}

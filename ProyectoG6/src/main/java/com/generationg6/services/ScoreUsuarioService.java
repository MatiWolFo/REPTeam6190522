package com.generationg6.services;


import com.generationg6.models.ScoreUsuario;
import com.generationg6.repositories.ScoreUsuarioRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScoreUsuarioService {

    /* INYECCION DE DEPENDENCIA A REPOSITORIO */
    @Autowired
    ScoreUsuarioRepository scoreUsuarioRepository;

    /* METODOS INYECTADOS DESDE API REST CONTROLLER */
	public List<ScoreUsuario> findAll() {
		
		return scoreUsuarioRepository.findAll();
	}
}
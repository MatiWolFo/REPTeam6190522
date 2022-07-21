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

    public void guardarScoreUsuario(ScoreUsuario score) {
        scoreUsuarioRepository.save(score);
    }

    public ScoreUsuario getScoreUsuarioById(Long idScoreUsuario) {
        return scoreUsuarioRepository.findById(idScoreUsuario).get();
    }
}
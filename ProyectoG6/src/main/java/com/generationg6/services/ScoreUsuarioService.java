package com.generationg6.services;


import com.generationg6.repositories.AlternativaRepository;
import com.generationg6.repositories.ScoreUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScoreUsuarioService {

    /* INYECCION DE DEPENDENCIA A REPOSITORIO */
    @Autowired
    ScoreUsuarioRepository scoreUsuarioRepository;
}
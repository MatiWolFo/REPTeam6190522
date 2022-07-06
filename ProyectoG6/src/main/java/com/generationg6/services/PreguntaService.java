package com.generationg6.services;

import com.generationg6.repositories.PreguntaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PreguntaService {

    /* INYECCION DE DEPENDENCIA A REPOSITORIO */
    @Autowired
    PreguntaRepository preguntaRepository;
}

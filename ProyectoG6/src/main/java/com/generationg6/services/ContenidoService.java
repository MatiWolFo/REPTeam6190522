package com.generationg6.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generationg6.repositories.ContenidoRepository;

@Service
public class ContenidoService {

    /* INYECCION DE DEPENDENCIA A REPOSITORIO */
    @Autowired
    ContenidoRepository contenidoRepository;
}

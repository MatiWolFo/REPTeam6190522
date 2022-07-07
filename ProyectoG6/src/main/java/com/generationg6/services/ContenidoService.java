package com.generationg6.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generationg6.models.Contenido;
import com.generationg6.repositories.ContenidoRepository;

@Service
public class ContenidoService {

    /* INYECCION DE DEPENDENCIA A REPOSITORIO */
    @Autowired
    ContenidoRepository contenidoRepository;

    /* METODOS INYECTADOS DESDE API REST CONTROLLER */
	public List<Contenido> findAll() {
		
		return contenidoRepository.findAll();
	}
}

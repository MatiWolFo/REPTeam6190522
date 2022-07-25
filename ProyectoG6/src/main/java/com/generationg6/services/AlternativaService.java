package com.generationg6.services;


import com.generationg6.models.Alternativa;
import com.generationg6.repositories.AlternativaRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlternativaService {

    /* INYECCION DE DEPENDENCIA A REPOSITORIO */
    @Autowired
    AlternativaRepository alternativaRepository;

    /* METODOS INYECTADOS DESDE API REST CONTROLLER */
	public List<Alternativa> findAll() {
		
		return alternativaRepository.findAll();
	}
}
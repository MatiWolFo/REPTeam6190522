package com.generationg6.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generationg6.models.Modulo;
import com.generationg6.repositories.ModuloRepository;

@Service
public class ModuloService {

    /* INYECCION DE DEPENDENCIA A REPOSITORIO */
    @Autowired
    ModuloRepository moduloRepository;

    /* METODOS INYECTADOS DESDE API REST CONTROLLER */
	public List<Modulo> findAll() {
		
		return moduloRepository.findAll();
	}

    public Modulo getModuloById(Long IdModulo){


        return moduloRepository.findById(IdModulo).get();
    }
}

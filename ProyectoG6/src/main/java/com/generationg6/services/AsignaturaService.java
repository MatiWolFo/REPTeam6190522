package com.generationg6.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generationg6.models.Asignatura;
import com.generationg6.repositories.AsignaturaRepository;

@Service
public class AsignaturaService {
	
	/* INYECCION DE DEPENDENCIA A REPOSITORIO */
	@Autowired
	AsignaturaRepository asignaturaRepository;

	/*METODOS INYECTADOS DESDE API REST CONTROLLER*/
	public List<Asignatura> findAll() {
		return asignaturaRepository.findAll();
	}
}

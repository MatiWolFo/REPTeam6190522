package com.generationg6.services;

<<<<<<< HEAD
=======
import com.generationg6.models.Asignatura;
import com.generationg6.repositories.AsignaturaRepository;

>>>>>>> MatiRebolledo
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

<<<<<<< HEAD
import com.generationg6.models.Asignatura;
import com.generationg6.repositories.AsignaturaRepository;

@Service
public class AsignaturaService {
	
	/* INYECCION DE DEPENDENCIA A REPOSITORIO */
	@Autowired
	AsignaturaRepository asignaturaRepository;

	/*METODOS INYECTADOS DESDE API REST CONTROLLER*/
	public List<Asignatura> findAll() {
=======
@Service
public class AsignaturaService {

    /* INYECCION DE DEPENDENCIA A REPOSITORIO */
    @Autowired
    AsignaturaRepository asignaturaRepository;

    public Asignatura getAsignaturaById(Long idAsignatura) {
        return asignaturaRepository.findById(idAsignatura).get();
    }

    /* METODOS INYECTADOS DESDE API REST CONTROLLER */
	public List<Asignatura> findAll() {
		
>>>>>>> MatiRebolledo
		return asignaturaRepository.findAll();
	}
}

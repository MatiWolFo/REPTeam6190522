package com.generationg6.services;

<<<<<<< HEAD
=======
import com.generationg6.models.Etapa;

>>>>>>> MatiRebolledo
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

<<<<<<< HEAD
import com.generationg6.models.Etapa;
=======
>>>>>>> MatiRebolledo
import com.generationg6.repositories.EtapaRepository;

@Service
public class EtapaService {

	/* INYECCION DE DEPENDENCIA A REPOSITORIO */
	@Autowired
	EtapaRepository etapaRepository;

<<<<<<< HEAD
	/*METODOS INYECTADOS DESDE API REST CONTROLLER*/
	public List<Etapa> findAll() {
=======
	public Etapa getEtapaById(Long idEtapa) {

		return etapaRepository.findById(idEtapa).get();
	}

	/* METODOS INYECTADOS DESDE API REST CONTROLLER */
	public List<Etapa> findAll() {
		
>>>>>>> MatiRebolledo
		return etapaRepository.findAll();
	}
}

package com.paginas.services;

/* IMPORTAR LAS LIBRERIAS REQUERIDAS*/
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paginas.models.Paginas;
import com.paginas.repositories.PaginasRepository;



/* ASIGNAR LA ANOTACION PARA EL SERVICE*/
@Service
public class PaginasService {
	/* ASIGNAR LA ANOTACION PARA INJECTAR EL REPOSITORY */
	@Autowired
	PaginasRepository paginasRepository;

	/* CREA METODO PARA GUARDAR AUTOS EN UNA LISTA */
	public void guardarPagina(@Valid Paginas pagina) {
		paginasRepository.save(pagina);

	}

	/* CREA METODO PARA OBTENER UNA LISTA DE LOS AUTOS GUARDADOS EN ELLA */
	public List<Paginas> findAll() {

		return paginasRepository.findAll();
	}

	/* CREA METODO PARA OBTENER UNA LISTA DE LOS AUTOS GUARDADOS EN ELLA */
	public Paginas buscarId(Long id) {
		/*
		 * RETORNA UN OPTIONAL DE TIPO AUTO A TRTAVES DE UNA ID, CON GET ESPECIFICA Y
		 * ASEGURA EL RETORNO DE UN AUTO DE DICHA ID
		 *2.5. DEVUELVE EL OBJETO DESDE LA DB AL METODO */
		return paginasRepository.findById(id).get();
	}
}

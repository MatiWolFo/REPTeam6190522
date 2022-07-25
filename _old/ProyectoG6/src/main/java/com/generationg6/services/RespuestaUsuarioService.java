package com.generationg6.services;



import com.generationg6.models.RespuestaUsuario;
import com.generationg6.repositories.RespuestaUsuarioRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RespuestaUsuarioService {

    /* INYECCION DE DEPENDENCIA A REPOSITORIO */
    @Autowired
    RespuestaUsuarioRepository respuestaUsuarioRepository;
    
    /* METODOS INYECTADOS DESDE API REST CONTROLLER */
	public List<RespuestaUsuario> findAll() {
		
		return respuestaUsuarioRepository.findAll();
	}
}
package com.generationg6.services;


import com.generationg6.repositories.AlternativaRepository;
import com.generationg6.repositories.RespuestaUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RespuestaUsuarioService {

    /* INYECCION DE DEPENDENCIA A REPOSITORIO */
    @Autowired
    RespuestaUsuarioRepository respuestaUsuarioRepository;
}
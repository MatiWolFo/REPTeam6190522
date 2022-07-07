package com.generationg6.services;

import com.generationg6.repositories.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RolService {

    /* INYECCION DE DEPENDENCIA A REPOSITORIO */
    @Autowired
    RolRepository rolRepository;
}
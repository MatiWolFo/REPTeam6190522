package com.generationg6.services;


import com.generationg6.repositories.AlternativaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlternativaService {

    /* INYECCION DE DEPENDENCIA A REPOSITORIO */
    @Autowired
    AlternativaRepository alternativaRepository;
}
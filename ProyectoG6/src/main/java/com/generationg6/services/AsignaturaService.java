package com.generationg6.services;

import com.generationg6.models.Asignatura;
import com.generationg6.repositories.AsignaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AsignaturaService {


    @Autowired
    AsignaturaRepository asignaturaRepository;


    public List<Asignatura> findAll(){

        return asignaturaRepository.findAll();
    }

}

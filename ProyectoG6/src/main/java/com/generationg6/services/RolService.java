package com.generationg6.services;

import com.generationg6.models.Rol;
import com.generationg6.repositories.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;


@Service
public class RolService {

    /* INYECCION DE DEPENDENCIA A REPOSITORIO */
    @Autowired
    RolRepository rolRepository;


    public List<Rol>findAll() {

        return rolRepository.findAll();


    }

    public void  ElminarRol(Long id){

        rolRepository.deleteById(id);
    }

    public Rol BuscarRol(Long id){

        return rolRepository.findById(id).orElse(null);
    }

    public Rol GuardarRol(@Valid Rol rol) {
        rolRepository.save(rol);
        return rol;
    }
}
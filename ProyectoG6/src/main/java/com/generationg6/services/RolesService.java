package com.generationg6.services;

import com.generationg6.models.Roles;
import com.generationg6.repositories.RolesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;

@Service
public class RolesService {

    @Autowired
    RolesRepository rolesRepository;

    public void GuardarRol(@Valid Roles rolesUsuarios) {
        rolesRepository.save(rolesUsuarios);
    }
    public List<Roles> findAll(){


    return rolesRepository.findAll();
    }


}

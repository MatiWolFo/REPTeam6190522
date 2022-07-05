package com.generationg1.services;

import com.generationg1.models.Auto;
import com.generationg1.repositories.AutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;

@Service
public class AutoService {
    @Autowired
    AutoRepository autorepository;

    //guardar un auto
    public void saveAuto(@Valid Auto auto) {
        autorepository.save(auto);
    }

    //obtener una lista de autos
    public List<Auto> findAll() {

        return autorepository.findAll();
    }

    public Auto buscarId(Long id) {
        return autorepository.findById(id).get();//.get especifica el tipo de dato
    }

    public void eliminarPorId(Long id) {
      autorepository.deleteById(id);
    }
}

package com.generationg1.services;

import com.generationg1.models.Auto;
import com.generationg1.models.Usuario;
import com.generationg1.repositories.AutoRepository;
import com.generationg1.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;

/** Logica de negocio, o validaciones del sistema */
@Service
public class UsuarioService {
    /** llamar al Repository */
    @Autowired
    UsuarioRepository usuariorepository;
    public void saveUsuario(@Valid Usuario usuario) {
        usuariorepository.save(usuario);

    }


}

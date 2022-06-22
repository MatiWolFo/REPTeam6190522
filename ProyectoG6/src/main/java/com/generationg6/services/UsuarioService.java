package com.generationg6.services;


import com.generationg6.models.Usuario;
import com.generationg6.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;

@Service
public class UsuarioService {

@Autowired
UsuarioRepository usuariosRepository;

    public void GuardarUsuario(@Valid  Usuario usuario) {
               usuariosRepository.save(usuario);
    }
}

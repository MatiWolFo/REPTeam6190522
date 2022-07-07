package com.generationg6.services;

import com.generationg6.models.Usuario;
import com.generationg6.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;


@Service
public class UsuarioService {

    /* INYECCION DE DEPENDENCIA A REPOSITORIO */
    @Autowired
    UsuarioRepository usuariosRepository;

    public void GuardarUsuario(@Valid Usuario usuario) {
        usuariosRepository.save(usuario);
    }


    public List<Usuario> findAll() {

        return usuariosRepository.findAll();


    }
    public Usuario buscarId(Long id){

        return usuariosRepository.findById(id).get();//.get() especificamos el tipo de dato

    }

    public void eliminarUsuario(Long id){

        usuariosRepository.deleteById(id);

    }
}
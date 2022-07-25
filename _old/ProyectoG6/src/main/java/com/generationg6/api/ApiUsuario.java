package com.generationg6.api;

import com.generationg6.models.Usuario;
import com.generationg6.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiUsuario {

    @Autowired //Inyeccion de dependencias, traer una clase para ser usada internamente
    UsuarioService usuarioService;

        @RequestMapping("/api/usuario")
        public List<Usuario> obtenerListaUsuario(){

            List<Usuario> listaUsuarios = usuarioService.findAll();
            return listaUsuarios;

        }
}

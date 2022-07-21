package com.generationg6.api;

import com.generationg6.models.Usuario;
import com.generationg6.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class ApiUsuario {

    @Autowired //Inyeccion de dependencias, traer una clase para ser usada internamente
    UsuarioService usuarioService;

        @RequestMapping(value = "/usuario/obtener")
        public List<Usuario> obtenerListaUsuario(){

            List<Usuario> listaUsuarios = usuarioService.findAll();
            return listaUsuarios;
        }


        @PostMapping("/guardar/usuario")
        public ResponseEntity<Usuario> guardarUsuario(@RequestBody Usuario usuario){
            usuarioService.GuardarUsuario(usuario);
            return new ResponseEntity<Usuario>(usuario, HttpStatus.OK);
        }


       @PostMapping(value = "/eliminar/{id}")
       public ResponseEntity<Usuario> eliminarUsuario(@PathVariable Long id) {
        try {
            usuarioService.eliminarUsuario(id);
            return new ResponseEntity<Usuario>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Usuario>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}

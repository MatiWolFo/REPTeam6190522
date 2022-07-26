package com.generationg6.api;

import com.generationg6.models.Rol;
import com.generationg6.models.Usuario;
import com.generationg6.services.RolService;
import com.generationg6.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
<<<<<<< HEAD
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
=======
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
>>>>>>> fb06d24b4183010271fa5f71beab52584c2ed250

import javax.servlet.http.HttpServletRequest;
import javax.swing.text.html.Option;
import javax.validation.Valid;
import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class ApiUsuario {

    @Autowired //Inyeccion de dependencias, traer una clase para ser usada internamente
    UsuarioService usuarioService;

<<<<<<< HEAD
    @Autowired
    RolService rolService;


    @RequestMapping(value = "/usuario/obtener", method = RequestMethod.GET)
    public @ResponseBody List<Usuario> getUsuarios(HttpServletRequest request){
             List<Usuario> usuarios = usuarioService.findAll();
             return usuarios;
    }

    @PostMapping(value = "/usuario/guardar")
    public ResponseEntity<Usuario> guardarUsuario(@Valid @RequestBody Usuario usuario){
        Optional<Rol> rolOptional = Optional.ofNullable(rolService.BuscarRol(usuario.getRoles().getId()));

        if(rolOptional.isEmpty()){
            return ResponseEntity.unprocessableEntity().build();
        }

        usuario.setRoles(rolOptional.get());
        usuarioService.GuardarUsuario(usuario);


        return new ResponseEntity<Usuario>(usuario, HttpStatus.OK);
    }

    @PutMapping("/usuario/actualizar/{id}")
    public ResponseEntity<Usuario> actualizarUsuario(@Valid @RequestBody Usuario usuario,@PathVariable Long id){
        Optional<Rol> rolOptional = Optional.ofNullable(rolService.BuscarRol(usuario.getRoles().getId()));

        if(rolOptional.isPresent()){
            return ResponseEntity.unprocessableEntity().build();
        }

        Optional<Usuario> usuarioOptional = Optional.ofNullable(usuarioService.buscarId(id));
        if(!usuarioOptional.isPresent()){
            return ResponseEntity.unprocessableEntity().build();
        }

        usuario.setRoles(rolOptional.get());
        usuario.setId(usuarioOptional.get().getId());
        usuarioService.GuardarUsuario(usuario);

        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/usuario/eliminar/{id}")
    public ResponseEntity<Usuario> eliminarUsuario(@PathVariable Long id){
        Optional<Usuario> usuarioOptional = Optional.ofNullable(usuarioService.buscarId(id));

        if(!usuarioOptional.isPresent()){
            return ResponseEntity.unprocessableEntity().build();
        }

        usuarioService.eliminarUsuario(usuarioOptional.get().getId());
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/usuario/numero/{id}")
    public ResponseEntity<Usuario> obtenerUsuarioPorId(@PathVariable Long id){
        Optional<Usuario> usuarioOptional = Optional.ofNullable(usuarioService.buscarId(id));

        if(!usuarioOptional.isPresent()){
            return ResponseEntity.unprocessableEntity().build();
        }

        return ResponseEntity.ok(usuarioOptional.get());
    }
=======
        @RequestMapping("/usuario/obtener")
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

>>>>>>> fb06d24b4183010271fa5f71beab52584c2ed250
}

    /*@PostMapping(value = "/guardar/usuario")
    public  ResponseEntity<Rol> guardarUsuario(@Valid @RequestBody Usuario usuario){
        Optional<Usuario> usuarioOptional = Optional.ofNullable(usuarioService.buscarId(usuario.getRoles().getId()));
        if (!usuarioOptional.isPresent()){
            return ResponseEntity.unprocessableEntity().build();
        }
        usuario.setRoles(usuarioOptional.get());
        Usuario usuarioGuardado = usuarioService.GuardarUsuario(usuario);
        URI ubicacion = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(usuarioGuardado.getId()).toUri();

        return ResponseEntity.created(ubicacion).body(usuarioGuardado);*/


       /*@PostMapping(value = "/eliminar/{id}")
       public ResponseEntity<Usuario> eliminarUsuario(@PathVariable Long id) {
        try {
            usuarioService.eliminarUsuario(id);
            return new ResponseEntity<Usuario>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Usuario>(HttpStatus.INTERNAL_SERVER_ERROR);
        }*/




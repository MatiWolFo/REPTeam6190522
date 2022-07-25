package com.generationg6.api;

import com.generationg6.models.Rol;
import com.generationg6.services.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class ApiRol {

        @Autowired
        private RolService rolService;

        @RequestMapping(value = "/rol/obtener", method = RequestMethod.GET)
        public @ResponseBody List<Rol> getRoles(HttpServletRequest request){
            List<Rol> Roles = rolService.findAll();
            return Roles;
        }
        @PostMapping("/rol/guardar")
        public ResponseEntity<Rol> guardarRol(@Valid @RequestBody Rol rol){
            Rol rolGuardado = rolService.GuardarRol(rol);
            URI ubicacion = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                    .buildAndExpand(rolGuardado.getId()).toUri();
            return ResponseEntity.created(ubicacion).body(rolGuardado);
        }

        @PutMapping("/rol/actualizar/{id}")
        public ResponseEntity<Rol> actualizarRol(@PathVariable Long id,@Valid @RequestBody Rol rol){
            Optional<Rol> rolOptional = Optional.ofNullable(rolService.BuscarRol(id));

            if(!rolOptional.isPresent()){
                return ResponseEntity.unprocessableEntity().build();
            }

            rol.setId(rolOptional.get().getId());
            rolService.GuardarRol(rol);

            return ResponseEntity.noContent().build();
        }

        @DeleteMapping("/rol/eliminar/{id}")
        public ResponseEntity<Rol> eliminarRol(@PathVariable Long id){
            Optional<Rol> rolOptional = Optional.ofNullable(rolService.BuscarRol(id));

            if(!rolOptional.isPresent()){
                return ResponseEntity.unprocessableEntity().build();
            }

            rolService.ElminarRol(rolOptional.get().getId());
            return ResponseEntity.noContent().build();
        }

        @GetMapping("/rol/numero/{id}")
        public ResponseEntity<Rol> obtenerRolPorId(@PathVariable Long id){
            Optional<Rol> RolOptional = Optional.ofNullable(rolService.BuscarRol(id));

            if(!RolOptional.isPresent()){
                return ResponseEntity.unprocessableEntity().build();
            }

            return ResponseEntity.ok(RolOptional.get());
        }
    }


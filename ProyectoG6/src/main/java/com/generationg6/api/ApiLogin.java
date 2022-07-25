package com.generationg6.api;


import com.generationg6.models.Usuario;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class ApiLogin {

    @PostMapping(value ="/api/login")
    public ResponseEntity<Usuario> loginUsuario(@Valid @RequestBody Usuario usuario){


    }
}

package com.generationg6.controllers;

import com.generationg6.models.*;
import com.generationg6.services.AsignaturaService;
import com.generationg6.services.EtapaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//Establecemos que la clase en un controlador y ruta inicial
//RequestMapping permite cualquier metodo que llegue a la ruta(GET,POST,PUT, PATCH, DELETE)
@Controller
@RequestMapping("/home")

public class IndexController {
    AsignaturaService asignaturaService;
    EtapaService etapaService;


    public IndexController(AsignaturaService asignaturaService,EtapaService etapaService) {
        this.asignaturaService = asignaturaService;
        this.etapaService = etapaService;
    }

    @RequestMapping("")
    public String index(){

        return "home.jsp";
    }

    @RequestMapping("/login")
    public String login(){

        return "login.jsp";
    }
}

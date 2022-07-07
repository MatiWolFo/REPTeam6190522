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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@Controller
@RequestMapping("/")

public class IndexController {
    AsignaturaService asignaturaService;
    EtapaService etapaService;


    public IndexController(AsignaturaService asignaturaService,EtapaService etapaService) {
        this.asignaturaService = asignaturaService;
        this.etapaService = etapaService;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)//Aqui transformo una clase del modelo(objeto) a JSON.
    @RequestMapping("getAsignaturaById")
    public ResponseEntity <Asignatura> getAsignaturaById(Long idAsignatura) {
        Asignatura asignatura ;

        try {
            asignatura = asignaturaService.getAsignaturaById(idAsignatura);
        }catch (Exception e){
            return new ResponseEntity<>(new Asignatura(), HttpStatus.BAD_REQUEST);

        }
        return new ResponseEntity<>(asignatura, HttpStatus.ACCEPTED);

    }

    @RequestMapping("/")
    public String index(Model model) {

        // PASA OBJETO A VISTA JSP
        return "home.jsp";
    }
}

package com.generationg6.controllers;


import com.generationg6.models.Asignatura;
import com.generationg6.models.Modulos;
import com.generationg6.repositories.AsignaturaRepository;
import com.generationg6.services.AsignaturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller

public class SelectorController {

    @Autowired
    AsignaturaService asignaturaService;

    @RequestMapping("home/seleccion")
    public String seleccionAsignatura(@ModelAttribute("asignatura") Asignatura asignatura, Model model){

        List<Asignatura> listaAsignatura = asignaturaService.findAll();
        model.addAttribute("listaAsignatura", listaAsignatura);

        return "seleccionAsignatura.jsp";
    }

    @RequestMapping("home/seleccion?id=1")
    public String seleccionModulo(Model model){



        return "seleccionModulo.jsp";

    }
}

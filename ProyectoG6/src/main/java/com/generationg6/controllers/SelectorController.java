package com.generationg6.controllers;


import com.generationg6.models.Asignatura;
import com.generationg6.models.Contenido;
import com.generationg6.models.Etapa;
import com.generationg6.models.Modulo;
import com.generationg6.services.AsignaturaService;
import com.generationg6.services.ContenidoService;
import com.generationg6.services.EtapaService;
import com.generationg6.services.ModuloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Nombramos otra vez que es una clase controller
@Controller
@RequestMapping("home/seleccion")
public class SelectorController {

    //Autowired permite salta la etapa de crear un instancia de clase
    //Por ende no es necesario hacer AsignaturaService asignaturaService = new AsignaturaService;
    @Autowired
    AsignaturaService asignaturaService;
    @Autowired
    ModuloService moduloService;
    @Autowired
    ContenidoService contenidoService;
    @Autowired
    EtapaService etapaService;

    @RequestMapping("/asignatura")
    //con @ModelAttribute nos comunicamos con el .jsp
    public String seleccionAsignatura(@ModelAttribute("asignatura") Asignatura asignatura, Model model){

        List<Asignatura> listaAsignatura = asignaturaService.findAll();
        model.addAttribute("listaAsignatura", listaAsignatura);

        return "seleccionAsignatura2.jsp";
    }

    @RequestMapping("/modulo")
    public String seleccionModulo(@ModelAttribute("modulo") Modulo modulo, Model model){

        List<Modulo> listaModulo = moduloService.findAll();
        model.addAttribute("listaModulo", listaModulo);
        return "seleccionModulo.jsp";
    }

    @RequestMapping("/contenido")
    public String seleccionContenido(Model model){

        List<Contenido> listaContenido = contenidoService.findAll();
        model.addAttribute("listaContenido", listaContenido);

        return "seleccionContenido2.jsp";
    }
    @RequestMapping("/etapas")
    public String seleccionContenido(@RequestParam(value = "id")Long id, Model model){

        List<Etapa> listaEtapa = etapaService.findAll();
        model.addAttribute("listaEtapas", listaEtapa);
        System.out.println("El id es" + id);

        return "seleccionEtapa2.jsp";
    }

}

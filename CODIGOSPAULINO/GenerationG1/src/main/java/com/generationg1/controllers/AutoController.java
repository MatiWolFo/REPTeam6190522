package com.generationg1.controllers;

import com.generationg1.models.Auto;
import com.generationg1.services.AutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/auto")
public class AutoController {
    @Autowired
    AutoService autoService;

    @RequestMapping("")
    public String registroAuto(@ModelAttribute("auto") Auto auto) {

        return "registroAuto.jsp"; //pagina a desplegar
    }

    @PostMapping("registro")
    public String guardarAuto(@Valid @ModelAttribute("auto") Auto auto,
                              BindingResult resultado,
                              Model model) {
        if (resultado.hasErrors()) {//capturamos si existe un error en el ingreso de datos desde el jsp
            model.addAttribute("msgError", "Debe ingresar valores correctos");
            return "registro.jsp";
        } else {
            //enviar el objeto al service
            autoService.saveAuto(auto);
            //obtener una lista de autos
            List<Auto> listaAutos = autoService.findAll();
            //pasamos la lista de autos al jsp
            model.addAttribute("listaAutos", listaAutos);
            return "mostrarAutos.jsp"; //pagina a desplegar
        }
    }

    //solo mostrar el listado de autos
    @RequestMapping("/mostrar")
    public String mostrar(Model model) {
        //obtener una lista de autos
        List<Auto> listaAutos = autoService.findAll();
        //pasamos la lista de autos al jsp
        model.addAttribute("listaAutos", listaAutos);
        return "mostrarAutos.jsp"; //pagina a desplegar
    }

    @RequestMapping("/editar/{id}")
    public String editar(@PathVariable("id") Long id, Model model) {
        System.out.println("el id es: " + id);
        Auto auto = autoService.buscarId(id);//buscar el objeto en el sql
        model.addAttribute("auto", auto);//pasar al jsp

        return "editarAuto.jsp";//redireccionar a otra url o path
    }

    //localhost:8080/auto/actualizar/{id} -> //actualizar para la persistencia en la bd
    @PostMapping("/actualizar/{id}")
    public String actualizarAuto(@PathVariable("id") Long id, @Valid @ModelAttribute("auto") Auto auto,
                                 BindingResult resultado,
                                 Model model) {
        System.out.println("el id al actualizar es: " + id);


        if (resultado.hasErrors()) {//capturamos si existe un error en el ingreso de datos desde el jsp
            model.addAttribute("msgError", "Debe ingresar valores correctos");
            return "editarAuto.jsp";
        } else {
            auto.setId(id);//-> agregar el id al objeto
            //enviar el objeto al service
            autoService.saveAuto(auto);
            //obtener una lista de autos
            List<Auto> listaAutos = autoService.findAll();
            //pasamos la lista de autos al jsp
            model.addAttribute("listaAutos", listaAutos);
            return "mostrarAutos.jsp"; //pagina a desplegar
        }

    }

    @RequestMapping("/eliminar/{id}")
    public String eliminarAuto(@PathVariable("id") Long id, Model model) {

        autoService.eliminarPorId(id);

        return "redirect:/auto/mostrar";


    }
}

package com.generationg6.controllers;


import com.generationg6.models.Usuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
@RequestMapping("/home")


public class RegistroUsuarioController {

@Autowired
    RegistroUsuario registroUsuarioService;


@RequestMapping("/home/registro")
    public String registro(@ModelAttribute("usuario") Usuarios usuario,
                           BindingResult result, Model model){

    if(result.hasErrors()){








    }





}







package com.generationg6.api;


import com.generationg6.models.Asignatura;
import com.generationg6.services.AsignaturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiRestControllerAsignatura {

    @Autowired
    AsignaturaService asignaturaService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)//Aqui transformo una clase del modelo(objeto) a JSON.
    @RequestMapping("getAsignaturaById")
    public ResponseEntity<Asignatura> getAsignaturaById(Long idAsignatura) {
        Asignatura asignatura ;

        try {
            asignatura = asignaturaService.getAsignaturaById(idAsignatura);
        }catch (Exception e){
            return new ResponseEntity<>(new Asignatura(), HttpStatus.BAD_REQUEST);

        }
        return new ResponseEntity<>(asignatura, HttpStatus.ACCEPTED);

    }
}

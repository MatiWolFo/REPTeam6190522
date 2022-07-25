package com.generationg6.api;

import com.generationg6.models.Juego;
import com.generationg6.models.ScoreUsuario;
import com.generationg6.models.Usuario;
import com.generationg6.services.JuegoService;
import com.generationg6.services.ScoreUsuarioService;
import com.generationg6.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST })
public class ApiJuegoController {

    @Autowired // Inyeccion de dependencias, traer una clase para ser usada internamente
    ScoreUsuarioService scoreUsuarioService;

    @Autowired // Inyeccion de dependencias, traer una clase para ser usada internamente
    JuegoService juegoService;


    @PostMapping("/guardar/score")
    public ResponseEntity<ScoreUsuario> guardarScoreUsuario(@RequestBody ScoreUsuario score) {
        try {
            scoreUsuarioService.guardarScoreUsuario(score);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<ScoreUsuario>(score, HttpStatus.ACCEPTED);

    }

    @RequestMapping("/obtener/juegoById")
    public ResponseEntity<Juego> getJuegoById(Long idJuego) {
        Juego juego ;
        try {
            juego = juegoService.getJuegoById(idJuego);
        }catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(juego, HttpStatus.ACCEPTED);

    }

}

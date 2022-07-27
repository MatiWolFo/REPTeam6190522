package com.generationg6.services;

import com.generationg6.models.Usuario;
import com.generationg6.repositories.UsuarioRepository;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;


@Service
public class UsuarioService {

    /* INYECCION DE DEPENDENCIA A REPOSITORIO */
    @Autowired
    UsuarioRepository usuariosRepository;

    //YA NO SOLO GUARDAMOS USARIO, VALIDAMOS PRIMERO
    /*public void GuardarUsuario(@Valid Usuario usuario) {
        usuarioRepository.save(usuario);
    }*/



    public List<Usuario> findAll() {

        return usuariosRepository.findAll();


    }
    public Usuario buscarId(Long id){

        return usuariosRepository.findById(id).get();//.get() especificamos el tipo de dato

    }

    public void eliminarUsuario(Long id){

        usuariosRepository.deleteById(id);

    }

    public boolean GuardarUsuario(Usuario usuario) {
        boolean error=true;
        /*Proceso de validacion de datos*/
        //1-) Validar si el correo existe en la base de datos
        Usuario existeusuario = usuariosRepository.findByEmail(usuario.getEmail());

        //Si no existe el usuario, lo creamos
        if (existeusuario == null) {
            //2-) Encriptar el password
            String passEncriptado = BCrypt.hashpw(usuario.getPassword(), BCrypt.gensalt());
            //Le seteamos el password ya encriptado
            usuario.setPassword(passEncriptado);
            //Guardamos el usuario
            usuariosRepository.save(usuario);
            //Si no hay error es falso
            error=false;

        } else {
            //Si hay error es verdadero
            error=true;
        }

        //retornamos la variable error con lo que este adentro
        return error;
    }

    public boolean validarUsuario(String email, String password) {
        boolean error = true;
        // verificar el email
        Usuario existeUsuario = usuariosRepository.findByEmail(email);
        if (existeUsuario == null) {//no existe el usuario, error de ingreso
            error = true;
        }else {
            // verificar password contra password base datos desencriptada
            if(BCrypt.checkpw(password, existeUsuario.getPassword())) {
                //password iguales, email y password igual a la base datos
                error= false;
            }else {
                //password distintos, error
                error = true;
            }
        }
        return error;
    }

}
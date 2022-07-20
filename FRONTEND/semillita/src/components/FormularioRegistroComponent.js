import React, {useState, useEffect} from "react";

const initialValues =[
    {
      id:'',
      nombre:'',
      apellido:'',
      edad:'', 
      username: '',
      password:'',
      email: ''
    }
  ]

const FormularioRegistroComponent = () =>
   


<div>
    <main>
      <h3 className="subtitulo">Regístrate. ¿Quién eres?...</h3>
      <section className="cuerpoPagina">
        <div className="wrapper">
          <div className="container1">
            <div className="tabla1 row">
              <div className="columna1 col text-dark ">
                <input type="text" name="nombres" id="nombres" placeholder="Ingrese sus nombres" />
                <p>Nombres</p> 
                <input type="text" name="apellidos" id="apellidos" placeholder="Ingrese sus apellidos" />
                <p>Apellidos</p> 
                <input type="int" name="edad" id="int" placeholder="Ingrese su edad" />
                <p>Edad</p> 
                <input type="email" name="correo" id="correo" placeholder="Ingrese su correo" />
                <p>Correo</p> 
                <input type="text" name="nombreUsuario" id="nombreUsuario" placeholder="Ingrese su nombre de usuario" />
                <p>Nombre de usuario</p> 
                <input type="password" name="clave" id="clave" placeholder="Ingrese su clave" />
                <p>Clave</p> 
                <input type="password" name="reingresoClave" id="reingreoClave" placeholder="Reingrese su clave" />
                <p>Reingrese su clave</p>
                {/*INYECTADO LINK AL BOTON*/}
                <a href="asignaturas.html">
                  <input id="btn1" type="submit" defaultValue="Registrarse" />
                </a>
              </div>
              <div className="columna2 col text-dark">
                <div className="btn-selector">
                  <div className="grupobtn btn-group" role="group" aria-label="Basic example">
                    <button type="button" className="btn btn-secondary" style={{fontSize: 'small'}}>Alumno</button>
                    {/* <button type="button" class="btn btn-secondary"
                                      style="font-size: x-small;">Profesor</button> */}
                    <button type="button" className="btn btn-secondary" style={{fontSize: 'small'}}>Profesor</button>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div></section>
    </main>
    </div>
  
    

export default FormularioRegistroComponent;
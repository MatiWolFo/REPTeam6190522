import React, {useState} from "react";


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

const FormularioRegistroComponent = () =>{
    const [values, setValues] = useState(initialValues);
    const {nombre, apellido, edad, email, username, password}= values;

const handleInputChange=(e)=>{
    
    const changedFormValue ={
      ...values, 
      [e.target.name]:e.target.value

    }
    setValues(changedFormValue)
  }

return(
<div>
    <main>
      <h3 className="subtitulo">Regístrate. ¿Quién eres?...</h3>
      <section className="cuerpoPagina">
        <div className="wrapper">
          <div className="container1">
            <div className="tabla1 row">
              <div className="columna1 col text-dark ">
              <label>Nombres</label> 
                <input 
                type="text" 
                name="nombres" 
                id="nombres" 
                placeholder="Ingrese sus nombres" 
                value={nombre}
                onChange={handleInputChange}
                />
                <label>Apellidos</label>
                <input 
                type="text" 
                name="apellidos" 
                id="apellidos" 
                placeholder="Ingrese sus apellidos"
                value={apellido} 
                onChange={handleInputChange}
                />
                <label>Edad</label>
                <input 
                type="int" 
                name="edad" 
                id="edad" 
                placeholder="Ingrese su edad"
                value={edad}
                onChange={handleInputChange}
                />
                <label>Correo</label> 
                <input 
                type="email"
                name="email" 
                id="email" 
                placeholder="Ingrese su correo"
                value={email} 
                onChange={handleInputChange}
                />
                <label>Nombre de usuario</label> 
                <input 
                type="text" 
                name="nombreUsuario" 
                id="nombreUsuario" 
                placeholder="Ingrese su nombre de usuario"
                value={username} 
                onChange={handleInputChange}
                />
                <label>Clave</label>  
                <input 
                type="password" 
                name="clave" 
                id="clave" 
                placeholder="Ingrese su clave"
                value={password} 
                onChange={handleInputChange}
                />
                <label>Reingrese su clave</label> 
                <input 
                type="password" 
                name="reingresoClave" 
                id="reingreoClave" 
                placeholder="Reingrese su clave"
                onChange={handleInputChange}
                />
                
                {/*INYECTADO LINK AL BOTON*/}
                <a href="asignaturas.html">
                  <input id="btn1" type="submit" defaultValue="Registrarse"/>
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
                <div className ="imagen_registro"></div>
                <div className = "texto_login">
                  <label>Si ya tienes cuenta haz click <a href = "/login" >aqui!</a></label>
                </div>
                </div>
            </div>
          </div>
        </div></section>
    </main>
    </div>

)};

export default FormularioRegistroComponent;
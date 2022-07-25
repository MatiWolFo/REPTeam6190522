import React, {useState} from "react";
import {saveUsuario, getAll} from "../services/RegistroService"


const initialValues =[
    {
      id:'',
      nombre:'',
      apellido:'',
      edad:'', 
      username: '',
      password:'',
      email: '',
      roles: {
        id: ''
      }
    }
  ]

const FormularioRegistroComponent = () =>{
    const [values, setValues] = useState(initialValues);
    const {nombre, apellido, edad, email, username, password,roles}= values;



const [registrado, setRegistrado] = useState(false);


const handleInputChange=(e)=>{
    if(e.target.name === "roles"){    
      const changedFormValue ={
        ...values, 
            [e.target.name]: {"id" :e.target.value}
      
      }
      setValues(changedFormValue)
    }else{
      const changedFormValue ={
        ...values, 
        [e.target.name]:e.target.value
      }
      setValues(changedFormValue)
    }
    
  }


  const guardarUser = async(usuario)=>{
    await saveUsuario(usuario)
    setValues(await getAll())
    }

const handleSubmit = (e) =>{
  e.preventDefault();
  console.log(values)
  guardarUser(values);
  setRegistrado(true)
  
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
                <form onSubmit={handleSubmit}>
                  {registrado ? <div className="registro_excito">Gracias por registrarte!</div>: null}
                <label>Nombres</label> 
                  <input 
                  type="text" 
                  name="nombre" 
                  id="nombre" 
                  placeholder="Ingrese sus nombres" 
                  value={nombre}
                  onChange={handleInputChange}
                  />
                  <label>Apellidos</label>
                  <input 
                  type="text" 
                  name="apellido" 
                  id="apellido" 
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
                  name="username" 
                  id="username" 
                  placeholder="Ingrese su nombre de usuario"
                  value={username} 
                  onChange={handleInputChange}
                  />
                  <label>Clave</label>  
                  <input 
                  type="password" 
                  name="password" 
                  id="password" 
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
                  <label>ID ROL (1 a 3)</label> 
                  <input 
                  type="numeric" 
                  name="roles" 
                  id="roles" 
                  value={roles} 
                  placeholder="Id rol"
                  onChange={handleInputChange}
                  />
                  <input id="btn1" type="submit" defaultValue="Registrarse" />
                  </form>
                </div>
                <div className="columna2 col text-dark">
                  
                  <div className="btn-selector">
                    <div className="grupobtn btn-group" role="group" aria-label="Basic example">
                      <button type="radio" name = "rol_id" value = {1} className="btn btn-secondary" style={{fontSize: 'small'}}>Alumno</button>
                      {/* <button type="button" class="btn btn-secondary"
                                        style="font-size: x-small;">Profesor</button> */}
                      <button type="radio" name = "rol_id" value = {3} className="btn btn-secondary" style={{fontSize: 'small'}}>Profesor</button>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div></section>
      </main>
      </div>
  
  )};
  
  export default FormularioRegistroComponent;
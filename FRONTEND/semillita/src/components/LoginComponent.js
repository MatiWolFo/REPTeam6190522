import React, {useState} from "react";
import { Link } from 'react-router-dom';
import axios from "axios";



const LoginComponent = () =>{


  const [username, setUsername] = useState("");
  const [password, setPassword] = useState("");

  const[statusLogin, setStatusLogin] = useState("")


  const onSubmit = () => {
      axios.post('http://localhost:3000/login',{
      username: username,
      password: password
    }).then((response) => {
     if(response.data.message){
      setStatusLogin(response.data.message) 
     }else{ setStatusLogin(response.data[0].username)
     }
     
    });
  }
  return(
  <div className="container" align="center">
    <div className="row justify-content-center ">
      <div className="pared">
        <div className="formulario">
          <form action="">
            <div className="form-group text-center pt-3">
              <h3 className="text-light">INICIAR SESIÓN</h3>
            </div>
            <div className="form-group mx-sm-4 pt-3">
              <input
                type="text"
                className="form-control"
                placeholder="Ingrese su Usuario"
                onChange ={(e) =>{setUsername(e.target.value)}}
                value={username}
                name="username" 
                id="username" 
              />
            </div>
            <div className="form-group mx-sm-4 pb-3">
              <input
                type="password"
                className="form-control"
                placeholder="Ingrese su Contraseña"
                onChange ={(e) =>{setPassword(e.target.value)}}
                value={password}
                name="password" 
                id="password" 
              />
            </div>
            {/*CHECAR ESTE LINK DE RE DIRECCION*/}
            <br />
            <br />
            <div className="form-group mx-sm-4 pb-2">
              <span>
              <input className="olvide1" type="submit" defaultValue="INGRESAR" onClick={onSubmit}/>
              </span>
              {/*<input type="submit" class="btn btn-block ingresar" value="INGRESAR">*/}
            </div>
            <br />
            <br />
            {/* <div class="form-group mx-sm-4 text-right">
                              <span class=""><a href="#" class="olvide">Olvide mi contraseña?</a></span>
                          </div>*/}
            <div className="form-group text-center">
              <span>
                <Link to="/registro" className="olvide1">
                  REGISTRARSE
                </Link>
              </span>
              <h1>{onSubmit}</h1>
            </div>
            <br />
            <br />
          </form>
        </div>
      </div>
    </div>
  </div>
  )};

  
export default LoginComponent;
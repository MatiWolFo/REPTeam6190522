import React from "react";

const LoginComponent = () =>

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
            />
          </div>
          <div className="form-group mx-sm-4 pb-3">
            <input
              type="password"
              className="form-control"
              placeholder="Ingrese su Contraseña"
            />
          </div>
          {/*CHECAR ESTE LINK DE RE DIRECCION*/}
          <br />
          <br />
          <div className="form-group mx-sm-4 pb-2">
            <span>
              <a href="asignaturas.html" className="olvide1">
                INGRESAR
              </a>
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
              <a href="registro.html" className="olvide1">
                REGISTRARSE
              </a>
            </span>
          </div>
          <br />
          <br />
        </form>
      </div>
    </div>
  </div>
</div>



export default LoginComponent;
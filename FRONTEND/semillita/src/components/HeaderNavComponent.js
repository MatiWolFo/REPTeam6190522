import React from "react";
import semillon_logo from "../imagenes/semillita_logo.png";
import a from "../imagenes/A.png"
import semilli from "../imagenes/Semilli.png"
import semilla_t from "../imagenes/Semilla.png"

const HeaderNavComponent = () =>

<header>
    {/*banner?*/}
    <div className="nompag">
    <a className="aimg" href="../index.html">
        <img className="img" src={semillon_logo} alt="tamago" />
    </a>
    <div className="kd">
        <img className="b" src={semilli} alt="semilli" />
        <img className="c" src={semilla_t} alt="semilla" />
        <img className="a" src={a} alt="a" />
    </div>
    </div>
    {/*navbar*/}
    <nav className="navv">
    <ul className="nav justify-content-center">
        <li className="nav-item">
        <a className="nav-link " aria-current="page" href="../index.html">
            Inicio
        </a>
        </li>
        <li className="nav-item">
        <a className="nav-link" href="Nosotros.html">
            {" "}
            ¿Quienes somos?
        </a>
        </li>
        <li className="nav-item">
        <a className="nav-link" href="contacto.html">
            Contacto
        </a>
        </li>
        <li className="nav-item">
        <a className="nav-link" href="registro.html">
            Registro
        </a>
        </li>
        <li className="nav-item">
        <a className="nav-link active" href="iniciarSesion.html">
            Iniciar Sesión
        </a>
        </li>
    </ul>
    </nav>
</header>

export default HeaderNavComponent;
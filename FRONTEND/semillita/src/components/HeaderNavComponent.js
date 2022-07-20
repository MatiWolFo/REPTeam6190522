import React from "react";
import semillon_logo from "../imagenes/semillita_logo.png";
import a from "../imagenes/A.png"
import semilli from "../imagenes/Semilli.png"
import semilla_t from "../imagenes/Semilla.png"
import { Link } from 'react-router-dom'
const HeaderNavComponent = () =>

<header>
    {/*banner?*/}
    <div className="nompag">
    <Link className="aimg" to="">
        <img className="img" width={100} src={semillon_logo} alt="tamago" />
    </Link>
    <div className="centrar-imagen">
    <div className="kd">
        <img className="b" src={semilli} alt="semilli" />
        <img className="c" src={semilla_t} alt="semilla" />
        <img className="a" src={a} alt="a" />
    </div>
    </div>
   
    </div>
    {/*navbar*/}
    <nav className="navv">
    <ul className="nav justify-content-center">
        <li className="nav-item">
        <Link className="nav-link " aria-current="page" to="">
            Inicio
        </Link>
        </li>
        <li className="nav-item">
        <Link className="nav-link" to="nosotros">
            ¿Quienes somos?
        </Link>
        </li>
        <li className="nav-item">
        <Link className="nav-link" to="contacto">
            Contacto
        </Link>
        </li>
        <li className="nav-item">
        <Link className="nav-link" to="registro">
            Registro
        </Link>
        </li>
        <li className="nav-item">
        <Link className="nav-link active" to="login">
            Iniciar Sesión
        </Link>
        </li>
    </ul>
    </nav>
</header>

export default HeaderNavComponent;
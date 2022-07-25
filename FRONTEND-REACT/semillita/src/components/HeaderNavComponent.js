import React from "react";
import semillon_logo from "../imagenes/semillita_logo.png";
import semilli from "../imagenes/Semilli.png"
import { Link } from 'react-router-dom'

const HeaderNavComponent = () =>

    <header>
        {/*banner?*/}
        <div className="nompag">
            <Link className="aimg" to="">
                <img className="img" src={semillon_logo} alt="Semillita" />
            </Link>
            <div className="centrar-imagen">
                <img className="semillita" src={semilli} alt="semilli" />

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
import React from "react";
import { Link } from 'react-router-dom'

function AsignaturaComponent() {
    return (
        <main>
            <div className="container">
                <div className="contenidos"></div>
                <div className="h4center">
                    <h4 className="nivel1 justify-content-center">ASIGNATURA: HTML5</h4>
                    <h5 className="descCont">Explora el comienzo del mundo de programar.</h5>
                </div>
                <Link className="hyperlinksub" to="/modulo">
                    <div className="boxContC container">
                        <div className="boxCont1 container">
                            <h6 className="nivelFont">Hola Semillita</h6>
                        </div>
                    </div>
                </Link>
                <div>
                    <div className="h5center">
                        <h4 className="nivel3 justify-content-center">VUELVE MÁS TARDE</h4>
                    </div>
                </div>
                <div className="box3 container">
                    <div className="boxSoon container">
                    <h5 id="proximamente">Plantando</h5>
                    </div>
                </div>
            </div>
        </main>
    )
}

export default AsignaturaComponent;







import React from "react";
import { Link } from 'react-router-dom'

function ModuloComponent() {
    return (
        <main>
            <div className="container">
                <div className="contenidos">
                    <h4 className="subtitulo">MÓDULOS HTML</h4>
                </div>
                <div className="h4center">
                    <h4 className="nivel1 justify-content-center">
                        Semillita - Primeros pasos
                    </h4>

                </div>
                <Link className="hyperlinksub" to="/etapa">
                    <div className="boxContC container">
                        <div className="boxCont1 container">
                            <h6 className="nivelFont">HTML básico 1</h6>
                        </div>
                    </div>
                </Link>
                <div>
                    <div className="h5center">
                        <h5 className="descCont">
                            A medida que avances, nuevos módulos se agregarán a tu ruta.
                        </h5>
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

export default ModuloComponent;
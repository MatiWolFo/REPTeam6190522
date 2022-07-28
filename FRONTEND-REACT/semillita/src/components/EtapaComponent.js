import React from "react";
import { Link } from 'react-router-dom'

function EtapaComponent() {
    return (
        <main>
            <div className="container">
                <div className="contenidos">
                    <h4 className="subtitulo">
                        1. HTML: Tus primeros pasos - <br/>ATRAPA LOS "TAGS HTML".
                    </h4>
                </div>
                <div class="h4center justify-content-center">
                    <h5 class="descCont">¡Intenta atrapar las etiquetas que caen desde el cielo!</h5>
                </div>
                <Link className="hyperlinksub" to="/video">
                    <div className="box1 container">
                        <div className="boxNivel container">
                            <h6 className="nivelFont">Semillita</h6>
                        </div>
                    </div>
                </Link>
                <div>
                    <div className="h4center">
                        <h4 className="nivel2 justify-content-center">ARRASTRA Y SUELTA</h4>
                        <h5 className="descCont">
                            ¿Correcto o incorrecto? Arrastra y suelta las opciones según lo que
                            has aprendido.
                        </h5>
                    </div>
                </div>
                <Link className="hyperlinksub" to="/">
                    <div className="box2 container">
                        <div className="boxNivel container">
                            <h6 className="nivelFont">NIVEL 2</h6>
                        </div>
                    </div>
                </Link>
                <div>
                    <div className="h5center">
                        <h4 className="nivel3 justify-content-center">MÁS NIVELES POR VENIR</h4>
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

export default EtapaComponent;
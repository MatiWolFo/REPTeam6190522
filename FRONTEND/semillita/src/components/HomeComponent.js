import React from "react";
import semgif from "../imagenes/Semillitacre.gif"

function HomeComponent() {

    return (
        <>
            <main>
                <div className="semitxt">
                    <h2>"LA SEMILLITA DE HOY,<br />ES EL ÁRBOL DEL MAÑANA"</h2>
                    <div className="semi">
                        <img className="semicreci" src={semgif} alt="semillitacrece" />
                        <h4>FLORECIMIENTO HACIA EL FUTURO</h4>
                        <div className="semicont">
                            <p>Porque las semillitas de hoy, serán los grandes árboles del mañana; Semillita nace para darle a los más pequeños de la vida un apoyo para que puedan iniciar su integración al mundo TI (Tecnología de Información). Descubre mediante la interacción con distintos juegos y ambientes, como los pequeños comienzan a plantar, regar y cultivar la semillita de la programación.</p>
                        </div>
                        <h4>ACOMPAÑA A TU SEMILLITA EN SU CAMINO</h4>
                        <div className="semicont">
                            <p>Como madre, padre o tutor, tener la posibilidad de monitorear el progreso y las actividades que realiza tu semillita es vital. Crea tu cuenta  "Tutor" para acompañar a los pequeños.  </p>
                        </div>
                        <h4>VELA POR TU SEMILLITA EN SU VIDA ESCOLAR</h4>
                        <div className="semicont">
                            <p> Con los contenidos educativos sobre tecnología evolucionando y cambiando frecuentemente, los centros educativos tienen la posibilidad de implementar el servicio en las salas de clase. Gracias a este apoyo para las asignaturas en tecnología, siempre podrán ejercitar y cuidar constantemente de la semillita que están plantando. </p>
                        </div>
                    </div>
                </div>
                <div class="container" align="center">
                    <div class="video">
                        <blockquote class="embedly-card"><h4><link href="https://www.youtube.com/watch?v=y8C361oai0w"></link></h4><p></p></blockquote>
                    </div>
                </div>



            </main>


        </>

    )
}

export default HomeComponent
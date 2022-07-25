import React from "react";
import semgif from "../imagenes/Semillitacre.gif"

function HomeComponent() {
  
    return(
        <>
            
            <main>
                <div className="semitxt">
                <h2>LA SEMILLITA DE HOY, ES EL ÁRBOL DEL MAÑANA</h2>
                <div className="semi">
<img className="semicreci" src={semgif} alt="semillitacrece" />

                    <h4>Florecimiento hacia el futuro</h4>
<p>Porque las semillitas de hoy, serán los grandes árboles del mañana; Semillita nace para darle a los más pequeños de la vida un apoyo para que puedan iniciar su integración al mundo TI (Tecnología de Información). Descubre mediante la interacción con distintos juegos y ambientes, como los pequeños comienzan a plantar, regar y cultivar la semillita de la programación.</p>

<h4>Acompaña a tu semillita en su camino</h4>
 <p>Como madre, padre o tutor, tener la posibilidad de monitorear el progreso y las actividades que realiza tu semillita es vital. Crea tu cuenta  "Tutor" para acompañar a los pequeños.  </p>

<h4>Vela por tu semillita en su ambiente escolar</h4>
<p> Con los contenidos educativos sobre tecnología evolucionando y cambiando frecuentemente, los centros educativos tienen la posibilidad de implementar el servicio en las salas de clase. Gracias a este apoyo para las asignaturas en tecnología, siempre podrán ejercitar y cuidar constantemente de la semillita que están plantando. </p>
</div>
</div>
        <div class="container" align="center">
            <div class="video">
                <blockquote class="embedly-card"><h4><a href="https://www.youtube.com/watch?v=y8C361oai0w"></a></h4><p></p></blockquote>
            </div>
        </div>

        

    </main>
            
        
        </>
        
    )
}

export default HomeComponent
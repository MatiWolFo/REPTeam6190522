import React from "react";
import MAR from "../imagenes/MAR.png"
import MIR from "../imagenes/MIR.png"
import PR from "../imagenes/PR.png"
import AV from "../imagenes/AV.png"

const NosotrosComponent = () =>

<div>
  <h3 className="subtitulo">¿Quienes somos?</h3>
  
  <section className="testi">
    <div className="MDP">
      <div className="MiR">
        <h2 className="subNombre">ID_MiR</h2>
        <img className="ID" src={MIR} alt="MIR" />
        <p>
          “Me inspira el proyecto porque en el futuro <br /> me gustaría que en
          Chile se enseñara programación <br />
          como parte curriculum en todos los colegios.”
          <br />
          <br />
          <span className="name">-Michael Roldan.</span>
        </p>
      </div>
      <div className="PR">
        <h2 className="subNombre">ID_PR</h2>
        <img className="ID" src={PR} alt="PR" />
        <p>
          “Me inspira el proyecto porque le damos la oportunidad
          <br /> a los niños de aprender ... de manera didáctica.”
          <br />
          <br />
          <span className="name">-Paulino Rubio.</span>
        </p>
      </div>
    </div>
    <div className="AM">
      <div className="AV">
        <h2 className="subNombre">ID_AV</h2>
        <img className="ID" src={AV} alt="AV" />
        <p>
          "Si mediante la pagina que estamos creando puedo enseñar
          <br /> a pequeñas Alondritas a programar no lo voy a pensar
          <br /> dos veces y voy a dar todo lo que pueda para hacerlo realidad "
          <br />
          <br />
          <span className="name">-Alondra Valenzuela.</span>
        </p>
      </div>
      <div className="MaR">
        <h2 className="subNombre">ID_MaR</h2>
        <img className="ID" src={MAR} alt="MAR" />
        <p>
          “La posibilidad de unir elementos del pasado <br /> con elementos del
          presente y el futuro, dando
          <br /> a nuevas generaciones una pizca de historia mientras juegan.”
          <br />
          <br />
          <span className="name">-Matias Rebolledo.</span>
        </p>
      </div>
    </div>
  </section>
</div>

export default NosotrosComponent;
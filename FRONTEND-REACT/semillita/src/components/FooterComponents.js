import React from "react";
import ImagenFB from "../imagenes/fb.png";
import ImagenTW from "../imagenes/tw.png";
import ImagenGN from "../imagenes/generation.png";
import ImagenIG from "../imagenes/ig.png";


const FooterComponent = () => 

<footer>
  <img className="GN" src={ImagenGN} alt="generation" />
  <div className="RS">
    <a href="https://www.instagram.com">
    <img className="img-ig" src={ImagenIG} alt="ig" />
    </a>
    <a href="https://www.Facebook.com">
    <img className="img-fb" src={ImagenFB} alt="fb" />
    </a>
    <a href="https://twitter.com">
    <img className="img-tw " src={ImagenTW} alt="tw" />
    </a>
  </div>
</footer>



export default FooterComponent;
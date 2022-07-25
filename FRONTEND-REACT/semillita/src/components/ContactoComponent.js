import React from "react";

const ContactoComponent = () =>

<div className="prueba">
<section className="contacto">
  <h3 className="subtitulo">Envíanos tu mensaje</h3>
  <br />
  <div className="correo" id="form1" align="center">
    <form
      action="”mailto:contact@yourdomain.com”"
      method="”POST”"
      encType="”multipart/form-data”"
      name="”EmailForm”"
    >
      <span>Nombre:</span>
      <br />
      <br />
      <input type="”text”" size="”19″" name="”ContactName”" placeholder="Ingresa tu nombre"/>
      <br />
      <br />
      <span>Correo:</span>
      <br />
      <br />
      <input type="”text”" size="”19″" name="”ContactName”" placeholder="correo@correo.com"/>
      <br />
      <br />
      <span>Mensaje:</span>
      <br />
      <br />
      <textarea
        name="”ContactCommentt”"
        rows="”6″"
        cols="”20″"
        defaultValue={""}
        placeholder="Escribe tu mensaje..."
      />
      <br />
      <br />
      {/*CHECAR PROBLEMA NO RE DIRECCIONA*/}
      <button type="submit" value="Submit" id="send">
        Enviar
      </button>
    </form>
  </div>
</section>
</div>
export default ContactoComponent;
DROP DATABASE IF EXISTS BBDDNinosDEMO;

CREATE DATABASE BBDDNinosDEMO;

USE BBDDNinosDEMO;

/*CREATE TABLE  UsuarioAsignatura(
id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
id_asignatura int,
id_usuario int

);*/

CREATE TABLE  EtapaJuego(
id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
id_etapas int,
id_juego int

);


CREATE TABLE  roles(
id_roles int PRIMARY KEY NOT NULL AUTO_INCREMENT,
nombre_rol varchar(30),
descripcion varchar(50)
);

CREATE TABLE modulos(
id_modulo int PRIMARY KEY NOT NULL AUTO_INCREMENT,
nombre_modulo varchar(50),
descripcion varchar(50),
id_contenido int
);

CREATE TABLE etapas(
id_etapas int PRIMARY KEY NOT NULL AUTO_INCREMENT,
nombre_etapa varchar(50),
descripcion varchar(50),
id_contenido int,
id_pregunta_etapa int,
id_usuario int
);

CREATE TABLE asignaturas(
id_asignatura int PRIMARY KEY NOT NULL AUTO_INCREMENT,
nombre_asignatura varchar(50),
id_modulo int,
id_usuario int
);

CREATE TABLE contenidos(
id_contenido int PRIMARY KEY NOT NULL AUTO_INCREMENT,
nombre_contenido varchar(50),
descripcion varchar(50),
id_modulo int
);

CREATE TABLE preguntas_etapa(
id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
descripcion varchar(50),
id_respuesta_etapa int,
id_validacion int
);

CREATE TABLE preguntas_juego(
id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
descripcion varchar(50),
id_respuesta_juego int,
id_validacion int
);


CREATE TABLE respuestas_etapa(
id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
descripcion varchar(50),
validacion int
);


CREATE TABLE respuestas_juego(
id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
descripcion varchar(50),
validacion int
);


CREATE TABLE juegos(
id_juegos int PRIMARY KEY NOT NULL AUTO_INCREMENT,
nombre varchar(50),
descripcion varchar(50),
id_pregunta_juego int
);

CREATE TABLE  usuarios(
id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
nombre varchar(30),
apellido varchar(30),
correo varchar(30),
password varchar(30),
nombre_usuario varchar(30),
edad int,
rut varchar(30),
id_roles int
);

CREATE TABLE validacion(
id_validacion int PRIMARY KEY NOT NULL,
descripcion varchar (20)
);

CREATE TABLE validacion2(
id_validacion int PRIMARY KEY NOT NULL,
descripcion varchar (20)
);

CREATE TABLE  EtapaUsuario(
id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
id_etapas int,
id_usuario int

);

/*CREATE TABLE  JuegoUsuario(
id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
id_juego int,
id_usuario int

);




/*CREACION DE LLAVES FORANEAS Y RELACIONES*/

/*RELACION ENTRE TABLA USUARIOS CON TABLA ROLES*/
ALTER TABLE usuarios ADD CONSTRAINT FK_rolID FOREIGN KEY (id_roles) REFERENCES roles(id_roles);

/*RELACION ENTRE TABLA ETAPAS CON TABLA CONTENIDOS*/
ALTER TABLE etapas ADD CONSTRAINT FK_contenido2ID FOREIGN KEY (id_contenido) REFERENCES contenidos(id_contenido);

/*RELACION ENTRE TABLA etapas CON TABLA preguntas de etapa*/
ALTER TABLE etapas ADD CONSTRAINT FK_preguntaetapaID FOREIGN KEY (id_pregunta_etapa) REFERENCES preguntas_etapa(id);

/*RELACION ENTRE TABLA preguntas de etapa CON TABLA de respuestas de etapa*/
ALTER TABLE preguntas_etapa ADD CONSTRAINT FK_respuestaetapaID FOREIGN KEY (id_respuesta_etapa) REFERENCES respuestas_etapa(id);

/*RELACION ENTRE TABLA etapas CON TABLA juegos*/
ALTER TABLE juegos ADD CONSTRAINT FK_preguntajuegoID FOREIGN KEY (id_pregunta_juego) REFERENCES preguntas_juego(id);

/*RELACION ENTRE TABLA juegos CON TABLA pregunta_juego*/
ALTER TABLE preguntas_juego ADD CONSTRAINT FK_respuestajuegoID FOREIGN KEY (id_respuesta_juego) REFERENCES respuestas_juego(id);

/*RELACION ENTRE TABLA asignatura CON TABLA modulos*/
ALTER TABLE asignaturas ADD CONSTRAINT FK_moduloID FOREIGN KEY (id_modulo) REFERENCES modulos(id_modulo);

/*RELACION ENTRE TABLA modulos CON TABLA contenidos*/
ALTER TABLE modulos ADD CONSTRAINT FK_contenidoID FOREIGN KEY (id_contenido) REFERENCES contenidos(id_contenido);

/*TABLA DE RELACIONES asignaturas CON usuarios*/
ALTER TABLE EtapaUsuario ADD CONSTRAINT FK_usuarioID FOREIGN KEY (id_usuario) REFERENCES usuarios(id);
ALTER TABLE EtapaUsuario ADD CONSTRAINT FK_etapaID FOREIGN KEY (id_etapas) REFERENCES etapas(id_etapas);

/*TABLA DE RELACIONES etapas CON juegos*/

ALTER TABLE EtapaJuego ADD CONSTRAINT FK_EtapaID FOREIGN KEY (id_etapas) REFERENCES etapas(id_etapas);
ALTER TABLE EtapaJuego ADD CONSTRAINT FK_JuegoID FOREIGN KEY (id_juego) REFERENCES juegos(id_juegos);

/*TABLA DE RELACIONES preguntas de juego y etapa CON SUS RESPECTIVAS validaciones*/
ALTER TABLE preguntas_juego ADD CONSTRAINT FK_ValidacionID FOREIGN KEY (id_validacion) REFERENCES validacion(id_validacion);
ALTER TABLE preguntas_etapa ADD CONSTRAINT FK_Validacion2ID FOREIGN KEY (id_validacion) REFERENCES validacion2(id_validacion);








/*COMENTARIOS

//TABLA DE PRUEBAS TODAVIA NO CREADA PORQUE NO SE SI ES REALMENTE NECESARIA, CONSULTAR CON GRUPO

//PREGUNTAR SOBRE RELACION ENTRE USUARIO Y ASIGNATURAS, ES MUCHO A MUCHO?

//PREGUNTAR SOBRE RELACION JUEGOS A PREGUNTAS, OTRA TABLA ES NECESARIA?
*/



/*DATOS DE INGRESO SOLO PARA PROBAR TABLAS*/


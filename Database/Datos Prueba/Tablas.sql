/*BORRA LA DATABASE SI ES QUE EXISTE*/
drop database if exists generationG6kidsdnd;

/*CREA LA DATABASE*/
create database generationG6kidsdnd;

/*LA SELECCIONA PARA USARLA*/
use generationG6kidsdnd;

/*CREACION DE TABLAS CON SUS ATRIBUTOS*/
CREATE TABLE rolesUsuarios(
id_rol_usuario int PRIMARY KEY NOT NULL AUTO_INCREMENT,
nombre_rol varchar(30),
descripcion_rol varchar(100)
);

CREATE TABLE modulos(
id_modulo int PRIMARY KEY NOT NULL AUTO_INCREMENT,
nombre_modulo varchar(50),
descripcion_modulo varchar(100),
id_asignatura int
);

CREATE TABLE etapas(
id_etapa int PRIMARY KEY NOT NULL AUTO_INCREMENT,
nombre_etapa varchar(50),
descripcion_etapa varchar(100),
id_contenido int,
id_validacion_respuesta_etapa int
);

CREATE TABLE asignaturas(
id_asignatura int PRIMARY KEY NOT NULL AUTO_INCREMENT,
nombre_asignatura varchar(50),
descripcion_asignatura varchar(100)
);

CREATE TABLE contenidos(
id_contenido int PRIMARY KEY NOT NULL AUTO_INCREMENT,
nombre_contenido varchar(50),
descripcion_contenido varchar(100),
id_modulo int
);

CREATE TABLE preguntasEtapas(
id_pregunta_etapa int PRIMARY KEY NOT NULL AUTO_INCREMENT,
nombre_pregunta_etapa varchar(50),
descripcion_pregunta_etapa varchar(100)
);

CREATE TABLE preguntasJuegos(
id_pregunta_juego int PRIMARY KEY NOT NULL AUTO_INCREMENT,
nombre_pregunta_juego varchar(50),
descripcion_pregunta_juego varchar(100)
);

CREATE TABLE respuestasEtapas(
id_respuesta_etapa int PRIMARY KEY NOT NULL AUTO_INCREMENT,
descripcion_respuesta_etapa varchar(100)
);

CREATE TABLE respuestasJuegos(
id_respuesta_juego int PRIMARY KEY NOT NULL AUTO_INCREMENT,
descripcion_respuesta_juego varchar(100)
);

CREATE TABLE juegosDnD(
id_juego_DnD int PRIMARY KEY NOT NULL AUTO_INCREMENT,
nombre_juego varchar(50),
descripcion_juego varchar(100),
id_validacion_respuesta_juego int
);

CREATE TABLE usuarios(
id_usuario int PRIMARY KEY NOT NULL AUTO_INCREMENT,
nombre varchar(30),
apellido varchar(30),
edad int,
rut varchar(30),
email varchar(30),
username varchar(30),
password varchar(30),
id_rol_usuario int
);

/*CREACION DE TABLAS DE VALIDACION PARA COMPROBAR RESPUESTAS*/
CREATE TABLE validacionRespuestasJuegos(
id_validacion_respuesta_juego int PRIMARY KEY NOT NULL,
respuesta_verdadera_falsa_juego boolean,
id_pregunta_juego int,
id_respuesta_juego int
);

CREATE TABLE validacionRespuestasEtapas(
id_validacion_respuesta_etapa int PRIMARY KEY NOT NULL,
respuesta_verdadera_falsa_etapa boolean,
id_pregunta_etapa int,
id_respuesta_etapa int
);

/*CREACION DE INTERTABLES RELACIONALES*/
CREATE TABLE itEtapaUsuario(
id_it_etapa_usuario int PRIMARY KEY NOT NULL AUTO_INCREMENT,
id_etapa int,
id_usuario int
);

CREATE TABLE itEtapaJuego(
id_it_etapa_juego int PRIMARY KEY NOT NULL AUTO_INCREMENT,
id_etapa int,
id_juego_DnD int
);


/*CREACION DE LLAVES FORANEAS Y RELACIONES*/
/*RELACION ENTRE TABLA USUARIOS CON TABLA ROLES*/
ALTER TABLE usuarios ADD CONSTRAINT FK_rol1ID FOREIGN KEY (id_rol_usuario) REFERENCES rolesUsuarios(id_rol_usuario);
/*RELACION ENTRE TABLA ETAPAS CON TABLA CONTENIDOS*/
ALTER TABLE etapas ADD CONSTRAINT FK_contenido1ID FOREIGN KEY (id_contenido) REFERENCES contenidos(id_contenido);
/*RELACION ENTRE TABLA etapas CON TABLA preguntas de etapa*/
ALTER TABLE etapas ADD CONSTRAINT FK_validacionEtapa1ID FOREIGN KEY (id_validacion_respuesta_etapa) REFERENCES validacionRespuestasEtapas(id_validacion_respuesta_etapa);
/*RELACION ENTRE TABLA contenidos CON TABLA modulos*/
ALTER TABLE contenidos ADD CONSTRAINT FK_modulo1ID FOREIGN KEY (id_modulo) REFERENCES modulos(id_modulo);
/*RELACION ENTRE TABLA preguntas de etapa CON TABLA de respuestas de etapa, COMENTADA POR mati.
ALTER TABLE preguntasEtapas ADD CONSTRAINT FK_respuestaetapaID FOREIGN KEY (id_respuesta_etapa) REFERENCES respuestasEtapas(id_respuesta_etapa);*/
/*RELACION ENTRE TABLA etapas CON TABLA juegos*/
ALTER TABLE juegosDnD ADD CONSTRAINT FK_validacionJuego1ID FOREIGN KEY (id_validacion_respuesta_juego) REFERENCES validacionRespuestasJuegos(id_validacion_respuesta_juego);
/*RELACION ENTRE TABLA juegos CON TABLA pregunta_juego, COMENTADA POR mati.
ALTER TABLE preguntasJuegos ADD CONSTRAINT FK_respuestajuegoID FOREIGN KEY (id_respuesta_juego) REFERENCES respuestasJuegos(id_respuesta_juego);*/
/*RELACION ENTRE TABLA asignatura CON TABLA modulos*/
ALTER TABLE modulos ADD CONSTRAINT FK_asignatura1ID FOREIGN KEY (id_asignatura) REFERENCES asignaturas(id_asignatura);
/*RELACION ENTRE TABLA VALIDACIONES DE JUEGOS CON SUS PREGUNTAS Y RESPUESTAS*/
/*CON ESTA SECUENCIA, NO IMPORTA CUANTOS INPUTS TENGA HACIA VALIDACION, SOLO UNA COMBINACION SERA CORRECTA PARA COMPLETAR EL JUEGO, mati.*/
ALTER TABLE validacionRespuestasJuegos ADD CONSTRAINT FK_preguntaJuego1ID FOREIGN KEY (id_pregunta_juego) REFERENCES preguntasJuegos(id_pregunta_juego);
ALTER TABLE validacionRespuestasJuegos ADD CONSTRAINT FK_respuestaJuego1ID FOREIGN KEY (id_respuesta_juego) REFERENCES respuestasJuegos(id_respuesta_juego);
/*RELACION ENTRE TABLA VALIDACIONES DE ETAPAS CON SUS PREGUNTAS Y RESPUESTAS*/
/*CON ESTA SECUENCIA, NO IMPORTA CUANTOS INPUTS TENGA HACIA VALIDACION, SOLO UNA COMBINACION SERA CORRECTA PARA TERMINAR LA ETAPA, mati.*/
ALTER TABLE validacionRespuestasEtapas ADD CONSTRAINT FK_preguntaEtapa1ID FOREIGN KEY (id_pregunta_etapa) REFERENCES preguntasEtapas(id_pregunta_etapa);
ALTER TABLE validacionRespuestasEtapas ADD CONSTRAINT FK_respuestaEtapa1ID FOREIGN KEY (id_respuesta_etapa) REFERENCES respuestasEtapas(id_respuesta_etapa);
/*INTERTABLE DE RELACIONES asignaturas CON usuarios*/
ALTER TABLE itEtapaUsuario ADD CONSTRAINT FK_usuario1ID FOREIGN KEY (id_usuario) REFERENCES usuarios(id_usuario);
ALTER TABLE itEtapaUsuario ADD CONSTRAINT FK_etapa1ID FOREIGN KEY (id_etapa) REFERENCES etapas(id_etapa);
/*INTERTABLE DE RELACIONES etapas CON juegos*/
ALTER TABLE itEtapaJuego ADD CONSTRAINT FK_etapa2ID FOREIGN KEY (id_etapa) REFERENCES etapas(id_etapa);
ALTER TABLE itEtapaJuego ADD CONSTRAINT FK_Juego1ID FOREIGN KEY (id_juego_DnD) REFERENCES juegosDnD(id_juego_DnD);


use generationg6kidsdnd;

insert into asignaturas(nombre, descripcion, fecha_creacion, fecha_edicion) values
('HTML','Hello World',NOW(),NULL),/*now() te entrega la fecha actual*/
('CSS','Colorea tu mundo',NOW(),NULL),
('JAVASCRIPT','Y si... de lo contrario...',NOW(),NULL),
('BOOTSTRAP','Anima, animate',NOW(),NULL);

insert into modulos(id_asignatura, nombre, descripcion, fecha_creacion, fecha_edicion) values
(1,'HTML INTRO','Veamos lo basico de un DOCTYPE',NOW(),NULL),
(1,'HTML PARTES','Semantica del HTML',NOW(),NULL);

insert into contenidos(id_modulo, nombre, descripcion, fecha_creacion, fecha_edicion) values
(1,'HTML TITULOS','Que es un titulo <h1> a <h6>',NOW(),NULL),
(1,'HTML PARRAFOS','Que es un parrafo <p>',NOW(),NULL),
(1,'HTML SALTA LAS LINEAS','Que es un <b>',NOW(),NULL),
(1,'HTML DIBUJA LAS LINEAS','Que es un parrafo <p>',NOW(),NULL);

insert into etapas(id_contenido, nombre, descripcion, fecha_creacion, fecha_edicion) values
(1,'TEXTO PRUEBA 1','Descripcion texto prueba 1',NOW(),NULL),
(1,'TEXTO PRUEBA 2','Descripcion texto prueba 2',NOW(),NULL),
(1,'TEXTO PRUEBA 3','Descripcion texto prueba 2',NOW(),NULL);

insert into preguntas(id_etapa, descripcion, fecha_creacion, fecha_edicion) values
(1,'Cual de las siguientes es una STRING',NOW(),NULL),
(1,'texto pregunta prueba 2',NOW(),NULL),
(1,'texto pregunta prueba 3',NOW(),NULL);

insert into juegos(id_etapa, nombre, descripcion, fecha_creacion, fecha_edicion)
values(1,'VARIABLES AL ATAQUE','Usa tu canasta para atrapar las variables de tipo STRING',NOW(),NULL);

insert into alternativas(descripcion, fecha_creacion, fecha_edicion) values
('113',NOW(),NULL),
('12',NOW(),NULL),
('dos',NOW(),NULL),
('2',NOW(),NULL);

insert into alternativas(descripcion, fecha_creacion, fecha_edicion) values
('respt5',NOW(),NULL),
('respt6 correcta',NOW(),NULL),
('respt7',NOW(),NULL);

insert into alternativas(descripcion, fecha_creacion, fecha_edicion) values
('respt8 correcta',NOW(),NULL),
('respt9',NOW(),NULL),
('respt10',NOW(),NULL);


insert into alternativas_preguntas(id_alternativa, id_pregunta, correcta, fecha_creacion, fecha_edicion) values
(1,1,0,NOW(),NULL),
(2,1,0,NOW(),NULL),
(3,1,1,NOW(),NULL),
(4,1,0,NOW(),NULL);
insert into alternativas_preguntas(id_alternativa, id_pregunta, correcta, fecha_creacion, fecha_edicion) values
(1,2,0,NOW(),NULL),
(2,2,1,NOW(),NULL),
(3,2,0,NOW(),NULL);
insert into alternativas_preguntas(id_alternativa, id_pregunta, correcta, fecha_creacion, fecha_edicion) values
(1,3,1,NOW(),NULL),
(2,3,0,NOW(),NULL),
(3,3,0,NOW(),NULL);

insert into configuraciones_juegos(id_juego, vidas, score_minimo, fecha_creacion, fecha_edicion) values
(1,3,1000, NOW(),NULL);








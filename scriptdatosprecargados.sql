drop database generationg6kidsdnd;
create database generationg6kidsdnd;
use generationg6kidsdnd;

insert into asignaturas(NOMBRE, DESCRIPCION, FECHA_CREACION, FECHA_EDICION)
values('Java','Esta es la asignatura java',NOW(),NULL);/*now() te entrega la fecha actual*/

insert into modulos(id_asignatura, nombre, descripcion, fecha_creacion, fecha_edicion)
values(1,'Variables','Aqui aprenderás que son las variables',NOW(),NULL);

insert into contenidos(id_modulo, nombre, descripcion, fecha_creacion, fecha_edicion)
values(1,'Variables de texto','Aqui aprenderás cuales son las variables de texto',NOW(),NULL);

insert into etapas(id_contenido, nombre, descripcion, fecha_creacion, fecha_edicion)
values(1,'String','Aqui aprenderás que es un String',NOW(),NULL);

insert into preguntas(id_etapa, descripcion, fecha_creacion, fecha_edicion)
values(1,'¿Cuál de estas variables es un String?',NOW(),NULL);

insert into juegos(id_etapa, nombre, descripcion, fecha_creacion, fecha_edicion)
values(1,'Atrapa las variables','Atrapa con la canasta todas las variables de tipo String',NOW(),NULL);

insert into alternativas(descripcion, fecha_creacion, fecha_edicion)
values('113',NOW(),NULL);
insert into alternativas(descripcion, fecha_creacion, fecha_edicion)
values('12',NOW(),NULL);
insert into alternativas(descripcion, fecha_creacion, fecha_edicion)
values('dos',NOW(),NULL);
insert into alternativas(descripcion, fecha_creacion, fecha_edicion)
values('2',NOW(),NULL);

insert into alternativas_preguntas(id_alternativa, id_pregunta, correcta, fecha_creacion, fecha_edicion)
values(1,1,0,NOW(),NULL);
insert into alternativas_preguntas(id_alternativa, id_pregunta, correcta, fecha_creacion, fecha_edicion)
values(2,1,0,NOW(),NULL);
insert into alternativas_preguntas(id_alternativa, id_pregunta, correcta, fecha_creacion, fecha_edicion)
values(3,1,1,NOW(),NULL);
insert into alternativas_preguntas(id_alternativa, id_pregunta, correcta, fecha_creacion, fecha_edicion)
values(4,1,0,NOW(),NULL);

insert into configuraciones_juegos(id_juego, vidas, score_minimo)
values(1,3,1000);








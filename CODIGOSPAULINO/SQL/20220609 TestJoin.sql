drop database TestJoin;
CREATE DATABASE TestJoin;
​
USE TestJoin;
​
CREATE TABLE grupos
(
    id int PRIMARY KEY NOT NULL,
    nombre varchar(20)
);
​
CREATE TABLE Alumnos
(
    id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    nombre varchar(20),
    grupo_id int
);
​
INSERT INTO Grupos VALUES(1, 'Grupo1');
INSERT INTO Grupos VALUES(2, 'Grupo2');
INSERT INTO Grupos VALUES(3, 'Grupo3');
INSERT INTO Grupos VALUES(4, 'Grupo4');
INSERT INTO Grupos VALUES(5, 'Grupo5');
INSERT INTO Grupos VALUES(6, 'Grupo6');
INSERT INTO Grupos VALUES(7, 'Grupo7');
INSERT INTO Grupos VALUES(8, 'Grupo8');

​
INSERT INTO alumnos(nombre, grupo_id) VALUES('Pamela', NULL);
INSERT INTO alumnos(nombre, grupo_id) VALUES('Israel', NULL);
​
INSERT INTO alumnos(nombre, grupo_id) VALUES('Leonardo Utreras', 1);
INSERT INTO alumnos(nombre, grupo_id) VALUES('Luis Mejias', 1);
INSERT INTO alumnos(nombre, grupo_id) VALUES('Francisco Cid', 1);
INSERT INTO alumnos(nombre, grupo_id) VALUES('Francisco Perez', 1);
INSERT INTO alumnos(nombre, grupo_id) VALUES('Marysabel Aedo', 1);
INSERT INTO alumnos(nombre, grupo_id) VALUES('Ignacio Romero', 1);
​
INSERT INTO alumnos(nombre, grupo_id) VALUES('Nicolas Neira', 2);
INSERT INTO alumnos(nombre, grupo_id) VALUES('Genesis Quezada', 2);
INSERT INTO alumnos(nombre, grupo_id) VALUES('Catalina Castillo', 2);
INSERT INTO alumnos(nombre, grupo_id) VALUES('Carlos Iturra', 2);
INSERT INTO alumnos(nombre, grupo_id) VALUES('Gabriel Guzman', 2)
INSERT INTO alumnos(nombre, grupo_id) VALUES
('Alejandro', 3)
,('Luis', 3)
,('Cristobal', 3)
,('Joao', 3)
,('Cristian', 3)
;
​
INSERT INTO alumnos(nombre, grupo_id) VALUES
('Danko', 4)
,('Wladimir', 4)
,('Catalina', 4)
,('Esteban', 4)
,('Katherina', 4)
;
​
INSERT INTO alumnos(nombre, grupo_id) VALUES
('Nicole Olivares', 5)
,('Hector Gomez', 5)
,('Fernando Faundez',5)
,('Ignacio Galaz', 5)
,('Constanza Mardones', 5)
;
​
INSERT INTO alumnos(nombre, grupo_id) VALUES
('Alondra', 6)
,('Diana', 6)
,('Matias', 6)
,('Michael', 6)
,('Paulino', 6)
;
​
ALTER TABLE alumnos
ADD CONSTRAINT FK_grupo_id
FOREIGN KEY (grupo_id) REFERENCES grupos(id);

/*select *
FROM tablaA a
inner join tableB b
on a.key= b.key;*/

select *
FROM alumnos a
inner join grupos g
on a.grupo_id = g.id
;

select a.id, a.nombre, g.nombre nombreGrupo
FROM alumnos a
inner join grupos g
on a.grupo_id = g.id
where g.id= 4
;

select a.id, a.nombre, g.nombre nombreGrupo
FROM alumnos a
left join grupos g
on a.grupo_id = g.id
;

select a.id, a.nombre, g.nombre nombreGrupo
FROM alumnos a
right join grupos g
on a.grupo_id = g.id
;

-- FULL JOIN
/*select a.id, a.nombre, g.nombre nombreGrupo
FROM alumnos a
FULL outer JOIN grupos g
on a.grupo_id = g.id
;*/

select *
FROM alumnos a
RIGHT JOIN grupos g
on a.grupo_id = g.id
UNION
select *
FROM alumnos a
LEFT JOIN grupos g
on a.grupo_id = g.id;


-- exclusion
select * from (select a.id, a.nombre as 'alumno',g.id as 'grupoId',  g.nombre as 'nombreGrupo'
				FROM alumnos a
				Right JOIN grupos g
				on a.grupo_id = g.id
				UNION
				select a.id, a.nombre as 'alumno',g.id as 'grupoId', g.nombre as 'nombreGrupo'
				FROM alumnos a
				LEFT JOIN grupos g
				on a.grupo_id = g.id
				) as universo
-- where -- is null
	;




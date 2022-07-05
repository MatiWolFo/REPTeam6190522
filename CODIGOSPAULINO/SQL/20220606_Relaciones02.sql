drop table ciudades;
create database generationg1;
use generationg1;

create table registros(
    id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    codigo_registro varchar(100) NOT NULL,
    rut varchar(100) NOT NULL
);

create table cursos(
    id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    nombre varchar(100) NOT NULL,
    descripcion varchar(100) NOT NULL
);

CREATE TABLE direcciones (
    id Integer PRIMARY KEY not null auto_increment,
    nombre varchar(30),
    numero int,
    ciudad varchar(20),
    region int,
    pais varchar (15)
);

create TABLE alumnos(
	id Integer NOT NULL AUTO_INCREMENT,
	nombre varchar(100),
	apellido varchar(100),
	edad int,
	PRIMARY KEY (id)
);

alter table alumnos add column direccion_id int;
alter table alumnos add column registro_id int;
alter table alumnos add column curso_id int;
alter table ciudades add column region_id int;
alter table regiones add column paises_id int;

alter table alumnos add foreign key (direccion_id) references direcciones(id);
alter table alumnos add constraint FK_direccion_id FOREIGN KEY (direccion_id) references direcciones(id);
alter table alumnos add foreign key (registro_id) references registros(id);
alter table alumnos add constraint FK_registro_id FOREIGN KEY (registro_id) references registros(id);
alter table alumnos add foreign key (curso_id) references cursos(id);
alter table alumnos add constraint FK_curso_id FOREIGN KEY (curso_id) references cursos(id);

alter table ciudades add foreign key (region_id) references regiones(id);
alter table ciudades add constraint FK_ciudad_id FOREIGN KEY (region_id) references regiones(id);
alter table regiones add foreign key (paises_id) references paises(id);
alter table regiones add constraint FK_region_id FOREIGN KEY (paises_id) references paises(id);

INSERT INTO registros(codigo_registro, rut) VALUES
('G1D01','18.531.899-0' ),
('G1D01','17.484.169-1' );

INSERT INTO cursos(nombre, descripcion) VALUES
('JAVAG1','curso de java basic a pro'),
('SQLG1','curso de bd basic a pro');

INSERT INTO direcciones(nombre, numero, ciudad, region, pais) VALUES
('Thiare','1099' ,'Santiago',13,'Chile'),
('LeonXIII','2397' ,'Santiago',13,'Chile');

INSERT INTO alumnos(nombre, apellido, edad) VALUES
('paulino','rubio' ,28),
('manuel','rubio' ,32);

-- PAISES DE AMERICA
CREATE TABLE paises (
    id Integer PRIMARY KEY not null auto_increment,
    nombre varchar(60)
);
INSERT INTO paises (nombre) VALUES
('Chile'),('Argentina'),('Perú'),('Bolivia'),('Ecuador'),('Brasil');

-- CIUDADES DE CHILE
CREATE TABLE ciudades (
    id Integer PRIMARY KEY not null auto_increment,
    nombre varchar(60)
);
INSERT INTO ciudades (nombre) VALUES
('Santiago'),('Concepción'),('Rancagua'),('Iquique'),('Arica'),('Temuco');

-- REGIONES DE CHILE NUMERO
CREATE TABLE regiones (
    id Integer PRIMARY KEY not null auto_increment,
    nombre varchar(60),
    numero int NOT NULL
);

INSERT INTO regiones (nombre,numero)VALUES
('ARICA Y PARINACOTA',15),('TARAPACÁ',1),('ANTOFAGASTA',2),('ATACAMA ',3),('COQUIMBO ',4),('VALPARAÍSO ',5),
('DEL LIBERTADOR GRAL. BERNARDO OHIGGINS ',6),('DEL MAULE',7),('DEL BIOBÍO ',8),('DE LA ARAUCANÍA',9),('DE LOS RÍOS',14),
('DE LOS LAGOS',10),('AISÉN DEL GRAL. CARLOS IBAÑEZ DEL CAMPO ',11),('MAGALLANES Y DE LA ANTÁRTICA CHILENA',12),
('METROPOLITANA DE SANTIAGO',13)
;

create TABLE usuarios(
	id Integer NOT NULL AUTO_INCREMENT,
	nick varchar(30),
	email varchar(30),
	passwords varchar(30),
	PRIMARY KEY (id)
);

INSERT INTO usuarios(nick,email,passwords)VALUES
('p.rubio321', 'a@a.cl','admin1234'), ('m.rubio321', 'b@b.cl','admin123'),
('j.rubio321', 'c@c.cl','admin12'), ('a.herrera321', 'd@d.cl','admin1')
;

create TABLE grupos(
	id Integer NOT NULL AUTO_INCREMENT,
	nombre varchar(30),
	PRIMARY KEY (id)
);

INSERT INTO grupos(nombre)VALUES
('borrachos'),('jugadores'),('genios')
;

select *from alumnos;
select *from cursos;
select *from registros;
select *from direcciones;
select *from paises;
select *from regiones;
select *from ciudades;


create TABLE salaries(
	from_date DATE NOT NULL ,
	to_date DATE,
	emp_id int(11),
	salario int (11) NOT NULL ,

	PRIMARY KEY (from_date)
);

alter table salaries add foreign key (emp_id) references employees(emp_id);
alter table salaries add constraint FK_emp_id FOREIGN KEY (emp_id) references salaries(emp_id);

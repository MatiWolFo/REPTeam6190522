create table direcciones(
    id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    nombre varchar(100) NOT NULL,
    numero int NOT NULL
);
alter table clientes add column direccionId int;
alter table clientes drop column direccionId ;
alter table clientes add foreign key (direccionId) references direcciones(id);
alter table clientes add constraint FK_direccionId FOREIGN KEY (direccionId) references direcciones(id);

INSERT INTO direcciones(nombre, numero) VALUES ('americo', 1038);
INSERT INTO clientes (nombre) VALUES ('ricardo');

UPDATE clientes SET direccionId= 3 WHERE id = 6;

select *from clientes where direccionId=1;

select *from clientes;
select *from direcciones;

select * from clientes cl
    inner join direcciones d on cl.direccionId=d.id;

select * from direcciones d
    left join clientes cl on cl.direccionId=d.id
where cl.id is null ;



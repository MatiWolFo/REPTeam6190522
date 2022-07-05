DROP DATABASE IF EXISTS `generationG6kidsdnd`;
create database generationg6kidsdnd;
USE `generationG6kidsdnd`;
CREATE TABLE alternativas(
    `id` bigint AUTO_INCREMENT NOT NULL,
    `descripcion` varchar(500) NULL,
    `fecha_creacion` datetime(6) NOT NULL,
    `fecha_edicion` datetime(6) NULL,
 CONSTRAINT `PK_alternativas` PRIMARY KEY (`id`)
);
CREATE TABLE alternativas_preguntas(
    `id` bigint AUTO_INCREMENT NOT NULL,
    `id_alternativa` bigint NOT NULL,
    `id_pregunta` bigint NOT NULL,
    `correcta` Tinyint(1) NOT NULL,
    `fecha_creacion` datetime(6) NOT NULL,
    `fecha_edicion` datetime(6) NULL,
 CONSTRAINT `PK_alternativas_preguntas` PRIMARY KEY (`id`)
);
CREATE TABLE asignaturas(
    `id` bigint AUTO_INCREMENT NOT NULL,
    `nombre` varchar(50) NOT NULL,
    `descripcion` varchar(500) NOT NULL,
 CONSTRAINT `PK_asignaturas` PRIMARY KEY (`id`)
);
CREATE TABLE configuraciones_juegos(
    `id` bigint AUTO_INCREMENT NOT NULL,
    `id_juego` bigint NOT NULL,
    `vidas` int NOT NULL,
    `score_minimo` int NOT NULL,
 CONSTRAINT `PK_configuraciones_juegos` PRIMARY KEY (`id`)
);
CREATE TABLE contenidos(
    `id` bigint AUTO_INCREMENT NOT NULL,
    `id_modulo` bigint NOT NULL,
    `nombre` varchar(50) NOT NULL,
    `descripcion` varchar(500) NOT NULL,

 CONSTRAINT `PK_contenidos` PRIMARY KEY (`id`)
);
CREATE TABLE etapas(
    `id` bigint AUTO_INCREMENT NOT NULL,
    `id_contenido` bigint NOT NULL,
    `nombre` varchar(50) NOT NULL,
    `descripcion` varchar(50) NOT NULL,

 CONSTRAINT `PK_etapas` PRIMARY KEY (`id`)
);
CREATE TABLE etapas_usuarios(
    `id` bigint AUTO_INCREMENT NOT NULL,
    `id_usuario` bigint NOT NULL,
    `id_etapa` bigint NOT NULL,
    `fecha_creacion` datetime(6) NOT NULL,
    `fecha_edicion` datetime(6) NULL,
 CONSTRAINT `PK_etapas_usuarios` PRIMARY KEY (`id`)
);
CREATE TABLE juegos(
    `id` bigint AUTO_INCREMENT NOT NULL,
    `id_etapa` bigint NOT NULL,
    `nombre` varchar(50) NOT NULL,
    `descripcion` varchar(500) NOT NULL,
    `fecha_creacion` datetime(6) NOT NULL,
    `fecha_edicion` datetime(6) NULL,
 CONSTRAINT `PK_juegos` PRIMARY KEY (`id`)
);
CREATE TABLE scores_usuarios(
    `id` bigint AUTO_INCREMENT NOT NULL,
    `id_juego` bigint NULL,
    `id_usuario` bigint NULL,
    `score_realizado` int NULL,
    `vidas_utilizadas` int NULL,
    `fecha_creacion` datetime(6) NOT NULL,
 CONSTRAINT `PK_scores_usuarios` PRIMARY KEY (`id`)
);
CREATE TABLE modulos(
    `id` bigint AUTO_INCREMENT NOT NULL,
    `id_asignatura` bigint NOT NULL,
    `nombre` varchar(50) NOT NULL,
    `descripcion` varchar(500) NOT NULL,

 CONSTRAINT `PK_modulos` PRIMARY KEY (`id`)
);
CREATE TABLE preguntas(
    `id` bigint AUTO_INCREMENT NOT NULL,
    `id_etapa` bigint NOT NULL,
    `descripcion` varchar(500) NOT NULL,
    `fecha_creacion` datetime(6) NOT NULL,
    `fecha_edicion` datetime(6) NULL,
 CONSTRAINT `PK_preguntas` PRIMARY KEY (`id`)
);
CREATE TABLE respuestas_usuarios(
    `id` bigint AUTO_INCREMENT NOT NULL,
    `id_alternativa__pregunta` bigint NOT NULL,
    `id_usuario` bigint NOT NULL,
    `fecha_creacion` datetime(6) NOT NULL,
 CONSTRAINT `PK_respuestas_usuarios` PRIMARY KEY (`id`)
);
CREATE TABLE roles(
    `id` bigint AUTO_INCREMENT NOT NULL,
    `nombre` varchar(50) NOT NULL,
    `descripcion` varchar(50) NOT NULL,
 CONSTRAINT `PK_roles` PRIMARY KEY (`id`)
);
CREATE TABLE usuarios(
    `id` bigint AUTO_INCREMENT NOT NULL,
    `id_rol` bigint NOT NULL,
    `nombre` varchar(50) NOT NULL,
    `apellido` varchar(50) NOT NULL,
    `edad` int NOT NULL,
    `rut` varchar(13) NOT NULL,
    `username` varchar(50) NOT NULL,
    `password` varchar(50) NOT NULL,
    `email` varchar(50) NOT NULL,

 CONSTRAINT `PK_usuarios` PRIMARY KEY (`id`)
);
ALTER TABLE alternativas_preguntas  ADD  CONSTRAINT `FK_alternativas_preguntas_alternativas` FOREIGN KEY(`id_alternativa`)
REFERENCES alternativas (`id`);
ALTER TABLE alternativas_preguntas  ADD  CONSTRAINT `FK_alternativas_preguntas_preguntas` FOREIGN KEY(`id_pregunta`)
REFERENCES preguntas (`id`);
ALTER TABLE configuraciones_juegos  ADD  CONSTRAINT `FK_configuraciones_juegos_juegos` FOREIGN KEY(`id_juego`)
REFERENCES juegos (`id`);
ALTER TABLE contenidos  ADD  CONSTRAINT `FK_contenidos_modulos` FOREIGN KEY(`id_modulo`)
REFERENCES modulos (`id`);
ALTER TABLE etapas  ADD  CONSTRAINT `FK_etapas_contenidos` FOREIGN KEY(`id_contenido`)
REFERENCES contenidos (`id`);
ALTER TABLE etapas_usuarios  ADD  CONSTRAINT `FK_etapas_usuarios_etapas` FOREIGN KEY(`id_etapa`)
REFERENCES etapas (`id`);
ALTER TABLE etapas_usuarios  ADD  CONSTRAINT `FK_etapas_usuarios_usuarios` FOREIGN KEY(`id_usuario`)
REFERENCES usuarios (`id`);
ALTER TABLE juegos  ADD  CONSTRAINT `FK_juegos_etapas` FOREIGN KEY(`id_etapa`)
REFERENCES etapas (`id`);
ALTER TABLE scores_usuarios  ADD  CONSTRAINT `FK_scores_usuarios_juegos` FOREIGN KEY(`id_juego`)
REFERENCES juegos (`id`);
ALTER TABLE scores_usuarios  ADD  CONSTRAINT `FK_scores_usuarios_usuarios` FOREIGN KEY(`id_usuario`)
REFERENCES usuarios (`id`);
ALTER TABLE modulos  ADD  CONSTRAINT `FK_modulos_asignaturas` FOREIGN KEY(`id_asignatura`)
REFERENCES asignaturas (`id`);
ALTER TABLE preguntas  ADD  CONSTRAINT `FK_preguntas_etapas` FOREIGN KEY(`id_etapa`)
REFERENCES etapas (`id`);
ALTER TABLE respuestas_usuarios  ADD  CONSTRAINT `FK_respuestas_usuarios_alternativas_preguntas` FOREIGN KEY(`id_alternativa__pregunta`)
REFERENCES alternativas_preguntas (`id`);
ALTER TABLE respuestas_usuarios  ADD  CONSTRAINT `FK_respuestas_usuarios_usuarios` FOREIGN KEY(`id_usuario`)
REFERENCES usuarios (`id`);


DROP DATABASE IF EXISTS `generationG6kidsdnd`;

CREATE DATABASE `generationg6kidsdnd` /*!40100 DEFAULT CHARACTER SET latin1 COLLATE latin1_spanish_ci */;

USE `generationG6kidsdnd`;

CREATE TABLE `asignaturas` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `created_at` datetime(6) DEFAULT NULL,
  `descripcion` varchar(255) COLLATE latin1_spanish_ci DEFAULT NULL,
  `nombre` varchar(255) COLLATE latin1_spanish_ci DEFAULT NULL,
  `updated_at` datetime(6) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

CREATE TABLE `contenidos` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `created_at` datetime(6) DEFAULT NULL,
  `descripcion` varchar(255) COLLATE latin1_spanish_ci DEFAULT NULL,
  `nombre` varchar(255) COLLATE latin1_spanish_ci DEFAULT NULL,
  `updated_at` datetime(6) DEFAULT NULL,
  `modulo_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKpvmkxurds2hcf5wetlgpu8a71` (`modulo_id`),
  CONSTRAINT `FKpvmkxurds2hcf5wetlgpu8a71` FOREIGN KEY (`modulo_id`) REFERENCES `modulos` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

CREATE TABLE `etapas` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `created_at` datetime(6) DEFAULT NULL,
  `descripcion` varchar(255) COLLATE latin1_spanish_ci DEFAULT NULL,
  `nombre` varchar(255) COLLATE latin1_spanish_ci DEFAULT NULL,
  `updated_at` datetime(6) DEFAULT NULL,
  `contenido_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKbfxqbdwu25ti8usp07l1xnnqe` (`contenido_id`),
  CONSTRAINT `FKbfxqbdwu25ti8usp07l1xnnqe` FOREIGN KEY (`contenido_id`) REFERENCES `contenidos` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

CREATE TABLE `etapas_juegos` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `created_at` datetime(6) DEFAULT NULL,
  `updated_at` datetime(6) DEFAULT NULL,
  `etapa_id` bigint(20) DEFAULT NULL,
  `juego_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKkdv7a4tvtmn6denc3kiq0knoj` (`etapa_id`),
  KEY `FKih8d6f1ugwyjl0tkv7lo7n4vq` (`juego_id`),
  CONSTRAINT `FKih8d6f1ugwyjl0tkv7lo7n4vq` FOREIGN KEY (`juego_id`) REFERENCES `juegos` (`id`),
  CONSTRAINT `FKkdv7a4tvtmn6denc3kiq0knoj` FOREIGN KEY (`etapa_id`) REFERENCES `etapas` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

CREATE TABLE `etapas_usuarios` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `created_at` datetime(6) DEFAULT NULL,
  `updated_at` datetime(6) DEFAULT NULL,
  `etapa_id` bigint(20) DEFAULT NULL,
  `usuario_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKsbf9nn8cvyoc1nwajxj4e2rxr` (`etapa_id`),
  KEY `FKs2qxmhmldvkxp23onxympnbxx` (`usuario_id`),
  CONSTRAINT `FKs2qxmhmldvkxp23onxympnbxx` FOREIGN KEY (`usuario_id`) REFERENCES `usuarios` (`id`),
  CONSTRAINT `FKsbf9nn8cvyoc1nwajxj4e2rxr` FOREIGN KEY (`etapa_id`) REFERENCES `etapas` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

CREATE TABLE `juegos` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `created_at` datetime(6) DEFAULT NULL,
  `descripcion` varchar(255) COLLATE latin1_spanish_ci DEFAULT NULL,
  `nombre` varchar(255) COLLATE latin1_spanish_ci DEFAULT NULL,
  `updated_at` datetime(6) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

CREATE TABLE `modulos` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `created_at` datetime(6) DEFAULT NULL,
  `descripcion` varchar(255) COLLATE latin1_spanish_ci DEFAULT NULL,
  `nombre` varchar(255) COLLATE latin1_spanish_ci DEFAULT NULL,
  `updated_at` datetime(6) DEFAULT NULL,
  `asignatura_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKlx9plf0bkuuyspiwbsytrw5ti` (`asignatura_id`),
  CONSTRAINT `FKlx9plf0bkuuyspiwbsytrw5ti` FOREIGN KEY (`asignatura_id`) REFERENCES `asignaturas` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

CREATE TABLE `preguntas_etapas` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `created_at` datetime(6) DEFAULT NULL,
  `descripcion` varchar(255) COLLATE latin1_spanish_ci DEFAULT NULL,
  `pregunta` varchar(255) COLLATE latin1_spanish_ci DEFAULT NULL,
  `updated_at` datetime(6) DEFAULT NULL,
  `etapa_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK64k56c098y5ihd41rqssuw8uy` (`etapa_id`),
  CONSTRAINT `FK64k56c098y5ihd41rqssuw8uy` FOREIGN KEY (`etapa_id`) REFERENCES `etapas` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

CREATE TABLE `preguntas_juegos` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `created_at` datetime(6) DEFAULT NULL,
  `descripcion` varchar(255) COLLATE latin1_spanish_ci DEFAULT NULL,
  `pregunta` varchar(255) COLLATE latin1_spanish_ci DEFAULT NULL,
  `updated_at` datetime(6) DEFAULT NULL,
  `juego_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKdvw5nkifuq1esvh2ec91523h4` (`juego_id`),
  CONSTRAINT `FKdvw5nkifuq1esvh2ec91523h4` FOREIGN KEY (`juego_id`) REFERENCES `juegos` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

CREATE TABLE `respuestas_etapas` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `created_at` datetime(6) DEFAULT NULL,
  `descripcion` varchar(255) COLLATE latin1_spanish_ci DEFAULT NULL,
  `respuesta` varchar(255) COLLATE latin1_spanish_ci DEFAULT NULL,
  `updated_at` datetime(6) DEFAULT NULL,
  `pregunta_etapa_id` bigint(20) DEFAULT NULL,
  `usuario_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK1a7lvxu6xu68fhd0v3y0uu9wy` (`pregunta_etapa_id`),
  KEY `FK5ts6u6imsjn3e2vtcs33vccso` (`usuario_id`),
  CONSTRAINT `FK1a7lvxu6xu68fhd0v3y0uu9wy` FOREIGN KEY (`pregunta_etapa_id`) REFERENCES `preguntas_etapas` (`id`),
  CONSTRAINT `FK5ts6u6imsjn3e2vtcs33vccso` FOREIGN KEY (`usuario_id`) REFERENCES `usuarios` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

CREATE TABLE `respuestas_juegos` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `created_at` datetime(6) DEFAULT NULL,
  `descripcion` varchar(255) COLLATE latin1_spanish_ci DEFAULT NULL,
  `respuesta` varchar(255) COLLATE latin1_spanish_ci DEFAULT NULL,
  `updated_at` datetime(6) DEFAULT NULL,
  `pregunta_juego_id` bigint(20) DEFAULT NULL,
  `usuarioa_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK63xglulyx6glj3udxppwd36m4` (`pregunta_juego_id`),
  KEY `FKaebms0l2qqnt1xv3n7gp9gys` (`usuarioa_id`),
  CONSTRAINT `FK63xglulyx6glj3udxppwd36m4` FOREIGN KEY (`pregunta_juego_id`) REFERENCES `preguntas_juegos` (`id`),
  CONSTRAINT `FKaebms0l2qqnt1xv3n7gp9gys` FOREIGN KEY (`usuarioa_id`) REFERENCES `usuarios` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

CREATE TABLE `roles` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `created_at` datetime(6) DEFAULT NULL,
  `descripcion` varchar(255) COLLATE latin1_spanish_ci DEFAULT NULL,
  `nombre` varchar(255) COLLATE latin1_spanish_ci DEFAULT NULL,
  `updated_at` datetime(6) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

CREATE TABLE `usuarios` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `apellido` varchar(255) COLLATE latin1_spanish_ci DEFAULT NULL,
  `created_at` datetime(6) DEFAULT NULL,
  `edad` int(11) DEFAULT NULL,
  `email` varchar(255) COLLATE latin1_spanish_ci DEFAULT NULL,
  `nombre` varchar(255) COLLATE latin1_spanish_ci DEFAULT NULL,
  `password` varchar(255) COLLATE latin1_spanish_ci DEFAULT NULL,
  `updated_at` datetime(6) DEFAULT NULL,
  `username` varchar(255) COLLATE latin1_spanish_ci DEFAULT NULL,
  `rol_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKqf5elo4jcq7qrt83oi0qmenjo` (`rol_id`),
  CONSTRAINT `FKqf5elo4jcq7qrt83oi0qmenjo` FOREIGN KEY (`rol_id`) REFERENCES `roles` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_spanish_ci;

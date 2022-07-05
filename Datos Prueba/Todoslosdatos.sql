INSERT INTO asignaturas(id_asignatura, nombre_asignatura, descripcion_asignatura) VALUES
(1, "HTML", "Clases de HTML"),
(2, "CSS", "Clases de CSS"),
(3, "JavaScript", "Clases de JavaScript")

INSERT INTO modulos(id_modulo, nombre_modulo, descripcion_modulo, id_asignatura) VALUES
(1, "Introducción a HTML", "Conceptos basicos de HTML", 1),
(2, "HTML intermedio", "Continua tu aprendizaje de HTML", 1),
(3, "HTML avanzado", "Profundiza tu aprendizaje de HTML", 1),
(4, "Introducción a CSS", "Conceptos basicos de CSS", 2),
(5, "CSS intermedio", "Continua tu aprendizaje de CSS", 2),
(6, "CSS avanzado", "Profundiza tu aprendizaje de CSS", 2),
(7, "Introducción a JavaScript", "Conceptos basicos de JavaScript", 3),
(8, "JavaScript intermedio", "Continua tu aprendizaje de JavaScript", 3),
(9, "JavaScript avanzado", "Profundiza tu aprendizaje de JavaScript", 3)

INSERT INTO contenidos(id_contenido, nombre_contenido, descripcion_contenido, id_modulo) VALUES
(1, "Que es HTML?", "Explicación basica de HTML, estructura basica", 1),
(2, "Otras etiquetas", "Agregar imagenes y parrafos", 1),
(3, "Botones y formularios", "Botones para ir a otra pagina", 1)

INSERT INTO etapas(id_etapa, nombre_etapa, descripcion_etapa, id_contenido) VALUES 
(1, "Etapa 1", "Etapa 1", 1),
(2, "Etapa 2", "Etapa 2", 1),
(3, "Etapa 3", "Etapa 3", 1),
(4, "Etapa 4", "Etapa 4", 1),
(5, "Etapa 5", "Etapa 5", 1),
(6, "Etapa 6", "Etapa 6", 1),
(7, "Etapa 7", "Etapa 7", 1),
(8, "Etapa 8", "Etapa 8", 1),
(9, "Etapa 9", "Etapa 9", 1),
(10, "Etapa 10", "Etapa 10", 1)

INSERT INTO usuarios(id_usuario, nombre, apellido, edad, rut, email, username, password, id_rol_usuario) VALUES 
(1, "Carlos", "Tapia", 7, "9977866-9", "carlos.tapia@correo.cl", "Chancho77", "contraseña123", 1),
(2, "Rodrigo", "Diaz", 8, "10777111-6", "rodrigo.diaz@correo.cl", "SombraxX34", "oculto123", 1),
(3, "Juan", "Tapia", 24, "9192888-1", "juan.tapia@correo.cl", "Padre_secreto", "secreto123", 2)

INSERT INTO rolesUsuarios(id_rol_usuario, nombre_rol, descripcion_rol) VALUES 
(1, "Alumno", "Alumno de 6 a 8 años"),
(2, "Padre", "Padre de alumno"),
(3, "Profesor", "Profesor de HTML, CSS, JS")

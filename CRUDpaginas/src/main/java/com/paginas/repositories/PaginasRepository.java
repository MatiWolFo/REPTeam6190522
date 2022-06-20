package com.paginas.repositories;

/* IMPORTAR LAS LIBRERIAS REQUERIDAS*/
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.paginas.models.Paginas;

/* ASIGNAR LA ANOTACION PARA EL REPOSITORY*/
@Repository
public interface PaginasRepository extends JpaRepository<Paginas, Long> {

}

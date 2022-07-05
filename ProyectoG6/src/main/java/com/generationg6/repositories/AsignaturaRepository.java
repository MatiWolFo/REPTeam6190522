package com.generationg6.repositories;

import com.generationg6.models.Asignatura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsignaturaRepository  extends JpaRepository<Asignatura, Long> {
}


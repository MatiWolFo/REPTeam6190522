package com.generationg6.repositories;

import com.generationg6.models.AlternativaPregunta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlternativaPreguntaRepository extends JpaRepository<AlternativaPregunta, Long> {

}

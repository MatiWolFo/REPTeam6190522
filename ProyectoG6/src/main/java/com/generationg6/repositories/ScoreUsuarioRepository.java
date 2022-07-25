package com.generationg6.repositories;

import com.generationg6.models.ScoreUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoreUsuarioRepository extends JpaRepository<ScoreUsuario, Long> {

}

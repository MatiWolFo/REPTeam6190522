package com.generationg6.repositories;

import com.generationg6.models.ConfiguracionJuego;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConfiguracionJuegoRepository extends JpaRepository<ConfiguracionJuego, Long> {

}


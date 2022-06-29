package com.generationg6.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generationg6.models.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
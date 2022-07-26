package com.generationg6.repositories;

import com.generationg6.models.Alternativa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlternativaRepository extends JpaRepository<Alternativa, Long> {

}

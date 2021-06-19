package com.crud.covid.repository;

import com.crud.covid.model.Anamnesa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnamnesaRepository extends JpaRepository<Anamnesa, Long> {
    
}

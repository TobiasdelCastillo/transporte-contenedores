package com.backend.gestion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.backend.gestion.entities.Camion;


@Repository
public interface CamionRepository extends JpaRepository<Camion, Long> {

}



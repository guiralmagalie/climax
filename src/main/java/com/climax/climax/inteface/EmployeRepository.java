package com.climax.climax.inteface;

import com.climax.climax.model.Employe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface EmployeRepository extends JpaRepository<Employe, UUID> {

    Optional<Employe> findByNom(UUID nom);
}

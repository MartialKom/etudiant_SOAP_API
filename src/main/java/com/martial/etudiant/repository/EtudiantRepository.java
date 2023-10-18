package com.martial.etudiant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.martial.etudiant.models.Etudiant;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, Integer> {

	
}

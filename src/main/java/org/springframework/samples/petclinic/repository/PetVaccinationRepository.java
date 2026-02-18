package org.springframework.samples.petclinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.samples.petclinic.model.PetVaccination;

public interface PetVaccinationRepository extends JpaRepository<PetVaccination,Integer> {
}

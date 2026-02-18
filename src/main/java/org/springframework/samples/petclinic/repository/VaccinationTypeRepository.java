package org.springframework.samples.petclinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.samples.petclinic.model.VaccinationType;

public interface VaccinationTypeRepository extends JpaRepository<VaccinationType,Integer> {
}

package org.springframework.samples.petclinic.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

@Entity
@Table(name = "pet_vaccinations", indexes = @Index(name = "idx_pet_vaccination_pet_id", columnList = "pet_id"))
public class PetVaccination extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "pet_id")
    @NotNull
    private Pet pet;

    @ManyToOne
    @JoinColumn(name = "vaccination_type_id")
    @NotNull
    private VaccinationType vaccinationType;

    @Column(nullable = false)
    private LocalDate dateAdministered;

    private LocalDate nextDueDate;

    private String vetame;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private VaccinationStatus status =  VaccinationStatus.ACTIVE;

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public VaccinationType getVaccinationType() {
        return vaccinationType;
    }

    public void setVaccinationType(VaccinationType vaccinationType) {
        this.vaccinationType = vaccinationType;
    }

    public LocalDate getDateAdministered() {
        return dateAdministered;
    }

    public void setDateAdministered(LocalDate dateAdministered) {
        this.dateAdministered = dateAdministered;
    }

    public LocalDate getNextDueDate() {
        return nextDueDate;
    }

    public void setNextDueDate(LocalDate nextDueDate) {
        this.nextDueDate = nextDueDate;
    }

    public String getVetame() {
        return vetame;
    }

    public void setVetame(String vetame) {
        this.vetame = vetame;
    }

    public VaccinationStatus getStatus() {
        return status;
    }

    public void setStatus(VaccinationStatus status) {
        this.status = status;
    }
}

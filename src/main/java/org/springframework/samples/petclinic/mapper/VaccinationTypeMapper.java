package org.springframework.samples.petclinic.mapper;

import org.springframework.samples.petclinic.model.VaccinationType;
import org.springframework.samples.petclinic.rest.dto.VaccinationTypeDto;
import org.springframework.samples.petclinic.rest.dto.VaccinationTypeFieldsDto;

import java.util.Collection;

public interface VaccinationTypeMapper {

    /**
     * Convert entiry to DTO
     */
    VaccinationTypeDto toVaccinationTypeDTO(VaccinationType vaccinationType);

    /**
     * Convert DTO to Entity
     */

    VaccinationType toVaccinationType(VaccinationTypeDto vaccinationTypeDto);

    /**
     * Convert fields DTO to entity
     */

    VaccinationType toVaccinationType(VaccinationTypeFieldsDto vaccinationTypeFieldsDto);

    /**
     * Convert collection of entities to DTOs
     */

    Collection<VaccinationTypeDto> toVaccinationTypeDTOs(Collection<VaccinationType> vaccinationTypes);


}

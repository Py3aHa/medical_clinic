package ru.common.medical_clinic.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.common.medical_clinic.core.model.entity.MedicalHistoryEntity;

@Repository
public interface MedicalHistoryRepository extends JpaRepository<MedicalHistoryEntity, Long> {

}

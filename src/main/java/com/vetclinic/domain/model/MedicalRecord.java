package com.vetclinic.domain.model;

import lombok.Getter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
public class MedicalRecord {
    private final UUID id;
    private final LocalDateTime date;
    private final List<Symptom> symptoms;
    private final List<Medication> medications;
    private final List<Operation> operations;
    private final TreatmentStatus status;

    public MedicalRecord(List<Symptom> symptoms, List<Medication> medications, List<Operation> operations, TreatmentStatus status) {
        this.id = UUID.randomUUID();
        this.date = LocalDateTime.now();
        this.symptoms = new ArrayList<>(symptoms != null ? symptoms : List.of());
        this.medications = new ArrayList<>(medications != null ? medications : List.of());
        this.operations = new ArrayList<>(operations != null ? operations : List.of());
        if (status == null) throw new IllegalArgumentException("Treatment status cannot be null");
        this.status = status;
    }
}
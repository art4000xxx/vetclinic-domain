package com.vetclinic.domain.model;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
public class Pet {
    private final UUID id;
    private final String name;
    private final String species;
    private final int age;
    private final List<MedicalRecord> medicalHistory;

    public Pet(String name, String species, int age) {
        this.id = UUID.randomUUID();
        if (name == null || name.isBlank()) throw new IllegalArgumentException("Pet name cannot be empty");
        if (species == null || species.isBlank()) throw new IllegalArgumentException("Species cannot be empty");
        if (age < 0) throw new IllegalArgumentException("Age cannot be negative");
        this.name = name;
        this.species = species;
        this.age = age;
        this.medicalHistory = new ArrayList<>();
    }

    public void addMedicalRecord(MedicalRecord record) {
        if (record == null) throw new IllegalArgumentException("Medical record cannot be null");
        medicalHistory.add(record);
    }
}
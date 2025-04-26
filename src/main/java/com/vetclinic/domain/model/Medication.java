package com.vetclinic.domain.model;

import lombok.Value;

@Value
public class Medication {
    String name;
    String dosage;

    public Medication(String name, String dosage) {
        if (name == null || name.isBlank()) throw new IllegalArgumentException("Medication name cannot be empty");
        if (dosage == null || dosage.isBlank()) throw new IllegalArgumentException("Dosage cannot be empty");
        this.name = name;
        this.dosage = dosage;
    }
}
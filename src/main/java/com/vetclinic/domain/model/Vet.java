package com.vetclinic.domain.model;

import lombok.Getter;

import java.util.UUID;

@Getter
public class Vet {
    private final UUID id;
    private final String name;
    private final String specialization;

    public Vet(String name, String specialization) {
        this.id = UUID.randomUUID();
        if (name == null || name.isBlank()) throw new IllegalArgumentException("Vet name cannot be empty");
        if (specialization == null || specialization.isBlank()) throw new IllegalArgumentException("Specialization cannot be empty");
        this.name = name;
        this.specialization = specialization;
    }
}
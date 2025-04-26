package com.vetclinic.domain.model;

import lombok.Value;

@Value
public class Symptom {
    String description;

    public Symptom(String description) {
        if (description == null || description.isBlank()) throw new IllegalArgumentException("Symptom description cannot be empty");
        this.description = description;
    }
}
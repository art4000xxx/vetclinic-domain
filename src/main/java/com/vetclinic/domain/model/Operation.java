package com.vetclinic.domain.model;

import lombok.Value;

@Value
public class Operation {
    String description;

    public Operation(String description) {
        if (description == null || description.isBlank()) throw new IllegalArgumentException("Operation description cannot be empty");
        this.description = description;
    }
}
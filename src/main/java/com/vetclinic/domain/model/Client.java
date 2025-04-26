package com.vetclinic.domain.model;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
public class Client {
    private final UUID id;
    private final String name;
    private final ContactInfo contactInfo;
    private final List<Pet> pets;

    public Client(String name, ContactInfo contactInfo) {
        this.id = UUID.randomUUID();
        if (name == null || name.isBlank()) throw new IllegalArgumentException("Client name cannot be empty");
        this.name = name;
        this.contactInfo = contactInfo;
        this.pets = new ArrayList<>();
    }

    public void addPet(Pet pet) {
        if (pet == null) throw new IllegalArgumentException("Pet cannot be null");
        pets.add(pet);
    }
}
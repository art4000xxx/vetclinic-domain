package com.vetclinic.domain.model;

import lombok.Getter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
public class Appointment {
    private final UUID id;
    private final LocalDateTime dateTime;
    private final AppointmentType type;
    private final Client client;
    private final Pet pet;
    private final Vet vet;

    public Appointment(LocalDateTime dateTime, AppointmentType type, Client client, Pet pet, Vet vet) {
        this.id = UUID.randomUUID();
        if (dateTime == null || dateTime.isBefore(LocalDateTime.now())) throw new IllegalArgumentException("Invalid appointment date");
        if (type == null) throw new IllegalArgumentException("Appointment type cannot be null");
        if (client == null || pet == null || vet == null) throw new IllegalArgumentException("Client, pet, or vet cannot be null");
        this.dateTime = dateTime;
        this.type = type;
        this.client = client;
        this.pet = pet;
        this.vet = vet;
    }
}
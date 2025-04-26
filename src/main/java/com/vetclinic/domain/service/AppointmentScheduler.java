package com.vetclinic.domain.service;

import com.vetclinic.domain.model.Appointment;
import com.vetclinic.domain.model.AppointmentType;
import com.vetclinic.domain.model.Client;
import com.vetclinic.domain.model.Pet;
import com.vetclinic.domain.model.Vet;

import java.time.LocalDateTime;
import java.util.List;

public class AppointmentScheduler {
    private final List<Appointment> appointments;

    public AppointmentScheduler(List<Appointment> appointments) {
        this.appointments = appointments;
    }

    public Appointment scheduleAppointment(LocalDateTime dateTime, AppointmentType type, Client client, Pet pet, Vet vet) {
        if (!isVetAvailable(vet, dateTime)) {
            throw new IllegalStateException("Vet is not available at the specified time");
        }
        Appointment appointment = new Appointment(dateTime, type, client, pet, vet);
        appointments.add(appointment);
        return appointment;
    }

    private boolean isVetAvailable(Vet vet, LocalDateTime dateTime) {
        return appointments.stream()
                .noneMatch(a -> a.getVet().equals(vet) && a.getDateTime().equals(dateTime));
    }
}
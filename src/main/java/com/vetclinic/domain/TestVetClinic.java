package com.vetclinic.domain;

import com.vetclinic.domain.model.*;
import com.vetclinic.domain.service.AppointmentScheduler;
import com.vetclinic.domain.service.MedicalRecordService;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TestVetClinic {
    public static void main(String[] args) {
        // Создаем клиента
        ContactInfo contact = new ContactInfo("1234567890", "client@example.com");
        Client client = new Client("Иван Иванов", contact);

        // Создаем питомца
        Pet pet = new Pet("Барсик", "Кот", 3);
        client.addPet(pet);

        // Создаем врача
        Vet vet = new Vet("Доктор Айболит", "Терапевт");

        // Планируем прием
        AppointmentScheduler scheduler = new AppointmentScheduler(new ArrayList<>());
        Appointment appointment = scheduler.scheduleAppointment(
                LocalDateTime.now().plusDays(1),
                AppointmentType.PLANNED,
                client,
                pet,
                vet
        );

        // Добавляем запись в историю болезни
        MedicalRecordService recordService = new MedicalRecordService();
        recordService.addMedicalRecordFromAppointment(
                pet,
                appointment,
                List.of(new Symptom("Кашель")),
                List.of(new Medication("Антибиотик", "5мг")),
                List.of(),
                TreatmentStatus.IN_PROGRESS
        );

        // Выводим результат
        System.out.println("Питомец: " + pet.getName());
        System.out.println("История болезни: " + pet.getMedicalHistory().get(0).getSymptoms());
    }
}
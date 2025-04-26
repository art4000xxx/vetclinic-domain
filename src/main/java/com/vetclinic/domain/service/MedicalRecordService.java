package com.vetclinic.domain.service;

import com.vetclinic.domain.model.Appointment;
import com.vetclinic.domain.model.MedicalRecord;
import com.vetclinic.domain.model.Pet;
import com.vetclinic.domain.model.Symptom;
import com.vetclinic.domain.model.Medication;
import com.vetclinic.domain.model.Operation;
import com.vetclinic.domain.model.TreatmentStatus;

import java.util.List;

public class MedicalRecordService {
    public void addMedicalRecordFromAppointment(Pet pet, Appointment appointment, List<Symptom> symptoms,
                                                List<Medication> medications, List<Operation> operations,
                                                TreatmentStatus status) {
        MedicalRecord record = new MedicalRecord(symptoms, medications, operations, status);
        pet.addMedicalRecord(record);
    }
}
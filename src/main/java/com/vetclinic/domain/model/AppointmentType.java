package com.vetclinic.domain.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum AppointmentType {
    PLANNED("Planned"),
    EMERGENCY("Emergency");

    private final String type;
}
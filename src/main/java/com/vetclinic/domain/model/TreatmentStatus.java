package com.vetclinic.domain.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum TreatmentStatus {
    IN_PROGRESS("In Progress"),
    COMPLETED("Completed"),
    REQUIRES_FOLLOW_UP("Requires Follow-Up");

    private final String status;
}
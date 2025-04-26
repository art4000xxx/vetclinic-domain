package com.vetclinic.domain.model;

import lombok.Value;

@Value
public class ContactInfo {
    String phone;
    String email;

    public ContactInfo(String phone, String email) {
        if (phone == null || phone.isBlank()) throw new IllegalArgumentException("Phone cannot be empty");
        if (email == null || email.isBlank()) throw new IllegalArgumentException("Email cannot be empty");
        this.phone = phone;
        this.email = email;
    }
}
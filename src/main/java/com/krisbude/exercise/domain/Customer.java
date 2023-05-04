package com.krisbude.exercise.domain;

import com.krisbude.exercise.endpoint.resources.CustomerResource;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String middleName;
    private String email;
    private String phoneNumber;
    private LocalDate birthDate;

    public static Customer from(CustomerResource customer) {
        return builder()
                .id(customer.getId())
                .firstName(customer.getFirstName())
                .lastName(customer.getLastName())
                .middleName(customer.getMiddleName())
                .email(customer.getEmail())
                .phoneNumber(customer.getPhoneNumber())
                .birthDate(customer.getBirthDate())
                .build();
    }
}


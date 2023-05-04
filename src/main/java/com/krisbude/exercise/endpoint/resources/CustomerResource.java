package com.krisbude.exercise.endpoint.resources;

import com.krisbude.exercise.domain.Customer;
import lombok.*;

import java.time.LocalDate;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerResource {

    private String id;
    private String firstName;
    private String lastName;
    private String middleName;
    private String email;
    private String phoneNumber;
    private LocalDate birthDate;

    public static CustomerResource from(Customer customer) {
        if (customer == null) return null;
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

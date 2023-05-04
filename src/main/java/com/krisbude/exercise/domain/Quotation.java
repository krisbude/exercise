package com.krisbude.exercise.domain;

import com.krisbude.exercise.endpoint.resources.QuotationResource;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Quotation {

    @Id
    private String id;
    private LocalDate beginingOfInsurance;
    private BigDecimal insuredAmount;
    private LocalDate dateOfSigningMortgage;
    @OneToOne
    private Customer customer;

    public static Quotation from(QuotationResource quotation) {
        return builder()
                .id(quotation.getId())
                .beginingOfInsurance(quotation.getBeginingOfInsurance())
                .insuredAmount(quotation.getInsuredAmount())
                .dateOfSigningMortgage(quotation.getDateOfSigningMortgage())
                .customer(Customer.from(quotation.getCustomer()))
                .build();
    }
}

package com.krisbude.exercise.endpoint.resources;

import com.krisbude.exercise.domain.Customer;
import com.krisbude.exercise.domain.Quotation;
import lombok.*;

import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.math.BigDecimal;
import java.time.LocalDate;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class QuotationResource {

    private String id;
    private LocalDate beginingOfInsurance;
    private BigDecimal insuredAmount;
    private LocalDate dateOfSigningMortgage;
    private CustomerResource customer;

    public static QuotationResource from(Quotation quotation) {
        if (quotation == null) return null;
        return builder()
                .id(quotation.getId())
                .beginingOfInsurance(quotation.getBeginingOfInsurance())
                .insuredAmount(quotation.getInsuredAmount())
                .dateOfSigningMortgage(quotation.getDateOfSigningMortgage())
                .customer(CustomerResource.from(quotation.getCustomer()))
                .build();
    }

}

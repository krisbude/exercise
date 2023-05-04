package com.krisbude.exercise.endpoint;

import com.krisbude.exercise.dao.QuotationRepository;
import com.krisbude.exercise.domain.Quotation;
import com.krisbude.exercise.endpoint.resources.QuotationResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuotationsEndpoint {

    private final QuotationRepository quotationRepository;

    @Autowired
    public QuotationsEndpoint(QuotationRepository quotationRepository) {
        this.quotationRepository =  quotationRepository;
    }

    @PostMapping("/quotations")
    public QuotationResource createQuotation(@RequestBody QuotationResource quotation) {
        return QuotationResource.from(quotationRepository.save(Quotation.from(quotation)));
    }

}

package com.krisbude.exercise.endpoint.resources;

import com.krisbude.exercise.domain.Quotation;
import com.krisbude.exercise.domain.Subscription;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Builder
public class SubscriptionResource {

    private String id;
    private Quotation quotation;
    private LocalDate startDate;
    private LocalDate validUntil;

    public static SubscriptionResource from(Subscription subscription) {
        if (subscription == null) return null;
        return builder()
                .id(subscription.getId())
                .quotation(subscription.getQuotation())
                .startDate(subscription.getStartDate())
                .validUntil(subscription.getValidUntil())
                .build();
    }
}

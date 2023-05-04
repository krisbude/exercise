package com.krisbude.exercise.domain;

import com.krisbude.exercise.endpoint.resources.SubscriptionResource;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.time.LocalDate;
@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Subscription {

    @Id
    private String id;
    @OneToOne
    private Quotation quotation;
    private LocalDate startDate;
    private LocalDate validUntil;

    public static Subscription from(SubscriptionResource subscription) {
        if (subscription == null) return null;
        return builder()
                .id(subscription.getId())
                .startDate(subscription.getStartDate())
                .validUntil(subscription.getValidUntil())
                .build();
    }
}


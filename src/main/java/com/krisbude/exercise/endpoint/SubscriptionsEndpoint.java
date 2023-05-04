package com.krisbude.exercise.endpoint;

import com.krisbude.exercise.dao.SubscriptionRepository;
import com.krisbude.exercise.domain.Subscription;
import com.krisbude.exercise.endpoint.resources.SubscriptionResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SubscriptionsEndpoint {

    private final SubscriptionRepository subscriptionRepository;

    @Autowired
    public SubscriptionsEndpoint(SubscriptionRepository subscriptionRepository) {
        this.subscriptionRepository = subscriptionRepository;
    }

    @PostMapping("/subscriptions")
    public SubscriptionResource createSubscription(@RequestBody SubscriptionResource subscription) {
        return SubscriptionResource.from(subscriptionRepository.save(Subscription.from(subscription)));
    }

    @GetMapping("/subscriptions/{id}")
    public SubscriptionResource getSubscription(@PathVariable String id) {
        return SubscriptionResource.from(subscriptionRepository.findById(id).orElse(null));
    }

}

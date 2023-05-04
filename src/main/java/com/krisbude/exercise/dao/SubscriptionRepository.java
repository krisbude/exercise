package com.krisbude.exercise.dao;

import com.krisbude.exercise.domain.Subscription;
import org.springframework.data.repository.CrudRepository;

public interface SubscriptionRepository extends CrudRepository<Subscription, String> {
}

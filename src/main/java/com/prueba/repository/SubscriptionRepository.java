package com.prueba.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.prueba.entity.Subscription;

public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {

}

package com.prueba.serviceimpl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.prueba.entity.Subscription;
import com.prueba.repository.SubscriptionRepository;
import com.prueba.service.SubscriptionService;

@Service
public class SubscriptionServiceImpl implements SubscriptionService {

	@Autowired
	private SubscriptionRepository subscriptionRepository;
	

	@Override
	@Transactional(readOnly = true)
	public List<Subscription> getSubscriptions() {
		 List<Subscription> subscriptions = subscriptionRepository.findAll();
		 return subscriptions;
	}
	
	
	@Override
	@Transactional(readOnly = true)
	public void insertSubscription(Subscription subscription) {
		subscriptionRepository.saveAndFlush(subscription);
	}

	@Override
	@Transactional(readOnly = true)
	public void deleteSubscription(Subscription subscription) {
		subscriptionRepository.delete(subscription);
		
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Subscription> getSubscriptionById(Long id) {
		 Optional<Subscription> subscriptions = subscriptionRepository.findById(id);
		 return subscriptions;
	}
}

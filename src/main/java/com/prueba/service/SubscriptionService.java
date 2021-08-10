package com.prueba.service;




import java.util.List;
import java.util.Optional;

import com.prueba.entity.Subscription;





public interface SubscriptionService {
	
	public List<Subscription> getSubscriptions();
	
	public Optional<Subscription>  getSubscriptionById(Long id);
	
	public void insertSubscription(Subscription subscription);
	
	public void deleteSubscription(Subscription subscription);

}

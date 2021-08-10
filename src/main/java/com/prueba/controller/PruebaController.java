package com.prueba.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.prueba.entity.Subscription;
import com.prueba.serviceimpl.SubscriptionServiceImpl;



@RestController
@RequestMapping("/subscritpion")
public class PruebaController {
	
	@Autowired
	private SubscriptionServiceImpl subscriptionService;

	
	
	@GetMapping
    @ResponseBody
    public List<Subscription> getAllSubsCriptions() {
        List<Subscription> subscriptions = subscriptionService.getSubscriptions();
        return subscriptions;
    }
	
	@GetMapping("/ID")
	@ResponseBody
	public Optional<Subscription> getSubscriptionById(@RequestParam("id") Long id) {
		Optional<Subscription> subscription = subscriptionService.getSubscriptionById(id);
		return subscription;
	}
	
	@PostMapping("/add")
	public void createSubscription(@RequestBody Subscription subscription) {
		subscriptionService.insertSubscription(subscription);
	}
	
	
	@DeleteMapping("/delete")
	public void deleteTask(@RequestBody Subscription subscription) {
		subscriptionService.deleteSubscription(subscription);
	}

}

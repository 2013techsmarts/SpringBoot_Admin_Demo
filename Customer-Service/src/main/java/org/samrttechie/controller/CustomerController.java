package org.samrttechie.controller;

import java.util.ArrayList;
import java.util.List;

import org.samrttechie.model.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CustomerController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(CustomerController.class);
	
	@RequestMapping(value="/customer/all", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Customer> getCustomers() {
		LOGGER.debug("Getting all the customers details");
		Customer customer1 = new Customer("1", "customer1", "Sample@cust1.com");
		Customer customer2 = new Customer("2", "customer2", "Sample@cust2.com");
		Customer customer3 = new Customer("3", "customer3", "Sample@cust3.com");
		
		List<Customer> customers = new ArrayList<>();
		customers.add(customer1);
		customers.add(customer2);
		customers.add(customer3);
		LOGGER.info("The size of the customers is" + customers.size());
		return customers;
	}
	
	@RequestMapping(value="/customer/me",produces=MediaType.APPLICATION_JSON_VALUE)
	public Customer getCustomer() {
		LOGGER.debug("Getting the logged in cutomer details");
		Customer customer1 = new Customer("1", "customer1", "Sample@cust1.com");
		LOGGER.info("The customer details are " + customer1);
		return customer1;
	}

}

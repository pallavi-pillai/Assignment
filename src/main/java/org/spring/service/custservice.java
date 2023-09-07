package org.spring.service;

import java.util.List;

import org.spring.entity.customer;

public interface custservice {
	List<customer> getAllCustomers();
	
	customer saveCustomer(customer customer);
	
	customer getCustomerById(String Email);
	customer updateCustomer(customer customer);
	
	void delete(String Email);
}

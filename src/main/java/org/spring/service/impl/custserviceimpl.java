package org.spring.service.impl;

import java.util.List;

import org.spring.entity.customer;
import org.spring.service.custservice;
import org.spring.repo.custrepo;
import org.springframework.stereotype.Service;

@Service
public class custserviceimpl implements custservice {

	private custrepo custrepo;
	
	
	public custserviceimpl(org.spring.repo.custrepo custrepo) {
		super();
		this.custrepo = custrepo;
	}


	@Override
	public List<customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return custrepo.findAll();
	}


	@Override
	public customer saveCustomer(customer customer) {
		// TODO Auto-generated method stub
		return custrepo.save(customer);
	}


	@Override
	public customer getCustomerById(String Email) {
		return custrepo.findById(Email).get();
				
	}


	@Override
	public customer updateCustomer(customer customer) {
		
		return custrepo.save(customer);
	}


	@Override
	public void delete(String Email) {
		custrepo.deleteById(Email);
		
	}
	
}

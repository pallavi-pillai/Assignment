package org.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.validation.Valid;

import org.spring.entity.customer;
import org.spring.service.custservice;

@Controller
public class custcontroller {
	private custservice custservice;

	public custcontroller(org.spring.service.custservice custservice) {
		super();
		this.custservice = custservice;
	}
	
	@GetMapping("/customers")
	public String listCustomer(Model model)
	{
		model.addAttribute("customers", custservice.getAllCustomers());
		return "customers";
	}
	
	@GetMapping("/customers/new")
	public String createCustomerForm(Model model) {
		customer cust=new customer();
		model.addAttribute("customer", cust);
		return "create_customer";
	}
	
	@PostMapping("/customers")
	public String saveCustomer( @ModelAttribute("customer") customer  cust)
	{
		
		custservice.saveCustomer(cust);
		return "redirect:/customers";
	}
	
	@GetMapping("/customers/edit/{Email}")
	public String editCustomerForm(@PathVariable String Email,Model model) {
		model.addAttribute("customer", custservice.getCustomerById(Email));
		return "edit_customer";
	}
	
	@PostMapping("/customers/{Email}")
	public String updateCustomer(@PathVariable String Email,
		@ModelAttribute("customer") customer customer,Model model) {
		customer existingCustomer=custservice.getCustomerById(Email);
		existingCustomer.setFirstName(customer.getFirstName());
		existingCustomer.setLastName(customer.getLastName());
		existingCustomer.setAddress(customer.getAddress());
		existingCustomer.setCity(customer.getCity());
		existingCustomer.setState(customer.getState());
		existingCustomer.setEmail(Email);
		existingCustomer.setPhone(customer.getPhone());
		
		custservice.updateCustomer(existingCustomer);
		return "redirect:/customers";	
	}
	
	@GetMapping("/customers/{Email}")
	public String deleteCustomer(@PathVariable String Email) {
		custservice.delete(Email);
		return "redirect:/customers";
		
	}
}

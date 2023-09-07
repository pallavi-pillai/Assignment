package org.spring.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name="customer")
public class customer {
	
	//@Column(name="first_name",nullable=false)
	
	private String FirstName;
	
	
	private String LastName;
	private String Address;
	private String City;
	private String State;
	@Id
	private String Email;
	private String Phone;
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public customer()
	{
		
	}
	public customer(String firstName, String lastName, String address, String city, String state, String email,
			String phone) {
		super();
		FirstName = firstName;
		LastName = lastName;
		Address = address;
		City = city;
		State = state;
		Email = email;
		Phone = phone;
	}
	
}

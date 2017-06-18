package org.samrttechie.model;

public class Customer {

	private String id;
	
	private String name;
	
	private String email;

	public Customer(String id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}

	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + "]";
	}

	
}

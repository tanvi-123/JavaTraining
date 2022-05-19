package com.example.httpmethods2;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	public Employee() {
		
	}
	@Id
	private int id;
	private String name;
	private String address;
	private String email;
	private long phone;
	private int sal;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public Employee(int id, String name, String address, String email, long phone, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.email = email;
		this.phone = phone;
		this.sal = sal;
	}
	
}

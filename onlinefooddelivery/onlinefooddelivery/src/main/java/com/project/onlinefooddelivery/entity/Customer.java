package com.project.onlinefooddelivery.entity;

import javax.persistence.Entity;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;


@Entity
@Table(name="Customer_Tb")

public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	
	private int customerId;
	
	@NotNull(message= "firstName should not be null!!!")
	@Pattern(regexp= "^[A-Za-z]+$", message = "First name can only contain alphabets!!!!")
	private String firstName;
	
	@NotNull(message= "lastName should not be null!!!")
	@Pattern(regexp= "^[A-Za-z]+$", message = "Last name can only contain alphabets!!!!")
	private String lastName;
	
	@NotNull(message="age should be mandatory")
	private int age;
	@NotNull(message="gender should be mandatory")
	
	private String gender;
	@Pattern(regexp="^[6-9]{1}[0-9]{9}$",message="enter valid mobile Number")
	
	private String mobileNumber;
	
	@OneToOne
	private Address address;
	
	@Email(message="Email is mandatory")
	@Pattern(regexp="^([a-zA-Z]{1}[a-zA-Z]+)@([a-zA-Z]+)\\.([a-zA-Z]{2,30})$",message="enter valid email id")
	private String email;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int customerId, String firstName, String lastName, int age, String gender, String mobileNumber,
			Address address, String email) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.mobileNumber = mobileNumber;
		this.address = address;
		this.email = email;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName + ", age="
				+ age + ", gender=" + gender + ", mobileNumber=" + mobileNumber + ", address=" + address + ", email="
				+ email + "]";
	}
   
}
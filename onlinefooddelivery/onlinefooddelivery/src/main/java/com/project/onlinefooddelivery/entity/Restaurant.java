package com.project.onlinefooddelivery.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.ManyToMany;

import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Table(name="Restaurant_Tb")

public class Restaurant {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	
	@Min(value=1)
	@Max(value=1000000)
	private int restaurantId; 
	
	
	@NotNull(message= "restaurantName should not be null!!!")
	@Pattern(regexp= "^[A-Za-z]+$", 
	message = "Restaurnat name can only contain alphabets!!!!")
	private String restaurantName;
	
	@OneToOne
	@JoinColumn(name="Address_Id")
	private Address address;
	
	@ManyToMany(mappedBy="restaurant",cascade = CascadeType.ALL)

	
	
	private List<Item> itemList;
	
	
	@NotNull(message= "managerName should not be null!!!")
	@Pattern(regexp= "^[A-Za-z]+$", 
	message = "Manager name can only contain alphabets!!!!")
	private String managerName;
	
	
	@NotNull(message= "contactnumber should not be null!!!")
	@Pattern(regexp= "^[0-9]{1}[0-9]{9}")
	private String contactNumber;

	public Restaurant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Restaurant(int restaurantId, String restaurantName, Address address, List<Item> itemList, String managerName,
			String contactNumber) {
		super();
		this.restaurantId = restaurantId;
		this.restaurantName = restaurantName;
		this.address = address;
		this.itemList = itemList;
		this.managerName = managerName;
		this.contactNumber = contactNumber;
	}

	public int getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Item> getItemList() {
		return itemList;
	}

	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	@Override
	public String toString() {
		return "Restaurant [restaurantId=" + restaurantId + ", restaurantName=" + restaurantName + ", address="
				+ address + ", itemList=" + itemList + ", managerName=" + managerName + ", contactNumber="
				+ contactNumber + "]";
	}

	
}

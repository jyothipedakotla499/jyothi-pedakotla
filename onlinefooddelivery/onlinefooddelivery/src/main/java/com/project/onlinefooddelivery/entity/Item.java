package com.project.onlinefooddelivery.entity;

import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;


@Entity
@Table(name="Item_Tb")

public class Item {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	

	@Min(value=1)
	@Max(value=1000000)
	private int itemId;
	
	
	@NotNull(message="ItemName should not be null!")
	@Pattern(regexp="[A-Za-z]+$",message="Item name can only contain alphabets!!")
	@Length(min=2,message="ItemName Length should not be 0!!")
	private String itemName;
	
	
	@NotNull(message="Category should not be null!")
	@Pattern(regexp="[A-Za-z]+$",message="Category can only contain alphabets!!")
	@Length(min=2,message="Category Length should not be 0!!")
	@OneToOne
	@JoinColumn(name="Category_Id")
	private Category category;
	
	
	
	@NotNull(message="Quantity should not be null!")
	@Min(value=10)
	@Max(value=10000)
	@Length(min=2,message="Quantity Length should not be 0!!")
	private int quantity;
	
	
	@NotNull(message="cost should not be null!")
	@Min(value=10)
	@Max(value=10000)
	private double cost;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="ITEM_RESTAURANT_Tb"
	, joinColumns={
	@JoinColumn(name="ITEM_ID")
	}
	, inverseJoinColumns={
	@JoinColumn(name="RESTAURANT_ID")
	}
	)
	
	
		private List<Restaurant> restaurant;

	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Item(int itemId, String itemName, Category category, int quantity, double cost,
			List<Restaurant> restaurant) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.category = category;
		this.quantity = quantity;
		this.cost = cost;
		this.restaurant = restaurant;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public List<Restaurant> getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(List<Restaurant> restaurant) {
		this.restaurant = restaurant;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", category=" + category + ", quantity=" + quantity
				+ ", cost=" + cost + ", restaurant=" + restaurant + "]";
	}

	
}

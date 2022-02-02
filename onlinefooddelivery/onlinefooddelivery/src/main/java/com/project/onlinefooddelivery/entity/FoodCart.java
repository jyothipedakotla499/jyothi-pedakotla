package com.project.onlinefooddelivery.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

//import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;

@Entity
@Table(name="FoodCart_Tb")
public class FoodCart {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	
	private int cartId;
	
	@OneToOne
	@JoinColumn(name="Customer_Id")
	private Customer customer;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="itemId")
	
	private List<Item> itemList;

	public FoodCart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FoodCart(int cartId, Customer customer, List<Item> itemList) {
		super();
		this.cartId = cartId;
		this.customer = customer;
		this.itemList = itemList;
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<Item> getItemList() {
		return itemList;
	}

	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}

	@Override
	public String toString() {
		return "FoodCart [cartId=" + cartId + ", itemList=" + itemList + "]";
	}
	
	
	

}
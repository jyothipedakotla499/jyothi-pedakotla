package com.project.onlinefooddelivery.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

@Entity
@Table(name="OrderDetails_Tb")

public class OrderDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Min(value=1)
	@Max(value=1000000)
   private int orderId;
	
	
	
	private Date orderDate;
	
	@NotNull(message="Status should be mandatory")
	private String orderStatus;
	
	@OneToOne
	@JoinColumn(name="FoodCart_Id")
	@NotNull(message="ItemName should not be null!")
	@Pattern(regexp="[A-Za-z]$+^[0-9]{1}[0-9]{9}",
	message="Cart can only contain alphabets!!")
	@Length(min=2,message="cart Length should not be 0!!")
	private FoodCart cart;


	public OrderDetails() {
		super();
		// TODO Auto-generated constructor stub
	}


	public OrderDetails(int orderId, Date orderDate, String orderStatus, FoodCart cart) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.orderStatus = orderStatus;
		this.cart = cart;
	}


	public int getOrderId() {
		return orderId;
	}


	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}


	public Date getOrderDate() {
		return orderDate;
	}


	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}


	public String getOrderStatus() {
		return orderStatus;
	}


	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}


	public FoodCart getCart() {
		return cart;
	}


	public void setCart(FoodCart cart) {
		this.cart = cart;
	}


	@Override
	public String toString() {
		return "OrderDetails [orderId=" + orderId + ", orderDate=" + orderDate + ", orderStatus=" + orderStatus
				+ ", cart=" + cart + "]";
	}
	
	

	



	}
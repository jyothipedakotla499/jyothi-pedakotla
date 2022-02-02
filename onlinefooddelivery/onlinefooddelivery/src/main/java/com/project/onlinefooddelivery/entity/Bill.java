package com.project.onlinefooddelivery.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
@Table(name="Bill_Tb")

public class Bill {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	

	private int billId;
	
	@NotNull(message="The date is required")
	private Date billDate;
	
	@NotNull(message= "orderdetails should not be null!!!")
	@Pattern(regexp= "^[A-Za-z]+$",
	message = "OrderDetails can only contain alphabets !!!!")
	@OneToOne
	private OrderDetails order;
	
	@Min(value = 10)
	private int totalItem;
	
	@Min(value = 50)
	private double totalCost;

	public Bill() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bill(int billId, Date billDate, OrderDetails order, int totalItem, double totalCost) {
		super();
		this.billId = billId;
		this.billDate = billDate;
		this.order = order;
		this.totalItem = totalItem;
		this.totalCost = totalCost;
	}

	public int getBillId() {
		return billId;
	}

	public void setBillId(int billId) {
		this.billId = billId;
	}

	public Date getBillDate() {
		return billDate;
	}

	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}

	public OrderDetails getOrder() {
		return order;
	}

	public void setOrder(OrderDetails order) {
		this.order = order;
	}

	public int getTotalItem() {
		return totalItem;
	}

	public void setTotalItem(int totalItem) {
		this.totalItem = totalItem;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

	@Override
	public String toString() {
		return "Bill [billId=" + billId + ", billDate=" + billDate + ", totalItem=" + totalItem + ", totalCost="
				+ totalCost + "]";
	}
	

}

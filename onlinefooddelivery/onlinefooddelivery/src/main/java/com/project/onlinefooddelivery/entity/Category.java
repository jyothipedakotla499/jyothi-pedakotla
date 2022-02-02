package com.project.onlinefooddelivery.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;


@Entity
@Table(name="Category_Tb")

public class Category {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	
	@Min(value=1)
	@Max(value=1000000)
	private int catId;
	
	
	@NotNull(message="CategoryName should not be null!")
	@Pattern(regexp="[A-Za-z]+$",message="Category name can only contain alphabets!!")
	@Length(min=2,message="CategoryName Length should not be 0!!")
    private String categoryName;

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Category(int catId, String categoryName) {
		super();
		this.catId = catId;
		this.categoryName = categoryName;
	}

	public int getCatId() {
		return catId;
	}

	public void setCatId(int catId) {
		this.catId = catId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@Override
	public String toString() {
		return "Category [catId=" + catId + ", categoryName=" + categoryName + "]";
	}
	
	
	
	

}



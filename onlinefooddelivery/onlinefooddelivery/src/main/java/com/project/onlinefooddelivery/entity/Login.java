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
@Table(name="Login_Tb")
public class Login {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	
	@Min(value=1)
	@Max(value=1000000)
	private int userId;
	
	
	@NotNull(message= "userName should not be null!!!")
	@Pattern(regexp= "^[A-Za-z]+$", message = "user name can only contain alphabets!!!!")
	private String userName;
	
	
	@NotNull(message= "password should not be null!!!")
	@Length(min=8,message ="password must contain 8 characters")
	@Pattern(regexp= "[A-Z]{4}[0-9]{3}[a-z]{1}[1-5]{1}", 
	message = "password can only contain 8 characters!!!! ")
	private String password;

	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Login(int userId, String userName, String password) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Login [userId=" + userId + ", userName=" + userName + ", password=" + password + "]";
	}
	
	
	
	

}

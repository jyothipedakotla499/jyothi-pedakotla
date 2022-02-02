package com.project.onlinefooddelivery.exception;

public class AddressNotFoundException extends  RuntimeException{
	public AddressNotFoundException(String message)
	{
		super(message);
	}

}

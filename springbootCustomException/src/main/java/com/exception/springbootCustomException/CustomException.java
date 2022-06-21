package com.exception.springbootCustomException;

public class CustomException extends Exception {
	public CustomException() {
		super("my own exception");
	}

}

package com.revature.tourofheroes.exceptions;

public class InvalidHealthLevelException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public InvalidHealthLevelException() {
		super("Health Level Exception!!");
	}
	public InvalidHealthLevelException(String errorMessage) {
		super(errorMessage);
	}
}

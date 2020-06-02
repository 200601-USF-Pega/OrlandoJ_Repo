package com.revature.tourofheroes.exceptions;

public class InvalidHealthException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3437954782205755924L;
	@Override
	public String getMessage() {
		return "Health should be greater than zero";
	}

}

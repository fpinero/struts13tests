package com.fpe.forms;

import org.apache.struts.action.ActionForm;

public class HelloWorldForm extends ActionForm {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2690060227930119664L;
	String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
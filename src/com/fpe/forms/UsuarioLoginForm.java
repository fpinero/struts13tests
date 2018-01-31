package com.fpe.forms;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class UsuarioLoginForm extends ActionForm {

	private static final long serialVersionUID = -5825756954029458811L;
	private String userName;
	private String password;
	
	public UsuarioLoginForm() {
		
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
		return "UsuarioLoginForm [userName=" + userName + ", password=" + password + "]";
	}

	@Override
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		userName = null;
		password = null;
	}
	
	
	

}

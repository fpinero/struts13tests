package com.fpe.logic;

import java.io.Serializable;

public class UserData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8182020815966663342L;
	private String name;
	private Integer edad;
	private String sexo;


public UserData() {
	
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public int getEdad() {
	return edad;
}


public void setEdad(int edad) {
	this.edad = edad;
}


public String getSexo() {
	return sexo;
}


public void setSexo(String sexo) {
	this.sexo = sexo;
}



}
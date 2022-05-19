package com.welcome;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

@ManagedBean
public class StudentOne {

	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private int postalCode;
	private String numberClass;
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

	public String getNumberClass() {
		return numberClass;
	}

	public void setNumberClass(String numberClass) {
		this.numberClass = numberClass;
	}
	
	public void validateNumberClass(FacesContext context,
									UIComponent component,
									Object value) throws ValidatorException{
		if (value == null) {
			return;
		}
		
		String data = value.toString();
		
		if (!data.startsWith("AULA")) {
			
			FacesMessage message = new FacesMessage("El curso introducido debe empezar por AULA");
			
			throw new ValidatorException(message);
		}
		
		
	}

	private int nota;
	
	public StudentOne() {
		
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}

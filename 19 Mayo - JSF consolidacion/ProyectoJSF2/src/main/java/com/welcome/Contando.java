package com.welcome;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class Contando {

	private int value = 0;
	
	public String increment() {
		value++;
		
		return "contador";
	}
	
	public Contando() {
		
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	
	
	
}

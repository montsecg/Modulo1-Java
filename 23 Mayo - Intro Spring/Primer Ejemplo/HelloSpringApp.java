package com.welcome;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
	// cargar la configuraci�n del archivo de Spring
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/**/applicationContext.xml");
	
		// llamar al Bean (creaci�n objeto desde Spring)
		
		Entrenador elEntrenador = context.getBean("miEntrenador", Entrenador.class);
		
		// llamar a los m�todos de dicho bean.
		
		System.out.println(elEntrenador.consejoDiario());
		
		// cerrar procedimiento
		
		context.close();
	}
	
}

package com.welcome;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
	// 1 FASE-> cargar la configuraci�n del archivo de Spring
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/**/applicationContext.xml");
	
				
		Scanner scann = new Scanner(System.in);
		System.out.println("dime qu� entrenador quieres y te dar�n un consejo");
		String respuesta = scann.nextLine();
		
		if(respuesta.equals("personal")) {
			
			// 2 FASE -> llamar al Bean (creaci�n objeto desde Spring)
														// ID (bean id) + nombre interfaz.class
				Entrenador elEntrenador = context.getBean("entrenando", Entrenador.class);	
				
				// Utilizamos un m�todo del objeto reci�n creado
				System.out.println(elEntrenador.consejoDiario());
				
				// 3 FASE -> llamaremos a los m�todos "auxiliaries" o dependientes... (dependency = helper)
				System.out.println(elEntrenador.vamos_a_competir());
				
		} else {
				Entrenador elEntrenador = context.getBean("baseball", Entrenador.class);
				
				//llamada m�todo
				System.out.println(elEntrenador.consejoDiario());
				
				// llamaremos a los m�todos "auxiliaries" o dependientes... (dependency = helper)
				System.out.println(elEntrenador.vamos_a_competir());
				
		}
		
		context.close();
	}
	
}

package com.welcome;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
	// 1 FASE-> cargar la configuración del archivo de Spring
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/**/applicationContext.xml");
	
				
		Scanner scann = new Scanner(System.in);
		System.out.println("dime qué entrenador quieres y te darán un consejo");
		String respuesta = scann.nextLine();
		
		if(respuesta.equals("personal")) {
			
			// 2 FASE -> llamar al Bean (creación objeto desde Spring)
														// ID (bean id) + nombre interfaz.class
				Entrenador elEntrenador = context.getBean("entrenando", Entrenador.class);	
				
				// Utilizamos un método del objeto recién creado
				System.out.println(elEntrenador.consejoDiario());
				
				// 3 FASE -> llamaremos a los métodos "auxiliaries" o dependientes... (dependency = helper)
				System.out.println(elEntrenador.vamos_a_competir());
				
		} else {
				Entrenador elEntrenador = context.getBean("baseball", Entrenador.class);
				
				//llamada método
				System.out.println(elEntrenador.consejoDiario());
				
				// llamaremos a los métodos "auxiliaries" o dependientes... (dependency = helper)
				System.out.println(elEntrenador.vamos_a_competir());
				
		}
		
		context.close();
	}
	
}

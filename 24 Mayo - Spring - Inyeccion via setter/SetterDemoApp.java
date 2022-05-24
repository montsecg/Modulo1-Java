package com.welcome;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// cargar el archivo de configuración
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/**/applicationContext.xml");
		
		// gestionar el bean del contenedor Spring
		EntrenadorTenis elEntrenador = context.getBean("tenis", EntrenadorTenis.class);
	
		// llamar a los métodos de dicho bean
		
		System.out.println(elEntrenador.consejoDiario());
		System.out.println(elEntrenador.vamos_a_competir());
		
		// cerrar el context. 
		context.close();
	}

}

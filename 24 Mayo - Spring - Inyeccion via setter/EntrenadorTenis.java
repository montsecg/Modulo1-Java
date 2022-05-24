package com.welcome;

public class EntrenadorTenis implements Entrenador {

	// EXPLICACI�N INYECCI�N V�A SETTER. 
	//1� -> definir atributo privado
	private competicion compitiendo;
	
	//2� -> crear un constructor por defecto 
	public EntrenadorTenis() {
		System.out.println("EntrenadorTenis: estamos dentro del constructor");
	}
	
	//3� -> crear un setter para poder realizar la "inyecci�n"
	public void setCompitiendo(competicion compitiendo) {
		System.out.println("EntrenadorTenis: estamos dentro del setCompeticion");
		this.compitiendo = compitiendo;
	}
	// 4� -> NOS VAMOS AL APPLICATIONCONTEXT
	
	
	
	
	@Override
	public String consejoDiario() {
		return "Practica el tiro r�pido cada 15 minutos";
	}

	
	@Override
	public String vamos_a_competir() {
		return "Es hora de ponernos a jugar al tenis...";
	}

}

package com.welcome;

public class EntrenadorTenis implements Entrenador {

	// EXPLICACIÓN INYECCIÓN VÍA SETTER. 
	//1º -> definir atributo privado
	private competicion compitiendo;
	
	//2º -> crear un constructor por defecto 
	public EntrenadorTenis() {
		System.out.println("EntrenadorTenis: estamos dentro del constructor");
	}
	
	//3º -> crear un setter para poder realizar la "inyección"
	public void setCompitiendo(competicion compitiendo) {
		System.out.println("EntrenadorTenis: estamos dentro del setCompeticion");
		this.compitiendo = compitiendo;
	}
	// 4º -> NOS VAMOS AL APPLICATIONCONTEXT
	
	
	
	
	@Override
	public String consejoDiario() {
		return "Practica el tiro rápido cada 15 minutos";
	}

	
	@Override
	public String vamos_a_competir() {
		return "Es hora de ponernos a jugar al tenis...";
	}

}

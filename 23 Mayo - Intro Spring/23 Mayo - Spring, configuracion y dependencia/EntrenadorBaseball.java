package com.welcome;

public class EntrenadorBaseball implements Entrenador {
	
	// 1 PASO PARA AÑADIR DEPENDENCIAS (LA CLASE E INTERFAZ COMPLEMENTARIAS)
	 // -> Definir un atributo privado para hacer funcionar la dependencia
	
	private competicion compitiendo;
	
	// 2 PASO -> definir un constructor para "inyectar" dicha dependencia
	public EntrenadorBaseball(competicion competir) {
		this.compitiendo = competir;
	}

	public String consejoDiario() {
		return "Entrena al menos 30 minutos cada día con el bate";
	}

	// 3 PASO -> ejecutar método del objeto competicion
	@Override
	public String vamos_a_competir() {
		return compitiendo.getCompeticion();
	}


	
}

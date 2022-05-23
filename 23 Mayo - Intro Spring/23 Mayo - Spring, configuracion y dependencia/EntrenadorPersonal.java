package com.welcome;

public class EntrenadorPersonal implements Entrenador {

	// 1 PASO PARA AÑADIR DEPENDENCIAS (LA CLASE E INTERFAZ COMPLEMENTARIAS)
		 // -> Definir un atributo privado para hacer funcionar la dependencia
	
	private competicion compitiendo;
	
	// 2 PASO -> definir un constructor para "inyectar" dicha dependencia
	
	public EntrenadorPersonal(competicion competir) {
		this.compitiendo = competir;
	}
	
	@Override
	public String consejoDiario() {
		return "Entrena cada mañana, pero también programa";
	}

	// 3 PASO -> ejecutar método del objeto competicion
	@Override
	public String vamos_a_competir() {
		return compitiendo.getCompeticion();
	}
}

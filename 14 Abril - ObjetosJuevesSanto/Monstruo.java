package ObjetosJuevesSanto;

public class Monstruo {

	// ATRIBUTOS
	
	int vida;
	int satisfaccion;
	int hambre;
	String tipo;
	String color;
	int altura;
	String origen;
	
	// PODEMOS CREAR UN MÉTODO ESPECIAL, QUE SIEMPRE SE EJECUTARÁ CUANDO CREEMOS UN OBJETO.
	
	public Monstruo() {
		vida = 100;
		satisfaccion = 50;
		hambre = 80;
		tipo = "Dragón";
	//	color = "rojo/negro";
//		altura = 20;
	//	origen = "El Hobbit, la novela";
	}
	
	public Monstruo(String tipo, String color, int altura, String origen) {
		vida = 100;
		satisfaccion = 50;
		hambre = 80;
		this.tipo = tipo;
		this.color = color;
		this.altura = altura;
		this.origen = origen;
	}
		
	// MÉTODOS 
	
	public void comer() {
		System.out.println("el monstruo está comiendo");
	}
	
	public void comerHobbit() {
		System.out.println("el monstruo está comiéndose a un hobbit");
	}

	public void correr() {
		System.out.println("el monstruo está corriendo");
	}

	public void dormir() {
		System.out.println("el monstruo está durmiendo");
	}
	
	
}

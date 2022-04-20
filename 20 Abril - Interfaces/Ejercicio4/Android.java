package Abril21.Ejercicio4;

public class Android extends Iphone {
	
    String modelo;
    int anoPublicacion;
    String sistemaOperativo;
    String fondoPantalla;


    public Android (String modelo, int anoPublicacion, String sistemaOperativo) {
        this.modelo = modelo;
        this.anoPublicacion = anoPublicacion;
        this.sistemaOperativo = sistemaOperativo;
    }

    public void cambiarFondoPantalla(String color) {
        this.fondoPantalla = color;
        System.out.println("El fondo de pantalla del Android es "+color);
        super.cambiarFondoPantalla();
        
     
    }
	
}

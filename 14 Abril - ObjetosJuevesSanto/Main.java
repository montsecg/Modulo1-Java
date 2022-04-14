package ObjetosJuevesSanto;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// QUEREMOS CREAR UN MONSTRUO
		
		// CREO UN OBJETO A PARTIR DE UNA CLASE LLAMADA MONSTRUO 
		Monstruo Smaug = new Monstruo();
		Monstruo Dragonite = new Monstruo();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("¿Quieres crear un nuevo monstruo. Por ejemplo, el fantástico Shenron de Dragon Ball?");
		String decision = scanner.nextLine();
		if (decision.equals("si")) {
			
			System.out.println("OK. Perfecto. Dime tipo de monstruo");
			String tipoMonstruo = scanner.nextLine();
			
		
			System.out.println("Dime color del " + tipoMonstruo);
			String colorMonstruo = scanner.nextLine();
			
			System.out.println("Dime altura del " + tipoMonstruo);
			int alturaMonstruo = scanner.nextInt();
			
			scanner = new Scanner(System.in);
			
			System.out.println("Dime origen del " + tipoMonstruo);
			String origenMonstruo = scanner.nextLine();
			
			System.out.println("******* CREANDO MONSTRUO ***** ");
	
			Monstruo Shenron = new Monstruo(tipoMonstruo, colorMonstruo, alturaMonstruo, origenMonstruo);
			
			System.out.println("******* ESTOS SON LOS DATOS INTRODUCIDOS ***** ");
			System.out.println("TIPO " + Shenron.tipo);
			System.out.println("COLOR " + Shenron.color);
			System.out.println("ALTURA " + Shenron.altura);
			System.out.println("ORIGEN " + Shenron.origen);
			
			}else {
			
			System.out.println("Una pena, adiós");
			
		}
		
		
		
		
		

	
		
		/*
		
		
		String origenSmaug = scanner.nextLine();
		System.out.println("ahora dime el origen de Dragonite");
		String origenDragonite = scanner.nextLine();
		
		Dragonite.origen = origenDragonite;
		Smaug.origen = origenSmaug;
		
		System.out.println("** COMPROBAMOS ORIGEN... **");
		System.out.println(" Smaug : " + Smaug.origen);
		System.out.println(" Dragonite : " + Dragonite.origen); */
	}

}

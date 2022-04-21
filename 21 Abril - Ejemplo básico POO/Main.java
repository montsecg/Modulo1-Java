package JardinEva;

import java.util.Scanner;

public class Main {

	 public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        
	        Jardin jardin1 = new Jardin();
	        
	        System.out.println("Tienes una planta... ¿qué quieres hacer? Regar, podar, hablar");
	        Scanner scanner = new Scanner(System.in);
	        String respuesta = scanner.nextLine();
	        
	        switch(respuesta){
	        case "regar": jardin1.regar();
	        
	        System.out.println("ya la has regado, quieres trasplantarla? Si o no");
	        String trasplantar = scanner.nextLine();
	        	
	        	if (trasplantar.equals("si")) {
	        		System.out.println("perfecto, ya las has trasplantado");
	        		// jardin1.agua = 3;
	        		
	  	        	} else {
	  	        		
	        		System.out.println("entonces la planta se pondrá a hablar...");
	        		jardin1.hablar();
	        	}
	        	
	        break;
	        
	        case "hablar": jardin1.hablar();
	        break;
	        case "podar": jardin1.podar();
	        break;
	        default: System.out.println("Opción no válida");}
	        
	     
	         
	        
	    }
}

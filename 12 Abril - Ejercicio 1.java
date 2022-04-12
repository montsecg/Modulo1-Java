import java.util.Scanner;

public class EjerciciosMetodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// EJERCICIO 1 - EJEMPLO MONTSE
		/*
	       Scanner scan = new Scanner(System.in);

	        System.out.println("APP para calcular el área de un ciruclo, cuadrado o triángulo.");
	        System.out.println("Indica ella figura qpara calcular su área: (1-CIRUCLO, 2-CUADRADO, 3-TRIANGULO): ");
	    int figura = scan.nextInt();
	        double area =0.00;

	        switch(figura){
	            case 1: area = areaCirculo();
	            break;
	            case 2: area = areaCuadrado();
	            break;
	            case 3: area = areaTriangulo();
	            break;
	            default:
	            break;
	        }
	    }

	    //MÉTODO CALCULA EL ÁREA DE UN CIRCULO-RESULTADO REAL(DOOUBLE)

	    public static double areaCirculo(){
	        Scanner scan = new Scanner(System.in);
	        double radio= 0.00;
	        double area= 0.00;
	        System.out.print("Indica el radio del círculo: ");
	    radio = scan.nextDouble();
	        area = Math.pow(radio, 2)*Math.PI;
	        System.out.println("El área del círculo es: " + area);
	      return area;
	    }

	    //MÉTODO CALCULA EL ÁREA DE UN CUADRADO-RESULTADO REAL(DOOUBLE)
	    public static double areaTriangulo(){
	        Scanner scan = new Scanner(System.in);
	        double base= 0.00;
	        double altura = 0.00;
	        double area= 0.00;
	        System.out.print("Indica la base del triangulo: ");
	    base = scan.nextDouble();
	        System.out.print("Indica la altura del triangulo: ");
	    altura = scan.nextDouble();
	        area =(base*altura)/2;

	        System.out.println("El área del triangulo es: " + area);
	      return area;
	    }
	    //MÉTODO CALCULA EL ÁREA DE UN TRIÁNGULO-RESULTADO REAL(DOOUBLE)
	    public static double areaCuadrado(){
	        Scanner scan = new Scanner(System.in);
	        double lado= 0.00;
	        double area= 0.00;
	        System.out.print("Indica lado del cuadrado: ");
	    lado = scan.nextDouble();
	        area =lado*lado;
	        System.out.println("El área del cuadrado es: " + area);
	      return area;
	    } */
		
		// EJERCICIO 1 - EJEMPLO JOAN CON BUCLE DO WHILE. 

		// CREA UNA APLICACIÓN QUE CALCULE EL ÁREA DE UN CIRCULO,
		// CUADRADO O TRIÁNGULO. 
		
		 //-> (1) PEDIMOS QUÉ FIGURA CALCULAR.
		//-> (2) SEGÚN LO PEDIDO, PEDIR VALORES NECESARIOS.
		
		/* 
		String eleccion;
		
		do {
		
		Scanner pregunta = new Scanner(System.in);
		System.out.println("dime qué figura quieres, no pongas tilde");
		eleccion = pregunta.nextLine().toLowerCase().trim();

		if (eleccion.equals("triangulo")) {
			
			System.out.println("dime la altura de tu triángulo");
			double altura = pregunta.nextDouble();
			System.out.println("dime cuánto mide la base");
			double base = pregunta.nextDouble();
			
			if (altura > 0 && base > 0) {
				System.out.println("El área del triángulo es de " + areaTriangulo(base, altura));
			} else {
				System.out.println("Valores no válidos");
			}
			
		} else if (eleccion.equals("cuadrado")) {
			
			System.out.println("Cuánto mide el lado de tu cuadrado");
			double lado = pregunta.nextDouble();
			
			if (lado > 0) System.out.println("El área del cuadrado es de " + areaCuadrado(lado));
			else System.out.println("Valores no válidos");
			
			
		} else if (eleccion.equals("circulo")) {
			
			System.out.println("Cuánto mide el radio");
			double radio = pregunta.nextDouble();
			
			if (radio > 0) System.out.println("El área del círculo es de " + areaCirculo(radio));
			else System.out.println("Valores no válidos");
			
		} else {
			System.out.println("valor no reconocido");
	
		} 
		
		} while ((!eleccion.equals("triangulo") && !eleccion.equals("circulo") && !eleccion.equals("cuadrado")));
				
		System.out.println("adiós");
		
	}	//-> (3) CREA UN MÉTODO POR CADA FIGURA PARA CALCULAR
	
		// MÉTODO PARA CIRCULO
		public static double areaCirculo(double r) {
			double resultado = Math.pow(r, 2) * Math.PI;
			return resultado;
		}
		
		public static double areaCuadrado(double s) {
			double resultado = s*s;
			return resultado;
		}
		
		public static double areaTriangulo(double b, double a) {
			double resultado = (b * a)/2;
			return resultado;
		}
		 */ 
		
		// EJERCICIO 1 - EJEMPLO JOSEP MARIA 
		
			/*
        double radio, base, altura, lado;

        boolean salir = true;

        Scanner pregunta1 = new Scanner(System.in);

        while (salir) {
            System.out.println("Calcularemos el áred de una figura.  Elige 1, 2 o 3. \n 1- Circulo.  \n 2-Triángulo.  \n 3- Cuadrado. \n 0- Salir ");

            int figura = pregunta1.nextInt();


            switch (figura) {

            case 1: 
                System.out.println("Introduce el radio del círculo");
                radio = pregunta1.nextDouble();

                System.out.println("El área de un círculo de radio " + radio + " es " + areaCirculo(radio)+"\n");

                break;

            case 2: 

                System.out.println("Introduce la base del triángulo");
                base = pregunta1.nextDouble();    

                System.out.println(("Introduce la altura del triángulo"));
                altura = pregunta1.nextDouble();

                System.out.println("El área de un triángulo de base " + base + "y una altura de " + altura + " es " + areaTriangulo(base, altura)+"\n");

                break;

            case 3:

                System.out.println("I)ntroduce el lado del cuadrado");
                lado = pregunta1.nextDouble();

                //area = lado*lado;

                System.out.println("El área de un cuadrado de lado " + lado + " es " + areaCuadrado(lado)+"\n");
                break;


            case 0:

                salir = false;
                System.out.println("Salimos del cálculo de áreas");
        }

        }    

    }

    public static double areaCirculo(double r) {

        double area = Math.PI*Math.pow(r, 2);
        return area;
    }
 
    public static double areaTriangulo(double b, double a) {

        double area = b*a/2;
        return area;

    }

    public static double areaCuadrado(double l) {
        double area = l*l;
        return area;
									*/
		
		// EJERCICIO 1 - EJEMPLO CARLOS
		/*
        int figura = 0;
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("Elegir figura");
            System.out.println("[1] Círculo");
            System.out.println("[2] Triángulo");
            System.out.println("[3] Cuadrado");
            System.out.println("[0] Salir");
            figura = scan.nextInt();
            switch(figura) {
            case 1:
                System.out.print("Ingrese radio del círculo: ");
                System.out.println("El área del círculo es: " + areaCirculo(scan.nextDouble()));
                break;
            case 2:
                System.out.print("Ingrese base y la altura del triángulo: ");
                System.out.println("El área del triángulo es: " + areaTriangulo(scan.nextDouble(),scan.nextDouble()));
                break;
            case 3:
                System.out.print("Ingrese lado del cuadrado: ");
                System.out.println("El área del cuadrado es: " + areaCuadrado(scan.nextDouble()));
                break;
            default:
                System.out.println("Opción incorrecta");
            }
            if(figura == 0) break;
            System.out.println();
            
        }
        scan.close();
        
       }
	
	   public static double areaCirculo(double radio) {
	        return Math.PI*(Math.pow(radio, 2));
	    }

	    public static double areaTriangulo(double base, double altura) {
	        return (base*altura)/2;
	    }

	    public static double areaCuadrado(double lado) {
	        return lado * lado;
	    }
	    */ 
	}
	}


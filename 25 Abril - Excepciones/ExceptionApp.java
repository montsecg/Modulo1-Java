package Abril25;

import java.util.Scanner;

public class ExceptionApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("dime un número");
			int num = scanner.nextInt();
			
			if(num >= 0 && num <= 10) { throw new MiExcepcion(111);}
			else if(num > 10 && num <= 20) { throw new MiExcepcion(222);}
			else if(num > 20 && num <= 30) { throw new MiExcepcion(333);}
		} catch (MiExcepcion ex){
			System.out.println(ex.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
	}

}

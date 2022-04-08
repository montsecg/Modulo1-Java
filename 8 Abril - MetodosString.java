package pruebas;

public class MetodosString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Ya hemos visto algunos... toUpperCase(), toLowerCase(), trim()...
		
		String nombre = "Joan";
		String nombreMayus = nombre.toUpperCase();
		System.out.println(nombreMayus);
		
		System.out.println(nombre.length());
		
		String apellido = "Vendrell";
		
		String nombreCompleto = nombre.concat(" " + apellido);
		System.out.println(nombreCompleto);
		
		System.out.println(nombre.equals("Joan"));
		System.out.println(nombre.equalsIgnoreCase("joan"));
		
		System.out.println(nombre.indexOf("m"));
		// IMPORTANTE, EL -1 INDICA QUE NO SE ENCUENTRA ESA LETRA/Nº... 

		if (nombre.indexOf("J") == -1) {
			System.out.println("no está esta letra...");
		} else {
			System.out.println("pues sí que está, sí");
		}
		
		if (nombre.contains("J") || nombre.contains("o") ) {
			System.out.println("SÍ que tiene J o la letra O");
		} else {
			System.out.println("NO tiene la letra j o la letra o");
		}
		
		String nombre2 = "Joan";
		
		System.out.println(nombre.getBytes());
		System.out.println(nombre2.getBytes());
		
		nombre2 = nombre;
		
		System.out.println(nombre.getBytes());
		System.out.println(nombre2.getBytes());
	}


}

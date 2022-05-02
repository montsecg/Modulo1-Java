import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	final String CONTROLADOR = "com.mysql.jdbc.Driver";
	final String URL = "jdbc:mysql://localhost:3306/prueba";
	final String USUARIO = "grace";
	final String CLAVE = "1234";

	public Connection conectar() {

	Connection connection = null;
	
	try {
		//A�ADIMOS ESTA INSTRUCCI�N PARA INDICARLE EL CONTROLADOR A USAR. NOS CREAR� AUTOM�TICAMENTER
		// EL CATCH CLASSNOTFOUND. 
		Class.forName(CONTROLADOR);
		connection = DriverManager.getConnection(URL, USUARIO, CLAVE);
		System.out.println("Conectado");
		
	} catch (SQLException e) {
		System.out.println("Error en la conexi�n");
		e.printStackTrace();
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println("Error al cargar el controlador");
		e.printStackTrace();
	}
	
	return connection;
	}
}

	

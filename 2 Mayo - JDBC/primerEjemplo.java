import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class primerEjemplo {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		final String CONTROLADOR = "com.mysql.jdbc.Driver";
		final String URL = "jdbc:mysql://localhost:3306/prueba";
		final String USUARIO = "grace";
		final String CLAVE = "1234";
		
		//VAMOS A CONECTARNOS A LA BASE DE DATOS MEDIANTE EL SERVIDOR
		// creación objeto de la clase Connection
		Connection connection = null;
		
		try {
			connection = DriverManager.getConnection(URL, USUARIO, CLAVE);
			System.out.println("Conectado");
		} catch (SQLException e) {
			System.out.println("Error en la conexión");
			e.printStackTrace();
		} finally {
			if(connection != null) {
				connection.close();
			}
		}
		
		
		
	}

}

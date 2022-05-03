import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConexion {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Conexion CONN = new Conexion();
			
			// TRES ELEMENTOS B�SICOS PARA CONECTARNOS A LA BASE DE DATOS.
			// OBJETO CONNECTION, PARA GESTIONAR LA CONEXI�N
			Connection connection = null;
			// OBJETO STATEMENT, PARA EJECUTAR LAS CONSULTAS A LA BASE DE DATOS. 
			Statement statement = null;
			// OBJETO RESULTSET, PARA ALMACENAR LOS RESULTADOS DE LAS CONSULTAS A LA BASE DE DATOS. 
			ResultSet resultset = null;
			
			try {
				//CONECTAMOS
				connection = CONN.conectar();
				
				/*
				// INSERTAREMOS ELEMENTOS AQU�
				// grabamos en un string la instrucci�n con interrogantes (valores que vamos a a�adir / diferentes columnas)
				String sql = "insert into users values(?, ?, ?, ?)";
				// creamos objeto preparedStatement
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setString(1, "6");
				preparedStatement.setString(2, "Joan");
				preparedStatement.setString(3, "joan@mail.com");
				preparedStatement.setString(4, "espa�ola");
				
				int result = preparedStatement.executeUpdate();
				
				if (result == 1) {
					System.out.println("Registro incorporado correctamente");
				} else {
					System.out.println("Error");
				} 
				*/ 
				// GUARDAMOS CONEXI�N Y EN EL STATEMENT
				statement = connection.createStatement();
				// GUARDAMOS B�SQUEDA EN EL RESULTSET 
				resultset = statement.executeQuery("SELECT * FROM users ORDER BY id DESC");
				

				System.out.println("*** Resultados b�squeda ***");
				// NECESITAMOS UN M�TODO QUE NOS IMPRIMA POR PANTALLA O POR LA P�GINA WEB LOS RESULTADOS. USAMOS WHILE.
				while(resultset.next()) {
					int id = resultset.getInt(1);
					String nombre = resultset.getString(2);
					String correo = resultset.getString(3);
					String nacionalidad = resultset.getString(4);
					
					System.out.println(id + " - " + nombre + " - " + correo + " - " + nacionalidad);
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			
				//IMPORTANTE A�ADIR UN FINALLY PARA CERRAR TODAS LAS CONEXIONES CON EL SERVIDOR Y LA BASE DE DATOS. 
			} finally {
				try {
					if (resultset != null) {
						resultset.close();
						System.out.println("Cerrando ResultSet");
					}
					
					if (statement != null) {
						statement.close();
						System.out.println("Cerrando Statement");
					}
					
					if (connection != null) {
						connection.close();
						System.out.println("Cerrando Connection");
					}
			}	catch (Exception e2) {
				e2.printStackTrace();
			}
			}
		}
	}
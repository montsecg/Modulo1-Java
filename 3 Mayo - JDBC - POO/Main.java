import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws SQLException {

		selector();
		
	}

	public static void selector() throws SQLException{
		
		Datos datos = new Datos();
		System.out.println("¿Qué quieres hacer: buscar (select), añadir (insert) o borrar (delete)?");
		Scanner scann = new Scanner(System.in);
		String respuesta = scann.nextLine();
		respuesta = respuesta.toLowerCase().trim();
		switch (respuesta) {
		case "select": datos.buscar();
			break;
		case "insert": datos.insertar();
			break;
		case "delete": datos.borrar();
			break;
		default: System.out.println("tienes que escribir o SELECT, o INSERT, o DELETE");
			}
		
		selector();
	}
			
		
	}
	

	
			
			
		/*
		
		
			
			
			statement = connection.createStatement();
			resultset = statement.executeQuery("SELECT * FROM users ORDER BY id DESC");
			
			System.out.println("*** Resultados búsqueda ***");
			
			while(resultset.next()) {
				int id = resultset.getInt(1);
				String nombre = resultset.getString(2);
				String correo = resultset.getString(3);
				String nacionalidad = resultset.getString(4);
				
				System.out.println(id + " - " + nombre + " - " + correo + " - " + nacionalidad);
			}
		} catch (SQLException e) {
			e.printStackTrace();

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

		
		
		
	} */



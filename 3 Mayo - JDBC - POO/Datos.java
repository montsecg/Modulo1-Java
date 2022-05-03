import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Datos {

	public static void buscar() throws SQLException {

		Conexion conn = new Conexion();
		Connection connection = null;
		connection = conn.conectar();
		Statement statement = null;
		ResultSet resultset = null;

		statement = connection.createStatement();
		resultset = statement.executeQuery("SELECT * FROM users ORDER BY id DESC");

		System.out.println("*** Resultados búsqueda ***");

		while (resultset.next()) {
			int id = resultset.getInt(1);
			String nombre = resultset.getString(2);
			String correo = resultset.getString(3);
			String nacionalidad = resultset.getString(4);

			System.out.println(id + " - " + nombre + " - " + correo + " - " + nacionalidad);
		}
	}

	public static void insertar() throws SQLException {
		Conexion conn = new Conexion();
		Connection connection = null;
		connection = conn.conectar();
		
		System.out.println("dime los cuatro elementos a insertar con este orden: id, nombre, mail y nacionalidad");
		Scanner scann = new Scanner(System.in);
		String id = scann.nextLine();
		String nombre = scann.nextLine();
		String mail = scann.nextLine();
		String nacionalidad = scann.nextLine();
		
		String sql = "insert into users values(?, ?, ?, ?)";
		// creamos objeto preparedStatement
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, id);
		preparedStatement.setString(2, nombre);
		preparedStatement.setString(3, mail);
		preparedStatement.setString(4, nacionalidad);
		
		int result = preparedStatement.executeUpdate();
		
		if (result == 1) {
			System.out.println("Registro incorporado correctamente");
			System.out.println("Nuevo registro con estos datos: " + id + " " + nombre + " " + mail + " " + nacionalidad);
		} else {
			System.out.println("Error");
		} 
	}

	public static void borrar() throws SQLException {

		Conexion conn = new Conexion();
		Connection connection = null;
		connection = conn.conectar();
		
		System.out.println("dime qué persona (a partir del nombre) quieres borrar");
		Scanner scann = new Scanner(System.in);
		String nombre = scann.nextLine();
		
		String sql = "DELETE FROM users WHERE nombre = ? ";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);		
		preparedStatement.setString(1, nombre);
		int result = preparedStatement.executeUpdate();
		
		if(result == 1) {
			System.out.println("Registro borrado");
			System.out.println("Se ha borrado el registro cuyo nombre es " + nombre);
		} else {
			System.out.println("Error");
		}
		
	}

}

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Página de Registro</title>
</head>
<body>

	<%@ page import="com.welcome.Alumno, com.welcome.EscribeArchivo" %>
	<%
	
	// OBTENCIÓN DE LOS PARÁMETROS DE LA PETICIÓN
	
	String nombre = request.getParameter("nombre");
	String apellidos = request.getParameter("apellidos");
	String nota = request.getParameter("nota");
	
	// CREACIÓN OBJETO ALUMNO PARA PASARLE LOS DATOS POR EL CONSTRUCTOR
	// LOS DATOS RECIBIDOS SE GUARDAN EN EL OBJETO alumno.
	Alumno alumno = new Alumno(nombre, apellidos, Double.parseDouble(nota));
	
	// indicamos aquí el contexto: el directorio de la dynamic web.
	ServletContext sc = this.getServletContext();
	
	String path = sc.getRealPath("/WEB-INF/Promedios.txt");
	System.out.println(path);
	path = path.replace('\\', '/');
	System.out.println(path);
	
	// guardar en archivo
	EscribeArchivo.add(alumno, path);
	%>
	
	<h2>Tu registro ha sido un éxito</h2>
	
	<form action="index.jsp" method="post">
		<input type="submit"  value="Nuevo Registro">
	</form>

</body>
</html>
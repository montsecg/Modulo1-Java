<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<title> Captura Datos</title>
</head>
<body>

	<%@ page import="com.welcome.MyServlet" %>
	<h1> Esta es la página de inicio</h1>
	<h2> Aquí se piden los datos </h2>
	<p> Hola, por favor introduce la información </p>

	
	<form action="MyServlet" method="post">
		<table cellspacing="3" cellpadding="3" border="1">
			<tr>
				<td align="right">Nombre:</td>
				<td><input type="text" name="nombre"></td>
			</tr>
			<tr>
				<td align="right">Apellidos:</td>
				<td><input type="text" name="apellidos"></td>
			</tr>
			<tr>
				<td align="right">Nota media:</td>
				<td><input type="text" name="prom"></td>
			</tr>
		</table>
	
	<input type="reset" value="Borrar">
	<input type="submit" value="Enviar">
	
	</form>


</body>
</html>
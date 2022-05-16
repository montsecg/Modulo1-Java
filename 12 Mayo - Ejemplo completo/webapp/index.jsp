<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<title> Index JSP</title>
</head>
<body>

<%@ page import="com.welcome.registraProducto" %>

	<h2> Hola! Proporciona los datos</h2>
	<h2> Del producto</h2>

	
	<form action="registraProducto" method="post">
		<table cellspacing="3" cellpadding="3" border="1">
			<tr>
				<td align="right">Clave:</td>
				<td><input type="text" name="clave"></td>
			</tr>
			<tr>
				<td align="right">Nombre:</td>
				<td><input type="text" name="nombre"></td>
			</tr>
			<tr>
				<td align="right">Precio:</td>
				<td><input type="text" name="precio"></td>
			</tr>
			<tr>
				<td align="right">Cantidad:</td>
				<td><input type="text" name="cant"></td>
			</tr>
		</table>
	
	<input type="reset" value="Borrar">
	<input type="submit" value="Enviar">
	
	</form>
	
	<form action="muestraProductos" method="post">
		<input type="submit" value="Ver productos">
	</form>


</body>
</html>
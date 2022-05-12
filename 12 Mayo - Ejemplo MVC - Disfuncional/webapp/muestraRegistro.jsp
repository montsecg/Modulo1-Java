<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Muestra registro</title>
</head>
<body>

<%@ page import="com.welcome.Producto" %>
<%
	Producto producto = (Producto) request.getAttribute("atributoProducto");
%>

<h2>Archivo MuestraRegistro.jsp</h2>
<p> Se guardaron los siguientes datos </p>
<table cellspacing="3" cellpadding="3" border="1">
	<tr>
		<td align="right"> Clave </td>
		<td> <%= producto.getClave() %></td>
	</tr>
	<tr>
		<td align="right"> Nombre</td>
		<td> <%= producto.getNombre() %> </td>
	</tr>
		<tr>
		<td align="right"> Precio</td>
		<td> <%= producto.getPrecio() %> </td>
	</tr>
		<tr>
		<td align="right"> Cantidad</td>
		<td> <%= producto.getCantidad() %> </td>
	</tr>
</table>

<form action="index.jsp" method="post">
	<input type="submit" value="Regresar">
</form>



</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Página Destino JSP</title>
</head>
<body>

<%@ page import="com.welcome.Calculo" %>
<%

// EXTRACCIÓN DE LOS PARÁMETROS RECIBIDOS

	String nombre = request.getParameter("nombre");
	String tInicial = request.getParameter("inicial");
	String tFinal = request.getParameter("final");
	String distancia = request.getParameter("distancia");
	
	Double vel, tiempo;
	
	Calculo calculo = new Calculo(tInicial, tFinal, distancia);
	calculo.velocidad();
	vel = calculo.getVelocidad();
	calculo.tiempoTotal();
	tiempo = calculo.getTiempo();

%>

<h2>Resultado</h2>
<p> Hola <%= nombre %> </p>
<table cellspacing="3" cellpadding="3" border="1">
	<tr>
		<td align="right"> Tu tiempo total fue: </td>
		<td> <%= tiempo %> minutos </td>
	</tr>
	<tr>
		<td align="right"> Y tu velocidad: </td>
		<td> <%= vel %> metros/minuto </td>
	</tr>
</table>

<form action="index.jsp" method="post">
	<input type="submit" value="Regresar">
</form>



</body>
</html>
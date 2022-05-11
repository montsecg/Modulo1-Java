<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <title>JSP PAGE</title>
</head>
<body>
	<%@ page import="com.welcome.Alumno" %>
	
	<% 
		// Recuperación del objeto enviado por el servlet.
		Alumno alumno = (Alumno) request.getAttribute("atributoAlumno");
	%>
	
	<h1>Archivo muestraDatos.jsp</h1>
	<h2>Aquí se despliegan los datos que envió el servlet</h2>
	<p>Tus datos son los siguientes:</p>

	<table cellspacing="3" cellpadding="3" border="1">
		<tr>
			<td align="right">Te llamas:</td>
			<td><%=alumno.getNombre()%>
		</tr>
		<tr>
			<td align="right">Tus apellidos son:</td>
			<td><%=alumno.getApellidos()%>
		</tr>
		<tr>
			<td align="right">Tu nota media es:</td>
			<td><%=alumno.getPromedio()%>
		</tr>
	</table>
	
	<form action="index.jsp" method="post">
		<input type="submit" value="regresar">
	</form>

</body>
</html>
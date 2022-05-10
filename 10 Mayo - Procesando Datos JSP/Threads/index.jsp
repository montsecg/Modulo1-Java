<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Ejemplo Threads</title>
</head>
<body>
	<%@ page import="java.util.Date"%>

	<%! // Me va a permitir crear variables globales

	int cuentaGlobal = 0;

%>

	<% // Esto es un scriptlet, por tanto crea variables locales. 
	cuentaGlobal++;

	int cuentaLocal = 0; 
	cuentaLocal++;%>

	<h1> En esta página se lleva la cuenta del número de acceso</h1>
	<table cellspacing="3" cellpading="3" border="1">
		<tr>
			<td align="right">Fecha y hora:</td>
			<td><%= new Date() %></td>
		</tr>
	</table>
	</br>
	<table cellspacing="5" cellpading="5" border="1.5">
		<tr>
			<td align="right">Número de accesos</td>
			<td><%= cuentaGlobal %></td>
			
			<td align="right">Valor cuentaLocal</td>
			<td><%= cuentaLocal %></td>
			
		</tr>
	</table>





</body>
</html>
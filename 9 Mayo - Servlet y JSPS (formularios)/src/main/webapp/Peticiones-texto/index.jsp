<%@page contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<!-- METADATOS -->
<meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
<title>AREA DE TEXTO</title>
</head>
<body>

	<h1>Esta es la p�gina de inicio</h1>
	<h2>Aqu� se piden los datos</h2>
	<p>Hola, por favor introduce la informaci�n</p>
	<form action="paginaDestino.jsp" method="POST">
		<table cellspacing="3" cellpadding="3" border="1">
			<tr>
				<td align="right">Nombre:</td>
				<td><input type="text" name="nombre"></td>
			</tr>

			<tr>
				<td align="right">Lenguaje programaci�n preferido:</td>
				<td><input type="text" name="lenguaje"></td>
			</tr>

			<tr>
				<td align="right">Correo:</td>
				<td><input type="text" name="mail"></td>
			</tr>
		</table>
		
		<input type="reset" value="Borrar">
		<input type="submit" value="Enviar">


	</form>


</body>

</html>

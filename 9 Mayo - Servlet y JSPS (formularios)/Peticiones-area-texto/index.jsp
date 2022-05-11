<%@page contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<!-- METADATOS -->
<meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
<title>Area de texto</title>
</head>
<body>

	<h1>Esta es la página de inicio</h1>
	<p>Escribe algo</p>
	
	<form action="paginaDestino.jsp" method="POST">
	<textarea name="area1" rows="3" cols="30">
	
	</textarea>
	
	<p>Vuelve a hacerlo</p>
	
	<textarea name="area2" rows="4" cols="60">
	
	</textarea>
	
	<input type="submit" value="Enviar">
	</form>
</body>

</html>

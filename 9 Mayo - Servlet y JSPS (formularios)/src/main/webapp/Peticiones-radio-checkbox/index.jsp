<%@page contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<!-- METADATOS -->
<meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
<title>Captura con radio-button y checkbox</title>
</head>
<body>

	<h1>Esta es la página de inicio</h1>
	<h2>Aquí se piden los datos</h2>
	<p>Hola, por favor introduce la información</p>
	
	<form action="paginaDestino.jsp" method="POST">
	
		<p>Elige que transporte prefieres </p>
		<input type="radio" name="transporte" value="car">Coche 
		<input type="radio" name="transporte" value="train">Tren 
		<input type="radio" name="transporte" value="plane">Avión 
		<input type="radio" name="transporte" value="bus">Autobús 
		<input type="radio" name="transporte" value="lorry">Camión 
		
		<p> ¿Cuáles son tus destinos favoritos? </p>
		
		<input type="checkbox" name="ciudad" value="city">Ciudad 
		<input type="checkbox" name="bosque" value="forest">Bosque 
		<input type="checkbox" name="playa" value="beach">Playa 
		<input type="checkbox" name="montanya" value="montain">Montaña

		<input type="submit" value="Enviar">


	</form>


</body>

</html>

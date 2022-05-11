<%@page contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%-- COMENTARIO --%>

<!DOCTYPE html>
<html>
<head>
<!-- METADATOS -->
<meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
<title>DESTINO</title>
</head>
<body>
	<%
	// Añadimos nuestros primeros scriptlets.
	// Código de Java que captura los parámetros con el objeto
	// "request"
	String transporte = request.getParameter("transporte");
	String ciudad = request.getParameter("ciudad");
	String bosque = request.getParameter("bosque");
	String playa = request.getParameter("playa");
	String montanya = request.getParameter("montanya");
	
	%>

	<h1>Esta es la página de destino</h1>
	<h2>Aquí se despliegan los datos que se recibieron</h2>
	<p>Tus datos son los siguientes:</p>

	<table cellspacing="3" cellpadding="3" border="1">

		<tr>
			<td align="right">Te transporte preferido es el: </td>
			<td><%= transporte %></td>
		</tr>
	</table>
	
	<p> Elegiste los siguientes destinos: <br>
	
		<% if(ciudad != null) { %>
		<!--  HTML -->	ciudad,
		<% } %>
		
		<% if(bosque != null) { %>
		<!--  HTML -->	bosque,
		<% } %>
		
		<% if(playa != null) { %>
		<!--  HTML -->	playa,
		<% } %>
		
		<% if(montanya != null) { %>
		<!--  HTML -->	montaña.
		<% } %>
		
	
	</p>
	
	<form action="index.jsp" method="post">
		<input type="submit" value="Regresar">
	</form>


</body>

</html>
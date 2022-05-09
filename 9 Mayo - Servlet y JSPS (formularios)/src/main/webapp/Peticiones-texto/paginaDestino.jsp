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
	String nombreJava = request.getParameter("nombre");
	String lenguajeJava = request.getParameter("lenguaje");
	String mailJava = request.getParameter("mail");
	%>

	<h1>Esta es la página de destino</h1>
	<h2>Aquí se despliegan los datos que se recibieron</h2>
	<p>Tus datos son los siguientes:</p>

	<table cellspacing="3" cellpadding="3" border="1">

		<tr>
			<td align="right">Te llamas:</td>
			<td><%=nombreJava%></td>
		</tr>
		<tr>
			<td align="right">Tu lenguaje de programación preferido es:</td>
			<td><%=lenguajeJava%></td>
		</tr>
		<tr>
			<td align="right">Tu correo es:</td>
			<td><%=mailJava%></td>
		</tr>

	</table>


</body>

</html>
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
	// A�adimos nuestros primeros scriptlets.
	// C�digo de Java que captura los par�metros con el objeto
	// "request"
	//String areaTexto1 = request.getParameter("area1");
	
	String areaTexto2 = request.getParameter("area2");
	String areaTexto1 = request.getParameter("area1");
	%>

	<h1>Esta es la p�gina de destino</h1>
	<h2>Aqu� se despliegan los datos que se recibieron</h2>

	<table cellspacing="3" cellpadding="3" border="1">

		<tr>
			<td align="right">El usuario escribi�</td>
			<td><%= areaTexto2 %></td>
					<td><%= areaTexto1 %></td>
		</tr>
	</table>
	
	<form action="index.jsp" method="POST">
		<input type="submit" value="Regresar">
	</form>


</body>

</html>
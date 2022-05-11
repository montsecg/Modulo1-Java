<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	String nombre = request.getParameter("nombre");
	String apellidos = request.getParameter("apellidos");
	String mail = request.getParameter("mail");

	String genero = request.getParameter("genero");

	String php = request.getParameter("php");
	String sql = request.getParameter("sql");
	String java = request.getParameter("java");
	String html = request.getParameter("html");
	String angular = request.getParameter("angular");

	String[] idiomasMult = request.getParameterValues("idiomas");

	String area = request.getParameter("area");
	%>

	<h1>Formulario de solicitud</h1>

	<h2>Tus datos son los siguientes:</h2>

	<table cellspacing="3" cellpadding="3" border="1">
		<tr>
			<th text align="left">Tu nombre es:</th>
			<td><%=nombre%></td>
		</tr>
		<tr>
			<th text align="left">Tus apellidos son:</th>
			<td><%=apellidos%></td>
		</tr>
		<tr>
			<th text align="left">Tu correo:</th>
			<td><%=mail%></td>
		</tr>
		<tr>
			<th text align="left">Te identificas como:</th>
			<td><%=genero%></td>
		</tr>
	</table>

	<p>
		Los lenguajes de programación que manejas son:
		<%
	if (php != null) {
	%>
		php,
		<%
	}
	%>
		<%
		if (sql != null) {
		%>
		sql,
		<%
		}
		%>
		<%
		if (java != null) {
		%>
		java,
		<%
		}
		%>
		<%
		if (html != null) {
		%>
		montaña,
		<%
		}
		%>
		<%
		if (angular != null) {
		%>
		angular.
		<%
		}
		%>
	</p>

	<p>
		Los idiomas que dominas son:
		<%
	for (int i = 0; i < idiomasMult.length; i++) {
	%>
		<%=idiomasMult[i]%>
		<%
		}
		%>
	</p>

	<%
	if (area != null) {
	%>

	<p>
		Has añadido el siguiente comentario: <br> "<%=area%>
		<%
		}
		%>"
	</p>
</body>
</html>
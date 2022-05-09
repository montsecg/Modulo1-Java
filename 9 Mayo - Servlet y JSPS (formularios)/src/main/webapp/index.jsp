<%@ page language="java" contentType ="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.Date"%>



<!DOCTYPE html>
<html>
<head> <!-- METADATOS -->
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	
	<p>Hello, this text is created on my JSP page.</p>
	
	<form action="ServletFuncional" method="GET">
		<button type="submit">Get Message</button>
	</form>
	
	
	
	<form action="ServletFuncional" method="POST">
	<button type="submit">Post Message</button>
	</form>
	
</body>

</html>

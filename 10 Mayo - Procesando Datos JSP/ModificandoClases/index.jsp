<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 
    <h1>Formulario de solicitud</h1>

    <p>Proporciona tus datos</p>
 
    <form action="registro.jsp" method="POST">
        <table cellspacing="3" cellpadding="3" border="1">
            <tr>
                <th text align="left">Nombre:</th>
                <td><input type="text" name="nombre"></td>
            </tr>
            <tr>
                <th text align="left">Apellidos:</th>
                <td><input type="text" name="apellidos"></td>                
            </tr>
            <tr>
                <th text align="left">Nota media</th>
                <td><input type="text" name="nota"></td>                
            </tr>
        </table>
        
        <input type="submit" name="Enviar">
        <input type="reset" name="Borrar">
    </form>
 
</body>
</html>
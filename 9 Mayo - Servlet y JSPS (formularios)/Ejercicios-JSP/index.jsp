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

    <p>Debes introducir tus datos. Cuando hayas finalizado, envía la información con el botón "Enviar", o elíminala antes con el botón "Borrar".</p>
 
    <form action="enviar.jsp" method="POST">
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
                <th text align="left">Correo:</th>
                <td><input type="email" name="mail"></td>                
            </tr>
        </table>

        <p>Te identificas como:</p>
        <input type="radio" name="genero" value="mujer" checked="checked">Mujer
        <input type="radio" name="genero" value="hombre">Hombre

        <p>Elige qué lenguajes de programación manejas</p>
        <input type="checkbox" name="php" value="php">PHP
        <input type="checkbox" name="sql" value="sql">SQL
        <input type="checkbox" name="java" value="java" checked="checked">Java
        <input type="checkbox" name="html" value="html">HTML
        <input type="checkbox" name="angular" value="angular">Angular

        <p>Elige los idiomas que dominas:
        <select name="idiomas" multiple>
        <option>Català</option>
        <option>Español</option>
        <option>English</option>
        <option>日本語</option>
        <option>Nederlandse</option>

        </select>
        </p>

        <p>Comentarios:</p>
        <textarea name="area" rows="4" cols="50">
        </textarea>

        <br>

        <input type="submit" name="Enviar">
        <input type="reset" name="Borrar">

    </form>
 
</body>
</html>
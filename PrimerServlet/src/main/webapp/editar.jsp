<%@page import="com.martindelgado.primerservlet.servlets.logica.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Usuario</title>
    </head>
    <body>
        <% Usuario usr = (Usuario)request.getSession().getAttribute("usrEditar"); %>
        <h1>Datos del usuario</h1>
        <form action="SvEditar"method="POST">
            <p><label>Dni:</label><input type="text" name="dni" value=<%= usr.getDni() %>></p>
            <p><label>Nombre:</label><input type="text" name="nombre" value=<%= usr.getNombre() %>></p>
            <p><label>Apellido:</label><input type="text" name="apellido" value=<%= usr.getApellido() %>></p>
            <p><label>Telefono:</label><input type="text" name="telefono" value=<%= usr.getTelefono() %>></p>
            <button type="submit">Guardar Cambios</button>
        </form>
    </body>
</html>

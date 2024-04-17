<%@page import="com.martindelgado.primerservlet.servlets.logica.Usuario"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Lista de Usuarios Registrados</h1>
        <%
            List <Usuario> listaUsuarios = (List) request.getSession().getAttribute("listaUsuarios");
            int cont = 1;
            for (Usuario usu : listaUsuarios) {
        %>
                <p><b>Usuario n°: <%= cont%></b></p>
                <p>Id: <%=usu.getId()%></p>
                <p>Dni: <%=usu.getDni()%></p>
                <p>Nombre: <%=usu.getNombre()%></p>
                <p>Apellido: <%=usu.getApellido()%></p>
                <p>Telefono: <%=usu.getTelefono()%></p>
                <%cont++;%>
            <% } %>       
    </body>
</html>

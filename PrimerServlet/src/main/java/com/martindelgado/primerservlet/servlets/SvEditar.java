package com.martindelgado.primerservlet.servlets;

import com.martindelgado.primerservlet.servlets.logica.ControladoraLogica;
import com.martindelgado.primerservlet.servlets.logica.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "SvEditar", urlPatterns = {"/SvEditar"})
public class SvEditar extends HttpServlet {
    
    ControladoraLogica controladoraLog = new ControladoraLogica();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //Traigo y parseo el string de la id, para poder llamar a las funciones
        // de traer usuario que pide id tipo int como parametro
        int id_editar = Integer.parseInt(request.getParameter("id_usuarioEditar"));
        //usr va a ser el usuario a editar
        Usuario usr = controladoraLog.traerUsuario(id_editar);
        //guardo los datos de la sesion, osea el usuario obtenido
        HttpSession miSesion = request.getSession();
        miSesion.setAttribute("usrEditar", usr);
        //para despues enviarlo al jsp que se va a encargar de obtener los
        //datos de la edicion
        response.sendRedirect("editar.jsp");
        
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String dni = request.getParameter("dni");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String telefono = request.getParameter("telefono");
        
        Usuario usr = (Usuario)request.getSession().getAttribute("usrEditar");
        usr.setDni(dni);
        usr.setNombre(nombre);
        usr.setApellido(apellido);
        usr.setTelefono(telefono);
        
        controladoraLog.editarUsuario(usr);
        
        response.sendRedirect("index.jsp");

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

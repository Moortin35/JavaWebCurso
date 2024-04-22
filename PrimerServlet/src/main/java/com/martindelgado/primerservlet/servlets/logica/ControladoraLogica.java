package com.martindelgado.primerservlet.servlets.logica;

import com.martindelgado.primerservlet.servlets.persistencia.ControladoraPersistencia;
import java.util.List;

public class ControladoraLogica {
    
    ControladoraPersistencia controladoraPersis = new ControladoraPersistencia();
    
    public void crearUsuario(Usuario usr){
        controladoraPersis.crearUsuario(usr);
    }
    
    public List<Usuario> traerUsuarios(){
        return controladoraPersis.traerUsuarios();
    }

    public void eliminarUsuario(int idEliminar) {
        controladoraPersis.eliminarUsuario(idEliminar);
    }

    public Usuario traerUsuario(int id_editar) {
        return controladoraPersis.traerUsuario(id_editar);
    }

    public void editarUsuario(Usuario usr) {
        controladoraPersis.editarUsuario(usr);
    }
    
}

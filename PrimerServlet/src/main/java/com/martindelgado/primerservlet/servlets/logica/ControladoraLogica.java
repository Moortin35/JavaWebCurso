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
    
}

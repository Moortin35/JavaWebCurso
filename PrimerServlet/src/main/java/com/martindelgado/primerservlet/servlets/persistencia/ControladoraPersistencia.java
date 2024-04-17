package com.martindelgado.primerservlet.servlets.persistencia;

import com.martindelgado.primerservlet.servlets.logica.Usuario;
import java.util.List;

public class ControladoraPersistencia {
    
    UsuarioJpaController usuarioJPA = new UsuarioJpaController();
    
    //Operacion CREATE
    public void crearUsuario(Usuario usr){
        usuarioJPA.create(usr);
    }
    
    //Operacion READ
    public List<Usuario> traerUsuarios(){
        return usuarioJPA.findUsuarioEntities();
    }
    
}

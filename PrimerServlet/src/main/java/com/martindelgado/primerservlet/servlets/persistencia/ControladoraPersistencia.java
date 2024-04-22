package com.martindelgado.primerservlet.servlets.persistencia;

import com.martindelgado.primerservlet.servlets.logica.Usuario;
import com.martindelgado.primerservlet.servlets.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    public void eliminarUsuario(int idEliminar) {
        try {
            usuarioJPA.destroy(idEliminar);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Usuario traerUsuario(int id_editar) {
        return usuarioJPA.findUsuario(id_editar);
    }

    public void editarUsuario(Usuario usr) {
        try {
            usuarioJPA.edit(usr);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

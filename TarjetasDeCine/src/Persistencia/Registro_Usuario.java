/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Entidades.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Registro_Usuario implements I_Usuario {
    
    private List<Usuario> ListUsuario;

    public Registro_Usuario() {
        this.ListUsuario = new ArrayList();
    }

    public List<Usuario> getListUsuario() {
        return ListUsuario;
    }

    public void setListUsuario(List<Usuario> ListUsuario) {
        this.ListUsuario = ListUsuario;
    }

    @Override
    public boolean agregarUsuario(Usuario A) {
        return this.ListUsuario.add(A);
    }

    @Override
    public boolean eliminarUsuario(Usuario A) {
        return this.ListUsuario.remove(A);
    }
    
    
    
}

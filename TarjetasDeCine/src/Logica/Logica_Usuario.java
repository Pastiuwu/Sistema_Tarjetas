/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Entidades.Usuario;
import Persistencia.I_Usuario;
import Persistencia.Registro_Usuario;

/**
 *
 * @author Usuario
 */
public class Logica_Usuario {
    private I_Usuario persistencia;

    public Logica_Usuario() {
        this.persistencia = new Registro_Usuario();
    }
    
    public boolean registrarUsuario(Usuario A){
        return this.persistencia.agregarUsuario(A);
    }
    
    public boolean cancelarUsuario(Usuario A){
        return this.persistencia.eliminarUsuario(A);
    }
    
}

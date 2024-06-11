/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Entidades.Cliente;
import Persistencia.I_Cliente;
import Persistencia.Registro_Cliente;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Logica_Cliente {
    
    private I_Cliente persistencia;

    public Logica_Cliente() {
        this.persistencia = new Registro_Cliente();
    }

    public boolean registrarCliente(Cliente A){
        return this.persistencia.agregarCliente(A);   
    }
    
    public boolean cancelarCliente(Cliente A){
        return this.persistencia.eliminarCliente(A);
    }
    
    public Cliente encontrarCliente(long identificacion){
        return this.persistencia.buscarCliente(identificacion);
    }
    
    public List<Cliente> ListaCliente(){
        return this.persistencia.obtenerClientes();
    }
    
}

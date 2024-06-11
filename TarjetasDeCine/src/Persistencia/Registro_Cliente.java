/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Entidades.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Registro_Cliente implements I_Cliente {
    
    private List<Cliente> ListCliente;

    public Registro_Cliente() {
        this.ListCliente = new ArrayList();
    }

    public List<Cliente> getListCliente() {
        return ListCliente;
    }

    public void setListCliente(List<Cliente> ListCliente) {
        this.ListCliente = ListCliente;
    }

    @Override
    public boolean agregarCliente(Cliente A) {
        return this.ListCliente.add(A);
    }

    @Override
    public boolean eliminarCliente(Cliente A) {
        return this.ListCliente.add(A);
    }
    
    @Override
    public Cliente buscarCliente(long identificacion){
        for(Cliente a: this.ListCliente){
            if(a.getIdentificacion() == identificacion){
                return a;
            }
        }
        return null;
    }    
   
    @Override
    public List<Cliente> obtenerClientes(){
        return this.ListCliente;
    }
    
    
    
    
}

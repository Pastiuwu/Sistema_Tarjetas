/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Entidades.Cliente;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface I_Cliente {
    
    boolean agregarCliente(Cliente A);
    Cliente buscarCliente(long identificacion);
    boolean eliminarCliente(Cliente A);
    List<Cliente> obtenerClientes();
}

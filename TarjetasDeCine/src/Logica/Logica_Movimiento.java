/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Entidades.Movimiento;
import Persistencia.I_Movimiento;
import Persistencia.Registro_Movimiento;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Logica_Movimiento {
    
    private I_Movimiento persistencia;

    public Logica_Movimiento() {
        this.persistencia = new Registro_Movimiento();
    }
    
    public boolean registrarMovimiento(Movimiento A){
        return this.persistencia.agregarMovimiento(A);
    }
    
    public List<Movimiento> ListaMovimiento(){
        return this.persistencia.obtenerMovimientos();
    }
    
}

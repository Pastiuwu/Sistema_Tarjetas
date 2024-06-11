/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Entidades.Movimiento;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Registro_Movimiento implements I_Movimiento {

    private List<Movimiento> ListMovimiento;

    public Registro_Movimiento() {
        this.ListMovimiento = new ArrayList();
    }
    
    public List<Movimiento> getListMovimiento() {
        return ListMovimiento;
    }

    public void setListMovimiento(List<Movimiento> ListMovimiento) {
        this.ListMovimiento = ListMovimiento;
    }
    @Override
    public boolean agregarMovimiento(Movimiento A) {
        return this.ListMovimiento.add(A);
    }

    @Override
    public List<Movimiento> obtenerMovimientos() {
        return this.ListMovimiento;
    }

}

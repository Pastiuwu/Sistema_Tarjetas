/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Entidades.Movimiento;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface I_Movimiento {
    boolean agregarMovimiento(Movimiento A);
    List<Movimiento> obtenerMovimientos();
}

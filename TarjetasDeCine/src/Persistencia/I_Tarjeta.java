/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Entidades.Tarjeta;

/**
 *
 * @author Usuario
 */
public interface I_Tarjeta {
    
    boolean agregarTarjeta(Tarjeta A);
    Tarjeta buscarTarjeta(long NoTarjeta);
    boolean eliminarTarjeta(Tarjeta A);
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.time.LocalDate;

/**
 *
 * @author Usuario
 */
public class TarjetaPremium extends Tarjeta{

    public TarjetaPremium() {
    }

    public TarjetaPremium(long No_Tarjeta, int CodSeg, LocalDate FechaVen, double Saldo, String Estado) {
        super(No_Tarjeta, CodSeg, FechaVen, Saldo, Estado);
    }

    @Override
    public String toString() {
        return "TarjetaPremium{" + '}';
    }
    
    
}

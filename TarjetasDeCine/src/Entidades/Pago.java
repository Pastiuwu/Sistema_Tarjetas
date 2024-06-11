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
public class Pago extends Movimiento {

    public Pago() {
    }

    public Pago(String Descripcion, LocalDate Fecha, double Monto) {
        super(Descripcion, Fecha, Monto);
    }

    @Override
    public String toString() {
        return "Pago{" + super.toString() + '}';
    }

	public void pagar(Tarjeta tarjeta, double monto) {
		
		
	}
    
    
}

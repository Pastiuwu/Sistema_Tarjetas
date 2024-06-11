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
public class Recarga extends Movimiento {

    public Recarga() {
    }

    public Recarga(String Descripcion, LocalDate Fecha, double Monto) {
        super(Descripcion, Fecha, Monto);
    }

    @Override
    public String toString() {
        return "Recarga{" + super.toString() + '}';
    }

	public void recargar(Tarjeta tarjeta, double monto) {
		
		
	}
    
    
}

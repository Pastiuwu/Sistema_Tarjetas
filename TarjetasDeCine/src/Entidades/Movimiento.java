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
public abstract class Movimiento {
    
    private String Descripcion;
    private LocalDate Fecha;
    private double Monto;

    public Movimiento() {
    }

    public Movimiento(String Descripcion, LocalDate Fecha, double Monto) {
        this.Descripcion = Descripcion;
        this.Fecha = Fecha;
        this.Monto = Monto;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public LocalDate getFecha() {
        return Fecha;
    }

    public void setFecha(LocalDate Fecha) {
        this.Fecha = Fecha;
    }

    public double getMonto() {
        return Monto;
    }

    public void setMonto(double Monto) {
        this.Monto = Monto;
    }

    @Override
    public String toString() {
        return "Movimiento{" + "Descripcion=" + Descripcion + ", Fecha=" + Fecha + ", Monto=" + Monto + '}';
    }
    
    
}

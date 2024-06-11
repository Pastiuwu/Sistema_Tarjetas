/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

public class Cliente extends Persona {
    
    private int PuntosCompra;
    private long numeroTarjeta;

    public Cliente() {
    }

    public Cliente(int PuntosCompra, String Nombre, long identificacion, long numeroTarjeta) {
        super(Nombre, identificacion);
        this.PuntosCompra = PuntosCompra;
        this.numeroTarjeta = numeroTarjeta;
    }

    public int getPuntosCompra() {
        return PuntosCompra;
    }

    public void setPuntosCompra(int PuntosCompra) {
        this.PuntosCompra = PuntosCompra;
    }

    public long getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(long numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public String toString() {
        return "Cliente{" + "PuntosCompra=" + PuntosCompra + ", numeroTarjeta=" + numeroTarjeta + '}';
    }
}



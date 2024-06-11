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
public class Tarjeta {
    
    private long No_Tarjeta;
    private int CodSeg;
    private LocalDate FechaVen;
    private double Saldo;
    private String Estado;

    public Tarjeta() {
    }

    public Tarjeta(long No_Tarjeta, int CodSeg, LocalDate FechaVen, double Saldo, String Estado) {
        this.No_Tarjeta = No_Tarjeta;
        this.CodSeg = CodSeg;
        this.FechaVen = FechaVen;
        this.Saldo = Saldo;
        this.Estado = Estado;
    }

    public long getNo_Tarjeta() {
        return No_Tarjeta;
    }

    public void setNo_Tarjeta(long No_Tarjeta) {
        this.No_Tarjeta = No_Tarjeta;
    }

    public int getCodSeg() {
        return CodSeg;
    }

    public void setCodSeg(int CodSeg) {
        this.CodSeg = CodSeg;
    }

    public LocalDate getFechaVen() {
        return FechaVen;
    }

    public void setFechaVen(LocalDate FechaVen) {
        this.FechaVen = FechaVen;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    @Override
    public String toString() {
        return "Tarjeta{" + "No_Tarjeta=" + No_Tarjeta + ", CodSeg=" + CodSeg + ", FechaVen=" + FechaVen + ", Saldo=" + Saldo + ", Estado=" + Estado + '}';
    }

	public void recargar(double monto) {
		// TODO Auto-generated method stub
		
	}

	public void pagar(double monto) {
		// TODO Auto-generated method stub
		
	}
    
    
}

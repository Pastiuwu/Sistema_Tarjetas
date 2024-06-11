/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import Entidades.Tarjeta;
import Entidades.TarjetaPremium;
import Persistencia.I_Tarjeta;
import Persistencia.Registro_Tarjeta;
import java.time.LocalDate;
import java.util.Random;

/**
 *
 * @author Usuario
 */
public class Logica_Tarjeta {
    
    private I_Tarjeta persistencia;

    public Logica_Tarjeta() {
        this.persistencia = new Registro_Tarjeta();
    }
    
    
    public static long generarNoTarjeta() {
        
        Random random = new Random();

        StringBuilder numtarjeta = new StringBuilder();
        for (int i = 0; i < 16; i++) {
            numtarjeta.append(random.nextInt(10)); 
        }
        
        return Long.parseLong(numtarjeta.toString());
    }      
    
    public static int generarNoCodSeg(){
        
        Random random = new Random();
        int Cod = 100 + random.nextInt(900);
        return Cod;
        
    }
    
    public Tarjeta registrarTarjeta(long No_Tarjeta, int CodSeg, LocalDate FechaVen, double Saldo, String Estado, int Tipo){
        
        switch (Tipo) {
            case 1:
                return new Tarjeta(No_Tarjeta, CodSeg, FechaVen, Saldo, Estado);
               
            case 2:
                return new TarjetaPremium(No_Tarjeta, CodSeg, FechaVen, Saldo, Estado);
               
            default: return null;
        }        
    }
    
    public boolean cancelarTarjeta(Tarjeta A){
        return this.persistencia.eliminarTarjeta(A);
    }
    
    public Tarjeta encontrarTarjeta(long NoTarjeta){
        return this.persistencia.buscarTarjeta(NoTarjeta);
    }
    
    public void sumarSaldo(Tarjeta tarjeta, double monto) {
        if (monto > 0) {
            tarjeta.setSaldo(tarjeta.getSaldo() + monto);
        } else {
            System.out.println("El monto a sumar debe ser positivo.");
        }
    }

    public void restarSaldo(Tarjeta tarjeta, double monto) {
        if (monto > 0) {
            if (tarjeta.getSaldo() >= monto) {
                tarjeta.setSaldo(tarjeta.getSaldo() - monto);
            } else {
                System.out.println("No hay suficiente saldo para realizar la operación.");
            }
        } else {
            System.out.println("El monto a restar debe ser positivo.");
        }
    }
    
}


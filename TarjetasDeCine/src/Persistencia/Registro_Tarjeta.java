/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Entidades.Tarjeta;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Registro_Tarjeta implements I_Tarjeta {
    
    private List<Tarjeta> ListTarjeta;

    public Registro_Tarjeta() {
        this.ListTarjeta = new ArrayList();
    }

    public List<Tarjeta> getListTarjeta() {
        return ListTarjeta;
    }

    public void setListTarjeta(List<Tarjeta> ListTarjeta) {
        this.ListTarjeta = ListTarjeta;
    }

    @Override
    public boolean agregarTarjeta(Tarjeta A) {
        return this.ListTarjeta.add(A);
    }

    @Override
    public Tarjeta buscarTarjeta(long NoTarjeta) {
        for(Tarjeta a: this.ListTarjeta){
            if(a.getNo_Tarjeta() == NoTarjeta){
                return a;
            }
        }
        return null;        
    }

    @Override
    public boolean eliminarTarjeta(Tarjeta A) {
        return this.ListTarjeta.remove(A);
    
    }
    
    
}

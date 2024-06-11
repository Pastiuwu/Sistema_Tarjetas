/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Usuario
 */
public abstract class Persona {
    
    private String Nombre;
    private long identificacion;

    public Persona() {
    }

    public Persona(String Nombre, long identificacion) {
        this.Nombre = Nombre;
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public long getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(long identificacion) {
        this.identificacion = identificacion;
    }

    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + Nombre + ", identificacion=" + identificacion + '}';
    }
    
    
    
}

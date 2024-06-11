/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Usuario
 */
public class Usuario extends Persona {
    
    private String Usarname;
    private String Clave;

    public Usuario() {
    }

    public Usuario(String Usarname, String Clave, String Nombre, long identificacion) {
        super(Nombre, identificacion);
        this.Usarname = Usarname;
        this.Clave = Clave;
    }

    public String getUsarname() {
        return Usarname;
    }

    public void setUsarname(String Usarname) {
        this.Usarname = Usarname;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    @Override
    public String toString() {
        return "Usuario{" + "Usarname=" + Usarname + ", Clave=" + Clave + '}';
    }
    
    
}

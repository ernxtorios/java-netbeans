/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresatransporte;

/**
 *
 * @author SARITA
 */
public class Chofer {
    private String dni;
    private String nombre;
    private String direccion;
    
    public Chofer(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public void estado() {
        System.out.println("Datos del Conductor");
        System.out.println("-------------------");
        System.out.println("DNI: " + 
                this.dni + "\nNombre: " + 
                this.nombre + "\nDirección: "
                + this.direccion);
    }
}

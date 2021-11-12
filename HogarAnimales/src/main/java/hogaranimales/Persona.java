package hogaranimales;

import java.util.List;

public class Persona {

    private String dni;

    private String nombre;

    private String direccion;

    private String genero;
    
    private List<Animal> animales;

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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public List<Animal> getAnimales() {
        return animales;
    }

    public void setAnimales(List<Animal> animales) {
        this.animales = animales;
    }

    public Persona(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }
    
    public void estado() {
        System.out.println("Nombre: " +
                this.nombre + ", DNI: " + 
                this.dni + ", Dirección: " + 
                this.direccion + ", Género: " + 
                this.genero);
    }
    
    public void reporteAnimales() {
        animales.forEach(a -> {
            System.out.println(a.getNombre());
        });
    }
}

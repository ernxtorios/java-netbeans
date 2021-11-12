package modelo;

public class Torta {

    private String tipo;

    private double precio;

    private double peso;

    private String descripcion;
    
    private boolean disponible;
    
    public Torta(String tipo) {
        this.tipo = tipo;
        this.precio = 0;
        this.peso = 0;
        this.descripcion = "";
        this.disponible = true;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isDisponible() {
        return disponible;
    }
    
    public String getDisponible() {
        if (this.disponible) {
            return "Sí";
        } else {
            return "No";
        }
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void estado() {
        System.out.println("Tipo: " + this.tipo + ", Precio: " + this.precio + 
                ", Peso: " + this.peso + ", Descripción: " + this.descripcion + 
                ", Disponible: " + this.disponible);
    }
}
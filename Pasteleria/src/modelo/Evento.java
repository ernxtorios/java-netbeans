package modelo;


import java.util.Date;

public class Evento {

    private String descripcion;

    private String lugar;

    private Date fecha;
    
    private boolean atendido;
    
    public Evento() {
        this.fecha = new Date();
        this.atendido = false;
    }

    public Evento(String descripcion) {
        this.descripcion = descripcion;
        this.lugar = "";
        this.fecha = new Date();
        this.atendido = false;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public boolean isAtendido() {
        return atendido;
    }
    
    public String getAtendido() {
        if (this.atendido) {
            return "Sí";
        } else {
            return "No";
        }
    }

    public void setAtendido(boolean atendido) {
        this.atendido = atendido;
    }

    public void estado() {
        System.out.println("Descripción: " + this.descripcion + ", Lugar: " +
                this.lugar + ", Fecha: " + this.fecha + 
                ", Atendido: " + this.getAtendido());
    }
}
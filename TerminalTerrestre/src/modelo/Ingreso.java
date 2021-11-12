package modelo;


import java.util.Date;

public class Ingreso {

    private Date fecha;

    private Bus bus;

    public Ingreso(Bus bus) {
        this.fecha = new Date();
        this.bus = bus;
    }

    public Ingreso() {
        this.fecha = new Date();
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public void estado() {
        System.out.println("Datos del ingreso: Fecha de ingreso: " + 
                this.getFecha()+ ", Número de placa del bus: " + 
                this.getBus().getPlaca() + ", Empresa: " + 
                this.getBus().getEmpresa().getNombre());
    }
}

package modelo;

public class EventoNormal extends Evento implements IEntrega {
    public EventoNormal() {
        super();
    }
    
    public EventoNormal(String descripcion) {
        super(descripcion);
    }
   
    @Override
    public double tiempoEntrega(double tiempo) {
        return tiempo;
    }
}

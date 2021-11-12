package modelo;

public class EventoEspecial extends Evento implements IEntrega {
    public EventoEspecial() {
        super();
    }
    
    public EventoEspecial(String descripcion) {
        super(descripcion);
    }
    
    @Override
    public double tiempoEntrega(double tiempo) {
        return 20;
    }
}

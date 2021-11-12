package modelo;

import java.util.Date;

public class Pedido {

    private String numero;

    private Date fecha;

    private Evento evento;

    private final double tiempoEntrega;

    private Cliente cliente;

    public Pedido() {
        this.fecha = new Date();
        this.tiempoEntrega = 60;
    }
    
    public Pedido(Cliente c, Evento e) {
        this.fecha = new Date();
        this.evento = e;
        this.cliente = c;
        this.tiempoEntrega = 60;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        if (!evento.isAtendido()) {
            this.evento = evento;
            this.evento.setAtendido(true);
        } else {
            System.out.println("El evento ha sido atendido");
        }
        
    }

    public double getTiempoEntrega() {
        return tiempoEntrega;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public void estado() {
        EventoNormal eventoNormal;
        EventoEspecial eventoEspecial;
        
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("DATOS DEL PEDIDO");
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("Número: " + this.getNumero() + 
                "\nFecha: " + this.getFecha());
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.print("EVENTO: ");
        this.getEvento().estado();
        if (this.getEvento() instanceof EventoNormal) {
                System.out.println("Tipo: Todo tipo de ocasión");
                eventoNormal = (EventoNormal) this.getEvento();
                System.out.println("Tiempo de entrega: " + eventoNormal.tiempoEntrega(this.getTiempoEntrega()));
        }
        if (this.getEvento() instanceof EventoEspecial) {
                System.out.println("Tipo: Ocasión especial");
                eventoEspecial = (EventoEspecial) this.getEvento();
                System.out.println("Tiempo de entrega: " + eventoEspecial.tiempoEntrega(this.getTiempoEntrega()));
        }
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.print("CLIENTE: ");
        this.getCliente().estado();
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
    }
}
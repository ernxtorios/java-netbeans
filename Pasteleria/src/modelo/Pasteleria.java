package modelo;


import java.util.ArrayList;
import java.util.Date;

public class Pasteleria {

    private String nombre;

    private ArrayList<Pedido> pedidos;
    
    private ArrayList<DetallePedido> itemsPedido;
    
    private ArrayList<Torta> tortas;

    private ArrayList<Evento> eventos;

    public Pasteleria(String nombre) {
        this.nombre = nombre;
        tortas = new ArrayList<>();
        eventos = new ArrayList<>();
        pedidos = new ArrayList<>();
        itemsPedido = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public ArrayList<DetallePedido> getItemsPedido() {
        return itemsPedido;
    }

    public void setItemsPedido(ArrayList<DetallePedido> itemsPedido) {
        this.itemsPedido = itemsPedido;
    }

    public ArrayList<Torta> getTortas() {
        return tortas;
    }

    public void setTortas(ArrayList<Torta> tortas) {
        this.tortas = tortas;
    }

    public ArrayList<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(ArrayList<Evento> eventos) {
        this.eventos = eventos;
    }
    
    public void agregarPedido(Pedido pedido) {
        this.pedidos.add(pedido);
    }

    public void modificarPedido(Pedido pedido, int indice) {
        this.pedidos.set(indice, pedido);
    }

    public void eliminarPedido(Pedido pedido) {
        this.pedidos.remove(pedido);
    }

    public Pedido buscarPedido(Pedido pedido) {
        Pedido elPedido = new Pedido();
        
        for (Pedido p : this.pedidos) {
            if (pedido.equals(p)) {
                elPedido = p;
            }
        }
        
        return elPedido;
    }

    public ArrayList<Pedido> buscarPedido(Date Fecha) {
        ArrayList<Pedido> losPedidos = new ArrayList<Pedido>();
        
        for (Pedido p : this.pedidos) {
            if (p.getFecha() == Fecha) {
                losPedidos.add(p);
            }
        }
        
        return losPedidos;
    }

    public ArrayList<Pedido> buscarPedido(Cliente cliente) {
        ArrayList<Pedido> losPedidos = new ArrayList<Pedido>();
        
        for (Pedido p : this.pedidos) {
            if (p.getCliente().equals(cliente)) {
                losPedidos.add(p);
            }
        }
        
        return losPedidos;
    }

    public ArrayList<Pedido> buscarPedido(Evento evento) {
        ArrayList<Pedido> losPedidos = new ArrayList<Pedido>();
        
        for (Pedido p : this.pedidos) {
            if (p.getEvento().equals(evento)) {
                losPedidos.add(p);
            }
        }
        
        return losPedidos;
    }
    
    public void agregarItemPedido(DetallePedido itemPedido) {
        this.itemsPedido.add(itemPedido);
    }

    public void modificarItemPedido(DetallePedido itemPedido, int indice) {
        this.itemsPedido.set(indice, itemPedido);
    }

    public void eliminarItemPedido(DetallePedido itemPedido) {
        this.itemsPedido.remove(itemPedido);
    }

    public DetallePedido buscarItemPedido(DetallePedido itemPedido) {
        DetallePedido elItemPedido = new DetallePedido();
        
        for (DetallePedido iP : this.itemsPedido) {
            if (itemPedido.equals(iP)) {
                elItemPedido = iP;
            }
        }
        
        return elItemPedido;
    }

    public ArrayList<DetallePedido> buscarItemPedido(Pedido pedido) {
        ArrayList<DetallePedido> losItemsPedido = new ArrayList<DetallePedido>();
        
        for (DetallePedido iP : this.itemsPedido) {
            if (iP.getPedido().equals(pedido)) {
                losItemsPedido.add(iP);
            }
        }
        
        return losItemsPedido;
    }

    public ArrayList<DetallePedido> buscarItemPedido(String tipoTorta) {
        ArrayList<DetallePedido> losItemsPedido = new ArrayList<DetallePedido>();
        
        for (DetallePedido iP : this.itemsPedido) {
            if (iP.getTorta().getTipo().equals(tipoTorta)) {
                losItemsPedido.add(iP);
            }
        }
        
        return losItemsPedido;
    }
    
    public double totalItemsPedido(Pedido pedido) {
        double suma = 0;
        
        for (DetallePedido iP : this.itemsPedido) {
            if (iP.getPedido().equals(pedido)) {
                suma = suma + iP.getTorta().getPrecio();
            }
        }
        
        return suma;
    }

    public void agregarTorta(Torta torta) {
        this.tortas.add(torta);
    }

    public void modificarTorta(Torta torta, int indice) {
        this.tortas.set(indice, torta);
    }

    public void eliminarTorta(Torta torta) {
        this.tortas.remove(torta);
    }

    public Torta buscarTorta(Torta torta, String tipoTorta) {
        Torta laTorta = new Torta(tipoTorta);
        
        for (Torta t : this.tortas) {
            if (torta.equals(t)) {
                laTorta = t;
            }
        }
        
        return laTorta;
    }

    public ArrayList<Torta> buscarTorta(String tipo) {
        ArrayList<Torta> lasTortas = new ArrayList<Torta>();
        
        for (Torta t : this.tortas) {
            if (t.getTipo().equals(tipo)) {
                lasTortas.add(t);
            }
        }
        
        return lasTortas;
    }

    public ArrayList<Torta> buscarTortaPrecio(double precio) {
        ArrayList<Torta> lasTortas = new ArrayList<Torta>();
        
        for (Torta t : this.tortas) {
            if (t.getPrecio() <= precio) {
                lasTortas.add(t);
            }
        }
        
        return lasTortas;
    }

    public ArrayList<Torta> buscarTortaPeso(double peso) {
        ArrayList<Torta> lasTortas = new ArrayList<Torta>();
        
        for (Torta t : this.tortas) {
            if (t.getPeso() == peso) {
                lasTortas.add(t);
            }
        }
        
        return lasTortas;
    }
    
    public void reporteTortas() {
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("CATALOGO DE TORTAS");
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        for (Torta t : this.getTortas()) {
            System.out.println("Tipo: " + t.getTipo() + 
                ", Descripción: " + t.getDescripcion() +
                ", Peso: " + t.getPeso() + 
                ", Precio: " + t.getPrecio() + 
                ", Disponible: " + t.getDisponible());
        }
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println();
    }

    public void agregarEvento(Evento evento) {
        this.eventos.add(evento);
    }

    public void modificarEvento(Evento evento, int indice) {
        this.eventos.set(indice, evento);
    }

    public void eliminarEvento(Evento evento) {
        this.eventos.remove(evento);
    }

    public Evento buscarEvento(Evento evento, String descripcion) {
        Evento elEvento = new Evento(descripcion);
        
        for (Evento e : this.eventos) {
            if (evento.equals(e)) {
                elEvento = e;
            }
        }
        
        return elEvento;
    }
    
    public void reporteEventos() {
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("CATALOGO DE EVENTOS");
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        for (Evento e : this.getEventos()) {
            System.out.println("Descripción: " + e.getDescripcion() +
                ", Lugar: " + e.getLugar() + 
                ", Fecha: " + e.getFecha() + 
                ", Atendido: " + e.getAtendido());
        }
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println();
    }
}
package colasejercicio1;

import java.util.ArrayList;
import java.util.LinkedList;

public class Colas {
    public static void main(String[] args) {
        int turnoVIP = 0;
        
        // La cola
        LinkedList<Cliente> cola = new LinkedList();
        
        // Los clientes
        ArrayList<Cliente> clientes = new ArrayList<>();
        
        clientes.add(new Cliente("Cliente 1", ""));
        clientes.add(new Cliente("Cliente 2", "VIP"));
        clientes.add(new Cliente("Cliente 3", ""));
        clientes.add(new Cliente("Cliente 4", ""));
        clientes.add(new Cliente("Cliente 5", "VIP"));
        clientes.add(new Cliente("Cliente 6", ""));
        clientes.add(new Cliente("Cliente 7", ""));
        clientes.add(new Cliente("Cliente 8", "VIP"));
        clientes.add(new Cliente("Cliente 9", ""));
        clientes.add(new Cliente("Cliente 10", ""));
        clientes.add(new Cliente("Cliente 11", ""));
        clientes.add(new Cliente("Cliente 12", ""));
        clientes.add(new Cliente("Cliente 13", "VIP"));
        clientes.add(new Cliente("Cliente 14", ""));
        clientes.add(new Cliente("Cliente 15", ""));
        
        // A la cola, a la cola
        for (Cliente cliente : clientes) {
            if (cliente.getTipo().equals("VIP")) {
                cola.add(turnoVIP, cliente);
                turnoVIP++;
            } else {
                cola.add(cliente);
            }
        }
        
        // Atención de la cola
        System.out.println("La cola tiene " + cola.size() + " clientes.");
        System.out.println("Atendiendo la cola...");
        while (cola.peek() != null) {
            System.out.println(cola.poll().getNombre());
        }
        System.out.println("La cola tiene " + cola.size() + " clientes.");
    }   
}

class Cliente {
    private String nombre;
    private String tipo;
    private final int preferencia;
    
    public Cliente(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        
        if (tipo.equalsIgnoreCase("VIP")) {
            this.preferencia = 2;
        } else if (tipo.equalsIgnoreCase("")) {
            this.preferencia = 1;
        } else {
            this.preferencia = 1;
        }  
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPreferencia() {
        return preferencia;
    }
}
package partidasajedrez;

import java.util.Scanner;

//clase que representa al jugador
class Jugador {
    private String nombre;
    
    public Jugador(String nombre){
        this.nombre = nombre;
    }
    
    public Jugador(){
        this.nombre = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String elJugador() {
        return "Datos del jugador: Nombre: " + this.getNombre();
    } 
}

//Clase que representa la partida
class Partida {
    private Jugador[] jugadores;
    private double tiempo;
    private String resultado;
    
    public Partida(Jugador[] jugadores) {
        this.jugadores = new Jugador[2];
        this.jugadores = jugadores;
        this.tiempo = 0;
        this.resultado = "";
    }
    
    public Partida() {
        this.jugadores = new Jugador[2];
        this.tiempo = 0;
        this.resultado = "";
    }

    public Jugador[] getJugadores() {
        return jugadores;
    }

    public void setJugadores(Jugador[] jugadores) {
        this.jugadores = jugadores;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    
    public String laPartida() {
        String datosPartida;
        
        datosPartida = "Datos de la partida:\nJugadores:\n";
        
        for (int j=0; j<this.getJugadores().length; j++) {
            datosPartida = datosPartida + "Jugador " + (j+1) + ": " + this.getJugadores()[j].getNombre() + "\n";
        }
        
        datosPartida = datosPartida + "Tiempo: " + this.getTiempo() + "\n";
        datosPartida = datosPartida + "Resultado (Ganador): " + this.getResultado();
        
        return datosPartida;
    }
}

//Clase principal
public class PartidasAjedrez {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int nPartidas;
        
        //Arreglo que almacena los nombres de los jugadores
        String [] jugadores = new String[2];
        
        //Arreglo que almacena los objetos de tipo jugador
        Jugador [] losJugadores = new Jugador[2];
        double tiempo;
        String resultado;
        
        System.out.println("Registrando partidas de juegos de ajedrez:");
        System.out.print("¿Cuántas partidas de ajedrez?: ");
        nPartidas = in.nextInt();
        in.nextLine();
        
        //Arreglo de partidas
        Partida[] partidas = new Partida[nPartidas];
        
        //Registro de partidas
        for (int i = 0; i < nPartidas; i++) {
            System.out.println("Registrando datos de la partida " + (i+1) + ":");
            
            System.out.print("Jugador 1: ");
            jugadores[0] = in.nextLine();
            Jugador jugador1 = new Jugador(jugadores[0]);
            losJugadores[0] = jugador1;
            
            System.out.print("Jugador 2: ");
            jugadores[1] = in.nextLine();
            Jugador jugador2 = new Jugador(jugadores[1]);
            losJugadores[1] = jugador2;
           
            partidas[i] = new Partida(losJugadores);
            
            System.out.print("Tiempo: ");
            tiempo = in.nextDouble();
            in.nextLine();
            partidas[i].setTiempo(tiempo);
            System.out.print("Resultado (Nombre del jugador ganador): ");
            resultado = in.nextLine();
            partidas[i].setResultado(resultado);
        }
        
        //Reporte de partidas
        System.out.println();
        System.out.println("Reportando datos de las partidas de ajedrez:");
        for (int i = 0; i < nPartidas; i++) {
            System.out.println("Partida " + (i+1) + ":");
            System.out.println(partidas[i].laPartida());
            System.out.println();
        }
        
        //Reporte del tiempo promedio de las partidas
        System.out.println(); 
        System.out.print("Tiempo promedio de partidas: " + tiempoPromedio(partidas));
        
        //consulta del tiempo de cada partida
        System.out.println(); 
        System.out.print("Tiempo de la partida 1: " + tiempoPartida(partidas, 1));
        
        System.out.println(); 
        System.out.print("Tiempo de la partida 2: " + tiempoPartida(partidas, 2));
    }
    
    //Metodo que calcula el tiempo promedio de las partidas
    static double tiempoPromedio(Partida[] partidas) {
        double sumaTiempos = 0;
        
        for (int i = 0; i < partidas.length; i++) {
            sumaTiempos = sumaTiempos + partidas[i].getTiempo();
        }
        
        return sumaTiempos/(partidas.length);
    }
    
    //Metodo que devuelve el tiempo de una partida dada
    static double tiempoPartida(Partida[] partidas, int partida) {
        return partidas[partida - 1].getTiempo();
    }
}

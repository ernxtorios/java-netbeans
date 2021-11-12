package modelo;


import java.util.ArrayList;


// Clase que representa la videoteca
public class Videoteca {

    private String nombre;

    private ArrayList<Pelicula> peliculas;
    
    // Constructor de la clase Videoteca en base a un nombre pasado por parámetro
    public Videoteca(String nombre) {
        this.nombre = nombre;
        this.peliculas = new ArrayList<>();
    }
    
    // Constructor por defecto de la clase Videoteca
    public Videoteca() {
        this.nombre = "";
        this.peliculas = new ArrayList<>();
    }

    // Los getters y los setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    // Método que permite agregar una película nueva a la liste de películas de la videoteca
    public void agregarPelicula(Pelicula pelicula) {
        this.getPeliculas().add(pelicula);
    }

    // Método para buscar una película en la lista de películas, en base a su código pasado por parámetro
    public Pelicula buscarPeliculaCodigo(String codigo) {
        Pelicula laPelicula = new Pelicula();
        
        for (Pelicula p : this.getPeliculas()) {
            if (p.getCodigo().equalsIgnoreCase(codigo)) {
                laPelicula = p;
            }
        }
        
        return laPelicula;
    }
    
    // Método para buscar una película en la lista de películas, en base a su título pasado por parámetro
    public Pelicula buscarPeliculaTitulo(String titulo) {
        Pelicula laPelicula = new Pelicula();
        
        for (Pelicula p : this.getPeliculas()) {
            if (p.getTitulo().equalsIgnoreCase(titulo)) {
                laPelicula = p;
            }
        }
        
        return laPelicula;
    }

    // Método para reportar la lista de películas de la videoteca
    public void reportePeliculas() {
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("LISTADO DE PELICULAS:");
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        for (Pelicula p : this.getPeliculas()) {
            System.out.println(p.laPelicula());
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        }
    }
    
    // Método para reportar los datos de una película dada por parámetro
    public void reportePelicula(Pelicula pelicula) {
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("LOS DATOS DE LA PELICULA QUE BUSCA SON:");
        System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(pelicula.laPelicula());
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }
    
    // Método que imprime el menú de acciones realizadas en la videoteca
    public void menuPrincipal() {
        System.out.println("------------------------------------------------------------------");
        System.out.println("Videoteca " + this.getNombre());
        System.out.println("------------------------------------------------------------------");
        System.out.println("1. Registrar una nueva película");
        System.out.println("2. Consultar una película");
        System.out.println("3. Listar todas las películas");
        System.out.println("4. Salir");
        System.out.println("------------------------------------------------------------------");
    }
}
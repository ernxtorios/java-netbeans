package modelo;


// Clase que representa la película
public class Pelicula {

    private String codigo;

    private String titulo;

    private double presupuesto;

    private int calificacion;

    private int duracion;

    private Pelicula precuela;

    // Constructor de la clase Pelicula en base a un título de película pasado por parámetro
    public Pelicula(String titulo) {
        this.codigo = "";
        this.titulo = titulo;
        this.presupuesto = 0;
        this.calificacion = 0;
        this.duracion = 0;
    }

    // Constructor por defecto de la clase Pelicula
    public Pelicula() {
        this.codigo = "";
        this.titulo = "";
        this.presupuesto = 0;
        this.calificacion = 0;
        this.duracion = 0;
    }

    // Los setters y getters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Pelicula getPrecuela() {
        return precuela;
    }

    public void setPrecuela(Pelicula precuela) {
        this.precuela = precuela;
    }

    // Método que devuelve una cadena de texto (String) con los datos de la película
    public String laPelicula() {
        // Variable que almacena la cadena de texto devolver, inicialmente vacía
        String laPelicula = "";
        
        // Concateno los valores de las propiedades de la película
        laPelicula = "Datos de la pelicula: Código: " + this.getCodigo() + 
               ", Título: " + this.getTitulo() +
               ", Presupuesto: " + this.getPresupuesto() + " dolares " + 
               ", Calificación: " + this.getCalificacion() + " puntos " +
               ", Duración: " + this.getDuracion() + " minutos";
        
        // Modifico la cadena laPelicula en base a si tiene una precuela o no
        if (this.getPrecuela() != null) {
            if (!(this.getPrecuela().getCodigo().equals(""))) {
                laPelicula = laPelicula + ", Película precuela: " + this.getPrecuela().getTitulo();
            }
        }
       
        return laPelicula;
    }
}
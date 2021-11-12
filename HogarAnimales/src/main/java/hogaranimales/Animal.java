package hogaranimales;

public class Animal {

    private String color;

    private float peso;

    private float edad;

    private float longitud;

    private float altura;

    private String nombre;
    
    private String genero;
    
    private String raza;
    
    private Persona adoptante;
    
    private Persona registrador;

    public Animal() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getEdad() {
        return edad;
    }

    public void setEdad(float edad) {
        this.edad = edad;
    }

    public float getLongitud() {
        return longitud;
    }

    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Persona getAdoptante() {
        return adoptante;
    }

    public void setAdoptante(Persona adoptante) {
        this.adoptante = adoptante;
    }

    public Persona getRegistrador() {
        return registrador;
    }

    public void setRegistrador(Persona registrador) {
        this.registrador = registrador;
    }
    
    public void estado() {
        System.out.println("Datos del animal: Nombre: " +
                this.nombre + "\nPeso: " + 
                this.peso + ", Edad: " + 
                this.edad + ", Longitud: " + 
                this.longitud + ", Altura: " + 
                this.altura + ", Color: " + 
                this.color + ", Género: " +
                this.genero + ", Raza: " + 
                this.raza);
    }
    
    public void datosAdoptante() {
        System.out.print("Datos de adoptante: ");
        this.adoptante.estado();
    }
    
    public void datosRegistrador() {
        System.out.print("Datos del registrador: ");
        this.registrador.estado();
    }
}

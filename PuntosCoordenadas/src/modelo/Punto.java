package modelo;

// Clase que representa el punto 3D

public class Punto {
    // Las propiedades de la clase, que representan las coordenas x, y , z
    private int x;
    private int y;
    private int z;
    
    // El constructor de la clase que inicializa en el punto (0, 0, 0) al punto
    public Punto() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }
    
    // El constructor de la clase que inicializa en el punto (x, y, z) al punto dado
    public Punto(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Los seters y los geters
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
    
    // Método que retorna el punto en formato (x, y, z)
    public String punto() {
        return "(" + this.getX() + ", " + this.getY() + ", " + this.getZ() + ")";
    }
}

package hogaranimales;

public class Perro extends Animal {

    private float longitudEsperada;

    private float alturaEsperada;

    public float getLongitudEsperada() {
        return longitudEsperada;
    }

    public void setLongitudEsperada(float longitudEsperada) {
        this.longitudEsperada = longitudEsperada;
    }

    public float getAlturaEsperada() {
        return alturaEsperada;
    }

    public void setAlturaEsperada(float alturaEsperada) {
        this.alturaEsperada = alturaEsperada;
    }

    public Perro() {
    }
    
    @Override
    public void estado() {
        System.out.println("Tipo: Perro");
        super.estado();
        System.out.println("Altura esperada: " + 
                this.alturaEsperada + ", Longitud esperada: " +
                this.longitudEsperada);
    }
}


package empresatransporte;

/**
 *
 * @author SARITA
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private String placa;
    private int ano;
    private int capacidad;
    private String tipo;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Chofer getConductor() {
        return conductor;
    }

    public void setConductor(Chofer conductor) {
        this.conductor = conductor;
    }
    
    private Chofer conductor;
    
    public Vehiculo(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    public void estado() {
        System.out.println("Datos del Vehículo");
        System.out.println("------------------");
        System.out.println("Marca: " + 
                this.marca + "\nModelo: " +
                this.modelo + "\nNúmero de placa: " + 
                this.placa + "\nAño de fabricación: " + 
                this.ano + "\nCapacidad máxima: " + 
                this.capacidad + "\nTipo: " +
                this.tipo);
        this.getConductor().estado();
    }
}

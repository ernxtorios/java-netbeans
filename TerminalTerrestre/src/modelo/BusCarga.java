package modelo;

public class BusCarga extends Bus implements IBus {

    private double pesoCargaMaxima;

    private double pesoCarga;
    
    public BusCarga() {
        super();
        this.pesoCargaMaxima = 0;
        this.pesoCarga = 0;
    }
    
    public BusCarga(String placa, String marca, String modelo) {
        super(placa, marca, modelo);
        this.pesoCargaMaxima = 0;
        this.pesoCarga = 0;
    }

    public double getPesoCargaMaxima() {
        return pesoCargaMaxima;
    }

    public void setPesoCargaMaxima(double pesoCargaMaxima) {
        this.pesoCargaMaxima = pesoCargaMaxima;
    }

    public double getPesoCarga() {
        return pesoCarga;
    }

    public void setPesoCarga(double pesoCarga) {
        this.pesoCarga = pesoCarga;
    }
    
    @Override
    public void estado() {
        super.estado();
        System.out.println("Datos del bus de carga: Peso carga máxima: " + this.getPesoCargaMaxima() + 
                ", Peso de carga: " + this.getPesoCarga());
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }

    @Override
    public double calcularPago(double tarifaVehiculoCarga, double tarifaVehiculoPasajeros, double porcentajeImpuestoBus) {
        return tarifaVehiculoCarga;
    }
    
    public void getPeso() {
        System.out.println("Peso de carga: " + this.getPesoCarga());
    }
}

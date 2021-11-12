package modelo;

public class BusPasajeroCarga extends Bus implements IBus {

    private int asientosTotales;

    private int asientosOcupados;

    private double pesoCargaMaxima;

    private double pesoCarga;
    
    private double precioPasaje;
    
    public BusPasajeroCarga() {
        super();
        this.asientosTotales = 0;
        this.asientosOcupados = 0;
        this.pesoCargaMaxima = 0;
        this.pesoCarga = 0;
        this.precioPasaje = 0;
    }
    
    public BusPasajeroCarga(String placa, String marca, String modelo) {
        super(placa, marca, modelo);
        this.asientosTotales = 0;
        this.asientosOcupados = 0;
        this.pesoCargaMaxima = 0;
        this.pesoCarga = 0;
        this.precioPasaje = 0;
    }

    public int getAsientosTotales() {
        return asientosTotales;
    }

    public void setAsientosTotales(int asientosTotales) {
        this.asientosTotales = asientosTotales;
    }

    public int getAsientosOcupados() {
        return asientosOcupados;
    }

    public void setAsientosOcupados(int asientosOcupados) {
        this.asientosOcupados = asientosOcupados;
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
    
    public int getAsientosVacios() {
        return this.asientosTotales - this.asientosOcupados;
    }

    public double getPrecioPasaje() {
        return precioPasaje;
    }

    public void setPrecioPasaje(double precioPasaje) {
        this.precioPasaje = precioPasaje;
    }
    
    @Override
    public void estado() {
        super.estado();
        System.out.println("Datos del bus de pasajeros y carga: Número de asientos totales: " + this.getAsientosTotales() + 
                ", Número de asientos ocupados: " + this.getAsientosOcupados() +
                ", Peso carga máxima: " + this.getPesoCargaMaxima() + 
                ", Peso de carga: " + this.getPesoCarga() + 
                ", Precio del pasaje: " + this.precioPasaje);
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }

    @Override
    public double calcularPago(double tarifaVehiculoCarga, double tarifaVehiculoPasajeros, double porcentajeImpuestoBus) {
        return tarifaVehiculoCarga + tarifaVehiculoPasajeros + 2 * porcentajeImpuestoBus* this.asientosOcupados * this.precioPasaje;
    }
    
    public void getInformacionAsientos() {
        System.out.println("Asientos totales: " + this.asientosTotales + 
                ", asientos ocupados: " + this.asientosOcupados + 
                ", asientos vacíos: " + this.getAsientosVacios());
    }
    
    public void getPeso() {
        System.out.println("Peso de carga: " + this.getPesoCarga());
    }
}

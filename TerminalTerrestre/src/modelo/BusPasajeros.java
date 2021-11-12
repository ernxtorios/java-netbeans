package modelo;

public class BusPasajeros extends Bus implements IBus {

    private int asientosTotales;

    private int asientosOcupados;
    
    private double precioPasaje;
    
    public BusPasajeros() {
        super();
        this.asientosTotales = 0;
        this.asientosOcupados = 0;
        this.precioPasaje = 0;
    }
    
    public BusPasajeros(String placa, String marca, String modelo) {
        super(placa, marca, modelo);
        this.asientosTotales = 0;
        this.asientosOcupados = 0;
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
        System.out.println("Datos del bus de pasajeros: Número de asientos totales: " + this.getAsientosTotales() + 
                ", Número de asientos ocupados: " + this.getAsientosOcupados() + 
                ", Precio del pasaje: " + this.precioPasaje);
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }

    @Override
    public double calcularPago(double tarifaVehiculoCarga, double tarifaVehiculoPasajeros, double porcentajeImpuestoBus) {
        return tarifaVehiculoPasajeros + porcentajeImpuestoBus * this.asientosOcupados * this.precioPasaje;
    }
    
    public void getInformacionAsientos() {
        System.out.println("Asientos totales: " + this.asientosTotales + 
                ", asientos ocupados: " + this.asientosOcupados + 
                ", asientos vacíos: " + this.getAsientosVacios());
    }
}

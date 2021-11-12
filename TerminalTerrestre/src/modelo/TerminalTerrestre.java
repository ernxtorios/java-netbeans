package modelo;


import java.util.ArrayList;
import java.util.Date;

public class TerminalTerrestre {

    private String nombre;

    private final double tarifaVehiculoCarga;

    private final double tarifaVehiculoPasajeros;

    private final double porcentajeImpuestoBus;
    
    private ArrayList<Bus> buses;
    
    private ArrayList<EmpresaTransporte> empresas;
    
    private ArrayList<Ingreso> ingresos;

    public TerminalTerrestre(String nombre) {
        this.nombre = nombre;
        this.tarifaVehiculoCarga = 10;
        this.tarifaVehiculoPasajeros = 8;
        this.porcentajeImpuestoBus = 0.005;
        this.buses = new ArrayList<>();
        this.empresas = new ArrayList<>();
        this.ingresos = new ArrayList<>();
    }

    public TerminalTerrestre() {
        this.nombre = "";
        this.tarifaVehiculoCarga = 10;
        this.tarifaVehiculoPasajeros = 8;
        this.porcentajeImpuestoBus = 0.005;
        this.buses = new ArrayList<>();
        this.empresas = new ArrayList<>();
        this.ingresos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTarifaVehiculoCarga() {
        return tarifaVehiculoCarga;
    }

    public double getTarifaVehiculoPasajeros() {
        return tarifaVehiculoPasajeros;
    }

    public double getPorcentajeImpuestoBus() {
        return porcentajeImpuestoBus;
    }

    public ArrayList<Bus> getBuses() {
        return buses;
    }

    public void setBuses(ArrayList<Bus> buses) {
        this.buses = buses;
    }

    public ArrayList<EmpresaTransporte> getEmpresas() {
        return empresas;
    }

    public void setEmpresas(ArrayList<EmpresaTransporte> empresas) {
        this.empresas = empresas;
    }

    public ArrayList<Ingreso> getIngresos() {
        return ingresos;
    }

    public void setIngresos(ArrayList<Ingreso> ingresos) {
        this.ingresos = ingresos;
    }

    public void agregarBus(Bus bus) {
        this.buses.add(bus);
    }

    public void modificarBus(Bus bus, int indice) {
        this.buses.set(indice, bus);
    }

    public void eliminarBus(Bus bus) {
        this.buses.remove(bus);
    }

    public Bus buscarBus(Bus bus) {
        Bus elBus = new Bus();
        
        for (Bus b : this.buses) {
            if (bus.equals(b)) {
                elBus = b;
            }
        }
        
        return elBus;
    }

    public Bus buscarBus(String placa) {
        Bus elBus = new Bus();
        
        for (Bus b : this.buses) {
            if (b.getPlaca().equals(placa)) {
                elBus = b;
            }
        }
        
        return elBus;
    }

    public ArrayList<Bus> buscarBusMarca(String marca) {
        ArrayList<Bus> losBuses = new ArrayList<Bus>();
        
        for (Bus b : this.buses) {
            if (b.getMarca().equalsIgnoreCase(marca)) {
                losBuses.add(b);
            }
        }
        
        return losBuses;
    }

    public ArrayList<Bus> buscarBusModelo(String modelo) {
        ArrayList<Bus> losBuses = new ArrayList<Bus>();
        
        for (Bus b : this.buses) {
            if (b.getModelo().equalsIgnoreCase(modelo)) {
                losBuses.add(b);
            }
        }
        
        return losBuses;
    }

    public ArrayList<Bus> buscarBus(EmpresaTransporte empresa) {
        ArrayList<Bus> losBuses = new ArrayList<Bus>();
        
        for (Bus b : this.buses) {
            if (b.getEmpresa().equals(empresa)) {
                losBuses.add(b);
            }
        }
        
        return losBuses;
    }

    public void agregarEmpresaTransporte(EmpresaTransporte empresa) {
        this.empresas.add(empresa);
    }

    public void modificarEmpresaTransporte(EmpresaTransporte empresa, int indice) {
        this.empresas.set(indice, empresa);
    }

    public void eliminarEmpresaTransporte(EmpresaTransporte empresa) {
        this.empresas.remove(empresa);
    }

    public EmpresaTransporte buscarEmpresaTransporte(EmpresaTransporte empresa) {
        EmpresaTransporte laEmpresaTransporte = new EmpresaTransporte();
        
        for (EmpresaTransporte eT : this.empresas) {
            if (empresa.equals(eT)) {
                laEmpresaTransporte = eT;
            }
        }
        
        return laEmpresaTransporte;
    }

    public EmpresaTransporte buscarEmpresaTransporte(String nombre) {
        EmpresaTransporte laEmpresaTransporte = new EmpresaTransporte();
        
        for (EmpresaTransporte eT : this.empresas) {
            if (eT.getNombre().equalsIgnoreCase(nombre)) {
                laEmpresaTransporte = eT;
            }
        }
        
        return laEmpresaTransporte;
    }

    public ArrayList<EmpresaTransporte> buscarEmpresaTransporteTipo(String tipo) {
        ArrayList<EmpresaTransporte> lasEmpresas = new ArrayList<EmpresaTransporte>();
        
        for (EmpresaTransporte eT : this.empresas) {
            if (eT.getTipo().equalsIgnoreCase(tipo)) {
                lasEmpresas.add(eT);
            }
        }
        
        return lasEmpresas;
    }

    public void agregarIngreso(Ingreso ingreso) {
        this.ingresos.add(ingreso);
    }

    public void modificarIngreso(Ingreso ingreso, int indice) {
        this.ingresos.set(indice, ingreso);
    }

    public void eliminarIngreso(Ingreso ingreso) {
        this.ingresos.remove(ingreso);
    }

    public Ingreso buscarIngreso(Ingreso ingreso) {
        Ingreso elIngreso = new Ingreso();
        
        for (Ingreso i : this.ingresos) {
            if (i.equals(ingreso)) {
                elIngreso = i;
            }
        }
        
        return elIngreso;
    }

    public Ingreso buscarIngreso(Bus bus) {
        Ingreso elIngreso = new Ingreso();
        
        for (Ingreso i : this.ingresos) {
            if (i.getBus().equals(bus)) {
                elIngreso = i;
            }
        }
        
        return elIngreso;
    }

    public ArrayList<Ingreso> buscarIngreso(Date fecha) {
        ArrayList<Ingreso> losIngresos = new ArrayList<Ingreso>();
        
        for (Ingreso i : this.ingresos) {
            if (i.getFecha() == fecha) {
                losIngresos.add(i);
            }
        }
        
        return losIngresos;
    }

    public void reporteBuses() {
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("RELACION DE BUSES");
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        for (Bus b : this.getBuses()) {
            b.estado();
        }
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println();
    }

    public void reporteEmpresasTransporte() {
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("RELACION DE EMPRESAS DE TRANSPORTE");
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        for (EmpresaTransporte eT : this.getEmpresas()) {
            eT.estado();
        }
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println();
    }

    public void reporteIngresos() {
        BusCarga busCarga;
        BusPasajeros busPasajeros;
        BusPasajeroCarga busPasajeroCarga;
        
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println("RELACION DE INGRESOS");
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        for (Ingreso i : this.getIngresos()) {
            i.estado();
            i.getBus().getEmpresa().getNombre();
            if (i.getBus() instanceof BusCarga) {
                System.out.println("Bus de carga");
                busCarga = (BusCarga) i.getBus();
                busCarga.getPeso();
                System.out.println("Importe a pagar: " + busCarga.calcularPago(this.getTarifaVehiculoCarga(), this.getTarifaVehiculoPasajeros(), this.getPorcentajeImpuestoBus()));
            }
            if (i.getBus() instanceof BusPasajeros) {
                System.out.println("Bus de pasajeros");
                busPasajeros = (BusPasajeros) i.getBus();
                busPasajeros.getInformacionAsientos();
                System.out.println("Importe a pagar: " + busPasajeros.calcularPago(this.getTarifaVehiculoCarga(), this.getTarifaVehiculoPasajeros(), this.getPorcentajeImpuestoBus()));
            }
            if (i.getBus() instanceof BusPasajeroCarga) {
                System.out.println("Bus de pasajeros y carga");
                busPasajeroCarga = (BusPasajeroCarga) i.getBus();
                busPasajeroCarga.getPeso();
                busPasajeroCarga.getInformacionAsientos();
                System.out.println("Importe a pagar: " + busPasajeroCarga.calcularPago(this.getTarifaVehiculoCarga(), this.getTarifaVehiculoPasajeros(), this.getPorcentajeImpuestoBus()));
            }
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");
        }
        System.out.println("//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////");
        System.out.println();
    }
}

package terminalterrestre;

import modelo.*;

public class TerminalBuses {

    public static void main(String[] args) {
        // El terminal de buses
        TerminalTerrestre terminal = new TerminalTerrestre("Terminal Terrestre de Moyobamba");
        
        // Registro de empresas de transporte
        EmpresaTransporte empresa1 = new EmpresaTransporte();
        empresa1.setNombre("Movil Tours");
        empresa1.setPosicionEstacionamiento("Lado A");
        empresa1.setTipo("Empresa de Transporte de Pasajeros y Encomiendas");
        
        terminal.agregarEmpresaTransporte(empresa1);
        
        EmpresaTransporte empresa2 = new EmpresaTransporte("Transportes CIVA");
        empresa2.setPosicionEstacionamiento("Lado B");
        empresa2.setTipo("Empresa de Transporte de Pasajeros");
        
        terminal.agregarEmpresaTransporte(empresa2);
        
        EmpresaTransporte empresa3 = new EmpresaTransporte();
        empresa3.setNombre("Empresa de Transporte Huallaga");
        empresa3.setPosicionEstacionamiento("Lado C");
        empresa3.setTipo("Empresa de Transporte de Encomiendas");
        
        terminal.agregarEmpresaTransporte(empresa3);

        // Registro de buses
        BusPasajeros bus1 = new BusPasajeros();
        bus1.setPlaca("ABC-123");
        bus1.setMarca("VOLKSWAGEN");
        bus1.setModelo("CROSSFOX");
        bus1.setEmpresa(empresa1);
        bus1.setAsientosTotales(60);
        bus1.setAsientosOcupados(45);
        bus1.setPrecioPasaje(70);
        
        terminal.agregarBus(bus1);
        
        BusCarga bus2 = new BusCarga();
        bus2.setPlaca("ABC-321");
        bus2.setMarca("TOYOTA");
        bus2.setModelo("YARIS");
        bus2.setEmpresa(empresa3);
        bus2.setPesoCargaMaxima(100);
        bus2.setPesoCarga(80);
        
        terminal.agregarBus(bus2);
        
        BusPasajeroCarga bus3 = new BusPasajeroCarga();
        bus3.setPlaca("XYZ-222");
        bus3.setMarca("HYUNDAI");
        bus3.setModelo("ELANTRA");
        bus3.setEmpresa(empresa1);
        bus3.setPesoCargaMaxima(100);
        bus3.setPesoCarga(80);
        bus3.setAsientosTotales(45);
        bus3.setAsientosOcupados(42);
        bus3.setPrecioPasaje(60);
        
        terminal.agregarBus(bus3);
        
        BusPasajeros bus4 = new BusPasajeros();
        bus4.setPlaca("HIJ-452");
        bus4.setMarca("TOYOTA");
        bus4.setModelo("4RUNNER");
        bus4.setEmpresa(empresa2);
        bus4.setAsientosTotales(58);
        bus4.setAsientosOcupados(50);
        bus4.setPrecioPasaje(65);
        
        terminal.agregarBus(bus4);
        
        BusCarga bus5 = new BusCarga("COW-456", "TOYOTA", "HILUX");
        bus5.setEmpresa(empresa3);
        bus5.setPesoCargaMaxima(120);
        bus5.setPesoCarga(110);
        
        terminal.agregarBus(bus5);
        
        BusPasajeroCarga bus6 = new BusPasajeroCarga();
        bus6.setPlaca("DEF-321");
        bus6.setMarca("TOYOTA");
        bus6.setModelo("COROLLA");
        bus6.setEmpresa(empresa1);
        bus6.setPesoCargaMaxima(80);
        bus6.setPesoCarga(80);
        bus6.setAsientosTotales(48);
        bus6.setAsientosOcupados(43);
        bus6.setPrecioPasaje(75);
        
        terminal.agregarBus(bus6);
        
        BusPasajeros bus7 = new BusPasajeros();
        bus7.setPlaca("DRE-405");
        bus7.setMarca("TOYOTA");
        bus7.setModelo("ETIOS");
        bus7.setEmpresa(empresa2);
        bus7.setAsientosTotales(45);
        bus7.setAsientosOcupados(45);
        bus7.setPrecioPasaje(55);
        
        terminal.agregarBus(bus7);
        
        BusCarga bus8 = new BusCarga();
        bus8.setPlaca("NOC-654");
        bus8.setMarca("TOYOTA");
        bus8.setModelo("RAV4");
        bus8.setEmpresa(empresa3);
        bus8.setPesoCargaMaxima(100);
        bus8.setPesoCarga(95);
        
        terminal.agregarBus(bus8);
        
        BusPasajeroCarga bus9 = new BusPasajeroCarga();
        bus9.setPlaca("CHO-159");
        bus9.setMarca("MERCEDES-BENZ");
        bus9.setModelo("CLA 200");
        bus9.setEmpresa(empresa1);
        bus9.setPesoCargaMaxima(140);
        bus9.setPesoCarga(100);
        bus9.setAsientosTotales(40);
        bus9.setAsientosOcupados(39);
        bus9.setPrecioPasaje(45);
        
        terminal.agregarBus(bus9);
        
        BusPasajeroCarga bus10 = new BusPasajeroCarga();
        bus10.setPlaca("CNA-900");
        bus10.setMarca("MAZDA");
        bus10.setModelo("CX-3");
        bus10.setEmpresa(empresa1);
        bus10.setPesoCargaMaxima(90);
        bus10.setPesoCarga(85);
        bus10.setAsientosTotales(40);
        bus10.setAsientosOcupados(36);
        bus10.setPrecioPasaje(40);
        
        terminal.agregarBus(bus10);
        
        // Registro de ingresos
        Ingreso ingreso1 = new Ingreso(bus5);
        
        terminal.agregarIngreso(ingreso1);
        
        Ingreso ingreso2 = new Ingreso();
        ingreso2.setBus(bus7);
        
        terminal.agregarIngreso(ingreso2);
        
        Ingreso ingreso3 = new Ingreso();
        ingreso3.setBus(bus3);
        
        terminal.agregarIngreso(ingreso3);
        
        Ingreso ingreso4 = new Ingreso();
        ingreso4.setBus(bus6);
        
        terminal.agregarIngreso(ingreso4);
        
        Ingreso ingreso5 = new Ingreso(bus4);
        
        terminal.agregarIngreso(ingreso5);
        
        terminal.reporteEmpresasTransporte();
        terminal.reporteBuses();
        terminal.reporteIngresos();
 
    }
    
}

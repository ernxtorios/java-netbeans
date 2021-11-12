
package empresatransporte;

import java.util.Scanner;

/**
 *
 * @author SARITA
 */
public class EmpresaTransporte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Chofer elChofer = new Chofer("", "");
        Bus elBus = new Bus("");
        Colectivo elColectivo = new Colectivo("");
        
        String marca, modelo, placa, tipo;
        int ano, capacidad;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Empresa de Transportes: Turismo Cajamarca");
        System.out.println("-----------------------------------------");
        System.out.println("Registro de Vehículo y Chofer");
        System.out.println("-----------------------------");
        System.out.println("");
        System.out.println("Vehículo");
        System.out.println("--------");
        System.out.print("Tipo (Bus o Colectivo): ");
        tipo = in.nextLine();
        System.out.print("Marca: ");
        marca = in.nextLine();
        System.out.print("Modelo: ");
        modelo = in.nextLine();
        System.out.print("Número de placa: ");
        placa = in.nextLine();
        System.out.print("Año de fabricación: ");
        ano = in.nextInt();
        System.out.print("Capacidad Máxima: ");
        capacidad = in.nextInt();
        if (tipo.equals("Colectivo") && capacidad > 5) {
            System.out.println("Un colectivo no puede tener más de 5 asientos.");
            do {
                System.out.print("Capacidad Máxima: ");
                capacidad = in.nextInt();
            } while (capacidad > 5);
        }
        if (tipo.equals("Bus") && capacidad <= 5) {
            System.out.println("Esto no parece un bus. Un bus debería tener más de 5 asientos.");
            do {
                System.out.print("Capacidad Máxima: ");
                capacidad = in.nextInt();
            } while (capacidad <= 5);
        }
        System.out.println("A continuación se registrarán los datos del chofer...");
        in.nextLine();
        
        System.out.println("Chofer");
        System.out.println("------");
        System.out.print("DNI: ");
        elChofer.setDni(in.nextLine());
        System.out.print("Nombre: ");
        elChofer.setNombre(in.nextLine());
        System.out.print("Dirección: ");
        elChofer.setDireccion(in.nextLine());
        System.out.println("");
        
        if (tipo.equals("Bus")) {
            elBus.setMarca(marca);
            elBus.setModelo(modelo);
            elBus.setPlaca(placa);
            elBus.setAno(ano);
            elBus.setCapacidad(capacidad);
            elBus.setTipo(tipo);
            elBus.setConductor(elChofer);
        } else if (tipo.equals("Colectivo")) {
            elColectivo.setMarca(marca);
            elColectivo.setModelo(modelo);
            elColectivo.setPlaca(placa);
            elColectivo.setAno(ano);
            elColectivo.setCapacidad(capacidad);
            elColectivo.setTipo(tipo);
            elColectivo.setConductor(elChofer);
        }
        
        System.out.println("Reporte de Vehículos");
        System.out.println("--------------------");
        
        if (tipo.equals("Bus")) {
            elBus.estado();
        } else if (tipo.equals("Colectivo")) {
            elColectivo.estado();
        }
        
        in.close();
    }
    
}

package puntoscoordenadas;

import java.util.Scanner;
import modelo.*;

public class PuntosCoordenadas {

    public static void main(String[] args) {
        // Variable que almacena el número de puntos que desea ingresar el usuario
        int m;
        
        // Variaables que almacenan las coordenadas x, y , z de cada punto ingresado por el usuario
        int cX;
        int cY;
        int cZ;
        
        // Variable que almacena la respuesta del usuario sí desea continuar o no
        int continuar = 1;
        
        // Variable que almacena los índices de los puntos que se calcularán la distanacia entre ellos
        int indice1 = 0;
        int indice2 = 0;
    
        Scanner e = new Scanner(System.in);
        
        // Solicita el ingreso de puntos, el cual se almacena en m
        System.out.print("Ingrese la cantidad de puntos que desea colocar en el plano: ");
        m = e.nextInt();
        
        // El objeto plano construido con el constructor Plano(int m)
        Plano elPlano = new Plano(m);
        
        // Solicita las coordenadas x, y, z de cada uno de los "m" puntos
        System.out.println("Ingrese las coordenadas de los " + m + " puntos:");
        for (int i = 0; i < m; i++) {
            System.out.println("Punto " + (i + 1) + ": ");
            // Solicita el ingreso de la coordenada x, el cual se almacena en cX
            System.out.print("Coordenada X: ");
            cX = e.nextInt();
            // Solicita el ingreso de la coordenada y, el cual se almacena en cY
            System.out.print("Coordenada Y: ");
            cY = e.nextInt();
            // Solicita el ingreso de la coordenada z, el cual se almacena en cZ
            System.out.print("Coordenada Z: ");
            cZ = e.nextInt();
            
            // El objeto punto construido con el constructor Punto(int x, int y, int z)
            Punto elPunto = new Punto(cX, cY, cZ);
            
            // Agregamos el punto en el ArrayList de puntos
            elPlano.agregarPunto(elPunto);
        }
        
        // Clasificamos los puntos en los arreglos correspondientes para las 
        // coordenadas x, las coordenadas y, las coordenadas z
        elPlano.clasificaPuntos();
        
        // Imprimimos las coordenadas x, las coordenadas y, las coordenadas z de los puntos
        elPlano.lasX();
        elPlano.lasY();
        elPlano.lasZ();
        
        // Imprimimos los puntos ingresados
        elPlano.losPuntos();
        
        // Preguntamos al usuario si desea calcular la distancia entre dos puntos
        // de acuerdo a su respuesta se procede según corresponde
        do {
            // Solicita si se desea calcular la distancia entre dos puntos
            // cuya respuesta se almacena en la variable continuar
            System.out.print("¿Desea conocer la distancia entre dos puntos? (Sí = 1, No = 0): ");
            continuar = e.nextInt();
            // De acuerdo a la respuesta del usuario se procede a calcular 
            // la distancia entre dos puntos o terminar el programa
            if (continuar == 1) {
                System.out.println("Calculando la distancia entre dos puntos:");
                // Solicita el ingreso del índice del primer punto el cual se almacena en indice1
                System.out.print("Ingrese el primer punto: ");
                indice1 = e.nextInt();
                // Se valida el ingreso del índice del primer punto, que no sea cero o negativo
                // además que no sea mayor al número de puntos registrados
                while (indice1 - 1 < 0 || indice1 -1 > elPlano.getPuntos().size() - 1) {
                    System.out.println("Punto no válido, intente con otro punto");
                    System.out.print("Ingrese el primer punto: ");
                    indice1 = e.nextInt();
                }
                // Solicita el ingreso del índice del segundo punto el cual se almacena en indice2
                System.out.print("Ingrese el segundo punto: ");
                indice2 = e.nextInt();
                // Se valida el ingreso del índice del segundo punto, que no sea cero o negativo
                // además que no sea mayor al número de puntos registrados
                while (indice2 - 1 < 0 || indice2 -1 > elPlano.getPuntos().size() - 1) {
                    System.out.println("Punto no válido, intente con otro punto");
                    System.out.print("Ingrese el segundo punto: ");
                    indice2 = e.nextInt();
                }
                
                // Se muestra el cálculo de la distancia entre los dos puntos
                System.out.println("La distancia entre el punto P" + indice1 + " = P" + elPlano.getPuntos().get(indice1 - 1).punto() + " y el punto P" + indice2 + " = P" +elPlano.getPuntos().get(indice2 - 1).punto() + " es:");
                System.out.println("d(P" + indice1 + ", P" + indice2 + ") = " + elPlano.distanciaDosPuntos(indice1, indice2));
            } else if (continuar == 0) {
                System.out.println("¡Gracias!");
            }
        } while (continuar == 1);
    }
}

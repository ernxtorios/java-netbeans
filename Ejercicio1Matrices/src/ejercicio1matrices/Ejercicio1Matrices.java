package ejercicio1matrices;

import java.util.Scanner;

public class Ejercicio1Matrices {

    public static void main(String[] args) {
        int numeroPuntos;
        int unPunto;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Puntos en el plano:");
        System.out.print("¿Cuántos puntos?: ");
        numeroPuntos = in.nextInt();
        
        while (numeroPuntos <= 0) {
            System.out.println("No parece real");
            System.out.print("¿Cuántos puntos?: ");
            numeroPuntos = in.nextInt();
        }
             
        //Contendrá una fila más y una columna más
        double[][] matrizPuntos = new double[numeroPuntos][3];
        
        registrarPuntos(matrizPuntos);
        mostrarPuntos(matrizPuntos);
        
        System.out.print("Seleccione un punto (1 al " + numeroPuntos + "): ");
        unPunto = in.nextInt();
        
        while (unPunto <= 0 || unPunto > numeroPuntos) {
            System.out.println("Punto no registrado");
            System.out.print("Seleccione un punto (1 al " + numeroPuntos + "): ");
            unPunto = in.nextInt();
        }
        
        distanciaDosPuntos(matrizPuntos, unPunto);
        
        System.out.println();
        
        puntoDistanciaMaxima(matrizPuntos, unPunto);
        puntoDistanciaMinima(matrizPuntos, unPunto);
        
        System.out.println();
    }
    
    static void registrarPuntos(double [][] matriz) {
        Scanner e = new Scanner(System.in);
        
        double coordenada;
        
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Registrando puntos en el plano:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Punto " + (i+1) + ":");
            for (int j = 0; j < matriz[i].length - 1; j++) {
                if (j == 0) {
                    System.out.print("Coordenada x: ");
                } else if (j == 1) {
                    System.out.print("Coordenada y: ");
                }
                coordenada = e.nextDouble();
                
                matriz[i][j] = coordenada;
            }
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        }
        System.out.println();
    }
    
    static void mostrarPuntos(double [][] matriz) {
        System.out.println("Puntos registrados en el plano:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("Punto " + (i + 1) + ": (" + matriz[i][0] + ", " + matriz[i][1] + ")");
            System.out.println();
        }
        System.out.println();
    }
    
    // Método que calcula la distancia entre los puntos registrados en una matriz, 
    // dado un punto de referencia
    // Estas distancias son almacenadas en la columna con índice 1 de la matriz
    // en base a la fórmula: d(Pi, Pj) = RaizCuadrada((xi-xj)^2 + (yi-yj)^2)
    static void distanciaDosPuntos(double [][] matriz, int referencia) {
        double dcX;
        double dcY;
        
        for (int i = 0; i < matriz.length; i++) {
            if (referencia - 1 != i) {
                dcX = Math.pow((matriz[referencia - 1][0] - matriz[i][0]), 2);
                dcY = Math.pow((matriz[referencia - 1][1] - matriz[i][1]), 2);
                matriz[i][2] = Math.sqrt(dcX + dcY);
            } 
        }
        
        System.out.println();
        
        for (int i = 0; i < matriz.length; i++) {
            if (referencia - 1 != i) {
                System.out.println("La distancia del punto " + referencia + " al punto " + (i + 1) + " es: " + matriz[i][2]);
            }
        }
    }
    
    static void puntoDistanciaMaxima(double [][] matriz, int referencia) {
        double maximo;
        
        int punto = 0;
        
        maximo = matriz[0][2];
        
        for(int i = 0; i < matriz.length; i++){
            if (referencia - 1 != i) {
                if (maximo < matriz[i][2]) {
                    maximo = matriz[i][2];
                    punto = i;
                }
            } else if (referencia == 1) {
                punto++;
            }
        }
        
        if (matriz.length == 1) {
            System.out.println("La distancia máxima del punto " + referencia + " es al punto " + (punto + 1) + ": " + matriz[0][2]);
        } else {
            System.out.println("La distancia máxima del punto " + referencia + " es al punto " + (punto + 1) + ": " + matriz[punto][2]);
        }
    }
    
    static void puntoDistanciaMinima(double [][] matriz, int referencia) {
        double minimo;
        
        int punto = 0;
        
        minimo = matriz[0][2];
        
        for(int i = 0; i < matriz.length; i++){
            if (referencia - 1 != i) {
                if (minimo > matriz[i][2]) {
                    minimo = matriz[i][2];
                    punto = i;
                }
            } else if (referencia == 1) {
                punto++;
            }
        }
        
        if (matriz.length == 1) {
            System.out.println("La distancia mínima del punto " + referencia + " es al punto " + (punto + 1) + ": " + matriz[0][2]);
        } else {
            System.out.println("La distancia mínima del punto " + referencia + " es al punto " + (punto + 1) + ": " + matriz[punto][2]);
        }    
    }
}

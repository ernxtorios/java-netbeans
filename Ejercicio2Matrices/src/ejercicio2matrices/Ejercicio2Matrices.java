package ejercicio2matrices;

import java.util.Scanner;

public class Ejercicio2Matrices {
    static int[][] matrizY = new int[3][3];
    
    static int[] tablero = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    
    public static void main(String[] args) {
        ingresarMatrizUnidades(matrizY);
        System.out.println();
        imprimirMatriz(matrizY);
    }
    
    static void ingresarMatrizUnidades(int [][] matriz) {
        Scanner e = new Scanner(System.in);
        
        int numero = -1;
        
        System.out.println("Ingresando datos a la matriz de unidades (sólo números del 1 al 9):");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Posición (" + i + ", " + j + "): ");
                numero = e.nextInt();
                
                while (numero <= 0 || numero > 9) {
                    System.out.println("Sólo números del 1 al 9");
                    System.out.print("Posición (" + i + ", " + j + "): ");
                    numero = e.nextInt();
                }
                
                while (validarDatos(numero)) {
                    System.out.println("Ya está registrado el número " + numero);
                    System.out.print("Posición (" + i + ", " + j + "): ");
                    numero = e.nextInt();
                }
                matriz[i][j] = numero;
                tablero[numero - 1] = -tablero[numero - 1];
            }
        }
    }
    
    static boolean validarDatos(int n) {
        boolean resultado = false;
        
        for (int i = 0; i < tablero.length; i++) {
            if (tablero[i] == -n) {
                resultado = true;
                break;
            } else {
                resultado = false;
            }
        }

        return resultado;
    }
    
    static void imprimirMatriz(int [][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "    ");
            }
            System.out.println();
        }
    }
}

package matrizdigital;

public class MatrizDigital {

    public static void main(String[] args) {
        int [][] laMatriz = new int[9][9];
        
        generarMatriz(laMatriz);
        System.out.println("La matriz de números aleatorios de 0 y 1:");
        mostrarMatriz(laMatriz);
        System.out.println("La fila con más unos es F" + filaConMasUnos(laMatriz));
        System.out.println("La fila con más ceros es F" + filaConMasCeros(laMatriz));
        System.out.println("La columna con más unos es C" + columnaConMasUnos(laMatriz));
        System.out.println("La columna con más ceros es C" + columnaConMasCeros(laMatriz));
    }
    
    static void generarMatriz(int [][] matriz) {
        int sumaFilas;
        int sumaColumnas;
        
        System.out.println("Generando aleatoriamente 0 y 1 en la matriz");
        for (int i = 0; i < matriz.length - 1; i++) {
            for (int j = 0; j < matriz[i].length - 1; j++) {
                System.out.print("Posición (" + i + ", " + j + ")... ");
                matriz[i][j] = (int) (Math.round(Math.random()));
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("¡Matriz generada con éxito!");
        
        for (int i = 0; i < matriz.length - 1; i++) {
            sumaFilas = 0;
            for (int j = 0; j < matriz[i].length - 1; j++) {
                sumaFilas += matriz[i][j];
            }
            matriz[i][matriz[0].length - 1] = sumaFilas;
        }
        
        for (int j = 0; j < matriz[0].length; j++) {
            sumaColumnas = 0;
            for (int i = 0; i < matriz.length - 1; i++) {
                sumaColumnas += matriz[i][j];
            }
            matriz[matriz.length - 1][j] = sumaColumnas;
        }
    }
    
    static void mostrarMatriz(int [][] matriz) {
        System.out.print("      ");
        for (int j = 0; j < matriz[0].length - 1; j++) {
            System.out.print("C" + (j + 1) + "   ");
        }
        System.out.println();
        for (int i = 0; i < matriz.length; i++) {
            if (i != matriz.length - 1) {
                System.out.print("F" + (i + 1) + "    ");
            } else {
                System.out.print("      ");
            }
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "    ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    static int filaConMasUnos(int [][] matriz) {
        // Será la fila que tenga la máxima suma almacenada en la fila i columa 9
        int maximo = matriz[0][matriz[0].length - 1];
        
        int fila = 0;
        
        for (int i = 0; i < matriz.length - 1; i++) {
            if (maximo < matriz[i][matriz[i].length - 1]) {
                maximo = matriz[i][matriz[i].length - 1];
                fila = i;
            }
        }
        
        return fila + 1;
    }
    
    static int filaConMasCeros(int [][] matriz) {
        // Será la fila que tenga la mínima suma almacenada en la fila i columa 9
        int minimo = matriz[0][matriz[0].length - 1];
        
        int fila = 0;
        
        for (int i = 0; i < matriz.length - 1; i++) {
            if (minimo > matriz[i][matriz[i].length - 1]) {
                minimo = matriz[i][matriz[i].length - 1];
                fila = i;
            }
        }
        
        return fila + 1;
    }
    
    static int columnaConMasUnos(int [][] matriz) {
        // Será la columna que tenga la máxima suma almacenada en la fila 9 columa i
        int maximo = matriz[matriz.length - 1][0];
        
        int columna = 0;
        
        for (int i = 0; i < matriz[i].length - 1; i++) {
            if (maximo < matriz[matriz.length - 1][i]) {
                maximo = matriz[matriz.length - 1][i];
                columna = i;
            }
        }
        
        return columna + 1;
    }
    
    static int columnaConMasCeros(int [][] matriz) {
        // Será la fila que tenga la mínima suma almacenada en la fila 9 columa i
        int minimo = matriz[matriz.length - 1][0];
        
        int columna = 0;
        
        for (int i = 0; i < matriz[i].length - 1; i++) {
            if (minimo > matriz[matriz.length - 1][i]) {
                minimo = matriz[matriz.length - 1][i];
                columna = i;
            }
        }
        
        return columna + 1;
    }
}

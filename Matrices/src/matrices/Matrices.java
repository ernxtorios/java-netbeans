package matrices;

public class Matrices {
    static int[][] matrizX = new int[4][4];
    
    static int[][] matrizY = new int[3][3];
    
    static int[][] matrizA = {{2, 1, 3}, {2, 1, -3}, {4, 6, 3}, {1, 1, 1}};
    static int[][] matrizB = {{1, 1, 2, 5}, {2, 4, 2, 8}, {2, 7, 9, 1}};
    
    public static void main(String[] args) {
        System.out.println("Matriz secuencial:");
        generarMatrizSecuencial(matrizX);
        imprimirMatriz(matrizX);
        
        System.out.println();
        
        System.out.println("Matriz identidad:");
        generarMatrizIdentidad(matrizX);
        imprimirMatriz(matrizX);    
        
        System.out.println();
        
        System.out.println("Matriz identidad inversa:");
        generarMatrizIdentidadInversa(matrizX);
        imprimirMatriz(matrizX);
        
        System.out.println();
        
        System.out.println("Multiplicación de matrices:");
        System.out.println("Matriz A (" + matrizA.length + "x" + matrizA[0].length + ")");
        System.out.println("Matriz B (" + matrizB.length + "x" + matrizB[0].length + ")");
        System.out.println("Matriz producto (" + multiplicarMatrices(matrizA, matrizB).length + "x" + multiplicarMatrices(matrizA, matrizB)[0].length + ")");
        imprimirMatriz(multiplicarMatrices(matrizA, matrizB));
        
        System.out.println();
        
        generarMatrizUnidades(matrizY);
        imprimirMatriz(matrizY);
    }
    
    static void generarMatrizUnidades(int [][] matriz) {
        int x=0;
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                x = 3*i+j+1;
                matriz[i][j] = x;
            }
        }
    }
    
    static void generarMatrizSecuencial(int [][] matriz) {
       for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    matriz[i][j] = i;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }
    }
    
    static void generarMatrizIdentidad(int [][] matriz) {
       for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }
    }
    
    static void generarMatrizIdentidadInversa(int [][] matriz) {
       for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i + j == matriz.length - 1) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }
    }
    
    static int[][] multiplicarMatrices(int [][] matriz1, int [][] matriz2) {
        int[][] matrizProducto = new int[matriz1.length][matriz2[0].length];
        
        if (matriz1[0].length == matriz2.length) {
            for (int i = 0; i < matriz1.length; i++) {
                for (int j = 0; j < matriz2[0].length; j++) {
                    for (int k = 0; k < matriz1[0].length; k++) {
                        matrizProducto[i][j] += matriz1[i][k] * matriz2[k][j];
                    }
                }
            }
        }
        
        return matrizProducto;
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

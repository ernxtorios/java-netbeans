package rotarmatriz;

public class RotarMatriz {
    public static void main(String[] args) {
        int [][] laMatriz = new int[4][4];
        
        generarMatriz(laMatriz);
        System.out.println("La matriz de números aleatorios:");
        mostrarMatriz(laMatriz);
        System.out.println("La matriz de números aleatorios, rotada en sentido horario:");
        mostrarMatriz(rotarHorario(laMatriz));
        System.out.println("La matriz de números aleatorios, rotada en sentido antihorario:");
        mostrarMatriz(rotarAntihorario(laMatriz));
    }
    
    static void generarMatriz(int [][] matriz) {
        System.out.println("Generando números aleatorios en la matriz");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Posición (" + i + ", " + j + ")... ");
                
                matriz[i][j] = (int) (Math.random()*90) + 10;
            }
        }
        System.out.println();
        System.out.println("¡Matriz generada con éxito!");
    }
    
    static void mostrarMatriz(int [][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "    ");
            }
            System.out.println();
        }
    }
    
    static int[][] rotarHorario(int[][] matriz) {
        int[][] matrizRotada = new int[matriz.length][matriz[0].length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matrizRotada[j][matriz.length - 1 - i] = matriz[i][j];
            }
        }      
        
        return matrizRotada; 
    }
    
    static int[][] rotarAntihorario(int[][] matriz) {
        int[][] matrizRotada = new int[matriz.length][matriz[0].length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matrizRotada[matriz.length - 1 - j][i] = matriz[i][j];
            }
        }      
        
        return matrizRotada; 
    }
}

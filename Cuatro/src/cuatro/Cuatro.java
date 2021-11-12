package cuatro;

public class Cuatro {

    public static void main(String[] args) {
        int [][] laMatriz = new int[9][9];
        
        generarMatriz(laMatriz);
        mostrarMatriz(laMatriz);
        
        cuatroEnLinea(laMatriz);
    }
    
    static void generarMatriz(int [][] matriz) {
        int x;
        
        System.out.println("Generando aleatoriamente números del 0 al 9 en la matriz");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Posición (" + i + ", " + j + ")... ");
                x = (int) (Math.random()*9);
                matriz[i][j] = (int) (Math.random()*x);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("¡Matriz generada con éxito!");
    }
    
    static void cuatroEnLinea(int [][] matriz) {
        boolean cuatro = false;
        
        int numeroAComparar;
        int numeroCoincidencias;
        
        // Buscamos cuatro en línea en las filas
        for (int i = 0; i < matriz.length; i++) {
            numeroAComparar = matriz[i][0];
            numeroCoincidencias = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                if (numeroAComparar == matriz[i][j]) {
                    numeroCoincidencias++;
                    if (numeroCoincidencias == 4) {
                        System.out.println("¡Cuatro en línea en fila " + (i + 1) + "!");
                        cuatro = true;
                        break;
                    }
                } else {
                    numeroAComparar = matriz[i][j];
                    numeroCoincidencias = 1;
                }
            }
        }
        
        // Buscamos cuatro en línea en las columnas
        for (int j = 0; j < matriz[0].length; j++) {
            numeroAComparar = matriz[0][j];
            numeroCoincidencias = 0;
            for (int i = 0; i < matriz.length; i++) {
                if (numeroAComparar == matriz[i][j]) {
                    numeroCoincidencias++;
                    if (numeroCoincidencias == 4) {
                        System.out.println("¡Cuatro en línea en columna " + (j + 1) + "!");
                        cuatro = true;
                        break;
                    }
                } else {
                    numeroAComparar = matriz[i][j];
                    numeroCoincidencias = 1;
                }
            }
        }
        
        if (!cuatro) {
            System.out.println("¡Filas y columnas sin cuatro repeticiones en línea!");
        }
    }
    
    static void mostrarMatriz(int [][] matriz) {
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "    |    ");
            }
            System.out.println();
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        }
        System.out.println();
    }
}
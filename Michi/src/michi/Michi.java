package michi;

public class Michi {
    static int turno;
    
    static String laJugada = "";
    
    public static void main(String[] args) {
        char [][] elTablero = new char[3][3];
        
        jugarMichi(elTablero);
    }
    
    static void jugarMichi(char [][] matriz) {
        int m, n;
        
        // Inicializamos el tablero michi con espacios ' ', por defecto asigna ''
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = ' ';
            }
        }
        
        System.out.println("Jugando michi...");
        turno = 1;
                
        while (turno <= 9) {
            m = (int) (Math.round(Math.random()*2));
            n = (int) (Math.round(Math.random()*2));
            
            while (matriz[m][n] == 'O' || matriz[m][n] == 'X') {
                m = (int) (Math.round(Math.random()*2));
                n = (int) (Math.round(Math.random()*2));
            }
            
            if (turno % 2 != 0) {
                matriz[m][n] = 'X';
                System.out.println("Turno " + turno + ", jugador X:");
            } else {
                matriz[m][n] = 'O';
                System.out.println("Turno " + turno + ", jugador O:");
            }
            
            mostrarMatriz(matriz);
            
            if (turno >= 5) {
                if (tresEnLinea(matriz)) {
                    System.out.println();
                    break;
                }
            }
            
            turno++;
            System.out.println();
        }

        System.out.println("¡Juego terminado!");
        
        if (tresEnLinea(matriz)) {
            if (turno % 2 == 0) {
                System.out.println("¡El jugador O ganó en el turno " + turno + "!");
            } else {
                System.out.println("¡El jugador X ganó en el turno " + turno + "!");
            }
            System.out.println(laJugada);
        } else {
            System.out.println("¡Empate!");
        }
        
    }
    
    static boolean tresEnLinea(char [][] matriz) {
        boolean resultado = false;
        
        // Buscamos tres en línea en las filas
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][0] != ' ' || matriz[i][1] != ' ' || matriz[i][2] != ' ') {
                if (matriz[i][0] == matriz[i][1] && matriz[i][1] == matriz[i][2]) {
                    resultado = true;
                    laJugada = "La jugada: Fila " + (i + 1);
                    break;
                }
            }
        }
        
        // Buscamos tres en línea en las columnas, solo en caso que no se haya encontrado tres en línea en las filas
        if (!resultado) {
            for (int i = 0; i < matriz.length; i++) {
                if (matriz[0][i] != ' ' && matriz[1][i] != ' ' && matriz[2][i] != ' ') {
                    if (matriz[0][i] == matriz[1][i] && matriz[1][i] == matriz[2][i]) {
                        resultado = true;
                        laJugada = "La jugada: Columna " + (i + 1);
                        break;
                    }
                }
            }
        }
        
        // Buscamos tres en línea en la diagonal principal, solo en caso que no se haya encontrado tres en línea en las filas y en las columnas
        if (!resultado) {
            if (matriz[0][0] != ' ' && matriz[1][1] != ' ' && matriz[2][2] != ' ') {
                if (matriz[0][0] == matriz[1][1] && matriz[1][1] == matriz[2][2]) {
                    resultado = true;
                    laJugada = "La jugada: Diagonal principal";
                }
            }
        }
        
        // Buscamos tres en línea en la diagonal secundaria, solo en caso que no se haya encontrado tres en línea en las filas, en las columnas y en la diagonal principal
        if (!resultado) {
            if (matriz[2][0] != ' ' && matriz[1][1] != ' ' && matriz[0][2] != ' ') {
                if (matriz[2][0] == matriz[1][1] && matriz[1][1] == matriz[0][2]) {
                    resultado = true;
                    laJugada = "La jugada: Diagonal secundaria";
                }
            }
        }
        
        return resultado;
    }
    
    static void mostrarMatriz(char [][] matriz) {
        System.out.println("- - - - - - - - - - - - - ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "    |    ");
            }
            System.out.println();
            System.out.println("- - - - - - - - - - - - - ");
        }
    }
}

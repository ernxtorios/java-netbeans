package deudores;

public class Deudores {

    public static void main(String[] args) {
        double [][] deudores = new double[4][4];
        
        deudores(deudores);
        mostrarDeudores(deudores);
    }
    
    static void deudores(double [][] matriz) {
        int x;
        
        int deudaCero;
        
        for (int i = 0; i < matriz.length; i++) {
            deudaCero = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                // Validamos que una persona no tenga deuda consigo misma
                if (i != j) {
                    // Generamos números entre 0 y 3
                    x = (int) (Math.random()*(matriz.length - 1));
                    // Almacenamos en la matriz el valor de la deuda, generada aleatoriamente
                    matriz[i][j] = (Math.random()*100*x);
                    
                    // Validamos que una persona tenga deuda por lo menos con una persona diferente
                    if (matriz[i][j] == 0) {
                        deudaCero++;
                    }
                    
                    if (deudaCero == 3) {
                        // Generamos números entre 0 y 3
                        x = (int) (Math.random()*(matriz.length - 1));
                        // Almacenamos en la matriz el valor de la deuda, generada aleatoriamente
                        matriz[i][j] = (Math.random()*100*x);
                        
                        while (matriz[i][j] == 0) {
                            // Generamos números entre 0 y 3
                            x = (int) (Math.random()*(matriz.length - 1));
                            // Almacenamos en la matriz el valor de la deuda, generada aleatoriamente
                            matriz[i][j] = (Math.random()*100*x);
                        }
                    }
                } else {
                    matriz[i][j] = 0;
                }
            }
        }
        System.out.println("¡Deudores creados aleatoriamente!");
    }
    
    static void mostrarDeudores(double [][] matriz) {
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.printf("\t \t");
        for (int i = 0; i < matriz[0].length; i++) {
            switch (i) {
                case 0:
                    System.out.print("Rocío");
                    break;
                case 1:
                    System.out.print("Alex");
                    break;
                case 2:
                    System.out.print("Liz");
                    break;
                case 3:
                    System.out.print("José");
                    break;
                default:
                    System.out.print("Deudor");
                    break;
            }
            System.out.printf("\t \t");
        }
        System.out.println();
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        for (int i = 0; i < matriz.length; i++) {
            switch (i) {
                case 0:
                    System.out.print("Rocío");
                    break;
                case 1:
                    System.out.print("Alex");
                    break;
                case 2:
                    System.out.print("Liz");
                    break;
                case 3:
                    System.out.print("José");
                    break;
                default:
                    System.out.print("Deudor");
                    break;
            }
            System.out.printf("\t \t");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%1.2f \t \t", matriz[i][j]);
            }
            System.out.println();
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        }
        System.out.println();
    }
}

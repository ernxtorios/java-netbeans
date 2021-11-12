package arregloprimos;

public class ArregloPrimos {
    public static void main(String[] args) {
        int [] numeros = {1, 2 , 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        
        for (int i=0; i < numeros.length; i++) {
            if (esPrimo(numeros[i])) {
                System.out.println(numeros[i]);
            }
        }
        
    }
    
    public static boolean esPrimo(int valor) {
        int contador = 2;
		
	boolean primo = true;
		
	while ((primo) && (contador != valor)) {
            if (valor % contador == 0) primo = false;
		contador++;
	}
		
        return primo;
    }
}

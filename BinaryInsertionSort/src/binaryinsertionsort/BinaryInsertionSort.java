package binaryinsertionsort;

// Implementación del programa Java 
// binary insertion sort
 
import java.util.Arrays;

public class BinaryInsertionSort {

    public static void main(String[] args) {
        final int[] arr = { 37, 23, 0, 17, 12, 72, 31, 46, 100, 88, 54 };
 
        new BinaryInsertionSort().sort(arr);
 
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
    
    public void sort(int array[]) {
        for (int i = 1; i < array.length; i++) {
            int x = array[i];
 
            // Buscar ubicación para insertar 
            // usando búsqueda binaria 
            int j = Math.abs(Arrays.binarySearch(array, 0, i, x) + 1);
 
            // Cambio de matriz a uno 
            // ubicación correcta
            System.arraycopy(array, j, array, j + 1, i - j);
 
            // Colocación del elemento en su 
            // ubicación correcta
            array[j] = x;
        }
    }
}

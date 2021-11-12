package heapsort;

// Programa Java para la implementación de Heap Sort 
public class HeapSort {

    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6, 7 };
        int n = arr.length;

        HeapSort ob = new HeapSort();
        ob.sort(arr);

        System.out.println("La matriz ordenada es");
        printArray(arr);
    }
    
    public void sort(int arr[]) {
        int n = arr.length;

        // Construir pila (reorganizar la matriz) 
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // Uno por uno extrae un elemento de la pila
        for (int i = n - 1; i > 0; i--) {
            // Mover la raíz actual al final
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Llamar a max heapify en la pila reducida
            heapify(arr, i, 0);
        }
    }
    
    // Para apilar un subárbol enraizado con el nodo i que es 
    // un índice en arr []. n es el tamaño del montón 
    void heapify(int arr[], int n, int i) {
        int largest = i; // Inicializar la variable largest como raíz 
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2

        // Si el nodo hijo izquierdo es mayor que la raíz 
        if (l < n && arr[l] > arr[largest])
            largest = l;

        // Si el nodo hijo derecho es mayor que largest hasta ahora
        if (r < n && arr[r] > arr[largest])
            largest = r;

        // Si largest no es raíz
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Apila de forma recursiva el subárbol afectado 
            heapify(arr, n, largest);
        }
    }
        
    /* Una función para imprimir una matriz de tamaño n  */
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }    
}
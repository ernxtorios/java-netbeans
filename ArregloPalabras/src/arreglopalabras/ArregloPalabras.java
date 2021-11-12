package arreglopalabras;

public class ArregloPalabras {

    public static void main(String[] args) {
        String [] palabras = {"Hola", "Perro", "Gato", "Botella", "Niños", "Televisor", "Silla", "Techo", "Alumno", "Universidad", "Hortaliza", "Jardín", "Moyobamba"};
        
        for (int i=0; i < palabras.length; i++) {
            if (palabras[i].length() >= 2 && palabras[i].length() <= 4) {
                System.out.println(palabras[i]);
            }
        }
    }
    
}

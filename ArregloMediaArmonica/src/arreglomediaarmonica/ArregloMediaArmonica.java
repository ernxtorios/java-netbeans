package arreglomediaarmonica;

public class ArregloMediaArmonica {

    public static void main(String[] args) {
        double [] notas = {2, 4, 8};
        
        double denominador = 0;
        
        for (int i=0; i < notas.length; i++) {
            denominador = denominador + (1/notas[i]);
        }
        
        System.out.println("Media Armónica: " + (double) notas.length/denominador);
        
        /*
        MediaArmonica = N/(1/x1 + 1/x2 + 1/x3 + ... + 1/xn)
        */
    }
}

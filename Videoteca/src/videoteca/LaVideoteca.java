package videoteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import modelo.*;

public class LaVideoteca {

    public static void main(String[] args) {
        BufferedReader esperar = new BufferedReader(new InputStreamReader(System.in));
        
        // El obejto videoteca
        Videoteca videoteca = new Videoteca("La Casita de las Películas");
        
        // Controla la opción de menú
        int opcion = 0;
        
        Scanner e = new Scanner(System.in);
        
        do {
            videoteca.menuPrincipal();
            
            System.out.print("Seleccione la opción que desea realizar (1, 2, 3, 4): ");
            opcion = e.nextInt();
            
            switch (opcion) {
                case 1:
                    // Objeto nuevaPelicula
                    Pelicula nuevaPelicula = new Pelicula();
                    
                    System.out.println();
                    e.nextLine();
                    System.out.println("------------------------------------------------------------------");
                    System.out.println("Registrando datos de la nueva película:");
                    System.out.println("------------------------------------------------------------------");
                    System.out.print("Código: ");
                    nuevaPelicula.setCodigo(e.nextLine());
                    System.out.print("Título: ");
                    nuevaPelicula.setTitulo(e.nextLine());
                    System.out.print("Presupuesto (US$): ");
                    nuevaPelicula.setPresupuesto(e.nextDouble());
                    e.nextLine();
                    System.out.print("Calificación (1-10): ");
                    nuevaPelicula.setCalificacion(e.nextInt());
                    e.nextLine();
                    System.out.print("Duración (Minutos): ");
                    nuevaPelicula.setDuracion(e.nextInt());
                    e.nextLine();
                    System.out.print("Título de precuela (Presione enter si no tiene precuela): ");
                    String precuela = e.nextLine().trim();
                    if (!precuela.equals("")) {
                       if (videoteca.buscarPeliculaTitulo(precuela).getTitulo().equals("")) {
                           System.out.println("No encontramos la película precuela que menciona, así que no registramos precuela para la nueva película");
                       } else {
                           nuevaPelicula.setPrecuela(videoteca.buscarPeliculaTitulo(precuela));
                       }
                    }
                    videoteca.agregarPelicula(nuevaPelicula);
                    System.out.println("La nueva película ha sido registrada con éxito. ¡Gracias!");
                    System.out.println("Presione enter para continuar...");
                    try {
                        esperar.readLine();
                    } catch (IOException exception) {
                        exception.printStackTrace();
                    }
                    break;
                case 2:
                    Pelicula peliculaEncontrada = new Pelicula();
                    
                    System.out.println();
                    e.nextLine();
                    System.out.println("------------------------------------------------------------------");
                    System.out.println("Consultando una película:");
                    System.out.println("------------------------------------------------------------------");
                    System.out.print("Ingrese el código de la película a consultar: ");
                    String codigoPelicula = e.nextLine();
                    if (!codigoPelicula.equals("")) {
                       if (videoteca.buscarPeliculaCodigo(codigoPelicula).getCodigo().equals("")) {
                           System.out.println("No encontramos ninguna película con el código " + codigoPelicula);
                       } else {
                           System.out.println("¡Película encontrada!");
                           peliculaEncontrada = videoteca.buscarPeliculaCodigo(codigoPelicula);
                           System.out.println(peliculaEncontrada.laPelicula());
                       }
                    } else {
                        System.out.println("No ingresó ningún código de película");  
                    }
                    System.out.println("Presione enter para continuar...");
                    try {
                        esperar.readLine();
                    } catch (IOException exception) {
                        exception.printStackTrace();
                    }
                    break;
                case 3:
                    videoteca.reportePeliculas();
                    System.out.println("Presione enter para continuar...");
                    try {
                        esperar.readLine();
                    } catch (IOException exception) {
                        exception.printStackTrace();
                    }
                    e.nextLine();
                    break;
                case 4:
                    System.out.println("¡Gracias!");
                    break;
                default:
                    if (opcion <= 0 || opcion > 4) {
                        System.out.println("Opción no válida");
                    }
                    break;
            }
        } while (opcion != 4);
    }
}

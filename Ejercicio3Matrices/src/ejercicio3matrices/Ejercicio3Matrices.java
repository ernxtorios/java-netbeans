package ejercicio3matrices;

import java.util.Scanner;

public class Ejercicio3Matrices {   
    public static void main(String[] args) {
        int numeroTrabajadores;
        int diasPorSemana;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Hoja de Tareo:");
        System.out.print("¿Cuántos trabajadores?: ");
        numeroTrabajadores = in.nextInt();
        
        while (numeroTrabajadores <= 0) {
            System.out.println("No parece real");
            System.out.print("¿Cuántos trabajadores?: ");
            numeroTrabajadores = in.nextInt();
        }
        
        System.out.print("¿Cuántos días por semana?: ");
        diasPorSemana = in.nextInt();
        
        while (diasPorSemana <= 0 || diasPorSemana > 7) {
            System.out.println("No parece real");
            System.out.print("¿Cuántos días por semana?: ");
            diasPorSemana = in.nextInt();
        }
        
        //Contendrá una fila más y una columna más
        double[][] matrizTrabajadores = new double[numeroTrabajadores + 1][diasPorSemana + 1];
        
        registrarTareo(matrizTrabajadores);
        mostrarTareo(matrizTrabajadores);
    }
    
    static void registrarTareo(double [][] matriz) {
        Scanner e = new Scanner(System.in);
        
        double horasTrabajador;
        double horasDia;
        
        double horas;
        
        System.out.println("Registrando horas trabajadas por día, por cada trabajador:");
        for (int i = 0; i < matriz.length - 1; i++) {
            System.out.println("Trabajador " + (i+1) + ":");
            for (int j = 0; j < matriz[i].length - 1; j++) {
                System.out.print("Día " + (j + 1) + ": ");
                horas = e.nextDouble();
                
                while (horas < 0 || horas > 24) {
                    System.out.println("No parece real");
                    System.out.print("Día " + (j + 1) + ": ");
                    horas = e.nextDouble();
                }
                
                matriz[i][j] = horas;
            }
            System.out.println("----   ---   ---   ---   ---   ---   ---   ---   ---   ---   ---   ---   ---   ---   ---   ---   ---   ---   ---   ---   ---   ---");
        }
        
        for (int i = 0; i < matriz.length - 1; i++) {
            horasTrabajador = 0;
            for (int j = 0; j < matriz[i].length - 1; j++) {
                horasTrabajador += matriz[i][j];
            }
            matriz[i][matriz[0].length - 1] = horasTrabajador;
        }
        
        for (int j = 0; j < matriz[0].length; j++) {
            horasDia = 0;
            for (int i = 0; i < matriz.length - 1; i++) {
                horasDia += matriz[i][j];
            }
            matriz[matriz.length - 1][j] = horasDia;
        }
    }
    
    static void mostrarTareo(double [][] matriz) {
        System.out.println();
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(String.format("%70s","HOJA DE TAREO"));
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.print("TRABAJADOR/SEMANA");
        for (int j = 0; j < matriz[0].length; j++) {
            if (j != matriz[0].length - 1) {
                System.out.print(String.format("%15s", "Día " + (j + 1)));
            } else {
                System.out.print(String.format("%25s", "Total horas trabajador"));
            }
        }
        System.out.println();
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < matriz.length; i++) {
            if (i != matriz.length - 1) {
                System.out.print(String.format("%1s", "Trabajador " + (i + 1)) + "   ");
            } else {
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.print(String.format("%1s", "Total horas día"));
            }
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(String.format("%15s", matriz[i][j]));
            }
            System.out.println();
        }
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println();
    }
}

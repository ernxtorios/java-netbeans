package modelo;

import java.util.ArrayList;

// Clase que representa al plano 3D

public class Plano {
    // Propiedades de la clase Plano
    // ArrayList que almacena los puntos registrados en el plano 3D
    private ArrayList<Punto> puntos;
    
    // Arreglos que almacenan las coordenadas x, y, z por separado
    private int [] coordenadasX;
    private int [] coordenadasY;
    private int [] coordenadasZ;
    
    // Constructor de la clase Plano que inicializa el ArrayList
    public Plano() {
        this.puntos = new ArrayList<>();
    }
    
    // Constructor de la clase Plano que inicializa el ArrayList y define 
    // el tamaño de los arreglos de acuerdo al número de puntos que 
    // contendrá el plano
    public Plano(int m) {
        this.puntos = new ArrayList<>();
        this.coordenadasX = new int[m];
        this.coordenadasY = new int[m];
        this.coordenadasZ = new int[m];
    }

    // Los seters y los geters
    public ArrayList<Punto> getPuntos() {
        return puntos;
    }

    public void setPuntos(ArrayList<Punto> puntos) {
        this.puntos = puntos;
    }

    public int[] getCoordenadasX() {
        return coordenadasX;
    }

    public void setCoordenadasX(int[] coordenadasX) {
        this.coordenadasX = coordenadasX;
    }

    public int[] getCoordenadasY() {
        return coordenadasY;
    }

    public void setCoordenadasY(int[] coordenadasY) {
        this.coordenadasY = coordenadasY;
    }

    public int[] getCoordenadasZ() {
        return coordenadasZ;
    }

    public void setCoordenadasZ(int[] coordenadasZ) {
        this.coordenadasZ = coordenadasZ;
    }
    
    // Método que agrega un punto en el ArrayList puntos
    public void agregarPunto(Punto punto) {
        this.puntos.add(punto);
    }
    
    // Método que imprime los puntos del plano en formato 
    // Punto i (Pi): (x, y, z); recorriendo el ArrayList de puntos
    public void losPuntos() {
        System.out.println("Los puntos:");
        for (int p = 0; p < this.getPuntos().size(); p++) {
            System.out.println("Punto " + (p + 1) + " (P" + (p + 1) + "): " + this.getPuntos().get(p).punto());
        }
    }
    
    // Método que coloca las coordenas x, y, z en su respectivo arreglo
    // recorriendo el ArrayList de puntos
    public void clasificaPuntos() {
        for (int i = 0; i < this.getPuntos().size(); i++) {
            coordenadasX[i] = this.getPuntos().get(i).getX();
            coordenadasY[i] = this.getPuntos().get(i).getY();
            coordenadasZ[i] = this.getPuntos().get(i).getZ();
        }
    }
    
    // Método que imprime las coordenadas x de los puntos en formato 
    // X = {x1, x2, x3, ..., xm} recorriendo el arreglo coordenadasX
    public void lasX() {
        System.out.println("Las coordenadas x:");
        System.out.print("X = {");
        for (int x = 0; x < this.getCoordenadasX().length; x++) {
            if (x == this.getCoordenadasX().length - 1) {
                System.out.print(this.getCoordenadasX()[x]);
            } else {
                System.out.print(this.getCoordenadasX()[x] + ", ");
            }
        }
        System.out.println("}");
    }
    
    // Método que imprime las coordenadas y de los puntos en formato 
    // Y = {y1, y2, y3, ..., ym} recorriendo el arreglo coordenadasY
    public void lasY() {
        System.out.println("Las coordenadas y:");
        System.out.print("Y = {");
        for (int y = 0; y < this.getCoordenadasY().length; y++) {
            if (y == this.getCoordenadasY().length - 1) {
                System.out.print(this.getCoordenadasY()[y]);
            } else {
                System.out.print(this.getCoordenadasY()[y] + ", ");
            }
        }
        System.out.println("}");
    }
    
    // Método que imprime las coordenadas z de los puntos en formato 
    // Z = {z1, z2, z3, ..., zm} recorriendo el arreglo coordenadasX
    public void lasZ() {
        System.out.println("Las coordenadas z:");
        System.out.print("Z = {");
        for (int z = 0; z < this.getCoordenadasZ().length; z++) {
            if (z == this.getCoordenadasZ().length - 1) {
                System.out.print(this.getCoordenadasZ()[z]);
            } else {
                System.out.print(this.getCoordenadasZ()[z] + ", ");
            }
        }
        System.out.println("}");
    }
    
    // Método que busca y devuelve un Punto dado unPunto
    public Punto buscarPunto(Punto unPunto) {
        Punto p = new Punto();
        
        for (Punto x : this.puntos) {
            if (x.equals(unPunto)) {
                p = x;
            }
        }
        
        return p;
    }
    
    // Método que calcula la distancia entre dos puntos dado los índices de los mismos
    // en base a la fórmula: d(Pi, Pj) = RaizCuadrada((xi-xj)^2 + (yi-yj)^2 + (zi-zj)^2)
    public double distanciaDosPuntos(int indice1, int indice2) {
        double dcX;
        double dcY;
        double dcZ;
        
        dcX = Math.pow((this.getCoordenadasX()[indice1 - 1] - this.getCoordenadasX()[indice2 - 1]), 2);
        dcY = Math.pow((this.getCoordenadasY()[indice1 - 1] - this.getCoordenadasY()[indice2 - 1]), 2);
        dcZ = Math.pow((this.getCoordenadasZ()[indice1 - 1] - this.getCoordenadasZ()[indice2 - 1]), 2);
        
        return Math.sqrt(dcX + dcY + dcZ);
    }
}
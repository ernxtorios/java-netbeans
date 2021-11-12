package pilas;

import java.util.ArrayList;
import java.util.Stack;

public class Pilas {
    public static void main(String[] args) {
        Stack<Cemento> pila1 = new Stack();
        Stack<Cemento> pila2 = new Stack();
        Stack<Cemento> pila3 = new Stack();
        
        Stack<Cemento> pila4 = new Stack();
        Stack<Cemento> pila5 = new Stack();
        Stack<Cemento> pila6 = new Stack();
        
        Stack<Cemento> pila7 = new Stack();
        Stack<Cemento> pila8 = new Stack();
        Stack<Cemento> pila9 = new Stack();
        
        // Cada pila tendrá 20 bolsas de cemento
        // Pila 1
        for (int i = 0; i < 20; i++) {
            pila1.push(new Cemento(5));
        }
        
        // Pila 2
        for (int i = 0; i < 20; i++) {
            pila2.push(new Cemento(4));
        }
        
        // Pila 3
        for (int i = 0; i < 20; i++) {
            pila3.push(new Cemento(10));
        }
        
        // Pila 4
        for (int i = 0; i < 20; i++) {
            pila4.push(new Cemento(20));
        }
        
        // Pila 5
        for (int i = 0; i < 20; i++) {
            pila5.push(new Cemento(9));
        }
        
        // Pila 6
        for (int i = 0; i < 20; i++) {
            pila6.push(new Cemento(16));
        }
        
        // Pila 7
        for (int i = 0; i < 20; i++) {
            pila7.push(new Cemento(12));
        }
        
        // Pila 8
        for (int i = 0; i < 20; i++) {
            pila8.push(new Cemento(6));
        }
        
        // Pila 9
        for (int i = 0; i < 20; i++) {
            pila9.push(new Cemento(11));
        }
        
        // Extrayendo las bolsas de cemento de las pilas
        // con la condición que tengan más de 10 dias de permanencia
        // Pila 1
        System.out.println("La pila 1 tiene " + pila1.size() + " bolsas de cemento.");
        while (!pila1.empty()) {
            if (pila1.peek().getDiasIngreso() > 10) {
                pila1.pop(); 
                System.out.println("La pila 1 ahora tiene " + pila1.size() + " bolsas de cemento.");
            } else {
                System.out.println("La pila 1 tiene menos de 10 días de permanencia");
                break;
            }
        }
        
        System.out.println();
        
        // Pila 2
        System.out.println("La pila 2 tiene " + pila2.size() + " bolsas de cemento.");
        while (!pila2.empty()) {
            if (pila2.peek().getDiasIngreso() > 10) {
                pila2.pop(); 
                System.out.println("La pila 2 ahora tiene " + pila2.size() + " bolsas de cemento.");
            } else {
                System.out.println("La pila 2 tiene menos de 10 días de permanencia");
                break;
            }
        }
        
        System.out.println();
        
        // Pila 3
        System.out.println("La pila 3 tiene " + pila3.size() + " bolsas de cemento.");
        while (!pila3.empty()) {
            if (pila3.peek().getDiasIngreso() > 10) {
                pila3.pop(); 
                System.out.println("La pila 3 ahora tiene " + pila3.size() + " bolsas de cemento.");
            } else {
                System.out.println("La pila 3 tiene menos de 10 días de permanencia");
                break;
            }
        }
        
        System.out.println();
        
        // Pila 4
        System.out.println("La pila 4 tiene " + pila4.size() + " bolsas de cemento.");
        while (!pila4.empty()) {
            if (pila4.peek().getDiasIngreso() > 10) {
                pila4.pop(); 
                System.out.println("La pila 4 ahora tiene " + pila4.size() + " bolsas de cemento.");
            } else {
                System.out.println("La pila 4 tiene menos de 10 días de permanencia");
                break;
            }
        }
        
        System.out.println();
        
        // Pila 5
        System.out.println("La pila 5 tiene " + pila5.size() + " bolsas de cemento.");
        while (!pila5.empty()) {
            if (pila5.peek().getDiasIngreso() > 10) {
                pila5.pop(); 
                System.out.println("La pila 5 ahora tiene " + pila5.size() + " bolsas de cemento.");
            } else {
                System.out.println("La pila 5 tiene menos de 10 días de permanencia");
                break;
            }
        }
        
        System.out.println();
        
        // Pila 6
        System.out.println("La pila 6 tiene " + pila6.size() + " bolsas de cemento.");
        while (!pila6.empty()) {
            if (pila6.peek().getDiasIngreso() > 10) {
                pila6.pop(); 
                System.out.println("La pila 6 ahora tiene " + pila6.size() + " bolsas de cemento.");
            } else {
                System.out.println("La pila 6 tiene menos de 10 días de permanencia");
                break;
            }
        }
        
        System.out.println();
        
        // Pila 7
        System.out.println("La pila 7 tiene " + pila7.size() + " bolsas de cemento.");
        while (!pila7.empty()) {
            if (pila7.peek().getDiasIngreso() > 10) {
                pila7.pop(); 
                System.out.println("La pila 7 ahora tiene " + pila7.size() + " bolsas de cemento.");
            } else {
                System.out.println("La pila 7 tiene menos de 10 días de permanencia");
                break;
            }
        }
        
        System.out.println();
        
        // Pila 8
        System.out.println("La pila 8 tiene " + pila8.size() + " bolsas de cemento.");
        while (!pila8.empty()) {
            if (pila8.peek().getDiasIngreso() > 10) {
                pila8.pop(); 
                System.out.println("La pila 8 ahora tiene " + pila8.size() + " bolsas de cemento.");
            } else {
                System.out.println("La pila 8 tiene menos de 10 días de permanencia");
                break;
            }
        }
        
        System.out.println();
        
        // Pila 9
        System.out.println("La pila 9 tiene " + pila9.size() + " bolsas de cemento.");
        while (!pila9.empty()) {
            if (pila9.peek().getDiasIngreso() > 10) {
                pila9.pop(); 
                System.out.println("La pila 9 ahora tiene " + pila9.size() + " bolsas de cemento.");
            } else {
                System.out.println("La pila 9 tiene menos de 10 días de permanencia");
                break;
            }
        }
        
        System.out.println();
    }
}

class Cemento {
    private int diasIngreso;
    private int demanda;
    
    public Cemento(int dias) {
        this.diasIngreso = dias;
    }

    public int getDiasIngreso() {
        return diasIngreso;
    }

    public void setDiasIngreso(int diasIngreso) {
        this.diasIngreso = diasIngreso;
    }

    public int getDemanda() {
        return demanda;
    }

    public void setDemanda(int demanda) {
        this.demanda = demanda;
    }
}

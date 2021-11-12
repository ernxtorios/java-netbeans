package heladeria;

public class Heladeria {
    public static void main(String[] args) {
        Helado[] helados = new Helado[3];
        
        obtenerTarifas(helados);        
        mostrarTarifas(helados);
        
        Sabor [] sabores = new Sabor[3];
        
        obtenerSabores(sabores);
        mostrarSabores(sabores);
        
        Sabor [] saboresElegidos1= new Sabor[1];
        saboresElegidos1[0] = sabores[2];
        Venta venta1 = new Venta("Juan", helados[0], saboresElegidos1, true);
        venta1.laVenta();
        
        Sabor [] saboresElegidos2= new Sabor[3];
        saboresElegidos2[0] = sabores[0];
        saboresElegidos2[1] = sabores[1];
        saboresElegidos2[2] = sabores[2];
        Venta venta2 = new Venta("Juana", helados[2], saboresElegidos2, false);
        venta2.laVenta();
        
        Sabor [] saboresElegidos3= new Sabor[2];
        saboresElegidos3[0] = sabores[1];
        saboresElegidos3[1] = sabores[2];
        Venta venta3 = new Venta("Bertha", helados[1], saboresElegidos3, true);
        venta3.laVenta();
        
        Venta [] ventas = new Venta[3];
        
        ventas[0] = new Venta();
        ventas[0] = venta1;
        
        ventas[1] = new Venta();
        ventas[1] = venta2;
        
        ventas[2] = new Venta();
        ventas[2] = venta3;
        
        mostrarVentas(ventas, helados, sabores);
    }
    
    // Matriz que almacena las tarifas de la heladeria
    static void obtenerTarifas(Helado [] matriz) {
        // Datos del helado simple
        matriz[0] = new Helado();
        
        matriz[0].setPresentacion("Simple");
        matriz[0].setPrecio(3.00);
        matriz[0].setAdicional(0.50);

        // Datos del helado doble
        matriz[1] = new Helado();

        matriz[1].setPresentacion("Doble");
        matriz[1].setPrecio(4.50);
        matriz[1].setAdicional(0.80);
        
        // Datos del helado triple
        
        matriz[2] = new Helado();
    
        matriz[2].setPresentacion("Triple");
        matriz[2].setPrecio(5.50);
        matriz[2].setAdicional(1.00);
    }
    
    static void mostrarTarifas(Helado [] matriz) {
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("TARIFAS:");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.printf("\t \t");
        for (int i = 0; i < matriz.length; i++) {
            switch (i) {
                case 0:
                    System.out.print("Precio");
                    break;
                case 1:
                    System.out.print("+ chocolate");
                    break;
            }
            System.out.printf("\t \t");
        }
        System.out.println();
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i].getPresentacion());
            System.out.printf("\t \t");
            System.out.print(matriz[i].getPrecio());
            System.out.printf("\t \t");
            System.out.print(matriz[i].getAdicional());
            System.out.printf("\t \t");
            System.out.println();
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        }
        System.out.println();
    }
    
    // Matriz que almacena las tarifas de la heladeria
    static void obtenerSabores(Sabor [] matriz) {
        // Datos del sabor 1
        matriz[0] = new Sabor("Fresa");
        
        // Datos del sabor 2
        matriz[1] = new Sabor("Chocochip");
        
        // Datos del sabor 3
        matriz[2] = new Sabor("Tricolor");
    }
    
    static void mostrarSabores(Sabor [] matriz) {
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("SABORES:");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i].getNombre());
            System.out.printf("\t \t");
            System.out.println();
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        }
        System.out.println();
    }
    
    static void mostrarVentas(Venta [] ventas, Helado [] helados, Sabor [] sabores) {
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.printf("\t \t \t \t");
        for (int i = 0; i < helados.length; i++) {
            System.out.print(helados[i].getPresentacion());
            System.out.printf("\t \t");
        }
        System.out.println();
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        for (int i = 0; i < ventas.length; i++) {
            System.out.print(sabores[i].getNombre()+ " ");
            System.out.printf("\t \t \t");
            System.out.printf("%1.2f \t \t", (ventas[i].getHelado().getPrecio() + ventas[i].getHelado().getAdicional()));
            System.out.println();
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        }
        System.out.println();
    }
}

class Helado {
    private String presentacion;
    private double precio;
    private double adicional;
    
    public Helado() {
        this.presentacion = "";
        this.precio = 0;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getAdicional() {
        return adicional;
    }

    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }
}

class Sabor {
    private String nombre;
    
    public Sabor(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

class Venta {
    private String cliente;
    private Helado helado;
    private Sabor sabor[];
    private boolean chocolate;
    
    public Venta(String cliente, Helado helado, Sabor[] sabor, boolean chocolate) {
        this.cliente = cliente;
        this.helado = helado;
        this.sabor = sabor;
        this.chocolate = chocolate;
    }
    
    public Venta() {
        this.chocolate = false;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Helado getHelado() {
        return helado;
    }

    public void setHelado(Helado helado) {
        this.helado = helado;
    }

    public Sabor[] getSabor() {
        return sabor;
    }

    public void setSabor(Sabor[] sabor) {
        this.sabor = sabor;
    }

    public boolean isChocolate() {
        return chocolate;
    }

    public void setChocolate(boolean chocolate) {
        this.chocolate = chocolate;
    }
    
    public void laVenta() {
        System.out.println("Reporte de la venta:");
        System.out.println("Cliente: " + this.cliente);
        System.out.println("Tipo de Helado: " + this.helado.getPresentacion());
        System.out.println("Sabores:");
        for (int i = 0; i < sabor.length; i++) {
            System.out.print("    " + this.sabor[i].getNombre() + " ");
        }
        System.out.println();
        System.out.println("Precio: " + this.helado.getPrecio());
        if (chocolate) {
            System.out.println("Adiciona chocolate");
            System.out.println("Costo adicional por incluir chocolate: " + this.helado.getAdicional());
            System.out.println("Precio Total: " + (this.helado.getPrecio() + this.helado.getAdicional()));
        } else {
            System.out.println("Sin chocolate");    
            System.out.println("Precio Total: " + (this.helado.getPrecio()));
        }
        System.out.println();
    }
}

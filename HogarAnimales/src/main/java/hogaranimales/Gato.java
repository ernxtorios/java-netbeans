package hogaranimales;

public class Gato extends Animal {

    public Gato() {
    }
    
    @Override
    public void estado() {
        System.out.println("Tipo: Gato");
        super.estado();
    }
}

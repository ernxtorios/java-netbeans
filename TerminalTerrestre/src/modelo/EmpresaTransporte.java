package modelo;

public class EmpresaTransporte {

    private String nombre;

    private String posicionEstacionamiento;

    private String tipo;

    public EmpresaTransporte(String nombre) {
        this.nombre = nombre;
    }

    public EmpresaTransporte() {
        this.nombre = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicionEstacionamiento() {
        return posicionEstacionamiento;
    }

    public void setPosicionEstacionamiento(String posicionEstacionamiento) {
        this.posicionEstacionamiento = posicionEstacionamiento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void estado() {
        System.out.println("Datos de la Empresa: Nombre: " + this.getNombre() +
                ", Posición en el estacionamiento: " + this.getPosicionEstacionamiento() +
                ", Tipo: " + this.getTipo());
    }
}

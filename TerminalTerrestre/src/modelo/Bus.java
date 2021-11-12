package modelo;

public class Bus {

    private String placa;

    private String marca;

    private String modelo;

    private EmpresaTransporte empresa;

    public Bus(String placa, String marca, String modelo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }

    public Bus() {
        this.placa = "";
        this.marca = "";
        this.modelo = "";
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public EmpresaTransporte getEmpresa() {
        return empresa;
    }

    public void setEmpresa(EmpresaTransporte empresa) {
        this.empresa = empresa;
    }
    
    public void estado() {
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Datos del Bus: Número de Placa: " + this.getPlaca() + 
                ", Marca: " + this.getMarca() + 
                ", Modelo: " + this.getModelo() + 
                ", Empresa de Transportes: " + this.getEmpresa().getNombre());
    }
}

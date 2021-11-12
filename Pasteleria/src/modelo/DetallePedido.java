package modelo;

public class DetallePedido {

    private int item;

    private Torta torta;

    private Pedido pedido;
    
    public DetallePedido() {
        this.item = 0;
    }
    
    public DetallePedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public Torta getTorta() {
        return torta;
    }

    public void setTorta(Torta torta) {
        if (torta.isDisponible()) {
            this.torta = torta;
            this.torta.setDisponible(false);
        } else {
            System.out.println("La torta no se encuentra disponible");
        }
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    
    public void estado() {
        System.out.println(String.format("%2s %40s %20s", this.getItem(), this.torta.getDescripcion(), this.torta.getPrecio()));
    }
}

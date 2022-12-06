package bean;

public class Pedido {

    private int pedidoId;
    private int clienteId;
    private String cliente;
    private int lancheId;
    private int quantidade;
    private float total;
    private String status;

    public Pedido(int pedidoId, int clienteId, String cliente, int lancheId, int quantidade, float total, String status) {
        this.pedidoId = pedidoId;        
        this.cliente = cliente;
        this.lancheId = lancheId;
        this.quantidade = quantidade;
        this.total = total;
        this.lancheId = lancheId;
        this.quantidade = quantidade;
        this.status = status;
    }

    
    
    public Pedido(int pedidoId, int clienteId, int lancheId, int quantidade) {
        this.pedidoId = pedidoId;
        this.clienteId = clienteId;
        this.lancheId = lancheId;
        this.quantidade = quantidade;
    }

    public Pedido(int pedidoId, String cliente, float total, String status) {
        this.pedidoId = pedidoId;
        this.cliente = cliente;
        this.total = total;
        this.status = status;
    }

    public int getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(int pedidoId) {
        this.pedidoId = pedidoId;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getLancheId() {
        return lancheId;
    }

    public void setLancheId(int lancheId) {
        this.lancheId = lancheId;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
}
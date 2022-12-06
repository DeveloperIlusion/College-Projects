package configs;

public class PedidoTransaction {

    private int pedidoId;
    private String msg;

    public PedidoTransaction() {}
    
    public PedidoTransaction(int pedidoId, String msg) {
        this.pedidoId = pedidoId;
        this.msg = msg;
    }

    public int getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(int pedidoId) {
        this.pedidoId = pedidoId;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
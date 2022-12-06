package bean;

public class ItemPedido {

    private int itemPedidoId;
    private int lancheId;
    private String lanche;
    private int quantidade;
    private float valorUnitario;
    private float subtotal;

    public ItemPedido() {
    }

    public ItemPedido(int itemPedidoId, int lancheId, String lanche, int quantidade, float valorUnitario, float subtotal) {
        this.itemPedidoId = itemPedidoId;
        this.lancheId = lancheId;
        this.lanche = lanche;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
        this.subtotal = subtotal;
    }

    public int getItemPedidoId() {
        return itemPedidoId;
    }

    public void setItemPedidoId(int itemPedidoId) {
        this.itemPedidoId = itemPedidoId;
    }

    public int getLancheId() {
        return lancheId;
    }

    public void setLancheId(int lancheId) {
        this.lancheId = lancheId;
    }

    public String getLanche() {
        return lanche;
    }

    public void setLanche(String lanche) {
        this.lanche = lanche;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }
}
package bean;

public class RelatorioLanche {

    private String lanche;
    private int vendidos;
    private float precoVenda;
    private float faturamento;

    public RelatorioLanche(String lanche, int vendidos, float precoVenda, float faturamento) {
        this.lanche = lanche;
        this.vendidos = vendidos;
        this.precoVenda = precoVenda;
        this.faturamento = faturamento;
    }

    public String getLanche() {
        return lanche;
    }

    public void setLanche(String lanche) {
        this.lanche = lanche;
    }

    public int getVendidos() {
        return vendidos;
    }

    public void setVendidos(int vendidos) {
        this.vendidos = vendidos;
    }

    public float getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(float precoVenda) {
        this.precoVenda = precoVenda;
    }

    public float getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(float faturamento) {
        this.faturamento = faturamento;
    }
}
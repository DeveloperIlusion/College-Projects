package bean;

public class Lanche {

    private int lancheId;
    private String nome;
    private float precoVenda;
    private String descricao;

    public Lanche() {}

    public Lanche(int lancheId, String nome, float precoVenda, String descricao) {
        this.lancheId = lancheId;
        this.nome = nome;
        this.precoVenda = precoVenda;
        this.descricao = descricao;
    }

    public int getLancheId() {
        return lancheId;
    }

    public void setLancheId(int lancheId) {
        this.lancheId = lancheId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(float precoVenda) {
        this.precoVenda = precoVenda;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
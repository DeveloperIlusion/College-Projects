package bean;

public class Lanche {
    
    private int lancheId;
    private String nome;
    private float valor;
    private String descricao;
    
    public Lanche () {}

    public Lanche(int lancheId, String nome, float valor, String descricao) {
        this.lancheId = lancheId;
        this.nome = nome;
        this.valor = valor;
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

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}

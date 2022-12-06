package bean;

public class RelatorioClientes {
    public String nome;
    public float totalGasto;

    public RelatorioClientes(String nome, float totalGasto) {
        this.nome = nome;
        this.totalGasto = totalGasto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getTotalGasto() {
        return totalGasto;
    }

    public void setTotalGasto(float totalGasto) {
        this.totalGasto = totalGasto;
    }
}



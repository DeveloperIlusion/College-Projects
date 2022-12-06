package bean;

public class Veiculo {
    private int anoFabricacao;
    private String modelo;
    private String marca;
    private int potencia;
    private String categoria;

    public Veiculo(int anoFabricacao, String modelo, String marca, int potencia, String categoria) {
        this.anoFabricacao = anoFabricacao;
        this.modelo = modelo;
        this.marca = marca;
        this.potencia = potencia;
        this.categoria = categoria;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoDeFabricacao) {
        this.anoFabricacao = anoDeFabricacao;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
}

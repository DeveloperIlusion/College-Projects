package bean;

public class Automovel extends Veiculo {
    
    private int chassi;
    private String tipoCombustivel;
    private String cor;
    private int crlv;

    public Automovel(int chassi, String tipoCombustivel, String cor, int crlv, 
                     int anoFabricacao, String modelo, String marca, int potencia, String categoria) {
        super (anoFabricacao, modelo, marca, potencia, categoria);
        this.chassi = chassi;
        this.tipoCombustivel = tipoCombustivel;
        this.cor = cor;
        this.crlv = crlv;
    }

    public int getChassi() {
        return chassi;
    }

    public void setChassi(int chassi) {
        this.chassi = chassi;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getCrlv() {
        return crlv;
    }

    public void setCrlv(int crlv) {
        this.crlv = crlv;
    }
    
    
}

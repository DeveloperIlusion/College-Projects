package bean;

public class VeiculoEletrico extends Veiculo {
    
    private int durabilidadeBateria;
    private String equipamentoSegurancaObrigatorio;
    private int tempoAbastecimento;
    private int autonomiaKM;

    public VeiculoEletrico(int durabilidadeBateria, String equipamentoSegurancaObrigatorio, int tempoAbastecimento, int autonomiaKM, int anoFabricacao, String modelo, String marca, int potencia, String categoria) {
        super(anoFabricacao, modelo, marca, potencia, categoria);
        this.durabilidadeBateria = durabilidadeBateria;
        this.equipamentoSegurancaObrigatorio = equipamentoSegurancaObrigatorio;
        this.tempoAbastecimento = tempoAbastecimento;
        this.autonomiaKM = autonomiaKM;
    }

    public int getDurabilidadeBateria() {
        return durabilidadeBateria;
    }

    public void setDurabilidadeBateria(int durabilidadeBateria) {
        this.durabilidadeBateria = durabilidadeBateria;
    }

    public String getEquipamentoSegurancaObrigatorio() {
        return equipamentoSegurancaObrigatorio;
    }

    public void setEquipamentoSegurancaObrigatorio(String equipamentoSegurancaObrigatorio) {
        this.equipamentoSegurancaObrigatorio = equipamentoSegurancaObrigatorio;
    }

    public int getTempoAbastecimento() {
        return tempoAbastecimento;
    }

    public void setTempoAbastecimento(int tempoAbastecimento) {
        this.tempoAbastecimento = tempoAbastecimento;
    }

    public int getAutonomiaKM() {
        return autonomiaKM;
    }

    public void setAutonomiaKM(int autonomiaKM) {
        this.autonomiaKM = autonomiaKM;
    }  
}

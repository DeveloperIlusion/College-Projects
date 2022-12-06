package bean;

import java.util.Date;

public class Colaborador extends PessoaFisica {

    private int ctps;
    private String funcao;
    private int horasDedicacao;

    public Colaborador(
        String nome, String cpf, Date dataNascimento,
        int ctps, String funcao, int horasDedicacao
    ) {
        super(nome, cpf, dataNascimento);
        this.ctps = ctps;
        this.funcao = funcao;
        this.horasDedicacao = horasDedicacao;
    }

    public int getCtps() {
        return ctps;
    }

    public void setCtps(int ctps) {
        this.ctps = ctps;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public int getHorasDedicacao() {
        return horasDedicacao;
    }

    public void setHorasDedicacao(int horasDedicacao) {
        this.horasDedicacao = horasDedicacao;
    }
}
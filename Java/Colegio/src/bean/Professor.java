package bean;

import java.util.Date;

public class Professor extends Colaborador {

    private String titulacao;

    // método construtor da classe professor
    public Professor(
        String nome, String cpf, Date dataNascimento, int ctps, String funcao,
        int horasDedicacao, String titulacao
    ) {
        // chamada da classe
        super(nome, cpf, dataNascimento, ctps, funcao, horasDedicacao);
        // determina o valor do atributo titulação
        this.titulacao = titulacao;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    } 
}

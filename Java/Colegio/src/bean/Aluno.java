package bean;

import java.util.Date;

public class Aluno extends PessoaFisica {

    private int matricula;
    private String rg;

    public Aluno(int matricula, String nome, Date dataNascimento, String cpf, String rg) {
        super(nome, cpf, dataNascimento);
        this.matricula = matricula;
        this.rg = rg;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
}
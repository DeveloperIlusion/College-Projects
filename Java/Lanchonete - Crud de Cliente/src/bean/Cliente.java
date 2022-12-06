package bean;

public class Cliente {
    
    private int clienteId;
    private String nome;
    private String telefone;
    private String email;
    
    public Cliente() {}

    public Cliente(int clienteId, String nome, String telefone, String email) {
        this.clienteId = clienteId;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public int getClienteId() {
        return clienteId;
    }

    public void setClienteId(int clienteId) {
        this.clienteId = clienteId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}

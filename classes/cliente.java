package classes;

public class cliente {

    private String nome;
    private String endereco;
    private String telefone;
    private String email;

    public cliente(String nome, String endereco, String telefone, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
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

    public String getnome() {
        return nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public static void main(String[] args) {
        cliente meuCliente = new cliente("João da Silva", "Rua A, 123", "9999-9999", "joao.silva@example.com");

        System.out.println("Nome: " + meuCliente.getNome());
        System.out.println("Endereço: " + meuCliente.getEndereco());
        System.out.println("Telefone: " + meuCliente.getTelefone());
        System.out.println("E-mail: " + meuCliente.getEmail());

        meuCliente.setTelefone("8888-8888");
        System.out.println("Novo telefone: " + meuCliente.getTelefone());
    }
}


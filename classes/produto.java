package classes;

public class produto {
    private String nome;
    private double preco;

    public produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public static void main(String[] args) {
        produto produto = new produto("Camiseta", 29.99);
        System.out.println("Nome do produto: " + produto.getNome());
        System.out.println("Preço do produto: " + produto.getPreco());
    }
}
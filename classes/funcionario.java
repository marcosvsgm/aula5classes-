package classes;

public class funcionario {
    private String nome;
    private double salario;

    public funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public static void main(String[] args) {
        funcionario funcionario = new funcionario("João", 2500.0);
        System.out.println("Nome do funcionário: " + funcionario.getNome());
        System.out.println("Salário do funcionário: " + funcionario.getSalario());
    }
}


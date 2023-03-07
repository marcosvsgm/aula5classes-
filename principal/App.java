package principal;

import classes.produto;

public class app {

    /**
     * @param args
     */
    public static void main(String[] args) {
       
    departamento setor = new departamento();
     setor.nome ="nome do setor";

    quantpessoas Colaboradores = new departamento();
    Colaboradores.Colaboradores ="Qnatidade de colaboradores";

    email email =new departamento();
    email.email ="Email do setor";
    }


    produto nomeProduto = new produto();
    nomeProduto = "Nome do Produto";
    
    peso peso = new produto();
    peso.peso = "Peso do Produto";

    altura tamanhoproduto = new produto();
    tamnanhoproduto.altura="altura do produto";

    ContaCorrente minhaConta = new ContaCorrente(1000.0);
        
    minhaConta.depositar(500.0);
    System.out.println("Saldo após depósito: " + minhaConta.getSaldo());
    
    minhaConta.sacar(200.0);
    System.out.println("Saldo após saque: " + minhaConta.getSaldo());
    
    minhaConta.sacar(1500.0);
    System.out.println("Saldo final: " + minhaConta.getSaldo());
    



    modificadordeacesso teste = new modificadordeacesso;

    s.o.p(teste.atributopublic);
    s.o.p(teste.atributoprotected);
    s.o.p(teste.atributoPrivate);
}

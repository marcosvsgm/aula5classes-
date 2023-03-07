package classes;

 class contacorrente {
    private double saldo;

    public contacorrente(double saldoInicial) {
        this.saldo = saldoInicial;
    }
    
    public void depositar(double valor) {
        this.saldo += valor;
    }
    
    public void sacar(double valor) {
        if (valor > this.saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            this.saldo -= valor;
        }
    }

    public double getSaldo() {
        return this.saldo;
    }
}

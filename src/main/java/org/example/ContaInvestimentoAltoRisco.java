package org.example;

class ContaInvestimentoAltoRisco extends ContaInvestimento {

    public ContaInvestimentoAltoRisco(String numeroConta, String titular, double saldoInicial) {
        super(numeroConta, titular, saldoInicial);
    }

    @Override
    public boolean sacar(double valor) {
        // Verifica se o saldo mínimo exigido é atendido.
        if (saldo < 10000) {
            System.out.println("Saldo mínimo de R$ 10.000,00 exigido para saque.");
            return false;
        }
        double taxa = valor * 0.05;
        double total = valor + taxa;
        if (total <= saldo) {
            saldo -= total;
            System.out.println("Saque realizado: " + valor + " (Taxa de 5%: " + taxa + ")");
            return true;
        } else {
            System.out.println("Saldo insuficiente para saque com taxa.");
            return false;
        }
    }
}

package org.example;

class ContaInvestimento extends ContaBancaria {

    public ContaInvestimento(String numeroConta, String titular, double saldoInicial) {
        super(numeroConta, titular, saldoInicial);
    }

    @Override
    public boolean sacar(double valor) {
        double taxa = valor * 0.02;
        double total = valor + taxa;
        if (total <= saldo) {
            saldo -= total;
            System.out.println("Saque realizado: " + valor + " (Taxa de: " + taxa + ")");
            return true;
        } else {
            System.out.println("Saldo insuficiente para saque com taxa.");
            return false;
        }
    }
}
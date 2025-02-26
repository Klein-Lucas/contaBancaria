package org.example;

abstract class ContaBancaria {
    protected String numeroConta;
    protected String titular;
    protected double saldo;

    public ContaBancaria(String numeroConta, String titular, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado: " + valor);
        } else {
            System.out.println("Valor inválido para depósito!");
        }
    }

    public abstract boolean sacar(double valor);

    public void exibirInformacoes() {
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }
}

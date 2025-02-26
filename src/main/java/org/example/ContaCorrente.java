package org.example;

class ContaCorrente extends ContaBancaria {
    protected double limiteChequeEspecial;

    public ContaCorrente(String numeroConta, String titular, double saldoInicial, double limiteChequeEspecial) {
        super(numeroConta, titular, saldoInicial);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado: " + valor);
            return true;
        }
        else if (valor <= (saldo + limiteChequeEspecial)) {
            double deficit = valor - saldo;
            saldo = -deficit;
            System.out.println("Saque realizado utilizando cheque especial: " + valor);
            return true;
        } else {
            System.out.println("Saldo insuficiente para saque.");
            return false;
        }
    }
}
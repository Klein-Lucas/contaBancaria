package org.example;

class ContaSalario extends ContaCorrente {
    private int saquesGratuitos;

    public ContaSalario(String numeroConta, String titular, double saldoInicial, double limiteChequeEspecial) {
        super(numeroConta, titular, saldoInicial, limiteChequeEspecial);
        this.saquesGratuitos = 0;
    }

    @Override
    public boolean sacar(double valor) {
        double taxa = 0.00;
        if (saquesGratuitos >= 1) {
            taxa = 5.00;
        }
        double total = valor + taxa;

        if (saldo >= total) {
            saldo -= total;
            saquesGratuitos++;
            if (taxa > 0)
                System.out.println("Saque realizado com taxa de R$5,00: " + valor);
            else
                System.out.println("Saque gratuito realizado: " + valor);
            return true;
        }
        else if ((saldo + limiteChequeEspecial) >= total) {
            double deficit = total - saldo;
            saldo = -deficit;
            saquesGratuitos++;
            if (taxa > 0)
                System.out.println("Saque realizado utilizando cheque especial com taxa de R$5,00: " + valor);
            else
                System.out.println("Saque gratuito realizado utilizando cheque especial: " + valor);
            return true;
        } else {
            System.out.println("Saldo insuficiente para saque.");
            return false;
        }
    }
}

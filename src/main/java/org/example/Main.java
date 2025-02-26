package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Teste da Conta Corrente ===");
        ContaCorrente cc = new ContaCorrente("001", "João", 500.00, 200.00);
        cc.depositar(100.00);
        cc.sacar(550.00);
        cc.exibirInformacoes();

        System.out.println("\n=== Teste da Conta Poupança ===");
        ContaPoupanca cp = new ContaPoupanca("002", "Maria", 1000.00);
        cp.depositar(200.00);
        cp.sacar(1500.00);
        cp.sacar(100.00);
        cp.exibirInformacoes();

        System.out.println("\n=== Teste da Conta Investimento ===");
        ContaInvestimento ci = new ContaInvestimento("003", "Carlos", 2000.00);
        ci.depositar(500.00);
        ci.sacar(1000.00);
        ci.exibirInformacoes();

        System.out.println("\n=== Teste da Conta Salário ===");
        ContaSalario cs = new ContaSalario("004", "Ana", 1000.00, 300.00);
        cs.depositar(300.00);
        cs.sacar(500.00);
        cs.sacar(200.00);
        cs.exibirInformacoes();

        System.out.println("\n=== Teste da Conta Investimento de Alto Risco ===");
        ContaInvestimentoAltoRisco cia = new ContaInvestimentoAltoRisco("005", "Fernando", 15000.00);
        cia.depositar(500.00);
        cia.sacar(1000.00);
        cia.exibirInformacoes();
    }
}
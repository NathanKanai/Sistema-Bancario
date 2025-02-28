package org.example;

public class Investimento extends ContaBanco {
    double saldoAtual;

    public Investimento(String codigoConta, String nomeTitular, double saldoInicial) {
        super(codigoConta, nomeTitular, saldoInicial);
    }
    
    public boolean realizarSaque(double valor) {
        double taxaOperacao = valor * 0.02;
        double totalSaque = valor + taxaOperacao;

        if (totalSaque <= saldoAtual) {
            saldoAtual -= totalSaque;
            System.out.println("Saque realizado com sucesso: R$" + String.format("%.2f", valor));
            System.out.println("Taxa de operação: R$" + String.format("%.2f", taxaOperacao));
            return true;
        }
        System.out.println("Saldo insuficiente para saque.");
        return false;
    }
}
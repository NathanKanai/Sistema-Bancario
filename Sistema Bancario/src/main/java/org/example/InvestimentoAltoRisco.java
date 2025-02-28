package org.example;

public class InvestimentoAltoRisco extends Investimento {
    private static final double SALDO_MINIMO_OPERACAO = 10000.0;
    private static final double TAXA_RISCO = 0.05;

    public InvestimentoAltoRisco(String codigoConta, String nomeTitular, double saldoInicial) {
        super(codigoConta, nomeTitular, saldoInicial);
    }

    @Override
    public boolean realizarSaque(double valor) {
        double taxaOperacao = valor * TAXA_RISCO;
        double totalSaque = valor + taxaOperacao;

        if (saldoAtual - totalSaque >= SALDO_MINIMO_OPERACAO) {
            saldoAtual -= totalSaque;
            System.out.println("Saque realizado com sucesso: R$" + String.format("%.2f", valor));
            System.out.println("Taxa de risco aplicada: R$" + String.format("%.2f", taxaOperacao));
            return true;
        }
        System.out.println("Saldo insuficiente ou abaixo do mínimo necessário.");
        return false;
    }
}
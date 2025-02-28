package org.example;

public class Poupanca extends ContaBanco {
    private double saldoAtual;

    public Poupanca(String codigoConta, String nomeTitular, double saldoInicial) {
        super(codigoConta, nomeTitular, saldoInicial);
    }
    
    public boolean realizarSaque(double valor) {
        if (valor <= saldoAtual) {
            saldoAtual -= valor;
            System.out.println("Saque realizado com sucesso: R$" + String.format("%.2f", valor));
            return true;
        }
        System.out.println("Saldo insuficiente para saque.");
        return false;
    }
}
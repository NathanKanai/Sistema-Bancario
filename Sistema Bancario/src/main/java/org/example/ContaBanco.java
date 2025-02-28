package org.example;

public abstract class ContaBanco {
    public String codigoConta;
    public String nomeTitular;
    public double saldoAtual;

    public ContaBanco(String codigoConta, String nomeTitular, double saldoInicial) {
        this.codigoConta = codigoConta;
        this.nomeTitular = nomeTitular;
        this.saldoAtual = saldoInicial;
    }

    public void adicionarSaldo(double valor) {
        if (valor > 0) {
            saldoAtual += valor;
            System.out.println("Depósito realizado: R$" + String.format("%.2f", valor));
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public abstract boolean realizarSaque(double valor);

    public void mostrarDetalhes() {
        System.out.println("Código da Conta: " + codigoConta);
        System.out.println("Nome do titular da conta: " + nomeTitular);
        System.out.println("Saldo Atual da conta: R$" + String.format("%.2f", saldoAtual));
    }
}



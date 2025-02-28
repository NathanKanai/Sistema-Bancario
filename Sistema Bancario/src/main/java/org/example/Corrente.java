package org.example;

    class Corrente extends ContaBanco {
    private double limiteCredito = 500.0;
    private double saldoAtual;

    public Corrente (String codigoConta, String nomeTitular, double saldoInicial) {
        super(codigoConta, nomeTitular, saldoInicial);
    }

    public boolean realizarSaque(double valor) {
        if (valor <= saldoAtual + limiteCredito) {
            saldoAtual -= valor;
            System.out.println("Saque realizado com sucesso: R$" + String.format("%.2f", valor));
            return true;
        }
        System.out.println("Saldo insuficiente para saque.");
        return false;
    }

    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("Limite de Crédito: R$" + String.format("%.2f", limiteCredito));
    }
}
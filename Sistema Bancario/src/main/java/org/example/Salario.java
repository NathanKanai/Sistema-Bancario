package org.example;

public class Salario extends Investimento {
    private int quantidadeSaques = 1;
    private static final double TAXA_SAQUE_ADICIONAL = 5.00;

    public Salario(String codigoConta, String nomeTitular, double saldoInicial) {
        super(codigoConta, nomeTitular, saldoInicial);
    }

    public boolean  realizarSaque (double valor)   {
        quantidadeSaques++;
        if (quantidadeSaques > 1) {
            valor += TAXA_SAQUE_ADICIONAL;
        }
        return super.realizarSaque(valor);
    }

    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("Quantidade de Saques Realizados: " + quantidadeSaques);
    }
}
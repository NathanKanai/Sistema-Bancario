package org.example;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main  {
    public static void main(String[] args) {
        Corrente contaCorrente = new Corrente("ney-10", "Neymar Jr", 1300);
        contaCorrente.adicionarSaldo(200);
        System.out.println("Resultado Saque CC: " + contaCorrente.realizarSaque(1300));
        contaCorrente.mostrarDetalhes();

        Poupanca contaPoupanca = new Poupanca("tiq-09", "Tiquinho Soares", 700);
        System.out.println("Resultado Saque CP: " + contaPoupanca.realizarSaque(600));
        contaPoupanca.mostrarDetalhes();

        Investimento contaInvestimento = new Investimento("gui-11", "Guilherme Amado", 5000);
        contaInvestimento.realizarSaque(500);
        contaInvestimento.mostrarDetalhes();

        Salario contaSalario = new Salario("sot-07", "Soteldinho", 2100);
        contaSalario.realizarSaque(100);
        contaSalario.realizarSaque(50);
        contaSalario.mostrarDetalhes();

        InvestimentoAltoRisco contaRisco = new InvestimentoAltoRisco("dw-36", "Deivid Washington", 19000);
        System.out.println("Resultado Saque CIR: " + contaRisco.realizarSaque(6000));
        contaRisco.mostrarDetalhes();
    }
}
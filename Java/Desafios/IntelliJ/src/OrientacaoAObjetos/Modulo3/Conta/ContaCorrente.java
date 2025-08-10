package Modulo3.Conta;

public class ContaCorrente extends ContaBancaria{
    private double tarifaMensal;

    ContaBancaria minhaConta = new ContaBancaria();

    public void cobrarTarifaMensal() {
        tarifaMensal -= getSaldo();
        System.out.println("Tarifa mensal de " + tarifaMensal + " cobrada. Saldo atual: " + minhaConta.getSaldo());
    }
}

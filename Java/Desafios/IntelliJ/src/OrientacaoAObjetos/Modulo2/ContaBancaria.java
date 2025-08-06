package Modulo2;

public class ContaBancaria {
    private String titular;
    private int numeroConta;
    private double saldo;

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void exibeConta() {
        System.out.println(titular);
        System.out.println(numeroConta);
        System.out.println(saldo);
    }
}

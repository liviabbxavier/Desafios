package Modulo2;

public class ContaBancariaPrincipal {
    public static void main(String[] args) {
        ContaBancaria minhaConta = new ContaBancaria();

        minhaConta.setTitular("Lívia");
        minhaConta.setNumeroConta(1234);
        minhaConta.setSaldo(700);

        minhaConta.exibeConta();
    }
}

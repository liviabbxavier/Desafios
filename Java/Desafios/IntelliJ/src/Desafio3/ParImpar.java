package Main.Desafio3;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        int numero;
        Scanner parOuImpar = new Scanner(System.in);
        System.out.println("Digite um número par ou ímpar");
        numero = parOuImpar.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Este número é par");
        } else {
            System.out.println("Este número é ímpar");
        }
    }
}

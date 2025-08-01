package Main.Exercícios;

import java.util.Scanner;

public class Soma100 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int soma = 0;

        while (soma <= 100) {
            System.out.println("Digite um número inteiro: ");
            int numero = leitura.nextInt();
            soma += numero;
            System.out.println("Soma atual: " + soma);
        }
        System.out.println("A soma excedeu o número 100. Valor total: " + soma);
        leitura.close();
    }
}

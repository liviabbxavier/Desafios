package Desafio3;

import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        int numero = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número positivo ou negativo");
        numero = teclado.nextInt();
        if (numero < 0) {
            System.out.println("Este número é negativo!");
        } else {
            System.out.println("Este número é positivo!");
        }
    }
}

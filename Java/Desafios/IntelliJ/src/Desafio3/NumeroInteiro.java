package Desafio3;

import java.util.Scanner;

public class NumeroInteiro {
    public static void main(String[] args) {
        int numero;
        int numero1;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número");
        numero = teclado.nextInt();
        Scanner teclado1 = new Scanner(System.in);
        System.out.println("Digite outro número");
        numero1 = teclado1.nextInt();
        if (numero > numero1) {
            System.out.println( numero + " é maior que " + numero1);
        } else if (numero < numero1){
            System.out.println(numero + " é menor que " + numero1);
        } else {
            System.out.println(numero + " é igual a " + numero1);
        }
    }
}

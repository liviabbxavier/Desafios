package Desafio3;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner tabuada = new Scanner(System.in);
        System.out.println("Digite um número e descubra a tabuada");
        int numero = tabuada.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf(numero + " x " + i + " = " + (numero * i ) );
        }
    }
}

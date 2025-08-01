package Main.Exercícios;

import java.util.Scanner;

public class Frase {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String frase = leitura.nextLine();
        System.out.println("Digite qualquer número: ");
        int numeroVezes = leitura.nextInt();
        int contador = 0;

        while (contador < numeroVezes) {
            System.out.println(frase);
            contador++;
        }
        leitura.close();
    }
}

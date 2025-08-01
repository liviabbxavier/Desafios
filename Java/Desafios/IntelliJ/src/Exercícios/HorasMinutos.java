package Main.Exercícios;

import java.util.Scanner;

public class HorasMinutos {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double numero;
        System.out.println("Digite um valor em minutos (tecle 0 para sair): ");

        while (true) {
            System.out.println("Minutos: ");
            numero = leitura.nextInt();

            if (numero == 0) {
                System.out.println("Programa encerrado, até mais!");
                break;
            }
                int horas = (int) numero / 60;
                int minutosRestantes = (int) numero % 60;
                double segundos = (numero - (int) numero) * 60;

                System.out.printf(numero + " representa: %d hora(s), %02d minuto(s) e %.0f segundo(s)\n\n",
                        horas, minutosRestantes, segundos);

        }
        leitura.close();
    }
}

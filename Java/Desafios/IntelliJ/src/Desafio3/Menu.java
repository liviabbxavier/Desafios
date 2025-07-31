package Main.Desafio3;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner menu1 = new Scanner(System.in);

            System.out.println("=== Menu ===");
            System.out.println("1 - Calcular área do quadrado.");
            System.out.println("2 - Calcular área do círculo");
            System.out.print("Escolha uma das opções acima: ");
            int opcao = menu1.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Informe o lado do quadrado: ");
                    double lado = menu1.nextDouble();
                    double areaQuadrado = lado * lado;
                    System.out.println("Área do quadrado: " + areaQuadrado);
                    break;

                case 2:
                    System.out.print("Informe o raio do círculo: ");
                    double raio = menu1.nextDouble();
                    double areaCirculo = Math.PI * Math.pow(raio, 2);
                    System.out.println("Área do círculo: " + areaCirculo);
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

            menu1.close();
        }
    }

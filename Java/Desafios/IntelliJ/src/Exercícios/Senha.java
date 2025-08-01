package Main.Exercícios;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String senha = "Java";
        String tentativa = "";

        while (!tentativa.equals(senha)) {
            System.out.println("Digite sua senha");
            tentativa = leitura.nextLine();


            if (!tentativa.equals(senha)) {
                System.out.println("*** Acesso NEGADO ***");
            }
        }
        System.out.println("*** Acesso LIBERADO ***");
        leitura.close();
    }
}

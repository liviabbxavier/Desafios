package Main.Desafio2;

public class Desconto {
    public static void main(String[] args) {
        double precoOriginal = 150;
        double porcentualDesconto = 10.0;
        double valorDesconto = precoOriginal * (porcentualDesconto / 100);
        double novoPreco = precoOriginal - valorDesconto;
        System.out.printf("Preço original: R$ " + precoOriginal);
        System.out.println("Desconto de: " + porcentualDesconto + "%");
        System.out.println("Preço com desconto: R$ " + novoPreco);
    }
}
package Modulo2;

public class Produto {
    private String nomeProduto;
    private double precoProduto;

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public void aplicarDesconto(double percentual) {
        double desconto = precoProduto * (percentual / precoProduto);
        precoProduto = precoProduto - desconto;
        System.out.println("Seu produto: " + nomeProduto);
        System.out.println("Preço final: " + precoProduto + "Desconto de: " + percentual);
    }
}

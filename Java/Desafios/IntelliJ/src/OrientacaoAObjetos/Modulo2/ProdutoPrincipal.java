package Modulo2;

public class ProdutoPrincipal {
    public static void main(String[] args) {
        Produto meuProduto = new Produto();
        meuProduto.setNomeProduto("Lightstck");
        meuProduto.setPrecoProduto(200);
        meuProduto.aplicarDesconto(10);
        meuProduto.dadosDoProduto();
    }
}

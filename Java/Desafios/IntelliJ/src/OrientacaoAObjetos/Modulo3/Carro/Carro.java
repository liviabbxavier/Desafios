package Modulo3.Carro;

public class Carro {
    public static void main(String[] args) {
        ModeloCarro meuCarro = new ModeloCarro();
        meuCarro.setNome("Clio");
        meuCarro.setModelo("duas portas");
        meuCarro.setAno1(28900);
        meuCarro.setAno2(27900);
        meuCarro.setAno3(25900);
        meuCarro.setPrecoMaisAlto(28900);
        meuCarro.precoMedio();
    }
}

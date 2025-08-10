package Modulo3.Carro;

public class Carro {
    public static void main(String[] args) {
        ModeloCarro meuCarro = new ModeloCarro();
        meuCarro.setNome("Ferrari");
        meuCarro.setModelo("12Cilindri Super");
        meuCarro.especificacoes();
        meuCarro.setPrecoMaisAlto(1000000);
    }
}

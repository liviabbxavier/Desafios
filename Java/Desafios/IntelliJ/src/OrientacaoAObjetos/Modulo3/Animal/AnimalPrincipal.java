package Modulo3.Animal;

public class AnimalPrincipal {
    public static void main(String[] args) {
        Cachorro meuCao = new Cachorro();
        meuCao.setNome("Mika");
        meuCao.setEspecie("Spitz alemão");
        meuCao.setPeso(8);
        meuCao.ficha();
        meuCao.emitirSom();

        Gato minhaGata = new Gato();
        minhaGata.setNome("Tigresa");
        minhaGata.setEspecie("Le Parm");
        minhaGata.setPeso(5);
        minhaGata.ficha();
        minhaGata.emitirSom();
    }
}

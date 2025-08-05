import br.com.alura.orientacaoobjeto.filme.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O Castelo Animado");
        meuFilme.setAnoDeLancamento(2005);
        meuFilme.setTempoDeFilmeEmMinutos(120);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(9);
        meuFilme.avalia(10);

        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Filme meuFilme2 = new Filme();
        meuFilme2.setNome("Rei Leão 2");
        meuFilme2.setAnoDeLancamento(1998);
        meuFilme2.setTempoDeFilmeEmMinutos(80);

        meuFilme2.exibeFichaTecnica();
        meuFilme2.avalia(5);
        meuFilme2.avalia(7);
        meuFilme2.avalia(8);

        System.out.println("Total de avaliações: " + meuFilme2.getTotalDeAvaliacoes());
        System.out.println(meuFilme2.pegaMedia());
    }
}

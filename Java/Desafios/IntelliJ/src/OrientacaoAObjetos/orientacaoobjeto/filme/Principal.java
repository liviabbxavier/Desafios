import br.com.alura.orientacaoobjeto.filme.Filme;
import br.com.alura.orientacaoobjeto.filme.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O Castelo Animado");
        meuFilme.setAnoDeLancamento(2005);
        meuFilme.setDuracaoEmMinutos(120);

        meuFilme.exibeFichaTecnica();
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos() + " minutos.");

        meuFilme.avalia(8);
        meuFilme.avalia(9);
        meuFilme.avalia(10);

        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Filme meuFilme2 = new Filme();
        meuFilme2.setNome("Rei Leão 2");
        meuFilme2.setAnoDeLancamento(1998);
        meuFilme2.setDuracaoEmMinutos(80);

        meuFilme2.exibeFichaTecnica();
        System.out.println("Duração do filme: " + meuFilme2.getDuracaoEmMinutos() + " minutos.");

        meuFilme2.avalia(5);
        meuFilme2.avalia(7);
        meuFilme2.avalia(8);

        System.out.println("Total de avaliações: " + meuFilme2.getTotalDeAvaliacoes());
        System.out.println(meuFilme2.pegaMedia());

        Serie oVeraoQMudouMinhaVida = new Serie();
        oVeraoQMudouMinhaVida.setNome("O Verão Que Mudou Minha Vida");
        oVeraoQMudouMinhaVida.setAnoDeLancamento(2022);
        oVeraoQMudouMinhaVida.exibeFichaTecnica();
        oVeraoQMudouMinhaVida.setTemporadas(3);
        oVeraoQMudouMinhaVida.setTotalDeEpisodios(10);
        oVeraoQMudouMinhaVida.setMinutosPorEpisodios(50);
        System.out.println("Duração para maratonar a série: " + oVeraoQMudouMinhaVida.getDuracaoEmMinutos());

    }
}

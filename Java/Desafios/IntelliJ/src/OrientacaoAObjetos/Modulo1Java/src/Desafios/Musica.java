package Desafios;

public class Musica {
    String titulo;
    String artista;
    int anoDeLancamento;
    double avaliacao;
    int totalDeAvaliacoes;

    void fichaMusica() {
        System.out.println("Nome da música: " +titulo );
        System.out.println("Artista: " +artista );
        System.out.println("Foi lançada no ano: " +anoDeLancamento);
    }
}

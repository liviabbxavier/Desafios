package br.com.alura.orientacaoobjeto.filme;

public class Serie extends Titulo{
    private int temporadas;
    private int totalDeEpisodios;
    private boolean ativa;
    private int minutosPorEpisodios;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getTotalDeEpisodios() {
        return totalDeEpisodios;
    }

    public void setTotalDeEpisodios(int totalDeEpisodios) {
        this.totalDeEpisodios = totalDeEpisodios;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getMinutosPorEpisodios() {
        return minutosPorEpisodios;
    }

    public void setMinutosPorEpisodios(int minutosPorEpisodios) {
        this.minutosPorEpisodios = minutosPorEpisodios;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * totalDeEpisodios * minutosPorEpisodios;
    }
}

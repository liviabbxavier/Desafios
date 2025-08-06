package Modulo2;

public class Livro {
    private String autorLivro;
    private String tituloLivro;

    public void setTituloLivro(String tituloLivro) {
        this.tituloLivro = tituloLivro;
    }

    public void setAutorLivro(String autorLivro) {
        this.autorLivro = autorLivro;
    }

    public void dadosDoLivro() {
        System.out.println("Título: " + tituloLivro);
        System.out.println("Autor da obra: " + autorLivro);
    }
}

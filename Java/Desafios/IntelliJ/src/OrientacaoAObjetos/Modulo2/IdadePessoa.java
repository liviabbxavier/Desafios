package Modulo2;

public class IdadePessoa {
    private String nome;
    private int idade;

    public void exibeDados() {
        System.out.println(nome);
        System.out.println(idade);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

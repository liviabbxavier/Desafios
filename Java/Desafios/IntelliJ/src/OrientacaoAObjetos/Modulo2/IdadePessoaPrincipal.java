package Modulo2;

public class IdadePessoaPrincipal {
    public static void main(String[] args) {
        IdadePessoa dados = new IdadePessoa();
        dados.setNome("Lívia");
        dados.setIdade(20);

        System.out.println(dados.setNome());
        System.out.println(dados.setIdade());

        System.out.println(dados.exibeDados());

    }
}

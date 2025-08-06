package Modulo2;

public class AlunoPrincipal {
    public static void main(String[] args) {
        Aluno dados = new Aluno();
        dados.setNomeAluno("Lívia");
        dados.calcularMedia(9);
        dados.calcularMedia(10);
        dados.calcularMedia(7);
        dados.dadosAluno();
    }
}

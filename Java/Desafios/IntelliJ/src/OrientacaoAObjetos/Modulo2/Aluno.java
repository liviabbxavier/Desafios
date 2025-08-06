package Modulo2;

public class Aluno {
    String nomeAluno;
    int notaAluno;
    double somaNotas;

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public void setNotaAluno(int notaAluno) {
        this.notaAluno = notaAluno;
    }

    public void calcularMedia(double nota) {
        somaNotas = somaNotas + nota;
        notaAluno++;
    }
    public void dadosAluno() {
        System.out.println("Aluno: " + nomeAluno);
        System.out.println("Media: " + notaAluno);
    }
}

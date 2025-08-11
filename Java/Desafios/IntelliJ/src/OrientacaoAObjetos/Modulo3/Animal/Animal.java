package Modulo3.Animal;

public class Animal {
    private String nome;
    private String especie;
    private double peso;

    public void emitirSom() {
        System.out.println("Barulho de animal!");
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
     public void ficha() {
         System.out.println("Nome: " + nome);
         System.out.println("Espécie: " + especie);
         System.out.println("Peso: " + peso);
     }
}

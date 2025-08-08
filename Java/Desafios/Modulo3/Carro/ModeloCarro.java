package Modulo3.Carro;

public class ModeloCarro extends Carro{
    private String modelo;
    private String nome;
    private int precoMaisAlto;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoMaisAlto() {
        return precoMaisAlto;
    }

    public void setPrecoMaisAlto(int precoMaisAlto) {
        this.precoMaisAlto = precoMaisAlto;
    }

    public void especificacoes() {
        System.out.println("Nome do carro: " + nome);
        System.out.println("Modelo: " + modelo);
        System.out.println("Preço: " + precoMaisAlto);
    }
}

package Modulo3.Carro;

public class ModeloCarro extends Carro {
    private String modelo;
    private String nome;
    private int precoMaisAlto;
    private int ano1;
    private int ano2;
    private int ano3;

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

    public double getAno1() {
        return ano1;
    }

    public void setAno1(int ano1) {
        this.ano1 = ano1;
    }

    public double getAno2() {
        return ano2;
    }

    public void setAno2(int ano2) {
        this.ano2 = ano2;
    }

    public double getAno3() {
        return ano3;
    }

    public void setAno3(int ano3) {
        this.ano3 = ano3;
    }

    public void precoMedio() {
        double precoMedio = (ano1 + ano2 + ano3) / 3;
        double menorPreco = Math.min(ano1, Math.min(ano2, ano3));
        double maiorPreco = Math.max(ano1, Math.max(ano2, ano3));
        System.out.println(precoMedio);

        System.out.println("Nome do carro: " + nome);
        System.out.println("Modelo: " + modelo);
        System.out.println("Preço 2012: " + "R$ " + ano1);
        System.out.println("Preço 2013: " + "R$ " + ano2);
        System.out.println("Preço 2014: " + "R$ " + ano3);
        System.out.println("Menor preço: " + "R$ " + menorPreco);
        System.out.println("Maior preço: " + "R$ " + maiorPreco);
    }
}

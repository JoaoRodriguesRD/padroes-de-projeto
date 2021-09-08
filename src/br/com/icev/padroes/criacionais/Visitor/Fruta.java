package br.com.icev.padroes.criacionais.Visitor;

public class Fruta implements Produto{
    private double precoPorKilo;
    private double peso;

    public double getPrecoPorKilo() {
        return precoPorKilo;
    }

    public void setPrecoPorKilo(double precoPorKilo) {
        this.precoPorKilo = precoPorKilo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private String nome;
    public Fruta(double preco, double peso, String nome) {
    }

    @Override
    public double receber(ICarrinhoDeCompras carrinho) {
        return carrinho.calcularPrecoDoProduto(this);
    }
}

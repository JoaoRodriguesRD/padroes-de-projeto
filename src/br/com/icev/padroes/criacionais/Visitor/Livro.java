package br.com.icev.padroes.criacionais.Visitor;

public class Livro implements Produto{
    private double preco;
    private String isbn;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Livro(double preco, String isbn) {
        this.preco = preco;
        this.isbn = isbn;
    }

    @Override
    public double receber(ICarrinhoDeCompras carrinho) {
        return carrinho.calcularPrecoDoProduto(this);
    }
}

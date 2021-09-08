package br.com.icev.padroes.criacionais.Visitor;

public class CarrinhoDeCompras implements ICarrinhoDeCompras{
    @Override
    public double calcularPrecoDoProduto(Livro livro) {
        double precoFinal = livro.getPreco();
        if (livro.getPreco() > 100)
            precoFinal *= 0.90;
        System.out.println("Livro ISBN: " + livro.getIsbn() + " Preço: " + livro.getPreco() + " Total a Pagar: " + precoFinal);
        return precoFinal;
    }

    @Override
    public double calcularPrecoDoProduto(Fruta fruta) {
        double precoFinal = fruta.getPrecoPorKilo() * fruta.getPeso();
        System.out.println(fruta.getNome() + " Preço Final: " + precoFinal);
        return precoFinal;
    }
}

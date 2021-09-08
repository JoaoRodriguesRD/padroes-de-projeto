package br.com.icev.padroes.criacionais.Visitor;



public interface ICarrinhoDeCompras {
    double calcularPrecoDoProduto(Livro livro);
    double calcularPrecoDoProduto(Fruta fruta);
}

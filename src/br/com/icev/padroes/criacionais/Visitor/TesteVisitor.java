package br.com.icev.padroes.criacionais.Visitor;

import java.util.List;

public class TesteVisitor {
    public static void main(String[] args) {
        Produto produtos[] = new Produto[]{new Livro(80.0, "1234"), new Livro(100.0, "5678"),
                new Fruta(8.0, 2.0, "Banana"), new Fruta(15.0, 5.0, "Maça")};

        double totalPedido = calcularTotalPedido(produtos);

    }

    private static double calcularTotalPedido(Produto[] produtos){
        ICarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        double total = 0;
        for (Produto p : produtos){
            total = total + p.receber(carrinho);
        }
        return total;
    }
}

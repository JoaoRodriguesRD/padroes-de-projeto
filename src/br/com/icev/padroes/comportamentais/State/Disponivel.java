package br.com.icev.padroes.comportamentais.State;

public class Disponivel implements EstadoLivro{

    @Override
    public void devolver(Livro livro) {

        System.out.println(livro + " na estante.");
    }

    @Override
    public boolean solicitar(Livro livro) {
        System.out.println("Atendendo pedido ao livro " + livro);
        livro.definirEstado(new Emprestado());
        return false;
    }

    @Override
    public String toString() {
        return "Disponível";
    }
}

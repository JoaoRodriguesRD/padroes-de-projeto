package br.com.icev.padroes.comportamentais.State;

public class Emprestado implements EstadoLivro{

    @Override
    public void devolver(Livro livro) {
        System.out.println("Ok, o livro "+ livro + " foi devolvido.");
        livro.definirEstado(new Disponivel());
    }

    @Override
    public boolean solicitar(Livro livro) {
        System.out.println("O livro "+ livro + "não está disponível.");
        return false;
    }

    @Override
    public String toString() {
        return "Emprestado";
    }
}

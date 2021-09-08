package br.com.icev.padroes.comportamentais.State;

public class TesteState {
    public static void main(String[] args) {
        Livro padroes = new Livro("Padrões de Projeto na Prática");
        Livro java = new Livro("Programação em Java - Avançado");

        padroes.solicitar();
        //java.solicitar();
        padroes.solicitar();

        //padroes.devolver();

    }
}

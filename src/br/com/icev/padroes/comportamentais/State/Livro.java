package br.com.icev.padroes.comportamentais.State;

public class Livro {

    private String titulo;
    private EstadoLivro estado;

    public Livro(String titulo) {
        this.titulo = titulo;
        this.estado = new Disponivel();
    }

    public void definirEstado(EstadoLivro estado){
        System.out.println("Transitando de "+ this.estado +" para "+ estado);
        this.estado = estado;
    }

    public void devolver() {
        this.estado.devolver(this);
    }

    public boolean solicitar() {
        return this.estado.solicitar(this);
    }

    @Override
    public String toString() {
        return this.titulo;
    }
}

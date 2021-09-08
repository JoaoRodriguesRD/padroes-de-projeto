package br.com.icev.padroes.estruturais.Adapter;

public class VisualizadorImagem {
    private Imagem imagem;


    public VisualizadorImagem(Imagem imagem) {
        this.imagem = imagem;
    }
    public void aplicarFiltro(Filtro filtro){
        filtro.aplicar(imagem);
    }
}

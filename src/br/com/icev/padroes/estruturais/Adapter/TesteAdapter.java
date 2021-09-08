package br.com.icev.padroes.estruturais.Adapter;

import br.com.icev.padroes.estruturais.Adapter.BibliotecaDeFiltros.Sepia;

public class TesteAdapter {
    public static void main(String[] args) {
        VisualizadorImagem visualizador = new VisualizadorImagem(new Imagem());
        visualizador.aplicarFiltro(new FiltroPretoBranco());
        visualizador.aplicarFiltro(new FiltroSepiaAdapter(new Sepia()));
    }
}

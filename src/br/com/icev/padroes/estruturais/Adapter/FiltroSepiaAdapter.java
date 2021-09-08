package br.com.icev.padroes.estruturais.Adapter;

import br.com.icev.padroes.estruturais.Adapter.BibliotecaDeFiltros.Sepia;

public class FiltroSepiaAdapter implements Filtro{
    private Sepia sepia;

    public FiltroSepiaAdapter(Sepia sepia){
        this.sepia = sepia;
    }

    @Override
    public void aplicar(Imagem imagem) {
        sepia.inicializarFiltro();
        sepia.render(imagem);
    }
}

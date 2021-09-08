package br.com.icev.padroes.estruturais.Adapter.BibliotecaDeFiltros;

import br.com.icev.padroes.estruturais.Adapter.Imagem;

public class Sepia {
    public void inicializarFiltro() {
        System.out.println("Filtro sépia inicializado");
    }

    public void render(Imagem imagem) {
        System.out.println("Filtro Sépia aplicado");
    }
}

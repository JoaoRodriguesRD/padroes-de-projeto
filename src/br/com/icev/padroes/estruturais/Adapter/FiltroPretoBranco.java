package br.com.icev.padroes.estruturais.Adapter;

public class FiltroPretoBranco implements Filtro{
    @Override
    public void aplicar(Imagem imagem) {
        System.out.println("Filtro preto e branco foi aplicado.");
    }
}

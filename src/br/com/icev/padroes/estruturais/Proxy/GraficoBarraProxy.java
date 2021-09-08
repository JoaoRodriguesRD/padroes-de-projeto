package br.com.icev.padroes.estruturais.Proxy;

import java.sql.SQLOutput;

public class GraficoBarraProxy implements Grafico{
    private Grafico grafico;

    public GraficoBarraProxy(){

        this.grafico = new GraficoBarra();
    }

    @Override
    public void carregarDados() {
        System.out.println("Desenha Gráfico Fake...");
        grafico.carregarDados();
    }

    @Override
    public void exibir() {
        // Pode implementar alguma lógica antes
        grafico.exibir();
        // Pode implementar alguma logica depois
    }
}

package br.com.icev.padroes.estruturais.Proxy;

public class TesteProxy {
    public static void main(String[] args) {

        Grafico grafico = new GraficoBarraProxy();
        grafico.carregarDados();
        grafico.exibir();

    }
}

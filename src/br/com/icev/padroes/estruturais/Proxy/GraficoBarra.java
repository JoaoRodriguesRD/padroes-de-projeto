package br.com.icev.padroes.estruturais.Proxy;

public class GraficoBarra implements Grafico {
    @Override
    public void carregarDados() {
        System.out.println("Carregando Dados...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void exibir() {
        System.out.println("Gráfico de Barras.");
    }
}

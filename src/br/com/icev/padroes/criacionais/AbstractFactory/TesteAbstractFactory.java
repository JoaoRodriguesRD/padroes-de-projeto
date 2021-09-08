package br.com.icev.padroes.criacionais.AbstractFactory;

public class TesteAbstractFactory {
    public static void main(String[] args) {
        FabricaDeComponentes fabrica = FabricaDeComponentes.obterFabrica(Configuracao.WINDOWS);
        Janela janela = fabrica.criarJanela();
        Botao botao = fabrica.criarBotao();

        janela.desenhar();
        botao.desenhar();
    }
}

package br.com.icev.padroes.criacionais.AbstractFactory;

public class FabricaDeComponentesWindows extends FabricaDeComponentes {
    @Override
    public Janela criarJanela() {
        return new JanelaWindows();
    }

    @Override
    public Botao criarBotao() {
        return new BotaoWindows();
    }
}

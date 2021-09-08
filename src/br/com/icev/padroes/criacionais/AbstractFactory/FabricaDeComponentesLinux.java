package br.com.icev.padroes.criacionais.AbstractFactory;

public class FabricaDeComponentesLinux extends FabricaDeComponentes {
    @Override
    public Janela criarJanela() {
        return new JanelaLinux();
    }

    @Override
    public Botao criarBotao() {
        return new BotaoLinux();
    }
}

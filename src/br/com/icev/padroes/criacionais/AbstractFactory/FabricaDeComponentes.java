package br.com.icev.padroes.criacionais.AbstractFactory;



public abstract class FabricaDeComponentes {
    public abstract Janela criarJanela();
    public abstract Botao criarBotao();

    public static FabricaDeComponentes obterFabrica(Configuracao configuracao){
        switch (configuracao){
            case WINDOWS: return new FabricaDeComponentesWindows();
            case LINUX: return new FabricaDeComponentesLinux();
        }
        return null;
    }

}

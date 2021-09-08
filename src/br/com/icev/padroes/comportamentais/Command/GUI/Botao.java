package br.com.icev.padroes.comportamentais.Command.GUI;

public class Botao {
    private Command command;

    public Botao(Command command){
        this.command = command;
    }

    public void click(){
        command.execute();
    }
}

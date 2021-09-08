package br.com.icev.padroes.comportamentais.Command;

import br.com.icev.padroes.comportamentais.Command.GUI.Botao;
import br.com.icev.padroes.comportamentais.Command.GUI.Command;

public class TesteCommand {
    public static void main(String[] args) {
        Command servico = new ServicoClienteCommand();
        Botao botao = new Botao(servico);
        botao.click();
    }
}

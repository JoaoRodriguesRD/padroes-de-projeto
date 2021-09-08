package br.com.icev.padroes.comportamentais.Command;

import br.com.icev.padroes.comportamentais.Command.GUI.Command;

public class ServicoClienteCommand implements Command {
    private ServicoCliente servico;

    public ServicoClienteCommand(){
        servico = new ServicoCliente();
    }

    @Override
    public void execute() {
        servico.adicionarCliente();
    }
}

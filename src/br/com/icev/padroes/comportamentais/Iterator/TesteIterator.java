package br.com.icev.padroes.comportamentais.Iterator;

import java.util.Iterator;

public class TesteIterator {
    public static void main(String[] args) {
        HistoricoNavegador historico = new HistoricoNavegador();
        historico.inserir("www.google.com.br");
        historico.inserir("www.apple.com.br");
        historico.inserir("www.globo.com");

        while ((historico.hasNext())){
            System.out.println(historico.next());
        }

    }
}

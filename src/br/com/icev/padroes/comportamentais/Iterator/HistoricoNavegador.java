package br.com.icev.padroes.comportamentais.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HistoricoNavegador extends Historico implements Iterator {
    List<String> urls = new ArrayList();
    int indice = 0;

    public void inserir(String s) {
        urls.add(s);
    }

    public void remover(String item){
        urls.remove(item);
    }

    @Override
    public boolean hasNext() {
        return (indice < urls.size());
    }

    @Override
    public String next() {
        String url = urls.get(indice);
        indice++;
        return url;
    }
}

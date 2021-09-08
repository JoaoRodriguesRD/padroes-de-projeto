package br.com.icev.padroes.comportamentais.Iterator;

import java.util.Iterator;

public abstract class Historico  {
    public abstract void inserir(String s);
    public abstract void remover(String item);
}

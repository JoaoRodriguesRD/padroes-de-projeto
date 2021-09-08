package br.com.icev.padroes.estruturais.Bridge;

public abstract class Forma {
    protected Cor cor;

    public Forma(Cor cor){
        this.cor = cor;
    }

    public abstract void aplicarCor();
}

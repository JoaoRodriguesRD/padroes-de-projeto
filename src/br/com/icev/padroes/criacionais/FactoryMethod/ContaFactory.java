package br.com.icev.padroes.criacionais.FactoryMethod;

public interface ContaFactory {
    public Conta getContaTipo(TipoConta tipoConta);
}

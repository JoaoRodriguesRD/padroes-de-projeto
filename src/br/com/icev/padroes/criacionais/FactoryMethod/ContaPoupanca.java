package br.com.icev.padroes.criacionais.FactoryMethod;

public class ContaPoupanca extends Conta{
    @Override
    public void sacar(double valor) {
        super.saldo -= valor;
    }
}

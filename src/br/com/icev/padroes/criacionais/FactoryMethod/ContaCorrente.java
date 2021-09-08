package br.com.icev.padroes.criacionais.FactoryMethod;

public class ContaCorrente extends Conta{

    @Override
    public void sacar(double valor) {
        //Lógica dea aplicar taxas
        double taxas = valor * 0.01;
        super.saldo -= (valor + taxas);
    }
}

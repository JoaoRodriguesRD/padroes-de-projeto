package br.com.icev.padroes.criacionais.FactoryMethod;

import java.math.BigDecimal;

public abstract class Conta {
    String agencia;
    String numero;
    double saldo;

    public void depositar(double valor){
        saldo += valor;
    };

    public abstract void sacar(double valor);

    public double getSaldo() {
        return saldo;
    }
}

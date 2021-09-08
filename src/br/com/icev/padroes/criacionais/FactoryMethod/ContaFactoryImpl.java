package br.com.icev.padroes.criacionais.FactoryMethod;

public class ContaFactoryImpl implements ContaFactory{
    @Override
    public Conta getContaTipo(TipoConta tipoConta) {
        switch (tipoConta){
            case CONTA_CORRENTE: return new ContaCorrente();
            case POUPANCA: return new ContaPoupanca();
            default: throw new RuntimeException("Tipo de Conta inválida!");
        }
    }
}

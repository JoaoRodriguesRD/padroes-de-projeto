package br.com.icev.padroes.criacionais.FactoryMethod;

public class ClienteFactoryMethod {
    public static void main(String[] args) {

        ContaFactory fabricaDeContas = new ContaFactoryImpl();
        Conta contaPoupanca = fabricaDeContas.getContaTipo(TipoConta.POUPANCA);
        Conta contaCorrente = fabricaDeContas.getContaTipo(TipoConta.CONTA_CORRENTE);

        contaCorrente.depositar(1000);
        contaPoupanca.depositar(1000);

        System.out.println("Saldo da Conta Corrente: " + contaCorrente.getSaldo());
        System.out.println("Saldo da Conta Poupança: " + contaPoupanca.getSaldo());

        contaCorrente.sacar(100);
        contaPoupanca.sacar(100);

        System.out.println("Saldo da Conta Corrente: " + contaCorrente.getSaldo());
        System.out.println("Saldo da Conta Poupança: " + contaPoupanca.getSaldo());
    }
}

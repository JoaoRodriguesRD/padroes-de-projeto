package br.com.icev.padroes.comportamentais.Strategy;

public class TesteStrategy {
    public static void main(String[] args) {

        CalculadoraDeImposto calculadora = new CalculadoraDeImposto();
        calculadora.setValor(100.0);

        System.out.println("Valor do Imposto: " + calculadora.calcular(valor -> valor * 0.25));
    }

}

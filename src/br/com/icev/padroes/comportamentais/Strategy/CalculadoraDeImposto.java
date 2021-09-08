package br.com.icev.padroes.comportamentais.Strategy;

public class CalculadoraDeImposto {

    private double valor;

    public double calcular(Imposto imposto){

        return imposto.calcular(valor);
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}

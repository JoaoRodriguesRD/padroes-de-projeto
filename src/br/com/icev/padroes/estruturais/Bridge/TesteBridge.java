package br.com.icev.padroes.estruturais.Bridge;

public class TesteBridge {

    public static void main(String[] args) {
        Forma quadrado = new Quadrado(new Vermelho());
        quadrado.aplicarCor();

        Forma circulo = new Circulo(new Laranja());
        circulo.aplicarCor();

    }


}

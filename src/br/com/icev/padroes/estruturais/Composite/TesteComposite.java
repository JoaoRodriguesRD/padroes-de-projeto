package br.com.icev.padroes.estruturais.Composite;

import br.com.icev.padroes.estruturais.Bridge.*;

public class TesteComposite {
    public static void main(String[] args) {
        Cor azul = new Azul();
        Canvas canvasPrincipal = new Canvas(azul);
        Canvas canvasVerde = new Canvas(new Verde());
        canvasPrincipal.adiciona(canvasVerde);

        canvasVerde.adiciona(new Circulo(new Azul()));
        canvasVerde.adiciona(new Quadrado(new Vermelho()));

        Canvas canvasLaranja = new Canvas(new Laranja());
        canvasLaranja.adiciona(new Circulo(new Vermelho()));

        canvasPrincipal.adiciona(canvasLaranja);

        canvasPrincipal.aplicarCor();
    }
}

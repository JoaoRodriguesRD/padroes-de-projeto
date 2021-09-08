package br.com.icev.padroes.criacionais.AbstractFactory;

public class JanelaWindows extends Janela{
    @Override
    public void desenhar() {
        System.out.println("Desenhando Janela windows");
    }
}

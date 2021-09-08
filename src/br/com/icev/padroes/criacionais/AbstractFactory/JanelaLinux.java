package br.com.icev.padroes.criacionais.AbstractFactory;

public class JanelaLinux extends Janela{
    @Override
    public void desenhar() {
        System.out.println("Desenhando Janela Linux");
    }
}

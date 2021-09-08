package br.com.icev.padroes.estruturais.Bridge;

public class Vermelho implements Cor{
    @Override
    public void aplicarCor() {
        System.out.println("Vermelho.");
    }
}

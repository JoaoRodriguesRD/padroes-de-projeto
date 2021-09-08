package br.com.icev.padroes.estruturais.Bridge;

public class Verde implements Cor{
    @Override
    public void aplicarCor() {
        System.out.println("Verde.");
    }
}

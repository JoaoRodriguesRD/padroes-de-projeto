package br.com.icev.padroes.estruturais.Bridge;

public class Quadrado extends Forma{

    public Quadrado(Cor cor){
        super(cor);
    }

    @Override
    public void aplicarCor() {
        System.out.print("Quadrado preenchido com a cor: ");
        cor.aplicarCor();
    }
}

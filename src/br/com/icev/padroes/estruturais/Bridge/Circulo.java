package br.com.icev.padroes.estruturais.Bridge;

public class Circulo extends Forma{

    public Circulo(Cor cor){
        super(cor);
    }

    @Override
    public void aplicarCor() {
        System.out.print("Círculo preenchido com a cor: ");
        cor.aplicarCor();
    }
}

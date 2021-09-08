package br.com.icev.padroes.estruturais.Composite;

import br.com.icev.padroes.estruturais.Bridge.Cor;
import br.com.icev.padroes.estruturais.Bridge.Forma;

import java.util.ArrayList;
import java.util.List;

public class Canvas extends Forma {

    private List<Forma> formas = new ArrayList<Forma>();

    public Canvas(Cor cor){
        super(cor);
    }

    @Override
    public void aplicarCor() {
        System.out.print("Desenhando o Canvas na cor: ");
        cor.aplicarCor();
        formas.forEach(f -> f.aplicarCor());
    }

    public void adiciona(Forma forma){
        formas.add(forma);
    }

    public void remove(Forma forma){
        formas.remove(forma);
    }

    public List<Forma> getFormas(){
        return formas;
    }

}

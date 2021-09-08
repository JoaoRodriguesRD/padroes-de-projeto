package br.com.icev.padroes.comportamentais.TemplateMethod.template;

public abstract class Relatorio {
    
    private void cabecalho(){
        System.out.println("Escola de Tecnologia Aplicada – iCEV");
        System.out.println("Curso de Engenharia de Software");
        System.out.println("Disciplina: Design e Arquitetura de Software");
        System.out.println("----------------------------------------------------------------------------");

    }
    private void rodape(){
        System.out.println("----------------------------------------------------------------------------");
    }

    protected abstract void corpo();

    public void imprimir(){
        cabecalho();
        corpo();
        rodape();
    }
}

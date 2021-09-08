package br.com.icev.padroes.comportamentais.TemplateMethod.template;

public class RelatorioDeNotas extends Relatorio {
    @Override
    protected void corpo() {
        System.out.println("Nome do Aluno                                                       |  Nota |");
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Aluno 1                                                             |  9.00 |");
        System.out.println("Aluno 2                                                             |  9.50 |");
        System.out.println("Aluno 3                                                             |  8.00 |");
        System.out.println("Aluno 4                                                             |  7.50 |");
    }
}

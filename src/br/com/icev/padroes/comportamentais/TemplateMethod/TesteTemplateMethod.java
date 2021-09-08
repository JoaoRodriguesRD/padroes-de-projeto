package br.com.icev.padroes.comportamentais.TemplateMethod;

import br.com.icev.padroes.comportamentais.TemplateMethod.template.Relatorio;
import br.com.icev.padroes.comportamentais.TemplateMethod.template.RelatorioDeNotas;

public class TesteTemplateMethod {
    public static void main(String[] args) {
        Relatorio relatorio = new RelatorioDeNotas();
        relatorio.imprimir();
    }
}

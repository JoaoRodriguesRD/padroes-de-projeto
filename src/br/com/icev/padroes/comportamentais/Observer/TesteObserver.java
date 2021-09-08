package br.com.icev.padroes.comportamentais.Observer;

public class TesteObserver {
    public static void main(String[] args) {
        var dados = new DataSource();
        var planilha1 = new SpreadSheet(dados);
        var planilha2 = new SpreadSheet(dados);
        var grafico = new Chart(dados);

        dados.addObserver(planilha1);
        dados.addObserver(planilha2);
        dados.addObserver(grafico);

        dados.setValue(20);
    }
}

package br.com.icev.padroes.comportamentais.Observer;

public class SpreadSheet implements Observer {
  private DataSource dataSource;

  public SpreadSheet(DataSource dataSource) {
    this.dataSource = dataSource;
  }

  @Override
  public void update() {
    System.out.println("Dados da planilha foram alterados: " + dataSource.getValue());
  }
}

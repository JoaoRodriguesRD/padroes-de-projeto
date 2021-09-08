package br.com.icev.padroes.comportamentais.Observer;

public class Chart implements Observer {
  private DataSource dataSource;

  public Chart(DataSource dataSource) {
    this.dataSource = dataSource;
  }

  @Override
  public void update() {
    System.out.println("Gráfico foi alterado: " + dataSource.getValue());
  }
}

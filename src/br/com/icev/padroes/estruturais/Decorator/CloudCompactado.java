package br.com.icev.padroes.estruturais.Decorator;

public class CloudCompactado implements FluxoBytes {
  private FluxoBytes dados;

  public CloudCompactado(FluxoBytes dados) {
    this.dados = dados;
  }

  @Override
  public void enviar(String dados) {
    var dadosCompactados = comprimir(dados);
    this.dados.enviar(dadosCompactados);
  }

  private String comprimir(String dados) {
    return dados.substring(0, 5);
  }
}

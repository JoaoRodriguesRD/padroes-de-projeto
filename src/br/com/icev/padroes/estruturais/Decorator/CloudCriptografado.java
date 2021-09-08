package br.com.icev.padroes.estruturais.Decorator;

public class CloudCriptografado implements FluxoBytes {
  private FluxoBytes dados;

  public CloudCriptografado(FluxoBytes dados) {
    this.dados = dados;
  }

  @Override
  public void enviar(String dados) {
    var criptografado = encrypt(dados);
    this.dados.enviar(criptografado);
  }

  private String encrypt(String dados) {

    return "!@#$(!@#*()*)(*!@#";
  }
}

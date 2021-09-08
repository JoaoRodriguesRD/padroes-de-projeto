package br.com.icev.padroes.estruturais.Decorator;

public class CloudTxt implements FluxoBytes {
  public void enviar(String dados) {

    System.out.println("Armazenando -> " + dados);
  }
}

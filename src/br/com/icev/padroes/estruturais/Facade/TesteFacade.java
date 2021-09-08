package br.com.icev.padroes.estruturais.Facade;

public class TesteFacade {
    public static void main(String[] args) {
        var service = new ServicoNotificacao();
        service.send("Olá Mundo!", "server");
    }
}

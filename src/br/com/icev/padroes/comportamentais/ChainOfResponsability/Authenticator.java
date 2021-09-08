package br.com.icev.padroes.comportamentais.ChainOfResponsability;

public class Authenticator extends Handler{

    public Authenticator(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("Requisicao autenticada...");
        return false;
    }
}

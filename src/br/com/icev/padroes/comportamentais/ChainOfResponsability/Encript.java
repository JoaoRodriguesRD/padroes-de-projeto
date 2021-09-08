package br.com.icev.padroes.comportamentais.ChainOfResponsability;

public class Encript extends Handler{

    public Encript(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("Criptografando....");
        return false;
    }
}

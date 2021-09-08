package br.com.icev.padroes.comportamentais.ChainOfResponsability;

public class Logger extends Handler{

    public Logger(Handler nextHandler) {
        super(nextHandler);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("Inserindo registro no Log");
        return false;
    }
}

package br.com.icev.padroes.comportamentais.ChainOfResponsability;

public abstract class Handler {
    private Handler next;

    public Handler(Handler nextHandler){
        next = nextHandler;
    }

    public void handle(HttpRequest request){
        if (doHandle(request))
            return;
        if (next != null)
            next.handle(request);
    }

    public abstract boolean doHandle(HttpRequest request);

}

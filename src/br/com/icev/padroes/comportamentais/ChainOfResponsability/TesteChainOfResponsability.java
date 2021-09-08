package br.com.icev.padroes.comportamentais.ChainOfResponsability;

public class TesteChainOfResponsability {
    public static void main(String[] args) {
        HttpRequest request = new HttpRequest("admin", "1234");
        Encript encript = new Encript(null);
        Logger logger = new Logger(encript);
        Authenticator authenticator = new Authenticator(logger);

        WebServer server = new WebServer(authenticator);

        server.handle(request);
    }
}

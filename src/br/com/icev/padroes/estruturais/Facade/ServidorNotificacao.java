package br.com.icev.padroes.estruturais.Facade;

public class ServidorNotificacao {
    // connect() -> Connection
    // authenticate(appID, key) -> AuthToken
    // send(authToken, message, target)
    // conn.disconnect()

    public Conexao connect(String ipAddress) {
        return new Conexao();
    }

    public TokenDeAutenticacao autenticar(String idApp, String chave) {
        return new TokenDeAutenticacao();
    }

    public void enviar(TokenDeAutenticacao tokenDeAutenticacao, Mensagem mensagem, String destino) {
        System.out.println(mensagem.getConteudo());
    }
}

package br.com.icev.padroes.estruturais.Facade;

public class ServicoNotificacao {
    public void send(String mensagem, String destino) {
        var servidor = new ServidorNotificacao();
        var conexao = servidor.connect("ip");
        var token = servidor.autenticar("appID", "key");
        servidor.enviar(token, new Mensagem(mensagem), destino);
        conexao.desconectar();
    }
}

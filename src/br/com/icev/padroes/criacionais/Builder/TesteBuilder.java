package br.com.icev.padroes.criacionais.Builder;

public class TesteBuilder {
    public static void main(String[] args) {
        Builder criaCliente = new ClienteBuilder();

        Cliente cliente = criaCliente.comNome("João da Silva")
                .comCPF("123.456.789-00")
                .comEndereco("64.000-123", "Centro", "Rua do Centro", "1234")
                .comTelefone("322-1234")
                .construir();

        System.out.println(cliente);

    }
}

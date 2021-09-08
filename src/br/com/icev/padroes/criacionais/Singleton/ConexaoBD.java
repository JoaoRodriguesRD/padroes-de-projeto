package br.com.icev.padroes.criacionais.Singleton;

public class ConexaoBD {
    private static ConexaoBD conexao;
    private String url = "jdbc://";
    private Usuario usuario = new Usuario("joao", "1234");

    private ConexaoBD(){

    }

    public static ConexaoBD getInstance() {
        if (conexao == null)
            conexao = new ConexaoBD();

        return conexao;
    }




}

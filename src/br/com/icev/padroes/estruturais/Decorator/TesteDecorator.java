package br.com.icev.padroes.estruturais.Decorator;

public class TesteDecorator {
    public static void main(String[] args) {
        FluxoBytes objeto = new CloudTxt();
        enviarDadosDocartaoDeCredito(new CloudCriptografado(new CloudCompactado(objeto)));

    }

    public static void enviarDadosDocartaoDeCredito(FluxoBytes dados){

        dados.enviar("1234-1234-1234-1234");
    }
}

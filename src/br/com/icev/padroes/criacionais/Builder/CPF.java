package br.com.icev.padroes.criacionais.Builder;

public class CPF {
    private String numero;

    public CPF(String numero) {
        this.numero = numero;
    }

    public boolean ehValido(){
        return true;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}

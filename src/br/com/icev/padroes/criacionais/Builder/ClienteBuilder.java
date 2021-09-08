package br.com.icev.padroes.criacionais.Builder;

public class ClienteBuilder implements Builder {
    private Cliente cliente;

    public ClienteBuilder(){
        cliente = new Cliente();
    }

    @Override
    public Builder comNome(String nome) {
        cliente.setNome(nome);
        return this;
    }

    @Override
    public Builder comCPF(String cpf) {
        cliente.setCpf(new CPF(cpf));
        return this;
    }

    @Override
    public Builder comEndereco(String cep, String bairro, String rua, String numero) {
        Endereco endereco = new Endereco(cep, bairro, rua, numero);
        cliente.setEndereco(endereco);
        return this;
    }

    @Override
    public Builder comTelefone(String telefone) {
        cliente.setTelefone(telefone);
        return this;
    }

    public Cliente construir(){
        return this.cliente;
    }
}

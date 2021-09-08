package br.com.icev.padroes.criacionais.Builder;

public interface Builder {
    public Builder comNome(String nome);
    public Builder comCPF(String cpf);
    public Builder comEndereco(String cep, String bairro, String rua, String numero);
    public Builder comTelefone(String telefone);
    public Cliente construir();
}

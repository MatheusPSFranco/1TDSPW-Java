package br.com.fiap.exercicio02.model;

public class Cliente {

    public String nome;
    public String cpf;
    public Endereco endereco;

    public void retornarDados(){
        System.out.println("Nome: "+nome);
        System.out.println("CPF: "+cpf);
        endereco.retornarEndereco();
        //System.out.println("Endereço: "+endereco.cep+" "+endereco.logradouro+" "+endereco.numero+" "+endereco.complemento);
    }

}

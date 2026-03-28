package br.com.fiap.exercicio02.model;

public class Endereco {

    public String logradouro;
    public short numero;
    public String complemento;
    public String cep;

    public void retornarEndereco(){
        System.out.println("CEP: "+cep);
        System.out.println("Número: "+numero);
        System.out.println("Complemento: "+complemento);
        System.out.println("Logradouro: "+logradouro);
    }
}

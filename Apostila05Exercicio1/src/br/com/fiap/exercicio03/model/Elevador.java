package br.com.fiap.exercicio03.model;

public class Elevador {

    private int andarAtual;
    private int totalAndar;
    private int capacidadePessoas;
    private int quantidadePessoas;

    public void entra(){
        quantidadePessoas++;
    }
    public void sai(){
        quantidadePessoas--;
    }
    public void sobe(){
        andarAtual++;
    }
    public void desce(){
        andarAtual--;
    }
}

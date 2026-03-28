package br.com.fiap.exercicio02.model;

public class ContaCorrente {

    public double saldo;
    public Cliente titular;

    public void depositar(double valor){
        saldo += valor;
        retornarSaldo();
    }
    public void retirar(double valor){
        saldo-=valor;
        retornarSaldo();
    }
    public void retornarSaldo(){
        System.out.println("Saldo atualizado: "+saldo);
    }
}

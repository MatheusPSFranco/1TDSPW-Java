package br.com.fiap.exercicio01.model;

public class Aluno {

    public String nome;
    public double cp1;
    public double cp2;
    public double cp3;
    public double cl1;
    public double cl2;
    public double gs;

    public double media(){
        return ((cp1+cp2+cp3)/3)*0.2+((cl1+cl2)/2)*0.2+ gs*0.6;

    }
}

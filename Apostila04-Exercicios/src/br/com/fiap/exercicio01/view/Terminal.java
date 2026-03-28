package br.com.fiap.exercicio01.view;

import br.com.fiap.exercicio01.model.Aluno;

import java.util.Scanner;

public class Terminal {

    public static void main(String[] args) {
        //Leitor do teclado
        Scanner leitor = new Scanner(System.in);

        //Ler os dados do aluno
        System.out.println("Digite o Nome do aluno: ");
        String nome = leitor.next() + leitor.nextLine();

        System.out.println("Digite a nota do Cp1: ");
        double cp1 = leitor.nextDouble();

        System.out.println("Digite a nota do Cp2: ");
        double cp2 = leitor.nextDouble();

        System.out.println("Digite a nota do Cp3: ");
        double cp3 = leitor.nextDouble();

        System.out.println("Digite a nota do Challenge1: ");
        double cl1 = leitor.nextDouble();

        System.out.println("Digite a nota do Challenge2: ");
        double cl2 = leitor.nextDouble();

        System.out.println("Digite a nota do Global Solution: ");
        double gs = leitor.nextDouble();

        //Criar o objeto aluno
        Aluno a = new Aluno();

        //Adicionar os valores nos atributos
        a.nome = nome;
        a.cp1 = cp1;
        a.cp2 = cp2;
        a.cp3 = cp3;
        a.cl1 = cl1;
        a.cl2 = cl2;
        a.gs = gs;

        //Exibir a média
        double media = a.media();
        System.out.println("A média do"+a.nome+" é "+media);
    }

}

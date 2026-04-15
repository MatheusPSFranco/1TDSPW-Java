package br.com.fiap.exercicio02.view;

import br.com.fiap.exercicio02.model.Data;

import java.util.Scanner;

public class Terminal {
    static void main() {

        Scanner leitor = new Scanner(System.in);

        Data data = new Data();

        System.out.println("Digite o dia: ");
        int dia = leitor.nextInt();
        data.setDia(dia);

        System.out.println("Digite o mês: ");
        int mes = leitor.nextInt();
        data.setMes(mes);

        System.out.println("Digite o ano: ");
        int ano = leitor.nextInt();
        data.setAno(ano);

        System.out.println(data.dataFormatada());
        System.out.println("Nome do mês: "+ data.nomeMes(data.getMes()));
    }
}

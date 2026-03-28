package br.com.fiap.exercicio02.view;

import br.com.fiap.exercicio02.model.Cliente;
import br.com.fiap.exercicio02.model.ContaCorrente;
import br.com.fiap.exercicio02.model.Endereco;

import java.util.Scanner;

public class Terminal {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        String nome = leitor.next() + leitor.nextLine();

        System.out.println("Digite o CPF: ");
        String cpf = leitor.next() + leitor.nextLine();

        System.out.println("Digite o Saldo: ");
        double saldo = leitor.nextDouble();

        System.out.println("Digite o CEP: ");
        String cep = leitor.next() + leitor.nextLine();

        System.out.println("Digite o logradouro: ");
        String logradouro = leitor.next()+ leitor.nextLine();

        System.out.println("Digite o número: ");
        short numero = leitor.nextShort();

        System.out.println("Digite o complemento: ");
        String complemento = leitor.next() + leitor.nextLine();

        ContaCorrente contaC = new ContaCorrente();
        Cliente c = new Cliente();
        Endereco e = new Endereco();

        contaC.saldo = saldo;
        contaC.titular = c;
        c.nome = nome;
        c.cpf = cpf;
        c.endereco = e;
        e.cep = cep;
        e.complemento = complemento;
        e.logradouro = logradouro;
        e.numero = numero;

        System.out.println("Qual valor vai ser acrescentado?");
        double adicao = leitor.nextDouble();
        contaC.depositar(adicao);

        System.out.println("Qual valor vai ser retirado?");
        double retirar = leitor.nextDouble();
        contaC.retirar(retirar);

        System.out.println("Exibindo os dados do cliente:");
        c.retornarDados();

        System.out.println("Exibindo somente o endereço:");
        e.retornarEndereco();

    }

}

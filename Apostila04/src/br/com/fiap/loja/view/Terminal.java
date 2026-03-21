package br.com.fiap.loja.view;

import br.com.fiap.loja.model.Fornecedor;
import br.com.fiap.loja.model.Produto;
import java.util.Scanner;

public class Terminal {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        //Ler as informações do Produto (sem fortnecedor por enquanto)
        System.out.println("Informe o nome do produto");
        String nomeProduto = leitor.next() + leitor.nextLine();

        System.out.println("Informe o preco do produto");
        double preco = leitor.nextDouble();

        System.out.println("Informe o codigo do produto");
        int codigo = leitor.nextInt();

        System.out.println("Informe a disponibilização do produto");
        boolean disponivel = leitor.nextBoolean();

        //Ler as informações do Fornecedor (sem fortnecedor por enquanto)
        System.out.println("Informe o nome do Fornecedor");
        String nomeFornecedor = leitor.next() + leitor.nextLine();

        System.out.println("Informe o CNPJ do Fornecedor");
        String cnpj = leitor.next();


        //Instanciar a classe produto
        Produto p = new Produto();

        //Instanciar a classe Fornecedor
        Fornecedor f = new Fornecedor();

        //Colocar as informações no objeto produto
        p.nome = nomeProduto;
        p.codigo = codigo;
        p.preco = preco;
        p.disponivel = disponivel;

        //Colocar as informações no objeto fornecedor
        f.nome = nomeFornecedor;
        f.cnpj = cnpj;

        //Exibir as informações do objeto do produto
        System.out.println("Produto");
        System.out.println("Nome: "+p.nome);
        System.out.println("Preco: "+p.preco);
        System.out.println("Codigo: "+p.codigo);
        System.out.println("Disponibilidade: "+p.disponivel);

        System.out.println("");

        //Exibir as informações do objeto do fornecedor
        System.out.println("Fornecedor");
        System.out.println("Nome: "+ f.nome);
        System.out.println("CNPJ: "+ f.cnpj);




    }

}

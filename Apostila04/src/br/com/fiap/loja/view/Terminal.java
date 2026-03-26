package br.com.fiap.loja.view;

import br.com.fiap.loja.model.Fornecedor;
import br.com.fiap.loja.model.Produto;
import java.util.Scanner;

public class Terminal {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        //Ler as informações do Produto
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

        //Colocar o fornecedor no produto
        p.fornecedor = f;

        //Exibir as informações do objeto do produto
        System.out.println("Nome: " + p.nome);
        System.out.println("Preco: " + p.preco);
        System.out.println("Codigo: " + p.codigo);
        System.out.println("Disponibilidade: " + p.disponivel);

        //Exibir as informações do objeto do fornecedor
        System.out.println("Nome fornecedor: " + p.fornecedor.nome);
        System.out.println("CNPJ fornecedor: " + p.fornecedor.cnpj);

        //Usando Metodos de dentro do produto
        double desconto = p.calcularDesconto();
        System.out.println("Desconto: " + desconto);

        System.out.println("Qual a % de aumento?");
        double porcentagem = leitor.nextDouble();

        p.aumentarPreco(porcentagem);
        System.out.println("Preço atualizado: " + p.preco);

        System.out.println("Quantos desse produto você quer?");
        int quantidade = leitor.nextInt();

        double valorFim = p.valorCompra(quantidade);
        System.out.println("Valor final: "+valorFim);
    }

}

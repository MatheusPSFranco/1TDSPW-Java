import java.util.Scanner;

public class ExemploEntradaDados {


    //Criar um programa para ler e calcular a media da FIAP
    public static void main(String[] args) {
        //Criar o objeto para ler o teclado
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome do aluno");
        String nome = leitor.next();

        System.out.println("Digite a nota da cp 1");
        double cp1 = leitor.nextDouble();

        System.out.println("Digite a nota da cp 2");
        double cp2 = leitor.nextDouble();

        System.out.println("Digite a nota da cp 3");
        double cp3 = leitor.nextDouble();

        System.out.println("Digite a nota do Challenge 1");
        double cl1 = leitor.nextDouble();

        System.out.println("Digite a nota do Challenge 2");
        double cl2 = leitor.nextDouble();

        System.out.println("Digite a nota da Global solution");
        double gs = leitor.nextDouble();

        //Calculando as Médias

        double medcp = (cp1 + cp2 + cp3)/3; // Média dos cps
        double medcl = (cl1 + cl2)/2; // Média dos challenges

        double medfim = (medcp + medcl + gs*3)/5; // Média Final

        //Exibindo a média final com mensagem antes
        System.out.println(" A Media final do "+nome+" é : "+medfim);

    }

}
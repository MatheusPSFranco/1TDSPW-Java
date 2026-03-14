import java.sql.SQLOutput;

public class ExemploCarro {

    public static void main(String[] args) {

        //Criar um objeto do tipo Carro
        Carro gol = new Carro();

        //Colocar valores nos atributos do objeto
        gol.cor = "Vermelho";
        gol.velocidadeMaxima = 300;
        gol.ano = 2011;
        gol.altura = 1.8f;
        gol.modelo = "Gol Blinadado Brabo";
        gol.automatico = false;
        gol.peso = 800;

        //Exibir os valores dos atributos do objeto

        System.out.println("Modelo: " + gol.modelo); //sout
        System.out.println("Ano: " + gol.ano);
        System.out.println("Cor: " + gol.cor);
        System.out.println("Velocidade Máxima: " + gol.velocidadeMaxima);
        System.out.println("Altura: " + gol.altura);
        System.out.println("Peso: " + gol.peso);
        System.out.println("Automático: " + gol.automatico);

        System.out.println(" ");

        //Criar um vovo objeto do tipo carro
        Carro fusca = new Carro();
        //Colocar Valores para os atributos e exibir esses valores
        fusca.modelo = "Fuscão Rebaixado";
        fusca.peso = 600;
        fusca.automatico = false;
        fusca.cor = "Azul";
        fusca.altura = 1.9f;
        fusca.velocidadeMaxima = 240;
        fusca.ano = 2001;

        System.out.println("Modelo: " + fusca.modelo);
        System.out.println("Peso: " + fusca.peso);
        System.out.println("Automático: " + fusca.automatico);
        System.out.println("Cor: " + fusca.cor);
        System.out.println("Altura: " + fusca.altura);
        System.out.println("Velocidade Máxima: " + fusca.velocidadeMaxima);
        System.out.println("Ano: " + fusca.ano);



    }

}

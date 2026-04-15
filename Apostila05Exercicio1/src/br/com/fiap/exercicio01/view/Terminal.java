package br.com.fiap.exercicio01.view;

import br.com.fiap.exercicio01.model.Aviao;
import br.com.fiap.exercicio01.model.Cor;

public class Terminal {
    static void main() {

        Cor verde = new Cor();

        verde.alterarCor(0,255,0,"Verde");


        Aviao a = new Aviao();

        a.setCor(verde);
        a.setComprimento(70);
        a.setAnoFabricacao(2000);
        a.setPrefixo("Furacão");
        a.setModelo("Fogoso");
        a.setQuantidadeLugares(130);
        a.setQuantidadeTurbinas(6);

        System.out.println("Modelo: "+a.getModelo());
        System.out.println("Prefixo: "+a.getPrefixo());
        System.out.println("Comprimento: "+a.getComprimento());
        System.out.println("Ano de fabricação: "+a.getAnoFabricacao());
        System.out.println("Cor: "+a.getCor().getNome());
        System.out.println("Quantidade de Lugares: "+a.getQuantidadeLugares());
        System.out.println("Quantidade de Turbinas: "+a.getQuantidadeTurbinas());
    }
}

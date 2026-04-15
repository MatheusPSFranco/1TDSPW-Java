package br.com.restaurante.view;

import br.com.restaurante.model.Funcionario;

public class Terminal {
    static void main() {

        Funcionario f = new Funcionario();

        f.setNome("Matheus");
        System.out.println(f.getNome());
        f.setSalario(1020.50);
        System.out.println(f.getSalario());
        f.setAtivo(true);
        System.out.println(f.isAtivo());
        f.setSexo('h');
        System.out.println(f.getSexo());
        f.setId(1);
        System.out.println(f.getId());
    }
}

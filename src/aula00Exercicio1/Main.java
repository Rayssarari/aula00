package aula00Exercicio1;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        //Crie um programa que leia seu nome e imprima na tela.

        Scanner darNome = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = darNome.nextLine();
        darNome.close();

        System.out.println("Prazer, " + nome + "!");
    }
}

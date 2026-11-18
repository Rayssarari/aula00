package Aula01.aula01Exercicio05;

import java.util.Scanner;

/*Escreva um programa que separa a string em duas metades e imprime a
primeira parte.*/
public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu nome completo: ");
        String nomeCompleto = scanner.nextLine();
        scanner.close();

        String[] nomes = nomeCompleto.split(" ", 2);
        System.out.println("Primeiro nome: " + nomes[0]);

    }
}

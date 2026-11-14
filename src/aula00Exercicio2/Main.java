package aula00Exercicio2;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        //Crie um programa que receba 2 números e imprima na tela.
        Scanner darNumero = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int primeiroNumero = darNumero.nextInt();

        System.out.println("Digite outro número inteiro: ");
        int segundoNumero = darNumero.nextInt();
        darNumero.close();

        System.out.println("Os números escolhidos foram '" + primeiroNumero + "' e '" + segundoNumero+"'.");
    }
}

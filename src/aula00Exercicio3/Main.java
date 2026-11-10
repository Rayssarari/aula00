package aula00Exercicio3;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        //Crie um programa que leia 3 números, imprima o maior, o menor e a média aritmética.

        Scanner darNumero = new Scanner(System.in);

        double primeiroNumero,segundoNumero,terceiroNumero;

        System.out.println("Digite um número de 0 a 100): ");
        primeiroNumero = darNumero.nextDouble();

        System.out.println("Digite outro número de 0 a 100): ");
        segundoNumero = darNumero.nextDouble();

        System.out.println("Digite outro número de 0 a 100): ");
        terceiroNumero = darNumero.nextDouble();
        darNumero.close();




    }
}

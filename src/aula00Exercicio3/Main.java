package aula00Exercicio3;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        //Crie um programa que leia 3 números, imprima o maior, o menor e a média aritmética.

        Scanner darNumero = new Scanner(System.in);
        int maior = 0;
        int menor = 0;
        int soma = 0;


        for (int i = 0; i < 3; i++) {
            System.out.println("Digite 3 números inteiros de 0 a 100): ");
            int numeros = darNumero.nextInt();

            if (i == 0) {
                maior = numeros;
                menor = numeros;

            } else {
                if (numeros > maior) {
                    maior = numeros;
                }
                if (numeros < menor) {
                    menor = numeros;
                }
            }
            soma += numeros;
        }

        double media = soma /3;

        System.out.println("O maior número foi: " + maior);
        System.out.println("O menor número foi: " + menor);
        System.out.println("A média dos números é: " + media);

        darNumero.close();
    }
}

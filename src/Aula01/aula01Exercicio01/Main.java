package Aula01.aula01Exercicio01;

import java.util.ArrayList;
import java.util.Scanner;

//Crie um programa que determine e escreva os números primos compreendidos entre um intervalo fornecido pelo usuário.
public class Main {
    private static ArrayList <Integer> listaDeNumeros;

    static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        listaDeNumeros = new ArrayList<>();
        int iInicial, iFinal , i, j;

        System.out.println("Determine um intervalo e descubra quantos números primos ele possui! ");
        System.out.println("Digite o primeiro número: ");
        iInicial = leitor.nextInt();
        System.out.println("Digite o número final: ");
        iFinal = leitor.nextInt();

        while (iInicial <= 0 || iFinal <= 0 || iFinal>iInicial){
            System.out.println("Condição inválida. Digite números positivos e com um intervalo válido!");
            System.out.println("Digite o primeiro número: ");
            iInicial = leitor.nextInt();
            System.out.println("Digite o número final: ");
            iFinal = leitor.nextInt();
        }

        boolean primo;
        leitor.close();
        for (i = iInicial; i <= iFinal ; i++) {
            primo = true;
            if (i == 1)
                primo = false;

            if (primo){
                if(i%2 == 0 && i != 2){
                    primo = false;
                }
            }

            if (primo){
                for (j = 3; j <= (i/2); j++) {
                    if (i % j == 0){
                        primo = false;
                        break;
                    }
                }
            }
            if (primo)
                listaDeNumeros.add(i);

        }

        System.out.println(listaDeNumeros.toString());
        System.out.println(String.format("Existe %d números primos entre %d e %d!", listaDeNumeros.size(), iInicial, iFinal));
    }
}

package Aula01.aula01Exercicio07;

import java.util.Random;
import java.util.Scanner;

/*Criar um jogo de adivinhação para descobrir quantos soldados os 300 espartanos irão enfrentar.
Leônidas pede para que seus soldados tentem adivinhar quantos inimigos irão combater.
O usuário deve digitar seu palpite e se o número for menor do que 300.000, Leônidas deve dizer Um pouco mais!,
caso o número dito pelo usuário seja maior, ele dirá Um pouco menos!".
*/
public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random numeroRandom = new Random();


        int chutes;
        int tentativas = 0;
        int minNumero = 1;
        int MaxNumero = 400;

        int randomNumber = numeroRandom.nextInt(minNumero,MaxNumero +1);

        System.out.println("Leônidas: Quantos soldados inimigos vamos combater hoje? ");

        do{
            System.out.println("Seu chute: ");
            chutes = scanner.nextInt();

            tentativas++;

            if (chutes < randomNumber) {
                System.out.println("Leônidas: Um pouco mais!");
            } else if (chutes > randomNumber) {
                System.out.println("Leônidas: Um pouco menos!");
            }else {
                System.out.println("Leônidas: ISSO MESMO!");
            }
        }while (chutes != randomNumber);

        System.out.println("O número de soldados para combater era: " + randomNumber);
        System.out.println("Você tentou " + tentativas + " vezes.");

        scanner.close();
    }
}

package Aula01.aula00Exercicio06;

import java.util.Scanner;

/*Escreva um programa que receba uma string do usuário e imprima ela ao
contrário
*/
public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String palavraInvertida = "";
        System.out.println("Escreva algo e veja ao contrario: ");
        String palavraUsuario = scanner.nextLine();
        System.out.println("Normal: " + palavraUsuario);
        scanner.close();

            for (int i = palavraUsuario.length() - 1; i >= 0; i--) {
                palavraInvertida += palavraUsuario.charAt(i);
            }
        System.out.println("Invertido: " + palavraInvertida );
    }
}

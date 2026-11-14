package aula00Exercicio6;

/*Escreva um programa que leia a idade do usuário e imprima respostas
diferentes dependendo do número colocado:
1. Se for menor de 16 anos, avisar que não pode votar;
2. Se tiver 16 ou 17, avisar que o voto é facultativo;
3. Se tiver mais de 65, avisar que também é facultativo o voto;
4. De 18 até 65, é obrigatório votar.*/

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner coletarIdade = new Scanner(System.in);

        System.out.println("Descubra se é obrigatório você votar.");
        System.out.println("Digite qual a sua idade: ");
        int idade = coletarIdade.nextInt();

        if (idade<=0 || idade > 122){
            System.out.println("Idade inválida! Tente novamente.");
            return;
        }if (idade < 16) {
                System.out.println("Você ainda não pode votar!");
            } else if (idade <= 17) {
                System.out.println("Seu voto é facultativo, poderá votar se solicitar seu título de eleitor! ");
            } else if (idade > 65) {
                System.out.println("Seu voto é facultativo!");
            } else {
                System.out.println("Seu voto é obrigatório!");
        }
    }
}

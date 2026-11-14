package aula00Exercicio8;
/*Criar um algoritmo para definir as filas prioritárias. Seu programa deve exibir
um menu de opções, perguntando se a pessoa é Gestante, Idosa, PCD ou
Nenhuma das alternativas.
Se ela for PCD, Idosa ou Gestante, tem direito a fila
prioritária. Se não, não tem direito.*/

import java.util.Scanner;

public class main {
    static void main(String[] args) {
        Scanner escolha = new Scanner(System.in);
        int opcao;

        String menuMensagem = String.format("Você se enquadra em alguma opção abaixo?\n " +
                "1) Gestante\n " +
                "2) Idosa\n " +
                "3) Pessoa com Deficiência (PCD)\n " +
                "4) Não, em nenhuma das anteriores.\n\n");

        System.out.println(menuMensagem + "Digite o número para selecionar a opção: " );
        opcao = escolha.nextInt();

        switch (opcao){
            case 1:
            case 2:
            case 3:
                System.out.println("Você tem direito à fila prioritária! ");
                break;
            case 4:
                System.out.println("Você não tem direito à fila prioritária! ");
                break;

            default:
                System.out.println("Opção inválida!");
        }

    }
}

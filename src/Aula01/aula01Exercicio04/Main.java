package Aula01.aula01Exercicio04;

import java.util.Scanner;

/*Implemente uma calculadora, onde o usuário deve entrar com 2 números e
escolher a operação que deseja realizar. Durante a execução o programa deve
perguntar ao usuário se ele deseja continuar, se ele não quiser, deve digitar ‘n’
para o programa encerrar.
*/
public class Main {
    static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double primeiroNumero, segundoNumero, resultado = 0;
        int operacao;
        String continuar;

        System.out.println("Digite dois números e escolha uma operação matemática para executar.");
        System.out.println(String.format(" 1) Somar (+) \n 2) Subtrair (-) \n 3) Multiplicar (*) \n 4) Dividir (/)"));

        System.out.println("Coloque o primeiro número: ");
        primeiroNumero = leitor.nextDouble();
        System.out.println("Coloque o segundo número: ");
        segundoNumero = leitor.nextDouble();

        System.out.println("Qual operação você deseja realizar? ");
        operacao = leitor.nextInt();

        switch (operacao){
            case 1:
                resultado = primeiroNumero + segundoNumero;
                break;
            case 2:
                resultado = primeiroNumero - segundoNumero;
                break;
            case 3:
                resultado = primeiroNumero * segundoNumero;
                break;
            case 4:
                if (segundoNumero != 0){
                resultado = primeiroNumero / segundoNumero;
                } else {
                    System.out.println("Erro: O denominador não pode ser zero!");
                } break;
            default:
                System.out.println("Operação Inválida!");
        }
        System.out.println("Você deseja continuar? Se sim digite 's' e se não digite 'n': ");
        continuar= leitor.next();

        if (continuar.equalsIgnoreCase("s")){
            System.out.println("Resultado: " + resultado);
        }else {
            System.out.println("Operação descartada. Programa encerrado!");
        }
        leitor.close();
    }
}
package aula00Exercicio4;
/*Crie um programa que leia o valor do salário mínimo e o valor do salário de um
 usuário, calcule a quantidade de salários mínimos que esse usuário ganha e
imprima o resultado, assuma que o salário mínimo é R$1.320.*/

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        BigDecimal mesesSalarios = new BigDecimal(13);
        Scanner lerSalario = new Scanner(System.in);
        Locale ptBr = new Locale("pt", "BR");

        System.out.println("Informe o valor do Salário Mínimo: R$ ");
        BigDecimal salarioMinimo = lerSalario.nextBigDecimal();
        lerSalario.close();

        BigDecimal salarioTotalAno = salarioMinimo.multiply(mesesSalarios);

        NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance(ptBr);
        String salarioTotalAnoFormatado = formatoMoeda.format(salarioTotalAno);

        System.out.println("O total anual desse valor é " + salarioTotalAnoFormatado);
    }
}

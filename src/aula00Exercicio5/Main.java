package aula00Exercicio5;

/*Crie um programa que armazene um horário (hora, minuto e segundo) em
variáveis, depois, determine e exiba a quantidade de segundos que se
passaram desde as 0h00min0s e a quantidade de segundos que faltam para a
meia-noite.*/

import java.text.NumberFormat;
import java.util.Locale;

public class Main {
    static void main(String[] args) {
        Locale ptBr = new Locale("pt", "BR");
        NumberFormat valorFormatado = NumberFormat.getNumberInstance(ptBr);

        int horas = 9;
        int minutos = 30;
        int segundos = 40;
        int umDiaEmSegundos = 86400;

        int segundosPassados = (horas * 3600) + (minutos * 60) + segundos;

        int segundosRestantesDoDia = umDiaEmSegundos - segundosPassados;

        String infomaHorario = String.format("Horário: 0%dh %dmin %ds \n",horas,minutos, segundos);
        System.out.println(infomaHorario);

        System.out.println("Segundos que passaram: " + valorFormatado.format(segundosPassados));
        System.out.println("Quanto segundos faltam para a meia-noite: " + valorFormatado.format(segundosRestantesDoDia));
    }
}

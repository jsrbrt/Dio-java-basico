package Exercicios;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExercicioList1 {
/*Faça um programa que receba a temperatura média dos 6
primeiros meses do ano e armazene-as em uma lista.

Após isto, calcule a média semestral das temperaturas e
mostre todas as temperaturas acima desta média, e em que
mês elas ocorreram (mostrar o mês por extenso: 1 — Janeiro, 2 — Fevereiro e etc). */

Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ExercicioList1 exercicioList = new ExercicioList1();

        exercicioList.calcularTemperatura();
    }
    public void calcularTemperatura() {
        

        List<Double> temperaturas = new ArrayList<>();
        System.out.println("Insira a temperatura média dos 6 primeiros meses:");
        double soma = 0;
            for (int i = 0; i <= 6 ; i++) {
                double temperaturaMedia = scanner.nextDouble();
                temperaturas.add(temperaturaMedia);
                soma += temperaturaMedia;
            }
        System.out.print(temperaturas);
        double media = soma / temperaturas.size();
            System.out.println("A média semestral foi de: " + media + "° C");

        Iterator<Double> iterator = temperaturas.iterator();

        while (iterator.hasNext())
            if(iterator.next() > media){
            int mes = temperaturas.indexOf(iterator.next());
            System.out.println("Os meses com a temperatura acima da media são:");
            switch (mes) {
                case 0:
                    System.out.println((mes+1) +" - Janeiro");
                    break;
                case 1:
                    System.out.println((mes+1) +" - Fevereiro");
                    break;
                case 2:
                    System.out.println((mes+1) +" - Março");
                    break;
                case 3:
                    System.out.println((mes+1) +" - Abril");
                    break;
                case 4:
                    System.out.println((mes+1) +" - Maio");
                    break;
                case 5:
                    System.out.println((mes+1) +" - Junho");
                    break;
                default:
                    System.out.println("Não houve temperatura acima da média.");
            }
        }

    }
}
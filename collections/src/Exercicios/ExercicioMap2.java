package Exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/*Facga um programa que simule um lancamento de dados.
Lance o dado 100 vezes e armazene.
Depois, mostre quantas vezes cada valor foi inserido. */
public class ExercicioMap2 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        Random random = new Random();
     
        int i = 0;//, qntd1 = 0, qntd2 = 0, qntd3 = 0, qntd4 = 0, qntd5 = 0, qntd6 = 0;
        while(i < 100){
            int numero = random.nextInt(7);
            if(numero != 0){
                numeros.add(numero); i++;
                /*switch (numero) {
                    case 1:
                        qntd1++;
                        break;
                    case 2:
                        qntd2++;
                        break;
                    case 3:
                        qntd3++;
                        break;
                    case 4:
                        qntd4++;
                        break;
                    case 5:
                        qntd5++;
                        break;
                    case 6:
                        qntd6++;
                        break;
                }*/
            } 
        }
        /*System.out.print("{1=" + qntd1 + ", ");
        System.out.print("2=" + qntd2+ ", ");
        System.out.print("3=" + qntd3+ ", ");
        System.out.print("4=" + qntd4+ ", ");
        System.out.print("5=" + qntd5+ ", ");
        System.out.println("6=" + qntd6 + "}");*/
        
        
        Map<Integer, Integer> quantidade = new HashMap<>(){{
            put(1, Collections.frequency(numeros, 1));
            put(2, Collections.frequency(numeros, 2));
            put(3, Collections.frequency(numeros, 3));
            put(4, Collections.frequency(numeros, 4));
            put(5, Collections.frequency(numeros, 5));
            put(6, Collections.frequency(numeros, 6));
        }};
        System.out.println(quantidade);

    }
}

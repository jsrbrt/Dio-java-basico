package Exercicios;

import java.util.ArrayList;
//import java.util.Collections;
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
     
        /*int i = 0;
        while(i < 100){
            int numero = random.nextInt(7);
            if(numero != 0)
                numeros.add(numero); i++;  
        }*/
        for (int i = 0; i < 100; i++) {
            int valor = random.nextInt(6)+1;
            numeros.add(valor);
        }
        Map<Integer, Integer> quantidade = new HashMap<>();
        for (Integer numero : numeros) {
            if(quantidade.containsKey(numero)) quantidade.put(numero, (quantidade.get(numero))+1);
            else quantidade.put(numero, 1);
        }
        System.out.println(quantidade);
        /*System.out.println();
        Map<Integer, Integer> quantidade2 = new HashMap<>(){{
            put(1, Collections.frequency(numeros, 1));
            put(2, Collections.frequency(numeros, 2));
            put(3, Collections.frequency(numeros, 3));
            put(4, Collections.frequency(numeros, 4));
            put(5, Collections.frequency(numeros, 5));
            put(6, Collections.frequency(numeros, 6));
        }};
        System.out.println(quantidade2);*/

//conteudo feito pela professora, para estudo futuro
        System.out.print("Jogando");
        //conteúdo do for + try/cath - totalmente opcional
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(3000);
                System.out.print(".");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\nValor " + " Quant. de vezes");
        for (Map.Entry<Integer, Integer> entry : quantidade.entrySet()) {
            System.out.printf("%3d %10d\n", entry.getKey(), entry.getValue());
        }
    }
}

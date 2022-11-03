package DesafiosDeCodigo;

import java.util.Scanner;

public class DesafioDeCodigo4 {
        /* Retorne a palavra correta de acordo com o múltiplo de "num". 
        Entrada
        Você receberá um número onde: 
        Se o número for um múltiplo de 3 e 5 -> "FizzBuzz" ; 
        Se o número for apenas múltiplo de 3 -> "Fizz" ; 
        Se o número for apenas múltiplo de 5 -> "Buzz"; 
        Se o número não for um múltiplo de 3 ou 5, o número deve ser exibido; 

        Saída
        Retorne a palavra correta de acordo com o seu múltiplo. Caso o valor não seja múltiplo de 3 ou 5, exiba o número, conforme exemplo abaixo:
        Caso o valor não seja múltiplo de 3 ou 5, exiba o número, conforme o enunciado.*/
    public static void main(String[] args) {

        try (Scanner number = new Scanner(System.in)) {
            int num = number.nextInt();
            System.out.println(funcao(num));
        } 
        

    }public static String funcao(int num) {
        String fizz = "Fizz";
        String buzz = "Buzz";
        
        if(num % 3 == 0 && num % 5 == 0)
        return fizz + buzz;
        else if(num % 5 == 0)
        return buzz;
        else if(num % 3 == 0)
        return fizz;
        else{
        String numero = String.valueOf(num);
            //return "O número " + num + " não é FizzBuzz :(";
            return numero;
        }
    }
}

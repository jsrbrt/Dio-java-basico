import java.util.Scanner;
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
public class FizzBuzz {
    public static void main(String[] args) {
        //TODO:  Retorne o valor da soma de todos múltiplos de "A" até o seu limite "N".
        int A, N;
        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        N = input.nextInt();
        int soma = 0;
        for (int i = A; i <= N; i++) {
            if(i % A == 0) soma += i;
        }
        System.out.println(soma);
        input.close();
    }
}

import java.util.Scanner;
/*Desafio
Dado um número A e o seu limite N, encontre a soma de todos os múltiplos A até o seu limite N.
Entrada
A entrada deverá ser composta pelo valor A na primeira linha, seguido do valor N na segunda.
Saída
A saída deverá retornar o valor da soma de todos os múltiplos A até o seu limite N.
*/
public class Multiplos {
    public static void main(String[] args) {
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

package fatorial;

import java.util.Scanner;

public class FatoralDesajeitado {
    public static void main(String[] args) {
        System.out.println("Digite o número desejado pra calcular o fatorial:");
        /*int i = n;
        String numeros = Integer.toString(i);
        char[] operador = new char[]{'*', '/', '+', '-'};

        i--;
        while (i>0){
            for (int j = 0; j < operador.length && i>0; j++) {
                numeros = numeros + operador[j] + i;
                i--;
            }
        }*/
        System.out.println(calcular(new Scanner(System.in).nextInt()));
    }
    public static int calcular(int N) {
        int resultado = 0, numero = N, j = 0;
        char[] operador = new char[]{'*', '/', '+', '-'};
        for (int i = N - 1; i >= 1; --i) {
            if (operador[j] == '*') {
                numero *= i;
            } else if (operador[j] == '/') {
                numero /= i;
            } else if (operador[j] == '+') {
                resultado += i;
            } else {
                resultado += (i == N - 4) ? numero : -numero;
                numero = i;
            }
            j = (j + 1) % 4;
        }
        return resultado + ((N <= 4) ? numero : -numero);
    }
}

package fatorial;

//import javax.script.ScriptException;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.Scanner;


public class FatoralDesajeitado {
    public static void main(String[] args) throws ScriptException {
        System.out.println("Digite o número desejado pra calcular o fatorial:");
        int n = Integer.parseInt(new Scanner(System.in).nextLine());
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
        System.out.println(calcular(n));
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

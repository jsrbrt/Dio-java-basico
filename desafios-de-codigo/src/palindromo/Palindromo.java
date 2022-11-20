package palindromo;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palavra = scanner.next();
        String palavraInvertida = new StringBuilder(palavra).reverse().toString();

        /*String resultado;
        if (palavra.equalsIgnoreCase(palavraInvertida)) resultado = "TRUE";
        else resultado = "FALSE";
        System.out.println(resultado);*/

        String resultado = palavra.equalsIgnoreCase(palavraInvertida) ? "TRUE" : "FALSE";
        System.out.println(resultado);
    }
}
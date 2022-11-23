import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        //TODO: Retorne TRUE ou FALSE, caso a "palavra" seja ou não um Palíndromo.
        String palavra = new Scanner(System.in).next();
        String palavraInvertida = new StringBuilder(palavra).reverse().toString();

        //boolean resultado = palavra.equalsIgnoreCase(palavraInvertida);
        String resultado = palavra.equalsIgnoreCase(palavraInvertida) ? "TRUE" : "FALSE";
        System.out.println(resultado);
    }
}
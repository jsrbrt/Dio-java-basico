import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        String palavra = new Scanner(System.in).next();
        String palavraInvertida = new StringBuilder(palavra).reverse().toString();

        //boolean resultado = palavra.equalsIgnoreCase(palavraInvertida);
        String resultado = palavra.equalsIgnoreCase(palavraInvertida) ? "TRUE" : "FALSE";
        System.out.println(resultado);
    }
}
import java.util.Scanner;

public class Somatorio {
    public static void main(String[] args) {
        System.out.println(somatorio(new Scanner(System.in).nextInt()));
    }
    static int somatorio(int numero) {
        if (numero == 0) return 0;
        else return numero + somatorio(numero - 1);
    }
}

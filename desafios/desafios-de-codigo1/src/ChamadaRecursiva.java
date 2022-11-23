import java.util.Scanner;

public class ChamadaRecursiva {
//TODO: Imprima o somatório de N (utilize o método "somatorio").
    public static void main(String[] args) {
        System.out.println(somatorio(new Scanner(System.in).nextInt()));
    }
    static int somatorio(int numero) {
        if (numero == 0) return 0;
        else return numero + somatorio(numero - 1);
    }
}

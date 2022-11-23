import java.util.Scanner;

public class BuscaSequencial {
    public static void main(String[] args) {
        acharNumero(new Scanner(System.in).nextInt());
    }
    public static void acharNumero(int numeroDesejado) {
        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};
        for (int i = 0; i < elementos.length; i++) {
            if(elementos[i] == numeroDesejado){
                System.out.println("Achei " + numeroDesejado + " na posição " + i);
                return;
            }
        }
        System.out.println("Número " + numeroDesejado + " não encontrado!");
    }
}

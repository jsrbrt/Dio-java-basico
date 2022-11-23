import java.util.Scanner;

public class Quadrados {
    public static void main(String[] args) {
        System.out.println(calcularQuadrados(new Scanner(System.in).nextInt()));
    }
    public static int calcularQuadrados(int n){
        int raizN = (int) Math.sqrt(n);
        int[] quadrados = new int[raizN];
        int i;

        for (i = 1; i <= raizN; i++) quadrados[i-1] = i*i;

        int[] a = new int [n + 1];
        for (i = 1; i <= n; i++) {
            a[i] = n + 1;
            for (int square : quadrados) {
                if (i < square) continue;
                if (square == i) a[i] = 1;
                else
                    a[i] = Math.min(a[i], 1 + a[i - square]);
            }
        }
        return a[n];
    }
}

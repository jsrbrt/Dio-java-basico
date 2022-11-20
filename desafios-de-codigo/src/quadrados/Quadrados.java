package quadrados;

import java.util.Scanner;

public class Quadrados {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println(numerosQuadrados(scanner.nextInt()));
    }
    public static int numerosQuadrados(int n) {
        int raizN = (int) Math.sqrt(n);
        int[] squares = new int [raizN];
        for (int i = 1; i <= raizN; i++) {
            squares[i - 1] = i * i;
        }
        int[] dp = new int [n + 1];
        for (int i = 1; i <= n; i++) {
            dp[i] = n + 1;
            for (int square : squares) {
                if (i < square) {
                    continue;
                }
                if (square == i) {
                    dp[i] = 1;
                } else {
                    dp[i] = Math.min(dp[i], 1 + dp[i - square]);
                }
            }
        }
        return dp[n];
    }
}


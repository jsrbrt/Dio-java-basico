package DesafiosDeCodigo;
import java.util.Scanner;

public class DesafioDeCodigo1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			int A = scanner.nextInt();
			int B = scanner.nextInt();

			if(A==B)
			System.out.println("Sao iguais!");
			else
			System.out.println("Nao sao iguais!");
		}
    }
}

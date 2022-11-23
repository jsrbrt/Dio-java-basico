import java.util.Scanner;

public class Iguais {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();

		if(A==B) System.out.println("Sao iguais!");
		else System.out.println("Nao sao iguais!");
		scanner.close();
	}
}

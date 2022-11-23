



import java.util.Locale;
import java.util.Scanner;

public class SobreMim {
    public static void main(String[] args) {
        /*String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);*/
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
               
        String nome;
        String sobrenome;
        int idade;
        double altura;

        System.out.println("Insira seu nome e sobrenome:");
            nome = scanner.next();
            sobrenome = scanner.next();
        System.out.println("Insira sua idade:");
            idade = scanner.nextInt();
        System.out.println("Insira sua altura:");
            altura = scanner.nextDouble();

        System.out.println("Olá, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos de idade e " + altura + " cm de altura.");    
    }
    }
}

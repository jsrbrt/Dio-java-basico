package ExerciciosMetodos;

import java.util.Scanner;

public class Emprestimo {
    Scanner scanner = new Scanner(System.in);
    double valor;
    int parcelas;
    public static void main(String[] args) {
        //System.out.println(emprestimo.teste(scanner.nextInt()));
        //Scanner scanner = new Scanner(System.in);
        Emprestimo emprestimo = new Emprestimo();

        emprestimo.decidirValores();
        System.out.print(emprestimo.calcularParcelas());
        System.out.println(" Totalizando em R$" + emprestimo.calcularValorFinal());
    
    }
    public void decidirValores() {
        System.out.println("Empréstimo:");
        valor = scanner.nextDouble();
        
        System.out.println("Dividir em quantas vezes?");
        parcelas = scanner.nextInt(); 
        while(parcelas > 9 || parcelas <= 0){
            System.out.println("Número de parcelas inválido.");
            System.out.println("Digite novamente. Dividir em quantas vezes?");
            parcelas = scanner.nextInt();
        }
    }
    public double calcularJuros() {
        double juros = parcelas * 0.15;
        return juros;
    }
    public double calcularValorFinal() {
        double valorFinal = valor + (valor * calcularJuros());
        return valorFinal;
    }
    public String calcularParcelas() {
        double parcela = calcularValorFinal() / parcelas;
        return "Você irá pagar R$" + parcela + " durante " + parcelas + " meses.";
    }
    /*public static int teste(int teste){
    return teste;
    }*/
    
}

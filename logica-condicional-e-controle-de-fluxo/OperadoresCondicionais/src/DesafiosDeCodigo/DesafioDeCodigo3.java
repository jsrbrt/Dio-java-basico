package DesafiosDeCodigo;

import java.util.Scanner;

public class DesafioDeCodigo3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(somatorio(scanner.nextInt()));
        }
    }

    /*
     * Método útil que calcula o somatório de um número usando recursividade.
     */
    static int somatorio(int numero) {
        
        if (numero == 0) {
            return 0;
        } else {
            return numero + somatorio(numero - 1);
        }
    }
}

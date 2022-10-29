package DesafiosDeCodigo;

import java.util.Scanner;

public class DesafioDeCodigo5 {

    public static void main(String[] args) {
        acharNumero();
    }
    public static void acharNumero() {
        Scanner leitor = new Scanner(System.in);

        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75}; 
        int numeroDesejado = leitor.nextInt();

        for (int i = 0; i < elementos.length; i++) 
        {
            if(elementos[i] == numeroDesejado){
            System.out.println("Achei " + numeroDesejado + " na posição " + i);
            i = elementos.length;
            return;}
        }
        System.out.println("Número " + numeroDesejado + " não encontrado!");
    }
}
